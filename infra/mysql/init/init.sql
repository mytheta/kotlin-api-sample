DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(20) NOT NULL DEFAULT '',
  hobby varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO user(id, name, hobby) VALUES(1, 'hoge', 'code');
INSERT INTO user(id, name, hobby) VALUES(2, 'hogehoge', 'python');

