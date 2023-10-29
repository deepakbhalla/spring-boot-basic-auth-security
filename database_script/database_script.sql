create table account(
  id bigserial primary key,
  acc_no numeric(10) not null,
  holder_name varchar(100) not null,
  start_date timestamp not null,
  branch varchar(100) not null,
  balance numeric (20) default 0,
  transactions jsonb,
  created_by varchar(50) not null,
  created_date timestamp not null,
  modified_by varchar(50),
  modified_date timestamp	
);

create table user_table (
	id bigserial primary key,
	username varchar(50) not null,
	password varchar(200) not null
);

select * from user_table;
select * from account;
