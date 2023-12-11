-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 22, 2023 at 03:35 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `login`
--

-- --------------------------------------------------------

--
-- Table structure for table `application`
--

CREATE TABLE `application` (
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `id` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `password`) VALUES
(39, 'dsfsdfdsf', 'nhlanha@gmail.com', 'knowldge'),
(40, 'dsfsdfdsf', 'nhlanha@gmail.com', 'knowldge'),
(41, 'dsfsdfdsf', 'nhlanha@gmail.com', 'knowldge'),
(42, 'dsfsdfdsf', 'nhlanha@gmail.com', 'knowldge'),
(43, 'dsfsdfdsf', 'nhlanha@gmail.com', 'knowldge'),
(44, 'dsfsdfdsf', 'nhlanha@gmail.com', 'knowldge'),
(45, 'dsfsdfdsf', 'nhlanha@gmail.com', 'knowldge'),
(46, 'dsfsdfdsf', 'nhlanha@gmail.com', 'knowldge'),
(47, 'dsfsdfdsf', 'nhlanha@gmail.com', 'knowldge'),
(48, 'hhh', 'nhlanha@dfdsffgmail.com', 'sdfsdf'),
(49, 'hhh', 'nhlanha@dfdsffgmail.com', 'sdfsdf'),
(50, 'dfewdw', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(51, 'dfewdw', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(52, 'dfewdw', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(53, 'dfewdw', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(54, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(55, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(56, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(57, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(58, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(59, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(60, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(61, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(62, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(63, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(64, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(65, 'uyuytuyu', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(66, 'sdfsdfdsfsd', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(67, 'sdfsdfdsfsd', 'nhlanha@dfdsffgmail.com', 'Nhlanhlakhoza05@'),
(68, 'sdfsdfsdfsd', 'nhlanha@dfdsffgmail.com', 'Nhlanhla05@'),
(69, 'sdfsdfsdfsd', 'nhlanha@dfdsffgmail.com', 'Nhlanhla05@'),
(70, 'sdfsdfsdfsd', 'nhlanha@dfdsffgmail.com', 'Nhlanhla05@'),
(71, 'ohhh', 'fsdfsdf@gmail.com', 'nhlanhla055@'),
(72, 'ohhh', 'fsdfsdf@gmail.com', 'nhlanhla055@'),
(73, 'asssssss', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(74, 'asssssss', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(75, 'asssssss', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(76, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(77, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(78, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(79, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(80, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(81, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(82, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(83, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(84, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(85, 'victoria', 'fsdfsdf@gmail.com', 'nhlanhla05@'),
(86, 'GDFGDFGFD', 'fsdfsdf@gmail.com', 'NHLANHLA05@'),
(87, 'GDFGDFGFD', 'fsdfsdf@gmail.com', 'NHLANHLA05@'),
(88, 'GDFGDFGFD', 'fsdfsdf@gmail.com', 'NHLANHLA05@'),
(89, 'GDFGDFGFD', 'fsdfsdf@gmail.com', 'NHLANHLA05@'),
(90, 'GDFGDFGFD', 'fsdfsdf@gmail.com', 'NHLANHLA05@'),
(91, 'GDFGDFGFD', 'fsdfsdf@gmail.com', 'NHLANHLA05@'),
(92, 'GDFGDFGFD', 'fsdfsdf@gmail.com', 'NHLANHLA05@'),
(93, 'knowledge', 'fdg@gmail.com', 'nhlanhla05@'),
(94, 'kkn', 'fdggg@gmail.com', 'knowledge');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=95;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
