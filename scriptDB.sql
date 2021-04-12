
CREATE TABLE `employee` (
  `idEmployee` int(10) UNSIGNED NOT NULL,
  `pass` varchar(8) NOT NULL,
  `name` varchar(255) NOT NULL,
  `phone` varchar(15) NOT  NULL,
  `state` varchar(1) DEFAULT NULL,
  `user` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO employee (idEmployee,pass,`name`,phone,`user`) values
(123,123,'Lucas Lima','1190909090','lucas');


