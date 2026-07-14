SELECT p1.product_id,
    CASE
        WHEN MIN(p1.change_date) > '2019-08-16' THEN 10
        ELSE (SELECT p2.new_price FROM Products p2
            WHERE p2.product_id=p1.product_id
            AND p2.change_date = (SELECT MAX(p3.change_date) FROM Products p3 
            WHERE p3.product_id=p2.product_id
            AND p3.change_date<='2019-08-16'))
    END AS price
FROM Products p1
GROUP BY p1.product_id;