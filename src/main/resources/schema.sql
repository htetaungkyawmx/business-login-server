create table if not exists `spring`.`user`(
    `username` varchar (45) not null,
    `password` text null,
    primary key (`username`));

create table if not exists `spring`.`otp`(
    `username` varchar (45) not null,
    `code` varchar (45) null,
    primary key(`username`));