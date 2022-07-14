-- 게시글 3개
insert into article (title, content, hashtag, created_at, created_by, modified_at, modified_by) values ('Least chipmunk', 'Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', 'Blue', '2022-05-26 22:26:22', 'Margie', '2022-06-17 02:17:27', 'Maurie');
insert into article (title, content, hashtag, created_at, created_by, modified_at, modified_by) values ('Cockatoo, red-tailed', 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.
Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', 'Goldenrod', '2022-03-18 14:08:15', 'Jefferey', '2022-07-03 08:55:45', 'Bevan');
insert into article (title, content, hashtag, created_at, created_by, modified_at, modified_by) values ('Two-toed sloth', 'Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque.
Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.', 'Green', '2022-04-23 15:38:27', 'Orran', '2022-06-17 11:33:29', 'Diane-marie');

-- 댓글 10개
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('1', 'Tarantula, salmon pink bird eater', '2022-05-29 02:37:05', 'Garland', '2022-02-12 10:19:56', 'Conchita');
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('1', 'Heron, gray', '2022-06-17 13:46:35', 'Cristabel', '2022-05-21 15:14:25', 'Silvio');
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('1', 'Plover, blacksmith', '2021-11-02 15:18:25', 'Trumann', '2021-11-04 05:42:49', 'Kriste');
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('1', 'Steenbuck', '2021-12-15 16:58:49', 'Timothea', '2022-02-07 15:16:08', 'Alphard');
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('2', 'Mountain lion', '2022-03-06 19:25:47', 'Eugen', '2022-01-22 07:34:25', 'Aleen');
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('2', 'White-bellied sea eagle', '2022-06-18 12:33:28', 'Ulrica', '2022-02-14 01:43:14', 'Kyle');
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('2', 'Ferruginous hawk', '2022-01-08 00:36:29', 'Langston', '2021-11-12 12:09:34', 'Michaeline');
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('3', 'Red-headed woodpecker', '2022-03-03 11:10:44', 'Pet', '2021-10-15 20:48:54', 'Bartholomeo');
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('3', 'Magpie, black-backed', '2022-03-29 18:26:54', 'Gradeigh', '2021-12-28 01:44:13', 'Elly');
insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values ('3', 'White-cheeked pintail', '2021-11-02 08:12:14', 'Omero', '2021-11-28 06:03:31', 'Cori');