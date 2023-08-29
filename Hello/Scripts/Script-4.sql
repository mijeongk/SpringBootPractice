SELECT * FROM tab;

-- 시퀀스를 만들자
CREATE SEQUENCE person_idx_seq;

-- 테이블을 만들자
CREATE TABLE person(
	idx NUMBER PRIMARY KEY,
	name varchar2(100) NOT NULL,
	age NUMBER DEFAULT 0
);

INSERT INTO person VALUES (person_idx_seq.nextval, '한사람', 22);
INSERT INTO person VALUES (person_idx_seq.nextval, '두사람', 18);
INSERT INTO person VALUES (person_idx_seq.nextval, '세사람', 29);
INSERT INTO person VALUES (person_idx_seq.nextval, '네사람', 31);
INSERT INTO person VALUES (person_idx_seq.nextval, '오사람', 19);

SELECT * FROM person;