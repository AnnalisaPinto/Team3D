-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Gen 25, 2022 alle 12:39
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
-- Database: `amministrazione`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `admin`
--

CREATE TABLE `admin` (
  `nome_admin` varchar(50) NOT NULL,
  `password_admin` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `admin`
--

INSERT INTO `admin` (`nome_admin`, `password_admin`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Struttura della tabella `codici`
--

CREATE TABLE `codici` (
  `id_codice` int(11) NOT NULL,
  `nome_codice` varchar(50) NOT NULL,
  `categoria_codice` varchar(50) NOT NULL,
  `codice` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `codici`
--

INSERT INTO `codici` (`id_codice`, `nome_codice`, `categoria_codice`, `codice`) VALUES
(9, 'Madonna - Hung Up', 'Pop', '<iframe style=\"border-radius:12px\" src=\"https://open.spotify.com/embed/track/3850dYVgOFIXJh5U4BFEWH?utm_source=generator\" width=\"100%\" height=\"380\" frameBorder=\"0\" allowfullscreen=\"\" allow=\"autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture\"></iframe>'),
(10, 'Lady Gaga - Poker Face', 'Pop', '<iframe style=\"border-radius:12px\" src=\"https://open.spotify.com/embed/track/1QV6tiMFM6fSOKOGLMHYYg?utm_source=generator\" width=\"100%\" height=\"380\" frameBorder=\"0\" allowfullscreen=\"\" allow=\"autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture\"></iframe>'),
(11, 'Sepultura - Ratamahatta', 'Metal', '<iframe style=\"border-radius:12px\" src=\"https://open.spotify.com/embed/track/3Tg8JctqoeIwZ3Rue8BjaI?utm_source=generator\" width=\"100%\" height=\"380\" frameBorder=\"0\" allowfullscreen=\"\" allow=\"autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture\"></iframe>'),
(15, 'Rammstein - Du hast', 'Metal', '<iframe style=\"border-radius:12px\" src=\"https://open.spotify.com/embed/track/5awDvzxWfd53SSrsRZ8pXO?utm_source=generator\" width=\"100%\" height=\"380\" frameBorder=\"0\" allowfullscreen=\"\" allow=\"autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture\"></iframe>'),
(16, 'Iron Maiden - The Number of the Beast', 'Metal', '<iframe style=\"border-radius:12px\" src=\"https://open.spotify.com/embed/track/3nlGByvetDcS1uomAoiBmy?utm_source=generator\" width=\"100%\" height=\"380\" frameBorder=\"0\" allowfullscreen=\"\" allow=\"autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture\"></iframe>'),
(27, 'This D.J. -  Warren G', 'Hip Hop', '<iframe style=\"border-radius:12px\" src=\"https://open.spotify.com/embed/track/2ImuQo1g14CTR9hZAZD3aQ?utm_source=generator\" width=\"100%\" height=\"380\" frameBorder=\"0\" allowfullscreen=\"\" allow=\"autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture\"></iframe>'),
(28, 'Tie Goes To The Runner -  Public Enemy', 'Hip Hop', '<iframe style=\"border-radius:12px\" src=\"https://open.spotify.com/embed/track/2TZuNkLb0J6oKLEdlZ0XX3?utm_source=generator\" width=\"100%\" height=\"380\" frameBorder=\"0\" allowfullscreen=\"\" allow=\"autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture\"></iframe>'),
(29, 'Watermelon Man - Remastered - Herbie Hancock', 'Jazz', '<iframe style=\"border-radius:12px\" src=\"https://open.spotify.com/embed/track/38xcUjiTP1ivfb7ObwjyGA?utm_source=generator\" width=\"100%\" height=\"380\" frameBorder=\"0\" allowfullscreen=\"\" allow=\"autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture\"></iframe>'),
(30, 'One For Daddy-O - Remastered - Cannonball Adderley', 'Jazz', '<iframe style=\"border-radius:12px\" src=\"https://open.spotify.com/embed/track/4f0D7T8yswXUJ62AKLoMtS?utm_source=generator\" width=\"100%\" height=\"380\" frameBorder=\"0\" allowfullscreen=\"\" allow=\"autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture\"></iframe>'),
(34, 'null', 'null', 'null');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `codici`
--
ALTER TABLE `codici`
  ADD PRIMARY KEY (`id_codice`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `codici`
--
ALTER TABLE `codici`
  MODIFY `id_codice` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
