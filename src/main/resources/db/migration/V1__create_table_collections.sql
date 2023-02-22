create table collections(
    id bigint not null auto_increment,
    name varchar(250) not null,
    type varchar(50) not null,
    start_date date,
    end_date date,

    primary key(id)
);