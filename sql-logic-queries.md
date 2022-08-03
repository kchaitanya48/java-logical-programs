/******************** SQL logical queries**************************************/

********************************CREATE EMPLOYEE TABLE ****************************

CREATE TABLE Employee(
    EmpId number PRIMARY KEY,
    FirstName varchar2(20),
    LastName varchar2(20),
    Email varchar2(25),
    PhoneNo varchar2(25),
    Salary number(8)
);


*******************************INSERT EMPLOYEE VALUES**************************

INSERT ALL
 INTO Employee  VALUES(1,'krishna','chaitanya','k.chaitanyag@abc.com','67233283',33000);
  INTO Employee VALUES(2,'swetha','mounika','swetha@abc.com','630656235',11000)
  INTO Employee VALUES(3,'krishna','kumar','kkumar@abc.com','975546341',20000)
  INTO Employee VALUES(4,'swetha','rama','srama@abc.com','649923121',23000)
  INTO Employee VALUES(5,'rama','rao','rrao@abc.com','630656785',11000)
  INTO Employee VALUES(6,'puspa','raj','praj@abc.com','975543451',20000)
  INTO Employee VALUES(7,'jai','rama','jrama@abc.com','649453121',23000)
  INTO Employee VALUES(8,'swetha','mounika','swetha@abc.com','630656235',11000)
  INTO Employee VALUES(9,'krishna','kumar','kkumar@abc.com','975546341',20000)
  INTO Employee VALUES(10,'swetha','rama','srama@abc.com','649923121',23000)
SELECT * FROM Dual;


********************************Nth max Salary****************************

select * from (SELECT emp_name,salary over (partition by salary) ct from employee) where ct=2;