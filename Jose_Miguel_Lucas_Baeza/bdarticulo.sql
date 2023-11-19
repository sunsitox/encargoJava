-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-11-2023 a las 05:27:23
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdarticulo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE `articulo` (
  `id` int(25) NOT NULL,
  `precio` int(7) NOT NULL,
  `nombre` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `articulo`
--

INSERT INTO `articulo` (`id`, `precio`, `nombre`) VALUES
(12, 3232, 'cdsc'),
(34, 24333, 'fds'),
(93, 24333, 'fds'),
(123, 3232, 'cdsc'),
(444, 4000, 'pan'),
(665, 3232, 'cdsc'),
(934, 24333, 'fds');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pantalon`
--

CREATE TABLE `pantalon` (
  `idPantalon` int(25) NOT NULL,
  `talla` varchar(3) NOT NULL,
  `material` varchar(25) NOT NULL,
  `color` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pantalon`
--

INSERT INTO `pantalon` (`idPantalon`, `talla`, `material`, `color`) VALUES
(12, 'M', 'Lana', 'Azul'),
(123, 'M', 'Lana', 'Azul'),
(444, 'L', 'Lino', 'Azul'),
(665, 'M', 'Lana', 'Azul');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `polera`
--

CREATE TABLE `polera` (
  `idPolera` int(25) NOT NULL,
  `talla` varchar(25) NOT NULL,
  `material` varchar(25) NOT NULL,
  `color` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vestido`
--

CREATE TABLE `vestido` (
  `idVestido` int(25) NOT NULL,
  `tela` varchar(25) NOT NULL,
  `talla` varchar(3) NOT NULL,
  `diceno` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vestido`
--

INSERT INTO `vestido` (`idVestido`, `tela`, `talla`, `diceno`) VALUES
(34, 'tafetán ', 'M', 'No'),
(93, 'tafetán ', 'M', 'No'),
(934, 'tafetán ', 'M', 'No');

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista1`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista1` (
`Id` int(25)
,`Nombre` varchar(25)
,`Precio` varchar(48)
,`Tipo` varchar(8)
);

-- --------------------------------------------------------

--
-- Estructura para la vista `vista1`
--
DROP TABLE IF EXISTS `vista1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista1`  AS  select `art`.`id` AS `Id`,`art`.`nombre` AS `Nombre`,concat('$',format(`art`.`precio`,2)) AS `Precio`,(case when (`art`.`id` = `pol`.`idPolera`) then 'Polera' when (`art`.`id` = `ves`.`idVestido`) then 'Vestido' when (`art`.`id` = `pan`.`idPantalon`) then 'Pantalón' else 'Otro' end) AS `Tipo` from (((`articulo` `art` left join `pantalon` `pan` on((`pan`.`idPantalon` = `art`.`id`))) left join `vestido` `ves` on((`ves`.`idVestido` = `art`.`id`))) left join `polera` `pol` on((`pol`.`idPolera` = `art`.`id`))) order by `art`.`id` ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pantalon`
--
ALTER TABLE `pantalon`
  ADD PRIMARY KEY (`idPantalon`);

--
-- Indices de la tabla `polera`
--
ALTER TABLE `polera`
  ADD PRIMARY KEY (`idPolera`);

--
-- Indices de la tabla `vestido`
--
ALTER TABLE `vestido`
  ADD PRIMARY KEY (`idVestido`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pantalon`
--
ALTER TABLE `pantalon`
  ADD CONSTRAINT `pantalon_articulo_fk` FOREIGN KEY (`idPantalon`) REFERENCES `articulo` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `polera`
--
ALTER TABLE `polera`
  ADD CONSTRAINT `polera_articulo_fk` FOREIGN KEY (`idPolera`) REFERENCES `articulo` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `vestido`
--
ALTER TABLE `vestido`
  ADD CONSTRAINT `vestido_articulo_fk` FOREIGN KEY (`idVestido`) REFERENCES `articulo` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
