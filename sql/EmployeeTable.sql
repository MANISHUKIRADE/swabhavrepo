

CREATE TABLE DEP (
 DEPNO              integer NOT NULL,
 DNAME               varchar(14),
 LOC                 varchar(13),
 CONSTRAINT DEP_PRIMARY_KEY PRIMARY KEY (DEPNO));

INSERT INTO DEP VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEP VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEP VALUES (30,'SALES','CHICAGO');
INSERT INTO DEP VALUES (40,'OPERATIONS','BOSTON');

CREATE TABLE EMP (
 EMPNO               integer NOT NULL,
 ENAME               varchar(10),
 JOB                 varchar(9),
 MGR                 integer CONSTRAINT EMP_SELF_KEY REFERENCES EMP (EMPNO),
 HIREDATE            DATEtime,
 SAL                 money,
 COMM                money,
 DEPNO              integer NOT NULL,
 CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPNO) REFERENCES DEP (DEPNO),
 CONSTRAINT EMP_PRIMARY_KEY PRIMARY KEY (EMPNO));

INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'17-NOV-81',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1-MAY-81',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'9-JUN-81',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'2-APR-81',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'28-SEP-81',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'20-FEB-81',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'8-SEP-81',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'3-DEC-81',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'22-FEB-81',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'3-DEC-81',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'17-DEC-80',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'09-DEC-82',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'12-JAN-83',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'23-JAN-82',1300,NULL,10);


--display all employee deptno is 10
select * from EMP where DEPNO=10

--display all employee deptno 10 nd 20
select * from EMP where DEPNO=10 OR DEPNO=20

--dislay employee name who r mgr
select ENAME from EMP where JOB='MANAGER'

--display all emp who r in  DEPno 10 and mgr
select * from EMP where DEPNO=10 AND JOB='MANAGER'

--display all emp whose commission is null
select * from EMP where COMM IS NULL

--disp emp name salary and annual ctc (commission+salary*12)
	select ENAME,SAL,((SAL*12) +ISNULL(COMM,0)) as ANNUALCTC FROM EMP

--display employee whose salary bet 2000 to 5000
 select * from EMP where SAL between 2000 AND 5000

--display employee name in lowercase
	select LOWER(ENAME) from EMP

--display dept no which are unique
	select DISTINCT(DEPNO) from DEP
	select DISTINCT(DEPNO) from EMP

--display emp name hireddate and year of experience
	select ENAME,HIREDATE,
	 CONVERT(VARCHAR(3),DATEDIFF(MONTH, HIREDATE, GETDATE())/12) +' years '+
    CONVERT(VARCHAR(2),DATEDIFF(MONTH, HIREDATE, GETDATE()) % 12)+ ' months' 
   AS YearsOfExperience from EMP

--displaoy top 3 salaried employee
SELECT *
FROM EMP
WHERE 
(SAL IN 
  (
    SELECT TOP (3) SAL
    FROM EMP 
    ORDER BY SAL DESC
  )
)

--or
 SELECT TOP (3) * FROM EMP ORDER BY SAL DESC

 --display employee name scott and display all working in scott department
	select * from EMP where DEPNO IN(select DEPNO from EMP where ENAME='SCOTT')
 --display all the employee who have same designation of blake
	select * from EMP where JOB IN (select JOB from EMP where ENAME='BLAKE')
 --disp all reporties of king 
	select * from EMP where MGR in(select EMPNO from EMP where ENAME='KING')
	select * from EMP where MGR =(select EMPNO from EMP where ENAME='KING')

 --disp no of employess in employee table 
	select COUNT(ENAME) from EMP
 --disp count of emmpl avg sal and max sal ,min sal
	select COUNT(ENAME) as emplcount,AVG(SAL) as AverageSal,MAX(SAL) as MaxSal,MIN(SAL) as MinSAL from EMP

		


select * from EMP order by ENAME


select EMP.ENAME , DEP.DEPNO
FROM   EMP 
JOIN DEP 
ON EMP.DEPNO = DEP.DEPNO;  

SELECT EMP.ENAME , DEP.DEPNO,DEP.DNAME
FROM EMP 
RIGHT JOIN DEP
ON EMP.DEPNO = DEP.DEPNO

SELECT  DEP.*
FROM EMP 
RIGHT JOIN DEP
ON EMP.DEPNO = DEP.DEPNO 
WHERE EMP.EMPNO IS NULL


SELECT e1.ENAME ,e2.ENAME AS Bossname
from EMP as e1
JOIN EMP  as e2 
ON  e1.MGR = e2.EMPNO

SELECT e1.ENAME ,e2.ENAME AS Bossname
from EMP as e1
LEFT JOIN EMP  as e2 
ON  e1.MGR = e2.EMPNO  

