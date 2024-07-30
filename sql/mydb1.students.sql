DROP SCHEMA IF EXISTS `mydb2`;
CREATE SCHEMA `mydb2`;
use `mydb2`;
CREATE TABLE `students` (
                            `id` int NOT NULL AUTO_INCREMENT, `name` varchar(45) DEFAULT NULL,
                            `email` varchar(45) DEFAULT NULL, `password` varchar(45) DEFAULT NULL, `regdate`
                                datetime DEFAULT now(),
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;
INSERT INTO `students` VALUES
                           (1,'홍길일','abc1@abc.com','12345', now()),(2,'홍길이','abc2@abc.com','12345', now()),
                           (3,'홍길삼','abc3@abc.com','12345', now());