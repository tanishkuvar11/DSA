SELECT d.name AS Department,
e.name AS `Employee`,
e.salary AS Salary
FROM Employee e,
Department d
WHERE e.departmentId=d.id
AND e.salary IN (SELECT MAX(salary) FROM Employee
WHERE departmentId=e.departmentId);