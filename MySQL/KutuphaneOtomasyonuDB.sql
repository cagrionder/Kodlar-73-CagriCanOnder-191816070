-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: kutuphane_sistemi
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `all_book`
--

DROP TABLE IF EXISTS `all_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `all_book` (
  `book_id` varchar(45) DEFAULT NULL,
  `book_title` varchar(45) DEFAULT NULL,
  `book_author` varchar(45) DEFAULT NULL,
  `book_isbn` varchar(45) DEFAULT NULL,
  `book_publisher` varchar(45) DEFAULT NULL,
  `book_page` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `all_book`
--

LOCK TABLES `all_book` WRITE;
/*!40000 ALTER TABLE `all_book` DISABLE KEYS */;
INSERT INTO `all_book` VALUES ('10','Vakıf Kurulurken','Isaac Asimov','9786053757375','İthaki','320'),('16','Vakıf ve İmparatorluk','Isaac Asimov','9786053757390','İthaki','300'),('20','Vakıfın Sınırı','Isaac Asimov','9786053757475','İthaki','320'),('22','Vakıf ve Dünya','Isaac Asimov','9786053757398','İthaki','450'),('25','Java How to Program','Harvey Deitel','8516053454393','Pearson','1250'),('17','Java The Complete Reference','Herbert Schildt','9390491622','McGraw-Hill Education','1248'),('14','Vakıf','Isaac Asimov','9786053757385','İthaki','250'),('18','İkinci Vakıf','Isaac Asimov','9786053757395','İthaki','350'),('12','Vakıf İleri','Isaac Asimov','9786053757380','İthaki','210');
/*!40000 ALTER TABLE `all_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrow_book`
--

DROP TABLE IF EXISTS `borrow_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `borrow_book` (
  `member_id` int DEFAULT NULL,
  `member_firstname` varchar(45) DEFAULT NULL,
  `member_lastname` varchar(45) DEFAULT NULL,
  `book_id` varchar(45) DEFAULT NULL,
  `book_title` varchar(45) DEFAULT NULL,
  `book_author` varchar(45) DEFAULT NULL,
  `book_isbn` varchar(45) DEFAULT NULL,
  `book_publisher` varchar(45) DEFAULT NULL,
  `book_page` varchar(45) DEFAULT NULL,
  `issue_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrow_book`
--

LOCK TABLES `borrow_book` WRITE;
/*!40000 ALTER TABLE `borrow_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `borrow_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `id` int NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(45) DEFAULT NULL,
  `admin_user` varchar(45) NOT NULL,
  `admin_password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (10,'Buğra  Güntekin','admin','1234'),(11,'Ahmet Yıldız','root','1234');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `id` int NOT NULL AUTO_INCREMENT,
  `member_firstname` varchar(45) DEFAULT NULL,
  `member_lastname` varchar(45) DEFAULT NULL,
  `member_user` varchar(45) DEFAULT NULL,
  `member_posta` varchar(100) DEFAULT NULL,
  `member_pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (3,'Çağrı','Önder','user14','cagri@gmail.com','1234'),(4,'Cevdet','Canver','user12','Cevdet@gmail.com','12345'),(6,'Mehmet','Çıtak','user9','mehmet@gmail.com','123');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `return_book`
--

DROP TABLE IF EXISTS `return_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `return_book` (
  `member_id` int DEFAULT NULL,
  `member_firstname` varchar(45) DEFAULT NULL,
  `member_lastname` varchar(45) DEFAULT NULL,
  `book_id` varchar(45) DEFAULT NULL,
  `book_title` varchar(45) DEFAULT NULL,
  `book_author` varchar(45) DEFAULT NULL,
  `book_isbn` varchar(45) DEFAULT NULL,
  `book_publisher` varchar(45) DEFAULT NULL,
  `book_page` varchar(45) DEFAULT NULL,
  `issue_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `return_book`
--

LOCK TABLES `return_book` WRITE;
/*!40000 ALTER TABLE `return_book` DISABLE KEYS */;
INSERT INTO `return_book` VALUES (3,'Çağrı','Önder','14','Vakıf','Isaac Asimov','9786053757385','İthaki','250','2021-01-15','2021-01-18'),(4,'Cevdet','Canver','18','İkinci Vakıf','Isaac Asimov','9786053757395','İthaki','350','2021-01-13','2021-01-16'),(4,'Cevdet','Canver','18','İkinci Vakıf','Isaac Asimov','9786053757395','İthaki','350','2021-01-17','2021-01-19'),(6,'Mehmet','Çıtak','12','Vakıf İleri','Isaac Asimov','9786053757380','İthaki','210','2021-01-14','2021-01-19');
/*!40000 ALTER TABLE `return_book` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-17 19:19:56
