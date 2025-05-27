SELECT e.title 
FROM Events e 
LEFT JOIN Feedback f ON e.event_id = f.event_id 
WHERE e.event_id IN (SELECT event_id FROM Registrations) 
AND f.feedback_id IS NULL;