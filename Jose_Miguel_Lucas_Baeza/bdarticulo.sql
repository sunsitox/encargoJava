-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2023 a las 08:04:36
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
-- Estructura de tabla para la tabla `pantalon`
--

CREATE TABLE `pantalon` (
  `idPantalon` int(25) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `talla` varchar(3) NOT NULL,
  `material` varchar(25) NOT NULL,
  `color` varchar(25) NOT NULL,
  `precio` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pantalon`
--

INSERT INTO `pantalon` (`idPantalon`, `nombre`, `talla`, `material`, `color`, `precio`) VALUES
(1, 'Pantalones Cargo', 'L', 'Algodón', 'Negro', 21000),
(2, 'Pantalones Cargo', 'L', 'Algodón', 'Azul', 21000),
(3, 'Pantalones Cargo', 'XL', 'Algodón', 'Negro', 21000),
(4, 'Pantalón Lino', 'S', 'Lino', 'Negro', 24000),
(5, 'Pantalón Lino', 'L', 'Lino', 'Azul', 24000),
(6, 'Pantalón Lino', 'XL', 'Lino', 'Blanco', 24000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `polera`
--

CREATE TABLE `polera` (
  `idPolera` int(25) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `talla` varchar(25) NOT NULL,
  `material` varchar(25) NOT NULL,
  `color` varchar(25) NOT NULL,
  `precio` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `polera`
--

INSERT INTO `polera` (`idPolera`, `nombre`, `talla`, `material`, `color`, `precio`) VALUES
(7, 'Polera de Bambú', 'L', 'Bambú', 'Azul', 29990),
(8, 'Polera interior', 'S', 'Modal', 'Blanco ', 19990),
(9, 'Polera interior', 'M', 'Modal', 'Blanco ', 19990),
(10, 'Polera interior', 'L', 'Modal', 'Negro', 19990),
(11, 'Polera interior', 'XL', 'Bambú', 'Gris', 19990);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vestido`
--

CREATE TABLE `vestido` (
  `idVestido` int(25) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `tela` varchar(25) NOT NULL,
  `talla` varchar(3) NOT NULL,
  `diceno` varchar(25) NOT NULL,
  `precio` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vestido`
--

INSERT INTO `vestido` (`idVestido`, `nombre`, `tela`, `talla`, `diceno`, `precio`) VALUES
(12, 'Vestido de tirantes', 'Encaje gasa de seda ', 'S', 'Si', 15000),
(13, 'Vestidos midi casual', 'Seda cruda', 'M', 'No', 24000),
(14, 'Vestidos midi casual', 'Seda cruda', 'M', 'Si', 24000),
(15, 'Vestido Sin Mangas', 'Tafetán ', 'S', 'No', 23000),
(16, 'Vestido Sin Mangas', 'Tafetán  ', 'S', 'Si', 23000),
(17, 'Vestido Sin Mangas', 'Tafetán ', 'M', 'No', 23000);

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

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista1`  AS  select `pantalon`.`idPantalon` AS `Id`,`pantalon`.`nombre` AS `Nombre`,concat('$',format(`pantalon`.`precio`,0,'de_DE')) AS `Precio`,'Pantalon' AS `Tipo` from `pantalon` union all select `polera`.`idPolera` AS `idPolera`,`polera`.`nombre` AS `nombre`,concat('$',format(`polera`.`precio`,0,'de_DE')) AS `CONCAT('$', FORMAT(precio, 0, 'de_DE'))`,'Polera' AS `Polera` from `polera` union all select `vestido`.`idVestido` AS `idVestido`,`vestido`.`nombre` AS `nombre`,concat('$',format(`vestido`.`precio`,0,'de_DE')) AS `CONCAT('$', FORMAT(precio, 0, 'de_DE'))`,'Vestido' AS `Vestido` from `vestido` order by 1 ;

--
-- Índices para tablas volcadas
--

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
