-- 创建表 ,hsqldb 不支持 AUTO_INCREMENT
CREATE TABLE t_mybatis_user (
  id   INTEGER GENERATED BY DEFAULT AS IDENTITY( START WITH 1) NOT NULL PRIMARY KEY,
  name VARCHAR(20),
  age  INT
);


CREATE TABLE T (
  A INTEGER GENERATED BY DEFAULT AS IDENTITY,
  B INTEGER DEFAULT 2
);

INSERT INTO T (A,B) VALUES ((1,2),(3,NULL), (DEFAULT,6)) ;