***Paste the following commands in mysql server commandline, and your database is ready***




create database testdb;

use testdb;

create table cab( cabType char(1), driverName varchar(100), carModel varchar(100), plateNumber varchar(100), rating DECIMAL(3, 2), completedTrips int, InService bool, Location int);

insert into cab values("g", "Gopal", "Maruti 800", "TS-01-CDC-6901", "4.12", 15, 0, 3);

insert into cab values("x", "Suresh", "Innova Crysta", "TS-04-AMD-007", "4.69", 5, 0, 18);

insert into cab values("p", "Anil", "Lamborghnini Hurican", "UK-16-GTX-2080-ti", 5, 2, 0, 8);

create table logindatabase(firstName varchar(100), lastName varchar(100), userName varchar(100) primary key, email varchar(100), phoneNumber varchar(10), password varchar(100), wallet int);

select * from logindatabase;

insert into logindatabase values("admin", "admin", "admin", "admin@admin.admin", "1234567890", "admin", 10000);
