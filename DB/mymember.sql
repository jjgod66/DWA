/* 회원 */
CREATE TABLE mymember (
	mem_id VARCHAR2(30) NOT NULL, /* 회원ID */
	mem_name VARCHAR2(10), /* 회원이름 */
	mem_tel VARCHAR2(13), /* 회원전화번호 */
	mem_addr VARCHAR2(50) /* 회원주소 */
);

COMMENT ON TABLE mymember IS '회원';

COMMENT ON COLUMN mymember.mem_id IS '회원ID';

COMMENT ON COLUMN mymember.mem_name IS '회원이름';

COMMENT ON COLUMN mymember.mem_tel IS '회원전화번호';

COMMENT ON COLUMN mymember.mem_addr IS '회원주소';

CREATE UNIQUE INDEX PK_mymember
	ON mymember (
		mem_id ASC
	);

ALTER TABLE mymember
	ADD
		CONSTRAINT PK_mymember
		PRIMARY KEY (
			mem_id
		);

INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a001', '홍길동', '010-1111-1111', '대전광역시 중구 선화동 111');
INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a002', '성춘향', '010-2222-2222', '대전광역시 중구 선화동 222');
INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a003', '이몽룡', '010-3333-3333', '대전광역시 중구 선화동 333');
INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a004', '변학도', '010-4444-4444', '대전광역시 중구 선화동 444');
INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a005', '해린', '010-5555-5555', '대전광역시 중구 선화동 555');
INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a006', '하니', '010-6666-6666', '대전광역시 중구 선화동 666');
INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a007', '민지', '010-7777-7777', '대전광역시 중구 선화동 777');
INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a008', '다니엘', '010-8888-8888', '대전광역시 중구 선화동 888');
INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a009', '혜인', '010-9999-9999', '대전광역시 중구 선화동 999');
INSERT INTO DRON4GI.MYMEMBER
(MEM_ID, MEM_NAME, MEM_TEL, MEM_ADDR)
VALUES('a010', '카즈하', '010-1000-0000', '대전광역시 중구 선화동 100');
