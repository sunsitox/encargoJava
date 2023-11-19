-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-11-2023 a las 10:23:30
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
(1, 21000, 'Pantalones Cargo'),
(2, 21000, 'Pantalones Cargo'),
(3, 21000, 'Pantalones Cargo'),
(4, 24000, 'Pantalón Lino'),
(5, 24000, 'Pantalón Lino'),
(6, 24000, 'Pantalón Lino'),
(7, 29990, 'Polera de Bambú'),
(8, 19990, 'Polera interior'),
(9, 19990, 'Polera interior'),
(10, 19990, 'Polera interior'),
(11, 29990, 'Polera de Bambú'),
(12, 15000, 'Vestido de tirantes'),
(13, 24000, 'Vestidos midi casual'),
(14, 24000, 'Vestidos midi casual'),
(15, 23000, 'Vestido Sin Mangas'),
(16, 23000, 'Vestido Sin Mangas'),
(17, 23000, 'Vestido Sin Mangas');

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
(1, 'M', 'Algodón', 'Azul'),
(2, 'L', 'Algodón', 'Azul'),
(3, 'XL', 'Algodón', 'Negro'),
(4, 'S', 'Lino', 'Negro'),
(5, 'L', 'Lino', 'Azul'),
(6, 'XL', 'Lino', 'Blanco');

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

--
-- Volcado de datos para la tabla `polera`
--

INSERT INTO `polera` (`idPolera`, `talla`, `material`, `color`) VALUES
(7, 'L', 'Bambú', 'Azul'),
(8, 'S', 'Modal', 'Blanco '),
(9, 'M', 'Modal', 'Blanco '),
(10, 'L', 'Modal', 'Negro'),
(11, 'XL', 'Bambú', 'Gris');

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
(12, 'Encaje gasa de seda ', 'S', 'Si'),
(13, 'Seda cruda', 'M', 'No'),
(14, 'Seda cruda', 'M', 'Si'),
(15, 'Tafetán ', 'S', 'No'),
(16, 'Tafetán  ', 'S', 'Si'),
(17, 'Tafetán ', 'M', 'No');

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

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista1`  AS  select `art`.`id` AS `Id`,`art`.`nombre` AS `Nombre`,concat('$',format(`art`.`precio`,0,'de_DE')) AS `Precio`,(case when (`art`.`id` = `pol`.`idPolera`) then 'Polera' when (`art`.`id` = `ves`.`idVestido`) then 'Vestido' when (`art`.`id` = `pan`.`idPantalon`) then 'Pantalón' else 'Otro' end) AS `Tipo` from (((`articulo` `art` left join `pantalon` `pan` on((`pan`.`idPantalon` = `art`.`id`))) left join `vestido` `ves` on((`ves`.`idVestido` = `art`.`id`))) left join `polera` `pol` on((`pol`.`idPolera` = `art`.`id`))) order by `art`.`id` ;

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
