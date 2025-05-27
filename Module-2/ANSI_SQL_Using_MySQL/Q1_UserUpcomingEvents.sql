SELECT e.title, e.city, e.start_date 
FROM Events e 
JOIN Registrations r ON e.event_id = r.event_id 
WHERE r.user_id = ? 
AND e.status = 'upcoming' 
ORDER BY e.start_date;