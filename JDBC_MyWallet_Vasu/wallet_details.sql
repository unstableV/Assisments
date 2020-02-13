-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 13, 2020 at 12:39 PM
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
-- Database: `mywallet`
--

-- --------------------------------------------------------

--
-- Table structure for table `wallet_details`
--

CREATE TABLE `wallet_details` (
  `wallet_accountNo` int(100) NOT NULL,
  `wallet_name` varchar(10) NOT NULL,
  `wallet_id` int(100) NOT NULL,
  `wallet_amount` int(100) NOT NULL,
  `wallet_phoneNo` int(10) NOT NULL,
  `widh_details` int(100) NOT NULL,
  `deposite_details` int(100) NOT NULL,
  `wallet_time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `wallet_details`
--

INSERT INTO `wallet_details` (`wallet_accountNo`, `wallet_name`, `wallet_id`, `wallet_amount`, `wallet_phoneNo`, `widh_details`, `deposite_details`, `wallet_time`) VALUES
(0, '', 1, -233, 0, 0, 0, '0000-00-00 00:00:00'),
(123, 'vasu', 2, -3432209, 97973444, 0, 0, '2020-02-13 16:54:21'),
(23, 'mir', 3, 43, 2123444, 0, 0, '2020-02-13 16:41:38'),
(1122, 'amit', 4, 122, 89028334, 0, 0, '2020-02-13 16:33:58');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `wallet_details`
--
ALTER TABLE `wallet_details`
  ADD PRIMARY KEY (`wallet_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `wallet_details`
--
ALTER TABLE `wallet_details`
  MODIFY `wallet_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
