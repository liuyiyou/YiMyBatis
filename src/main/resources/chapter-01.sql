-- 创建表 ,hsqldb 不支持 AUTO_INCREMENT，改用h2

DROP  TABLE IF EXISTS t_mybatis_user;
CREATE TABLE  t_mybatis_user (id INT NOT NULL  PRIMARY KEY AUTO_INCREMENT  ,NAME VARCHAR (20),age INT );
