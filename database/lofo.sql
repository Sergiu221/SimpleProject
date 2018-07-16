CREATE DATABASE  IF NOT EXISTS `lofo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `lofo`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: lofo
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adds`
--

DROP TABLE IF EXISTS `adds`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `adds` (
  `id_add` int(35) NOT NULL AUTO_INCREMENT,
  `image_add` varchar(300) NOT NULL,
  `description_add` text NOT NULL,
  `type_add` int(1) DEFAULT NULL,
  `id_category` int(1) NOT NULL,
  `date_add` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_user` int(11) NOT NULL,
  `id_city` int(11) NOT NULL,
  PRIMARY KEY (`id_add`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adds`
--

LOCK TABLES `adds` WRITE;
/*!40000 ALTER TABLE `adds` DISABLE KEYS */;
INSERT INTO `adds` VALUES (1,'light.jpeg','I lost this lighter on my way to Lidl to OMV in the Pacurari area. It has sentimental value.',0,1,'2018-07-15 18:01:21',2,1),(2,'keys-friend.jpg','My friend found these keys.',1,1,'2018-06-28 07:01:21',2,2),(3,'keys.jpg','I found these keys on Dimitrie Street number 3.',1,5,'2017-05-25 18:03:54',2,1),(4,'book.jpg','I lost this book to the downtown library with the name \"A.I Cuza\".',0,3,'2018-05-28 13:04:28',1,3),(5,'samsungS6.jpg','I forgot this phone on the bus from 14:00 to Bucharest.',0,1,'2018-06-10 13:06:31',3,4),(6,'dog.jpg','\nI found this dog without a master. He is very cute.',1,2,'2018-05-11 08:50:23',1,1);
/*!40000 ALTER TABLE `adds` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `categories` (
  `id_category` int(1) NOT NULL,
  `name_category` varchar(10) NOT NULL,
  PRIMARY KEY (`id_category`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'phone'),(2,'pet'),(3,'papers'),(5,'key'),(6,'other');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cities`
--

DROP TABLE IF EXISTS `cities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cities` (
  `id_city` int(11) NOT NULL,
  `name_city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_city`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cities`
--

LOCK TABLES `cities` WRITE;
/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` VALUES (1,'Iasi'),(2,'Bucuresti'),(3,'Timisoara'),(4,'Cluj'),(5,'Other');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comments`
--

DROP TABLE IF EXISTS `comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `comments` (
  `id_coment` int(11) NOT NULL AUTO_INCREMENT,
  `conted` text NOT NULL,
  `lpost_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id_coment`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comments`
--

LOCK TABLES `comments` WRITE;
/*!40000 ALTER TABLE `comments` DISABLE KEYS */;
INSERT INTO `comments` VALUES (1,'Comment 1.',1,1),(2,'Comment2.',5,3),(3,'Comment 3.',4,3),(4,'Comment 4.',4,2);
/*!40000 ALTER TABLE `comments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reports`
--

DROP TABLE IF EXISTS `reports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `reports` (
  `Id_Add` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reports`
--

LOCK TABLES `reports` WRITE;
/*!40000 ALTER TABLE `reports` DISABLE KEYS */;
/*!40000 ALTER TABLE `reports` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `typeads`
--

DROP TABLE IF EXISTS `typeads`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `typeads` (
  `Id_Add` int(1) NOT NULL,
  `Type_Add` varchar(5) NOT NULL,
  PRIMARY KEY (`Id_Add`),
  UNIQUE KEY `Id_Ads` (`Id_Add`),
  KEY `Id_Ads_2` (`Id_Add`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `typeads`
--

LOCK TABLES `typeads` WRITE;
/*!40000 ALTER TABLE `typeads` DISABLE KEYS */;
INSERT INTO `typeads` VALUES (0,'LOST'),(1,'FOUND');
/*!40000 ALTER TABLE `typeads` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `name_user` varchar(35) NOT NULL,
  `password_user` varchar(35) NOT NULL,
  `email_user` varchar(1250) NOT NULL,
  `active_user` int(11) NOT NULL DEFAULT '1',
  `type_user` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Boca','7c6a180b36896a0a8c02787eeafb0e4c','arsenie.v.boca@lumina.boss.com',1,1),(2,'Madalina','5f4dcc3b5aa765d61d8327deb882cf99','madalina.bo$$@compania.boss.com',0,0),(3,'Sergiu','5f4dcc3b5aa765d61d8327deb882cf99','sergiu.v@yahoo.com',1,0),(4,'test','fcea920f7412b5da7be0cf42b8c93759','test@test.com',0,0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `view_adds`
--

DROP TABLE IF EXISTS `view_adds`;
/*!50001 DROP VIEW IF EXISTS `view_adds`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `view_adds` AS SELECT 
 1 AS `id`,
 1 AS `username`,
 1 AS `category`,
 1 AS `city`,
 1 AS `description`,
 1 AS `image`,
 1 AS `type`,
 1 AS `date`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `view_adds`
--

/*!50001 DROP VIEW IF EXISTS `view_adds`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_adds` AS select `a`.`id_add` AS `id`,`u`.`name_user` AS `username`,`g`.`name_category` AS `category`,`c`.`name_city` AS `city`,`a`.`description_add` AS `description`,`a`.`image_add` AS `image`,`a`.`type_add` AS `type`,`a`.`date_add` AS `date` from (((`adds` `a` join `cities` `c` on((`a`.`id_city` = `c`.`id_city`))) join `categories` `g` on((`a`.`id_category` = `g`.`id_category`))) join `users` `u` on((`a`.`id_user` = `u`.`id_user`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-16 12:32:51
