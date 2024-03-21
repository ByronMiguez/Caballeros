-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-03-2024 a las 21:53:29
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
-- Estructura de tabla para la tabla `armas`
--

CREATE TABLE `armas` (
  `Id_arma` int(11) NOT NULL,
  `Tipo` varchar(255) NOT NULL,
  `Danio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `armas`
--

INSERT INTO `armas` (`Id_arma`, `Tipo`, `Danio`) VALUES
(1, 'Espada', 400),
(4, 'Daga de los cielos', 999),
(6, 'Arco', 350);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caballeros`
--

CREATE TABLE `caballeros` (
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

--
-- Volcado de datos para la tabla `caballeros`
--

INSERT INTO `caballeros` (`Id_caballero`, `Nombre`, `Experiencia`, `Danio_caballero`, `Velocidad_caballero`, `Id_arma`, `Id_escudo`, `Id_caballo`, `Id_escudero`) VALUES
(1, 'eñaut', 100, 200, 150, 1, 1, 1, 3),
(5, 'juanjo', 100, 100, 265, 4, 1, 4, 1),
(11, 'alberto', 300, 100, 200, 6, 1, 3, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caballos`
--

CREATE TABLE `caballos` (
  `Id_caballo` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Velocidad` int(11) NOT NULL,
  `Resistencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `caballos`
--

INSERT INTO `caballos` (`Id_caballo`, `Nombre`, `Velocidad`, `Resistencia`) VALUES
(1, 'juan', 22, 12),
(3, 'cola', 450, 560),
(4, 'miguelito', 300, 100),
(5, 'null', 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escuderos`
--

CREATE TABLE `escuderos` (
  `Id_escudero` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Experiencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `escuderos`
--

INSERT INTO `escuderos` (`Id_escudero`, `Nombre`, `Experiencia`) VALUES
(1, 'Unai', 11),
(2, 'Javi', 49),
(3, 'paco', 45),
(4, 'juanjo', 45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escudos`
--

CREATE TABLE `escudos` (
  `Id_escudo` int(11) NOT NULL,
  `Tipo` varchar(255) NOT NULL,
  `Defensa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `escudos`
--

INSERT INTO `escudos` (`Id_escudo`, `Tipo`, `Defensa`) VALUES
(1, 'grande', 200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `luchas`
--

CREATE TABLE `luchas` (
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
-- Indices de la tabla `armas`
--
ALTER TABLE `armas`
  ADD PRIMARY KEY (`Id_arma`);

--
-- Indices de la tabla `caballeros`
--
ALTER TABLE `caballeros`
  ADD PRIMARY KEY (`Id_caballero`),
  ADD UNIQUE KEY `Id_caballo_2` (`Id_caballo`),
  ADD UNIQUE KEY `Id_escudero_2` (`Id_escudero`),
  ADD UNIQUE KEY `Id_caballo` (`Id_caballo`) USING BTREE,
  ADD UNIQUE KEY `Id_escudero` (`Id_escudero`) USING BTREE,
  ADD KEY `Id_arma` (`Id_arma`),
  ADD KEY `Id_escudo` (`Id_escudo`);

--
-- Indices de la tabla `caballos`
--
ALTER TABLE `caballos`
  ADD PRIMARY KEY (`Id_caballo`);

--
-- Indices de la tabla `escuderos`
--
ALTER TABLE `escuderos`
  ADD PRIMARY KEY (`Id_escudero`);

--
-- Indices de la tabla `escudos`
--
ALTER TABLE `escudos`
  ADD PRIMARY KEY (`Id_escudo`);

--
-- Indices de la tabla `luchas`
--
ALTER TABLE `luchas`
  ADD PRIMARY KEY (`Id`,`Id_caballero1`,`Id_caballero2`,`Fecha`),
  ADD KEY `Id_caballero1` (`Id_caballero1`,`Id_caballero2`),
  ADD KEY `fk_lucha_caballero2` (`Id_caballero2`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `armas`
--
ALTER TABLE `armas`
  MODIFY `Id_arma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `caballeros`
--
ALTER TABLE `caballeros`
  MODIFY `Id_caballero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `caballos`
--
ALTER TABLE `caballos`
  MODIFY `Id_caballo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `escuderos`
--
ALTER TABLE `escuderos`
  MODIFY `Id_escudero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `escudos`
--
ALTER TABLE `escudos`
  MODIFY `Id_escudo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `luchas`
--
ALTER TABLE `luchas`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `caballeros`
--
ALTER TABLE `caballeros`
  ADD CONSTRAINT `fk_caballero_arma` FOREIGN KEY (`Id_arma`) REFERENCES `armas` (`Id_arma`),
  ADD CONSTRAINT `fk_caballero_caballo` FOREIGN KEY (`Id_caballo`) REFERENCES `caballos` (`Id_caballo`),
  ADD CONSTRAINT `fk_caballero_escudero` FOREIGN KEY (`Id_escudero`) REFERENCES `escuderos` (`Id_escudero`),
  ADD CONSTRAINT `fk_caballero_escudo` FOREIGN KEY (`Id_escudo`) REFERENCES `escudos` (`Id_escudo`);

--
-- Filtros para la tabla `luchas`
--
ALTER TABLE `luchas`
  ADD CONSTRAINT `fk_lucha_caballero1` FOREIGN KEY (`Id_caballero1`) REFERENCES `caballeros` (`Id_caballero`),
  ADD CONSTRAINT `fk_lucha_caballero2` FOREIGN KEY (`Id_caballero2`) REFERENCES `caballeros` (`Id_caballero`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
