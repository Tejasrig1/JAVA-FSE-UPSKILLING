SELECT event_id, COUNT(session_id) AS session_count 
FROM Sessions 
GROUP BY event_id 
ORDER BY session_count DESC 
LIMIT 1;