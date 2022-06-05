/* Write your PL/SQL query statement below */
SELECT user_id, INITCAP(name) as name
FROM Users 
ORDER BY user_id;