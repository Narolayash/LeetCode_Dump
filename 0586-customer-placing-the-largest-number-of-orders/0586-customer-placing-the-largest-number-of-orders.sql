/* Write your T-SQL query statement below */

SELECT TOP 1 customer_number
FROM Orders
Group BY customer_number
Order By Count(order_number) Desc
