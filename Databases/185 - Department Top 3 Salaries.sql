SELECT t.Department, t.Employee, t.Salary
FROM (SELECT e.name as Employee, e.salary as Salary, d.name as Department,
DENSE_RANK() OVER (PARTITION BY e.departmentId 
                ORDER BY e.salary DESC) as rn
FROM Employee e
JOIN Department d
ON e.departmentId=d.id) t
WHERE rn<=3;