-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Feb 03, 2022 alle 12:25
-- Versione del server: 10.4.22-MariaDB
-- Versione PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `campaniausers`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `avatar`
--

CREATE TABLE `avatar` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `image` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `avatar`
--

INSERT INTO `avatar` (`id`, `name`, `image`) VALUES
(3, 'UomoAvido', 'https://images.clipartlogo.com/files/images/36/366887/greedy-man-clip-art_f.jpg');

-- --------------------------------------------------------

--
-- Struttura della tabella `contact`
--

CREATE TABLE `contact` (
  `id` int(11) NOT NULL,
  `asker_user_id` int(11) DEFAULT NULL,
  `asked_user_id` int(11) DEFAULT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `contact`
--

INSERT INTO `contact` (`id`, `asker_user_id`, `asked_user_id`, `status`) VALUES
(19, 7, 8, 1),
(24, 21, 18, 1),
(25, 9, 20, 0),
(26, 10, 22, 1),
(27, 15, 11, 0),
(29, 7, 10, 0),
(30, 12, 13, 1),
(31, 16, 17, 0),
(32, 19, 14, 1),
(33, 12, 7, 0),
(34, 13, 14, 1),
(35, 8, 20, 0),
(36, 10, 21, 1),
(41, 10, 15, 1),
(44, 10, 11, 1),
(46, 11, 10, 1),
(48, 15, 10, 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `follower`
--

CREATE TABLE `follower` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `follower_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `url`
--

CREATE TABLE `url` (
  `id` int(11) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `mail_address` varchar(255) DEFAULT NULL,
  `id_avatar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `user`
--

INSERT INTO `user` (`id`, `nickname`, `password`, `mail_address`, `id_avatar`) VALUES
(7, 'Nicknamebanale', 'nicknamebanale', 'banale.nickname@gmail.com', 4),
(8, 'Giorgio', 'giorgio', 'espositogiorgio1@gmail.com', 1),
(9, 'Ajeje', 'ajeje', 'AjejeBrazorf@gmail.com', 5),
(10, 'Chandra', 'chandra', 'chandramagic@hotmail.it', 13),
(11, 'UomoAvido', 'uomoavido', 'avidouomo@gmail.com', 10),
(12, 'Filippodettopippo', 'filippodettopippo', 'filippo10@virgilio.it', 7),
(13, 'Giuseppina', 'giuseppina', 'pinapina@gmail.com', 11),
(14, 'Alessia', 'alessia', 'alessiadivina@virgilio.it', 9),
(15, 'Ilrockettaro', 'ilrockettaro', 'vivailrock@gmail.com', 12),
(16, 'AmoIPanda', 'amoipanda', 'emailfalsa@gmail.com', 15),
(17, 'AmanteDiCani', 'amantedicani', 'amoicani@hotmail.com', 18),
(18, 'Rosalba', 'rosalba', 'rosalba95@gmail.com', 6),
(19, 'Gesualda', 'gesualda', 'dina93@hotmail.it', 3),
(20, 'Vincenzo', 'vincenzo', 'enzomatador@gmail.com', 2),
(21, 'Emanuela', 'emanuela', 'emanuela96@gmail.com', 8),
(22, 'MrGiraffa', 'mrgiraffa', 'mrgiraffa23@gmail.com', 20);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `avatar`
--
ALTER TABLE `avatar`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_1usu5w3nselijnsvsjmhiecsf` (`name`);

--
-- Indici per le tabelle `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKcb2rrwoy4w4mwqmlb0soxggjf` (`asked_user_id`),
  ADD KEY `FKjdu1p8qfsdcyb62ss0j2vwjhc` (`asker_user_id`);

--
-- Indici per le tabelle `follower`
--
ALTER TABLE `follower`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2tkyv0rmjw4t203ipp5tdob4a` (`follower_id`),
  ADD KEY `FKr99xseniq62g6519wn3i3duak` (`user_id`);

--
-- Indici per le tabelle `url`
--
ALTER TABLE `url`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9w6pk62lp313tcp6glxduwq6d` (`user_id`);

--
-- Indici per le tabelle `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_n4swgcf30j6bmtb4l4cjryuym` (`nickname`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `avatar`
--
ALTER TABLE `avatar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT per la tabella `contact`
--
ALTER TABLE `contact`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT per la tabella `follower`
--
ALTER TABLE `follower`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT per la tabella `url`
--
ALTER TABLE `url`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT per la tabella `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `contact`
--
ALTER TABLE `contact`
  ADD CONSTRAINT `FKcb2rrwoy4w4mwqmlb0soxggjf` FOREIGN KEY (`asked_user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKjdu1p8qfsdcyb62ss0j2vwjhc` FOREIGN KEY (`asker_user_id`) REFERENCES `user` (`id`);

--
-- Limiti per la tabella `follower`
--
ALTER TABLE `follower`
  ADD CONSTRAINT `FK2tkyv0rmjw4t203ipp5tdob4a` FOREIGN KEY (`follower_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKr99xseniq62g6519wn3i3duak` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

--
-- Limiti per la tabella `url`
--
ALTER TABLE `url`
  ADD CONSTRAINT `FK9w6pk62lp313tcp6glxduwq6d` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
