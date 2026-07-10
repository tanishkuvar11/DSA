CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE X INT;
  SET X=N-1;
  RETURN (
    SELECT(
      SELECT DISTINCT salary AS getNthHighestSalary 
      FROM Employee
      ORDER BY salary DESC
      LIMIT 1 OFFSET X)
  );
END