-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: comp440_practice
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customer_id` int(4) NOT NULL,
  `cust_name` varchar(13) DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `grade` varchar(3) DEFAULT NULL,
  `salesman_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `salesman_id` (`salesman_id`),
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`salesman_id`) REFERENCES `salesman` (`salesman_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (3001,'BradGuzan','London',NULL,5005),(3002,'NickRimando','NewYork','100',5001),(3003,'JozyAltidor','Moscow','200',5007),(3004,'FabianJohnson','Paris','300',5006),(3005,'GrahamZusi','California','200',5002),(3007,'BradDavis','NewYork','200',5001),(3008,'JulianGreen','London','300',5002),(3009,'GeoffCameron','Berlin','100',5003);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `Id` int(4) NOT NULL,
  `MgrId` int(4) DEFAULT NULL,
  `EmpName` varchar(6) DEFAULT NULL,
  `Salary` int(6) DEFAULT NULL,
  `StartDate` int(4) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1111,3333,'Kathy',50000,2012),(2222,3333,'John',60000,2011),(3333,0,'Cook',100000,2000),(4444,0,'Mathew',75000,2012),(5555,1111,'Jun',40000,2015);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_mast`
--

DROP TABLE IF EXISTS `item_mast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_mast` (
  `PRO_ID` int(3) NOT NULL,
  `PRO_NAME` varchar(16) DEFAULT NULL,
  `PRO_PRICE` int(4) DEFAULT NULL,
  `PRO_COM` int(2) DEFAULT NULL,
  PRIMARY KEY (`PRO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_mast`
--

LOCK TABLES `item_mast` WRITE;
/*!40000 ALTER TABLE `item_mast` DISABLE KEYS */;
INSERT INTO `item_mast` VALUES (101,'Mother Board',3200,15),(102,'Key Board',450,16),(103,'ZIP drive',250,14),(104,'Speaker',550,16),(105,'Monitor',5000,11),(106,'DVD drive',900,12),(107,'CD Drive',800,12),(108,'Printer',2600,13),(109,'Refill cartridge',350,13),(110,'Mouse',250,12);
/*!40000 ALTER TABLE `item_mast` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nobel_win`
--

DROP TABLE IF EXISTS `nobel_win`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nobel_win` (
  `YEAR` int(4) DEFAULT NULL,
  `SUBJECT` varchar(10) DEFAULT NULL,
  `WINNER` varchar(21) DEFAULT NULL,
  `COUNTRY` varchar(7) DEFAULT NULL,
  `CATEGORY` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nobel_win`
--

LOCK TABLES `nobel_win` WRITE;
/*!40000 ALTER TABLE `nobel_win` DISABLE KEYS */;
INSERT INTO `nobel_win` VALUES (1970,'Physics','HannesAlfven','Sweden','Scientist'),(1970,'Physics','LouisNeel','France','Scientist'),(1970,'Chemistry','LuisFedericoLeloir','France','Scientist'),(1970,'Physiology','UlfvonEuler','Sweden','Scientist'),(1970,'Physiology','BernardKatz','Germany','Scientist'),(1970,'Literature','AleksandrSolzhenitsyn','Russia','Linguist'),(1970,'Economics','PaulSamuelson','USA','Economist'),(1970,'Physiology','JuliusAxelrod','USA','Scientist'),(1971,'Physics','DennisGabor','Hungary','Scientist'),(1971,'Chemistry','GerhardHerzberg','Germany','Scientist'),(1971,'Peace','WillyBrandt','Germany','Chancellor'),(1971,'Literature','PabloNeruda','Chile','Linguist'),(1971,'Economics','SimonKuznets','Russia','Economist'),(1978,'Peace','Anwaral-Sadat','Egypt','President'),(1978,'Peace','MenachemBegin','Israel','PrimeMinister'),(1987,'Chemistry','DonaldJ.Cram','USA','Scientist'),(1987,'Chemistry','Jean-MarieLehn','France','Scientist'),(1987,'Physiology','SusumuTonegawa','Japan','Scientist'),(1994,'Economics','ReinhardSelten','Germany','Economist'),(1994,'Peace','YitzhakRabin','Israel','PrimeMinister'),(1987,'Physics','JohannesGeorgBednorz','Germany','Scientist'),(1987,'Literature','JosephBrodsky','Russia','Linguist'),(1987,'Economics','RobertSolow','USA','Economist'),(1994,'Literature','KenzaburoOe','Japan','Linguist');
/*!40000 ALTER TABLE `nobel_win` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `ord_no` int(5) NOT NULL,
  `purch_amt` decimal(6,2) DEFAULT NULL,
  `ord_date` date DEFAULT NULL,
  `customer_id` int(4) DEFAULT NULL,
  `salesman_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`ord_no`),
  KEY `customer_id` (`customer_id`),
  KEY `salesman_id` (`salesman_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`salesman_id`) REFERENCES `salesman` (`salesman_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (70001,150.50,'2012-10-05',3005,5002),(70002,65.26,'2012-10-05',3002,5001),(70003,2480.40,'2012-10-10',3009,5003),(70004,110.50,'2012-08-17',3009,5003),(70005,2400.60,'2012-07-27',3007,5001),(70007,948.50,'2012-09-10',3005,5002),(70008,5760.00,'2012-09-10',3002,5001),(70009,270.65,'2012-09-10',3001,5005),(70010,1983.43,'2012-10-10',3004,5006),(70011,75.29,'2012-08-17',3003,5007),(70012,250.45,'2012-06-27',3008,5002),(70013,3045.60,'2012-04-25',3002,5001);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesman`
--

DROP TABLE IF EXISTS `salesman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salesman` (
  `salesman_id` int(4) NOT NULL,
  `name` varchar(10) DEFAULT NULL,
  `city` varchar(8) DEFAULT NULL,
  `commission` decimal(3,2) DEFAULT NULL,
  PRIMARY KEY (`salesman_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesman`
--

LOCK TABLES `salesman` WRITE;
/*!40000 ALTER TABLE `salesman` DISABLE KEYS */;
INSERT INTO `salesman` VALUES (5001,'James Hoog','New York',0.15),(5002,'Nail Knite','Paris',0.13),(5003,'Lauson Hen','San Jose',0.12),(5005,'Pit Alex','London',0.11),(5006,'Mc Lyon','Paris',0.14),(5007,'Paul Adam','Rome',0.13);
/*!40000 ALTER TABLE `salesman` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-21 16:34:32
