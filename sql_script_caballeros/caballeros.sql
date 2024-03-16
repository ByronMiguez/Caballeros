-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-03-2024 a las 12:27:06
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

CREATE TABLE `Armas` (
  `Id_arma` int(11) NOT NULL,
  `Tipo` varchar(255) NOT NULL,
  `Danio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caballero`
--

CREATE TABLE `Caballeros` (
  `Id_caballero` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Experiencia` int(11) NOT NULL,
  `Danio_caballero` int(11) NOT NULL,
  `Velocidad_caballero` int(11) NOT NULL,
  `Id_arma` int(11) NOT NULL,
  `Id_escudo` int(11) NOT NULL,
  `Id_caballo` int(11) NOT NULL,
  `Id_escudero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caballo`
--

CREATE TABLE `Caballos` (
  `Id_caballo` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Velocidad` int(11) NOT NULL,
  `Resistencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escudero`
--

CREATE TABLE `Escuderos` (
  `Id_escudero` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Experiencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escudo`
--

CREATE TABLE `Escudos` (
  `Id_escudo` int(11) NOT NULL,
  `Tipo` varchar(255) NOT NULL,
  `Defensa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lucha`
--

CREATE TABLE `Luchas` (
  `Id` int(11) NOT NULL,
  `Id_caballero1` int(11) NOT NULL,
  `Id_caballero2` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Ganador` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arma`
--
ALTER TABLE `Armas`
  ADD PRIMARY KEY (`Id_arma`);

--
-- Indices de la tabla `caballero`
--
ALTER TABLE `Caballeros`
  ADD PRIMARY KEY (`Id_caballero`),
  ADD KEY `Id_arma` (`Id_arma`),
  ADD KEY `Id_escudo` (`Id_escudo`),
  ADD KEY `Id_caballo` (`Id_caballo`),
  ADD KEY `Id_escudero` (`Id_escudero`);

--
-- Indices de la tabla `caballo`
--
ALTER TABLE `Caballos`
  ADD PRIMARY KEY (`Id_caballo`);

--
-- Indices de la tabla `escudero`
--
ALTER TABLE `Escuderos`
  ADD PRIMARY KEY (`Id_escudero`);

--
-- Indices de la tabla `escudo`
--
ALTER TABLE `Escudos`
  ADD PRIMARY KEY (`Id_escudo`);

--
-- Indices de la tabla `lucha`
--
ALTER TABLE `Luchas`
  ADD PRIMARY KEY (`Id`,`Id_caballero1`,`Id_caballero2`,`Fecha`),
  ADD KEY `Id_caballero1` (`Id_caballero1`,`Id_caballero2`),
  ADD KEY `fk_lucha_caballero2` (`id_caballero2`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arma`
--
ALTER TABLE `Armas`
  MODIFY `Id_arma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `caballero`
--
ALTER TABLE `Caballeros`
  MODIFY `Id_caballero` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `caballo`
--
ALTER TABLE `Caballos`
  MODIFY `Id_caballo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `escudero`
--
ALTER TABLE `Escuderos`
  MODIFY `Id_escudero` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `escudo`
--
ALTER TABLE `Escudos`
  MODIFY `Id_escudo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `caballero`
--
ALTER TABLE `Caballeros`
  ADD CONSTRAINT `fk_caballero_arma` FOREIGN KEY (`Id_arma`) REFERENCES `Armas` (`Id_arma`),
  ADD CONSTRAINT `fk_caballero_caballo` FOREIGN KEY (`Id_caballo`) REFERENCES `Caballos` (`Id_caballo`),
  ADD CONSTRAINT `fk_caballero_escudero` FOREIGN KEY (`Id_escudero`) REFERENCES `Escuderos` (`Id_Escudero`),
  ADD CONSTRAINT `fk_caballero_escudo` FOREIGN KEY (`Id_escudo`) REFERENCES `Escudos` (`Id_escudo`);

--
-- Filtros para la tabla `lucha`
--
ALTER TABLE `Luchas`
  ADD CONSTRAINT `fk_lucha_caballero1` FOREIGN KEY (`Id_caballero1`) REFERENCES `Caballeros` (`Id_caballero`),
  ADD CONSTRAINT `fk_lucha_caballero2` FOREIGN KEY (`Id_caballero2`) REFERENCES `Caballeros` (`Id_caballero`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
