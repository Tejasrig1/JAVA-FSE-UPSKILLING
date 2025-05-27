SELECT u.user_id, u.full_name 
FROM Users u 
WHERE registration_date >= DATE_SUB(CURDATE(), INTERVAL 30 DAY) 
AND NOT EXISTS (SELECT 1 FROM Registrations r WHERE r.user_id = u.user_id);