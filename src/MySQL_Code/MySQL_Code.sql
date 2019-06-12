create database students_management_system;
use students_management_system;
create table user_teacher(
	TID varchar(20) primary key,
	TPassword varchar(20)
);
create table user_student(
	SID varchar(14),
	SPassword varchar(15)
);
create table info_teacher(
	TID varchar(20) primary key,
	TName varchar(20),
	TPassword varchar(20),
	TGender varchar(1),
	Education varchar(10),
	TBirth date,
	Nativeplace varchar(50)
);
create table info_student(
	SID varchar(14) primary key,
	SName varchar(20),
	SGender varchar(1),
	SBirth date,
	Major varchar(10),
	Enrollmentyear varchar(4),
	Nativeplace varchar(50)	
);
create table stu_score(
	SID varchar(14) primary key,
	chinese_score varchar(3),
	math_score varchar(3),
	English_score varchar(3)
);




