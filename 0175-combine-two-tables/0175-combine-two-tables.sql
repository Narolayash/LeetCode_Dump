/* Write your T-SQL query statement below */

SELECT P.firstName, P.lastName, A.city, A.state
FROM Person P
LEFT OUTER JOIN Address A
ON P.personId = A.personId
