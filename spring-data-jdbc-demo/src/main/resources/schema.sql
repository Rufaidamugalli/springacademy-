create table pet(
    id integer identity primary key,
    name varchar(30),
    birth_date date
);

create table customer(
    id integer identity primary key,
    name varchar(30)
);

create table address(
    id integer identity primary key,
    address_line varchar(30),
    customer integer
);
