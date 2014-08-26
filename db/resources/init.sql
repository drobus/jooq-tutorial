create table users (
  id integer,
  name varchar(200) not null,
  family_name varchar(200) not null,
  primary key(id)
);

create table articles (
  id integer,
  name varchar(200) not null,
  text varchar(2000) not null,
  user_id integer not null,
  primary key(id),
  foreign key (user_id) references users(id)
);

create table article_comments(
  id integer,
  title varchar(200) not null,
  text varchar(2000) not null,
  user_id integer not null,
  article_id integer not null,
  primary key(id),
  foreign key (user_id) references users(id),
  foreign key (article_id) references articles(id)
);
