-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: wedding_planner_system
-- ------------------------------------------------------
-- Server version	8.0.32
--
-- Table structure for table `signupdetails`
--
CREATE DATABASE weddingsys;
USE weddingsys;
DROP TABLE IF EXISTS `signupdetails`;
CREATE TABLE `signupdetails` (
  `name` varchar(20) DEFAULT NULL,
  `mobile` varchar(10) DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL,
  `pswd` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `signupdetails`
--

LOCK TABLES `signupdetails` WRITE;
INSERT INTO `signupdetails` VALUES ('aditi','1234','aditi','1234');
UNLOCK TABLES;