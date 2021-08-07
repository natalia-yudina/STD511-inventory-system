-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2020 at 08:08 AM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_inventory_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `item_ID` varchar(10) NOT NULL,
  `description` varchar(50) NOT NULL,
  `price` float NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_ID`, `description`, `price`, `quantity`) VALUES
('002', 'printer', 20.5, 3),
('003', 'table1', 200, 5),
('004', 'lamp', 5, 5),
('005', 'keyboard', 15, 4),
('006', 'office chair', 17, 50),
('007', 'book', 2, 20);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_ID` varchar(10) NOT NULL,
  `order_sum` double NOT NULL,
  `order_date` date NOT NULL,
  `responsible_person` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_ID`, `order_sum`, `order_date`, `responsible_person`) VALUES
('111091334', 0, '2020-12-10', 'Purchasing admin'),
('11109424', 35, '2020-12-10', 'Purchasing admin'),
('11109553', 41, '2020-12-10', 'Purchasing admin'),
('117203837', 0, '2020-12-07', ''),
('117211419', 15, '2020-12-07', ''),
('11721442', 90, '2020-12-07', ''),
('11721727', 30, '2020-12-07', ''),
('119125832', 50.5, '2020-12-09', 'Purchasing admin'),
('11913134', 20, '2020-12-09', 'Purchasing admin'),
('119132023', 115.7, '2020-12-09', 'Purchasing admin'),
('119132120', 0, '2020-12-09', 'Purchasing admin'),
('11913258', 50.5, '2020-12-09', 'Purchasing admin'),
('1191370', 20, '2020-12-09', 'Purchasing admin'),
('11922208', 100.7, '2020-12-09', 'Purchasing admin');

-- --------------------------------------------------------

--
-- Table structure for table `order_details`
--

CREATE TABLE `order_details` (
  `order_details_ID` varchar(13) NOT NULL,
  `order_number` varchar(10) NOT NULL,
  `product_number` varchar(10) NOT NULL,
  `quantity` int(11) NOT NULL,
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `order_details`
--

INSERT INTO `order_details` (`order_details_ID`, `order_number`, `product_number`, `quantity`, `status`) VALUES
('111091334_1', '111091334', '003', 10, 'out of stock'),
('11109424_1', '11109424', '004', 1, 'given out'),
('11109424_2', '11109424', '005', 2, 'given out'),
('11109553_1', '11109553', '002', 2, 'given out'),
('11913134_1', '11913134', '005', 1, 'given out'),
('11913134_2', '11913134', '004', 1, 'given out'),
('119131551_1', '119131551', '005', 1, 'given out'),
('119132023_1', '119132023', '005', 1, 'given out'),
('119132023_2', '119132023', '003', 1, 'given out'),
('119132120_1', '119132120', '003', 4, 'out of stock'),
('1191370_0', '1191370', '005', 1, 'given out'),
('1191370_1', '1191370', '004', 1, 'given out'),
('119171355_1', '119171355', '005', 1, 'given out'),
('119171355_2', '119171355', '004', 1, 'given out'),
('119221026_1', '119221026', '003', 1, 'given out'),
('119221456_1', '119221456', '003', 1, 'given out'),
('11922208_1', '11922208', '003', 1, 'given out'),
('119222325_1', '119222325', '004', 1, 'given out'),
('11922842_1', '11922842', '004', 1, 'given out');

-- --------------------------------------------------------

--
-- Table structure for table `staff_members`
--

CREATE TABLE `staff_members` (
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `gender` char(6) NOT NULL,
  `position` varchar(30) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` char(10) NOT NULL,
  `member_ID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `staff_members`
--

INSERT INTO `staff_members` (`first_name`, `last_name`, `gender`, `position`, `username`, `password`, `member_ID`) VALUES
('Maria', 'Khon', 'Female', 'Purchasing admin', 'khon', '111', '00001'),
('Yulia', 'Volk', 'Female', 'Store manager', 'volk', '222', '00002'),
('Alex', 'Lee', 'Male', 'Stock manager', 'lee', '444', '00004'),
('Tony', 'Roy', 'Male', 'Purchasing admin', 'roy', '888', '0008');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`item_ID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_ID`);

--
-- Indexes for table `order_details`
--
ALTER TABLE `order_details`
  ADD PRIMARY KEY (`order_details_ID`);

--
-- Indexes for table `staff_members`
--
ALTER TABLE `staff_members`
  ADD PRIMARY KEY (`member_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
