SELECT DISTINCT num AS ConsecutiveNums
FROM (SELECT num,
           LAG(num) OVER (ORDER BY id) AS prev,
           LEAD(num) OVER (ORDER BY id) AS nxt
    FROM Logs) t
WHERE num=prev
  AND num=nxt;