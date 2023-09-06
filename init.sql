create database student_management;
use student_management;

create table admin (
	id int not null primary key auto_increment,
    usename varchar(45) not null,
    password varchar(45) not null
);

create table student (
	id int not null primary key auto_increment,
    name varchar(150) not null,
    date_of_birth date not null,
    gender varchar(10) not null,
    email varchar(100) not null,
    phone varchar(15) not null,
    father_name varchar(150) not null,
    mother_name varchar(150) not null,
    address1 text not null,
    address2 text not null,
    image_path varchar(200) not null
);

create table course(
	id int not null primary key auto_increment,
    student_id int default null,
    semeter int default null,
    course1 varchar(200) default null,
    course2 varchar(200) default null,
    course3 varchar(200) default null,
    course4 varchar(200) default null,
    course5 varchar(200) default null,
    constraint fk_student_id
    foreign key (student_id) references student(id) 
    on delete cascade
);

create table score(
	id int not null primary key auto_increment,
    student_id int not null,
    semester int not null,
    course1 varchar(200) not null,
    score1 double not null,
    course2 varchar(200) not null,
    score2 double not null,
    course3 varchar(200) not null,
    score3 double not null,
    course4 varchar(200) not null,
    score4 double not null,
    course5 varchar(200) not null,
    score5 double not null,
    average double not null,
    constraint fk_stu_id
    foreign key (student_id) references student(id)
    on delete cascade on update cascade
);