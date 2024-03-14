-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-03-2024 a las 14:05:36
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `caballeros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arma`
--

CREATE TABLE `arma` (
  `Tipo` varchar(255) NOT NULL,
  `daño` int(11) NOT NULL,
  `Id_arma` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caballero`
--

CREATE TABLE `caballero` (
  `Nombre` varchar(255) NOT NULL,
  `Id_caballero` int(11) NOT NULL,
  `Id_arma` int(11) NOT NULL,
  `Id_escudo` int(11) NOT NULL,
  `Id_caballo` int(11) NOT NULL,
  `Id_escudero` int(11) NOT NULL,
  `Experiencia` int(11) NOT NULL,
  `Daño_caballero` int(11) NOT NULL,
  `Velocidad_caballero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caballo`
--

CREATE TABLE `caballo` (
  `Nombre` varchar(255) NOT NULL,
  `Velocidad` int(11) NOT NULL,
  `Resistencia` int(11) NOT NULL,
  `Id_caballo` int(11) NOT NULL,
  `Id_caballero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escudero`
--

CREATE TABLE `escudero` (
  `Nombre` varchar(255) NOT NULL,
  `Experiencia` int(11) NOT NULL,
  `Id_escudero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escudo`
--

CREATE TABLE `escudo` (
  `Tipo` varchar(255) NOT NULL,
  `Defensa` int(11) NOT NULL,
  `Id_escudo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arma`
--
ALTER TABLE `arma`
  ADD PRIMARY KEY (`Id_arma`);

--
-- Indices de la tabla `caballero`
--
ALTER TABLE `caballero`
  ADD PRIMARY KEY (`Id_caballero`),
  ADD KEY `Id_arma` (`Id_arma`),
  ADD KEY `Id_escudo` (`Id_escudo`),
  ADD KEY `Id_caballo` (`Id_caballo`),
  ADD KEY `Id_escudero` (`Id_escudero`);

--
-- Indices de la tabla `caballo`
--
ALTER TABLE `caballo`
  ADD PRIMARY KEY (`Id_caballo`);

--
-- Indices de la tabla `escudero`
--
ALTER TABLE `escudero`
  ADD PRIMARY KEY (`Id_escudero`);

--
-- Indices de la tabla `escudo`
--
ALTER TABLE `escudo`
  ADD PRIMARY KEY (`Id_escudo`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `caballero`
--
ALTER TABLE `caballero`
  ADD CONSTRAINT `fk_caballero_arma` FOREIGN KEY (`Id_arma`) REFERENCES `arma` (`id_arma`),
  ADD CONSTRAINT `fk_caballero_caballo` FOREIGN KEY (`Id_caballo`) REFERENCES `caballo` (`Id_caballo`),
  ADD CONSTRAINT `fk_caballero_escudero` FOREIGN KEY (`Id_escudero`) REFERENCES `escudero` (`Id_Escudero`),
  ADD CONSTRAINT `fk_caballero_escudo` FOREIGN KEY (`Id_escudo`) REFERENCES `escudo` (`Id_escudo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
