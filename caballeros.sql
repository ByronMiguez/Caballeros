-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-03-2024 a las 10:17:54
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
  `Id_caballero` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Experiencia` int(11) NOT NULL,
  `Daño_caballero` int(11) NOT NULL,
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

CREATE TABLE `caballo` (
  `Id_caballo` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Velocidad` int(11) NOT NULL,
  `Resistencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escudero`
--

CREATE TABLE `escudero` (
  `Id_escudero` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Experiencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escudo`
--

CREATE TABLE `escudo` (
  `Id_escudo` int(11) NOT NULL,
  `Tipo` varchar(255) NOT NULL,
  `Defensa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lucha`
--

CREATE TABLE `lucha` (
  `Id` int(11) NOT NULL,
  `Id_caballero1` int(11) NOT NULL,
  `id_caballero2` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Ganador` varchar(255) NOT NULL
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
-- Indices de la tabla `lucha`
--
ALTER TABLE `lucha`
  ADD PRIMARY KEY (`Id`,`Id_caballero1`,`id_caballero2`,`Fecha`),
  ADD KEY `Id_caballero1` (`Id_caballero1`,`id_caballero2`),
  ADD KEY `fk_lucha_caballero2` (`id_caballero2`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arma`
--
ALTER TABLE `arma`
  MODIFY `Id_arma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `caballero`
--
ALTER TABLE `caballero`
  MODIFY `Id_caballero` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `caballo`
--
ALTER TABLE `caballo`
  MODIFY `Id_caballo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `escudero`
--
ALTER TABLE `escudero`
  MODIFY `Id_escudero` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `escudo`
--
ALTER TABLE `escudo`
  MODIFY `Id_escudo` int(11) NOT NULL AUTO_INCREMENT;

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

--
-- Filtros para la tabla `lucha`
--
ALTER TABLE `lucha`
  ADD CONSTRAINT `fk_lucha_caballero1` FOREIGN KEY (`Id_caballero1`) REFERENCES `caballero` (`Id_caballero`),
  ADD CONSTRAINT `fk_lucha_caballero2` FOREIGN KEY (`id_caballero2`) REFERENCES `caballero` (`Id_caballero`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

