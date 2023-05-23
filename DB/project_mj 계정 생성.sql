CREATE USER project_mj IDENTIFIED BY java 
DEFAULT tablespace TS_DBSQL
TEMPORARY tablespace temp
;

GRANT CONNECT, resource TO m_project;
GRANT CREATE SESSION TO project_mj;