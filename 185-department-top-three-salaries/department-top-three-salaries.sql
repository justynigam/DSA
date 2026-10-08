# Write your MySQL query statement below
SELECT d.name as Department ,
       e.name as Employee , 
       e.salary as Salary
FROM (
    SELECT * , DENSE_RANK() over(
        partition by departmentid order by salary desc) as rnk
    FROM Employee
    ) e
    JOIN Department d on e.departmentId = d.id 
    where rnk <= 3; 