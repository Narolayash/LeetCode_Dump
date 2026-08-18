/* Write your T-SQL query statement below */

-- DELETE p1
-- FROM Person P1
-- JOIN Person P2
-- ON P1.email = P2.email AND P1.id > P2.id

DELETE 
FROM Person 
WHERE id NOT IN (
    SELECT MIN(id)
    FROM Person
    GROUP BY email
)