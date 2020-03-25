-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: website
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'Ao quan','sadsadasd'),(2,'dung cu gia dinh','sdasdas'),(3,'Vat tu y te','áo đẹp'),(4,'thiet bi giao duc','dsadasd'),(5,'xe','dsdasda');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `address` varchar(500) NOT NULL,
  `email` varchar(50) NOT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'Nguyen','Trinh','434342423432','hải châu','trinh@gmail.com','1990-03-09'),(2,'Nguyen','Lam','434342423432','thanh khê','trinh@gmail.com','1998-03-09'),(3,'Tran','Tan','434342423432','thanh khê','trinh@gmail.com','1998-03-09'),(4,'Ba','Trung','434342423432','hải châu','trinh@gmail.com','1992-03-09'),(5,'Dao','Teo','434342423432','liên chiểu','trinh@gmail.com','1998-03-25'),(6,'Nguyen','Tí','434342423432','cẩm lệ','trinh@gmail.com','1996-03-09');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `address` varchar(500) NOT NULL,
  `email` varchar(50) NOT NULL,
  `birthday` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Tran','Tan','0123123213','đà nẵng','adsa@gmail.com','1998-06-05 00:00:00'),(2,'Nguyen','Nam','0123123213','đà nẵng','adsa@gmail.com','1993-06-05 00:00:00'),(3,'Phan','Lao','0123123213','quảng nam','adsa@gmail.com','1996-06-05 00:00:00'),(4,'Tran','Quoc','0123123213','hà nội','adsa@gmail.com','1998-03-25 00:00:00'),(5,'Tran','Heo','0123123213','quảng trị','adsa@gmail.com','1960-06-05 00:00:00');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetails`
--

DROP TABLE IF EXISTS `orderdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderdetails` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_id` int DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `quantity` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `orderdetails_ibfk_1` (`order_id`),
  KEY `orderdetails_ibfk_2` (`product_id`),
  CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetails`
--