SELECT e1.ENAME as Name,e2.ENAME AS Bossname, d1.DNAME AS DeparmentName
from DEP d1 
JOIN  EMP as e1 
ON d1.DEPNO= e1.DEPNO
JOIN EMP  as e2 
ON  e1.MGR = e2.EMPNO 
 
SELECT COUNT(*) AS NO , DEP.DNAME
from EMP
JOIN DEP
ON EMP.DEPNO=DEP.DEPNO
GROUP BY DEP.DNAME

SELECT COUNT(*) AS NO, EMP.JOB
FROM EMP
GROUP BY EMP.JOB

SELECT COUNT(*) AS NO, EMP.JOB
FROM EMP
GROUP BY JOB
HAVING JOB = 'MANAGER' AND DEPNO=10

 

SELECT COUNT(*) AS NO, EMP.JOB , DEP.DNAME
 FROM EMP 
 JOIN DEP
 ON EMP.DEPNO=DEP.DEPNO
 GROUP BY EMP.JOB,DEP.DNAME

 SELECT COUNT(EMP.EMPNO) AS NO , DEP.DNAME
 FROM EMP 
 RIGHT JOIN DEP
 ON EMP.DEPNO=DEP.DEPNO
 GROUP BY DEP.DNAME

SELECT COUNT(EMP.EMPNO), DEP.DNAME
FROM EMP
RIGHT JOIN DEP 
ON EMP.DEPNO=DEP.DEPNO
GROUP BY DEP.DNAME 
HAVING COUNT(EMP.EMPNO)<5

go

CREATE PROCEDURE dbo.USP_GIVE_HIKE( @empId integer ,@Percentage integer)

AS 
UPDATE EMP
SET EMP.SAL = EMP.SAL + EMP.SAL*@Percentage/100 WHERE EMP.EMPNO= @empId
INSERT INTO USER_Log values('Salary of Employye hked')
RETURN (SELECT EMP.SAL FROM EMP WHERE EMP.EMPNO=@empId)

GO
go

DROP PROCEDURE dbo.USP_GIVE_HIKE
select * from EMP;
DECLARE @variable money ;

EXEC @variable= dbo.USP_GIVE_HIKE @empId=7369,@Percentage=10;
SELECT @variable
drop function maxSalriedEmployye
go
create function maxSalriedEmployye()
returns money
 BEGIN  
 
 return  (SELECT MAX(SAL) FROM EMP)
 
 END
go
SELECT dbo.maxSalriedEmployye() as MAX_Salary
drop trigger USP_Uppercase_name
go
create trigger USP_Uppercase_name
ON DEP 
INSTEAD OF  INSERT 
AS BEGIN
 DECLARE 
 @id int,
 @DNAME varchar(20),
 @LOC varchar(20)
 Select @DNAME = INSERTED.DNAME from INSERTED;
 select @id = INSERTED.DEPNO from INSERTED
 select @LOC = INSERTED.LOC FROM INSERTED
 INSERT into DEP values (@id,UPPER(@DNAME),@LOC)
 INSERT INTO USER_Log values('dep inserted')
 DECLARE
 @mesa varchar(200);
END
go
INSERT INTO DEP values (6,'accounts','mumbai')
select * from DEP


BEGIN TRANSACTION T1
select * from DEP
INSERT INTO DEP values (4,'ANALYST','pune')
select * from DEP
ROLLBACK
GO
select * from  DEP



create table Customer(
Custid int primary key,
name varchar(20),
balance money
)
create table Merchant(
Merchid int primary key,
name varchar(20),
balance money
) 
INSERT into Customer values(1,'Manish',4000)
Insert into Merchant values(1,'Ratnesh',10000)

begin transaction shoppping
begin try
update Customer 
SET balance=balance-2000
where Custid=1
update Merchant 
SET balance = balance+2000 
SELECT * FROM Customer, Merchant;
THROW 51000, 'The record does not exist.', 1;
commit
end TRY
begin catch
rollback
end catch
SELECT * FROM Customer, Merchant; 


CREATE table USER_Log(id  int NOT NULL IDENTITY PRIMARY KEY,messg varchar(2000))


select * from USER_Log

CREATE TABLE foo(id INT not null , name varchar(20))
INSERT INTO foo values(10,'manish')
INSERT INTO foo values(30,'ratnesh')
INSERT INTO foo values(40,'DIPESH')
INSERT INTO foo values(50,'Sanal')
INSERT INTO foo values(70,'DRUV')
INSERT INTO foo values(20,'AAKah')
SELECT * FROM foo;

select * from sys.indexes
where object_id = (select object_id from sys.objects where name = 'foo')

create Index i1 on foo(id)
 
Alter table foo 
ADD CONSTRAINT id PRIMARY KEY(id);