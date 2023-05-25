CREATE USER project_mj IDENTIFIED BY java 
DEFAULT tablespace TS_DBSQL
TEMPORARY tablespace temp
;

GRANT CONNECT, resource TO project_mj;
GRANT CREATE SESSION TO project_mj;

grant create any table to project_mj;