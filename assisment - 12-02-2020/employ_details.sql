-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 12, 2020 at 12:35 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employdetails`
--

-- --------------------------------------------------------

--
-- Table structure for table `employ_details`
--

CREATE TABLE `employ_details` (
  `employ_name` varchar(10) NOT NULL,
  `employ_id` int(10) NOT NULL,
  `employ_salary` int(10) NOT NULL,
  `employ_desigination` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employ_details`
--

INSERT INTO `employ_details` (`employ_name`, `employ_id`, `employ_salary`, `employ_desigination`) VALUES
('vasu', 1, 20000, ''),
('mir baba', 3, 1000, 'manager'),
('vasu', 4, 98000, ''),
('rahul', 5, 4344555, 'stock broker');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employ_details`
--
ALTER TABLE `employ_details`
  ADD PRIMARY KEY (`employ_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employ_details`
--
ALTER TABLE `employ_details`
  MODIFY `employ_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
