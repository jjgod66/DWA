-- 실습13
SELECT r.region_id, r.region_name, c.country_name
  FROM countries c, regions r
 WHERE c.region_id = r.region_id
   AND r.region_name = 'Europe'
;

-- 실습14
SELECT r.region_id, r.region_name, c.country_name, l.city
  FROM countries c, regions r, locations l
 WHERE c.country_id = l.country_id
   AND c.region_id = r.region_id
   AND r.region_name = 'Europe'
;

-- 실습15
SELECT r.region_id, r.region_name, c.country_name, l.city, d.department_name
  FROM countries c, regions r, locations l, departments d 
 WHERE c.region_id = r.region_id 
   AND c.country_id = l.country_id 
   AND l.location_id = d.location_id
   AND r.region_name = 'Europe'
;

-- 실습16
SELECT r.region_id, r.region_name, c.country_name, l.city, d.department_name, e.first_name || e.last_name name
  FROM countries c, regions r, locations l, departments d, employees e 
 WHERE c.region_id = r.region_id 
   AND c.country_id = l.country_id 
   AND l.location_id = d.location_id
   AND d.department_id = e.department_id 
   AND r.region_name = 'Europe'
;

-- 실습17
SELECT e.employee_id, CONCAT(e.first_name, e.last_name) name, j.job_id, j.job_title
  FROM jobs j, employees e 
 WHERE j.job_id = e.job_id 
;

-- 실습18
SELECT m.employee_id mgr_id, CONCAT(m.first_name, m.last_name) mgr_name, e.employee_id,
							 CONCAT(e.first_name, e.last_name) name, j.job_id, j.job_title
  FROM jobs j, employees e, employees m
 WHERE e.job_id = j.job_id 
   AND m.employee_id = e.manager_id 
;

