SELECT user_id, COUNT(feedback_id) AS feedback_count 
FROM Feedback 
GROUP BY user_id 
ORDER BY feedback_count DESC 
LIMIT 5;