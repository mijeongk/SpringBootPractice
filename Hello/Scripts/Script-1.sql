SELECT SYSDATE FROM dual;

-- 오라클 웹 포트 번호 확인
SELECT dbms_xdb.gethttpport AS "HTTP-Port" FROM dual;

-- 오라클 웹 포트 번호 변경(3줄 블럭잡고 ctrl + enter)
BEGIN
	dbms_xdb.sethttpport('9999');
END;
-- 등록된 모든 사용자의 계정 확인
SELECT username, account_status,lock_date FROM dba_users;

-- hr 계정 락 해제
ALTER USER hr account unlock;
-- hr 계정 암호 변경
ALTER USER hr IDENTIFIED BY "123456";
