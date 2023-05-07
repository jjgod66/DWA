SELECT *
  FROM emp;
 
  
SELECT TO_DATE(:yyyymm , 'YYYYMM') + (LEVEL - 1) AS dt	--날짜
	   ,TO_CHAR(TO_DATE(:yyyymm, 'YYYYMM') + (LEVEL - 1), 'D') d	--요일
  	   ,TO_CHAR(TO_DATE(:yyyymm, 'YYYYMM') + (LEVEL - 1), 'WW') WW
--	   ,LEVEL
	   FROM DUAL
CONNECT BY LEVEL <= TO_CHAR(LAST_DAY(TO_DATE(:yyyymm , 'YYYYMM')), 'DD') 
;

SELECT MIN (DECODE (d, 1, TO_CHAR (da, 'DD'), NULL)) SUN,
	   MIN (DECODE (d, 2, TO_CHAR (da, 'DD'), NULL)) MON,
	   MIN (DECODE (d, 3, TO_CHAR (da, 'DD'), NULL)) TUE,
	   MIN (DECODE (d, 4, TO_CHAR (da, 'DD'), NULL)) WED,
	   MIN (DECODE (d, 5, TO_CHAR (da, 'DD'), NULL)) THU,
	   MIN (DECODE (d, 6, TO_CHAR (da, 'DD'), NULL)) FRI,
	   MIN (DECODE (d, 7, TO_CHAR (da, 'DD'), NULL)) SAT
  FROM (
  		SELECT TO_DATE (:yyyymm , 'YYYYMM') + (LEVEL - 1) da
  			  ,TO_CHAR (TO_DATE (:yyyymm, 'YYYYMM') + (LEVEL - 1), 'D') d
  		 	  ,TO_CHAR (TO_DATE (:yyyymm, 'YYYYMM') + (LEVEL - 1), 'ww') ww
  		  FROM DUAL
  		CONNECT BY LEVEL <= TO_CHAR (LAST_DAY (TO_DATE (:yyyymm , 'YYYYMM')), 'DD')
  		)
 GROUP BY ww
 ORDER BY ww 
;