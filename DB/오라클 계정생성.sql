create user project_mj identified BY java;

alter user project_mj account unlock;

grant resource,connect to project_mj;

commit;