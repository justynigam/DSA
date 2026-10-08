# Write your MySQL query statement below
SELECT MAX(salary) as SecondHighestSalary FROM ( select salary , DENSE_RANK() OVER (ORDER BY SALARY DESC) AS RNK FROM Employee) t where RNK = 2;