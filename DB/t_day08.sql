SELF-JOIN : 동일한 테이블끼리 조인할 때 지칭하는 명칭(별도의 키워드가 아니다)

SELECT 사원번호, 사원이름, 사원의 상사 사원번호, 사원의 상사 이름
  FROM emp;
  
SELECT a.empno, a.ename, a.mgr, b.ename
  FROM emp a, emp b
 WHERE a.mgr = b.empno;

-- KING의 경우 상사가 없기 때문에 조인에 실패한다.
-- 따라서 총 행의 수는 13건이 조회된다.

SELECT e.empno, e.ename, e.mgr, m.ename mgr_name
  FROM emp e JOIN emp m ON (e.mgr = m.empno);
 
-- 사원중 사원의 번호가 7369 ~ 7698인 사원만 대상으로 해당 사원의 사원번호, 이름, 상사의 사원번호, 상사의 이름 조회
SELECT e.empno, e.ename, e.mgr, m.ename
  FROM emp e JOIN emp m ON (e.mgr = m.empno)
 WHERE e.empno BETWEEN 7369 AND 7698;

SELECT e.empno, e.ename, e.mgr, m.ename
  FROM emp e, emp m
 WHERE e.mgr = m.empno
   AND e.empno BETWEEN 7369 AND 7698;

NON-EQUI-JOIN : 조인 조건이 = 이 아닌 조인
  
SELECT *
  FROM salgrade;
 
SELECT empno, ename, sal, salgrade.grade
  FROM emp, salgrade
 WHERE emp.sal BETWEEN salgrade.losal AND salgrade.hisal;

-- 실습1
SELECT e.empno, e.ename, e.deptno, d.dname
  FROM emp e, dept d
 WHERE e.deptno = d.deptno;

-- 실습2
SELECT empno, ename, d.deptno, dname
  FROM emp e, dept d
 WHERE e.deptno = d.deptno
   AND e.deptno IN (10, 30);
  
-- 실습3
SELECT empno, ename, sal, e.deptno, dname
  FROM emp e, dept d
 WHERE e.deptno = d.deptno
   AND e.sal > 2500;

-- 실습4
SELECT empno, ename, sal, e.deptno, dname
  FROM emp e, dept d
 WHERE e.deptno = d.deptno
   AND e.sal > 2500
   AND e.empno > 7600;

-- 실습5
SELECT empno, ename, sal, e.deptno, dname
  FROM emp e, dept d
 WHERE e.deptno = d.deptno
   AND e.sal > 2500
   AND e.empno > 7600
   AND e.deptno = 20;
  
-- 실습6
SELECT l.lprod_gu, l.lprod_nm, p.prod_id, p.prod_name
  FROM prod p, lprod l
 WHERE p.prod_lgu = l.lprod_gu;
 
-- 실습7
SELECT b.buyer_id, b.buyer_name, p.prod_id, p.prod_name 
  FROM buyer b, prod p
 WHERE b.buyer_id = p.prod_buyer;

-- 실습8
SELECT m.mem_id, m.mem_name, p.prod_id, p.prod_name, c.cart_qty
  FROM cart c, member m, prod p
 WHERE c.cart_member = m.mem_id 
   AND c.cart_prod = p.prod_id ;
  
-- 실습9
SELECT cs.cid, cs.cnm, cc.pid, cc.DAY, cc.cnt
  FROM customer cs, cycle cc
 WHERE cs.cid = cc.cid
   AND cs.cnm IN ('brown', 'sally');

SELECT *
  FROM cycle;
