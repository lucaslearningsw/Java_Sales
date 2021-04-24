CREATE TABLE `user` (
  `idUser` int(10)  NOT NULL AUTO_INCREMENT, 
  `pass` varchar(8) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(15) NOT  NULL,
  PRIMARY KEY (idUser)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (pass,`name`,email) values
(123,'lucasa','lucas1');




CREATE TABLE `product` (
  `idProduct` int(11)  NOT NULL AUTO_INCREMENT,
  `name` varchar(244) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `stock` int(11) UNSIGNED DEFAULT NULL,
  `state` varchar(1) DEFAULT NULL,
  PRIMARY KEY (idProduct)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO `product` ( `name`, `price`, `stock`, `state`) VALUES
( 'produto3', 10, 91, '1'),
( 'produto4',30, 9, '1'),
( 'produto3', 300, 10, '1'),
( 'produto2', 10, 8, '1'),
( 'Producto1', 12, 5, '1');           


