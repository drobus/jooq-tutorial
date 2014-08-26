insert into users (id, name, family_name) values (1, 'USER1', 'FUSER1');
insert into users (id, name, family_name) values (2, 'USER2', 'FUSER2');
insert into users (id, name, family_name) values (3, 'USER3', 'FUSER3');

insert into articles(id, name, text, user_id) values(1, 'ARTICLE1', 'ARTICLE1 TEXT', 1);
insert into articles(id, name, text, user_id) values(2, 'ARTICLE2', 'ARTICLE2 TEXT', 2);
insert into articles(id, name, text, user_id) values(3, 'ARTICLE3', 'ARTICLE3 TEXT', 3);

insert into article_comments(id, title, text, user_id, article_id) values(1, 'COMMENT1', 'COMMENT1 TEXT', 1, 1);
insert into article_comments(id, title, text, user_id, article_id) values(2, 'COMMENT2', 'COMMENT2 TEXT', 1, 2);
insert into article_comments(id, title, text, user_id, article_id) values(3, 'COMMENT3', 'COMMENT3 TEXT', 1, 3);

insert into article_comments(id, title, text, user_id, article_id) values(4, 'COMMENT4', 'COMMENT4 TEXT', 2, 1);
insert into article_comments(id, title, text, user_id, article_id) values(5, 'COMMENT5', 'COMMENT5 TEXT', 2, 2);
insert into article_comments(id, title, text, user_id, article_id) values(6, 'COMMENT6', 'COMMENT6 TEXT', 2, 3);


