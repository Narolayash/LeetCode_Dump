/* Write your T-SQL query statement below */

Select class 
FROM Courses
Group By class
Having Count(student) >= 5
