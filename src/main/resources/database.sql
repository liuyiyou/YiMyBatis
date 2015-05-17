#创建表
CREATE TABLE  user (id INT PRIMARY KEY  AUTO_INCREMENT ,name VARCHAR (20));

#插入一列
INSERT INTO user ( name) VALUES ("test1");

#查询
SELECT *  FROM USER WHERE  USER.id = 1;