
CREATE TABLE `employee` (
  `idEmployee` int(10)  NOT NULL AUTO_INCREMENT, 
  `pass` varchar(8) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(15) NOT  NULL,
  PRIMARY KEY (idEmployee)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO employee (pass,`name`,email) values
(123,'lucasa','lucas1');

