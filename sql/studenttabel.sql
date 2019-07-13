create table studentDB(studentId INT primary key ,
 studentName varchar(20),
 cgpa float
 );

 Insert into studentDB values (1,'manish',7.6);
 Insert into studentDB values(2,'ratnesh',8.8);
 Insert into studentDB values(3,'priyank',9.9);
 Insert into studentDB values(4,'meet',8);
 Insert into studentDB values(5,'Dipesh',8.2);

 update studentDB 
 set studentName ='Manish'
 where studentId=1;
 
 delete studentDB
 where studentId=1;
  
 select * from studentDB;
 
create table dept(deptId INT primary key,
deptName varchar(20),
deptLoc varchar(20)
)
create table employee(eIo Int primary key,
eName varchar(20),
deptID int FOREIGN KEY REFERENCES dept(deptId)
)

insert into dept values(1,'sales','mumbai')
insert into dept values(2,'Marketing','mumbai')
insert into employee values(2,'Ratnesh',2);

select * from dept
select * from  employee



create table college(collegeId Int primary key,name varchar(20))
create table department(depaertment Int primary key , name varchar(20))
create table student (studentId Int primary key ,name varchar(20) )