LOCK TABLES `orderdetails` WRITE;
/*!40000 ALTER TABLE `orderdetails` DISABLE KEYS */;
INSERT INTO `orderdetails` VALUES (1,1,2,3),(2,2,3,2),(3,1,3,4),(4,3,4,3),(5,4,1,4);
/*!40000 ALTER TABLE `orderdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_date` datetime NOT NULL,
  `shipped_date` datetime DEFAULT NULL,
  `status` varchar(50) NOT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `shipping_address` varchar(500) NOT NULL,
  `shipping_Oty` varchar(50) NOT NULL,
  `payment_type` varchar(20) NOT NULL,
  `customer_id` int DEFAULT NULL,
  `employee_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `orders_ibfk_1` (`customer_id`),
  KEY `orders_ibfk_2` (`employee_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'2019-03-03 00:00:00','2019-03-09 00:00:00','complete','sadsadasd','da nang','410 nguyen phuoc nguyen','COD',1,2),(2,'2019-07-03 00:00:00','2020-03-25 00:00:00','complete','sadsadasd','hue','410le lai','COD',2,1),(3,'2018-02-03 00:00:00','2019-02-06 00:00:00','complete','sadsadasd','quang tri','410 le lai','cash',2,3),(4,'2019-03-03 00:00:00','2019-03-09 00:00:00','complete','sadsadasd','da nang','410 Quang trung','COD',4,1),(5,'2019-03-03 00:00:00','2019-03-09 00:00:00','cancel','sadsadasd','ha noi','410 Phuoc Thai','credit card',3,2),(6,'2019-12-03 00:00:00','2019-12-03 00:00:00','cancel','sadsadasd','da nang','410 le lai','cash',2,1),(7,'2019-05-03 00:00:00','2019-05-09 00:00:00','cancel','sadsadasd','Quanng nam','410 phuoc thai','credit card',3,3);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `image_url` varchar(1000) NOT NULL,
  `price` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `stock` double DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  `supplier_id` int DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `products_ibfk_1` (`category_id`),
  KEY `products_ibfk_2` (`supplier_id`),
  CONSTRAINT `products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `products_ibfk_2` FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'ao thun','sadsa-sadsdas_.com',21780,20,12,1,2,'dsadasđ'),(2,'ong tiem','sadsa-sadsdas_.com',36300,10,2,1,3,'sadsad'),(3,'bep nau','sadsa-sadsdas_.com',36300,5,4,2,4,'asdadsa'),(4,'bua','sadsa-sadsdas_.com',58080,11,12,4,1,'sadsadas'),(5,'chao','sadsa-sadsdas_.com',70180,20,12,3,1,'asasdasd');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suppliers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
INSERT INTO `suppliers` VALUES (1,'SONY','dn@gmail.com','0122795823','Đà Nẵng'),(2,'TOSHIBA','hn@gmail.com','0122795823','Hà Nội'),(3,'SAMSUNG','sg@gmail.com','0122795823','Sài Gòn'),(4,'APPLE','bg@gmail.com','0122795823','Bắc Giang'),(5,'SHARK','hp@gmail.com','0122795823','Hải Phòng');
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'website'
--

--
-- Dumping routines for database 'website'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-25 15:27:16
-- cau 1
SET SQL_SAFE_UPDATES=0;
update products set price=price+(price*10/100)
where price <= 100000;

-- cau 2
update products set discount=discount+5
where discount < 10;

-- cau3
select *
from products
where discount <=10;

-- cau 4
select * from products where stock <=5;

-- cau 5
select * from customers where address = 'hải châu';

-- cau 6
select * from customers where year(birthday)=1990;

-- cau 7
select * from customers where month(birthday)=month(now()) && day(birthday)=day(now());

-- cau 8
select * from orders where status='complete';

-- cau 9
select * from orders where status='complete' and year(shipped_date)=year(now()) and month(shipped_date)=month(now()) and day(shipped_date)=day(now());

-- cau 10
select * from orders where status='cancel';

-- cau 11
select * from orders where payment_type='cash';

-- cau 12
select * from orders where payment_type='credit card';

-- cau 13
select * from orders where shipping_address='ha noi';

-- cau 14
select * from employees where month(birthday)=month(now()) && day(birthday)=day(now());

-- cau 15
select * from suppliers where name in ('SONY', 'SAMSUNG', 'TOSHIBA', 'APPLE');

-- cau 16
select sp.id,sp.name,image_url,price,discount,stock,category_id,supplier_id,lsp.name
 from products sp,categories lsp where sp.category_id=lsp.id;

-- cau 17
select * from customers kh join orders dh on kh.id=dh.customer_id;

-- cau 18
select *
from products mh join categories lh on mh.category_id=lh.id 
                 join suppliers npp on mh.supplier_id=npp.id;
-- cau 19
select lmh.name ,sum(mh.stock)
from categories lmh join products mh on lmh.id=mh.category_id
group by mh.category_id;

-- cau 20
select npp.name ,sum(mh.stock)
from suppliers npp join products mh on npp.id=mh.supplier_id
group by mh.supplier_id;

-- cau 21
select mh.id,mh.name,image_url,price,discount,stock,category_id,supplier_id
from orders dh join orderdetails dhct on dhct.order_id=dh.id join products mh on dhct.product_id=mh.id
where shipped_date between '2019-01-01' and '2019-05-30';
-- cau 22
select distinct kh.id,first_name,last_name,phone_number
from orders dh join orderdetails dhct on dhct.order_id=dh.id join products mh on dhct.product_id=mh.id join customers kh on kh.id=dh.customer_id
where shipped_date between '2019-01-01' and '2019-05-30';

-- cau 23
select distinct kh.id,first_name,last_name,phone_number,sum(mh.price)
from orders dh join orderdetails dhct on dhct.order_id=dh.id join products mh on dhct.product_id=mh.id join customers kh on kh.id=dh.customer_id
where shipped_date between '2019-01-01' and '2019-05-30'
group by kh.id;

-- cau 24
select dh.id ,((mh.price*mh.discount)*dhct.quantity) as TongTien
from orders dh join orderdetails dhct on dhct.order_id=dh.id join products mh on dhct.product_id=mh.id 
group by dh.id;

-- cau 25
select nv.id,concat(nv.first_name,' ' ,nv.last_name) as fullname,((mh.price*mh.discount)*dhct.quantity) as TongTien
from orders dh join orderdetails dhct on dhct.order_id=dh.id join products mh on dhct.product_id=mh.id join employees nv on nv.id=dh.employee_id
group by nv.id;	