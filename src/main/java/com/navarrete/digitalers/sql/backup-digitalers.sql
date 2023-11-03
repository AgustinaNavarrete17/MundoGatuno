-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: proyectodigitalers
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adoptantes`
--

DROP TABLE IF EXISTS `adoptantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adoptantes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `edad` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adoptantes`
--

LOCK TABLES `adoptantes` WRITE;
/*!40000 ALTER TABLE `adoptantes` DISABLE KEYS */;
INSERT INTO `adoptantes` VALUES (1,'Sosa','Casa a, calle 3, Godoy Cruz, Mendoza',26,'Juan',2618883300),(2,'Navarrete','Casa B, calle 1, Godoy Cruz, Mendoza',25,'Agustina',261551723),(3,'Maunás','Casa C, calle 2, Mendoza',30,'Martin',261562812),(4,'Lopez','Casa D, calle 3, Luján de Cuyo, Mendoza',60,'Carla',261009271);
/*!40000 ALTER TABLE `adoptantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alimentacion`
--

DROP TABLE IF EXISTS `alimentacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alimentacion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` varchar(500) DEFAULT NULL,
  `descripcion` varchar(1000) DEFAULT NULL,
  `horario` varchar(500) DEFAULT NULL,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alimentacion`
--

LOCK TABLES `alimentacion` WRITE;
/*!40000 ALTER TABLE `alimentacion` DISABLE KEYS */;
INSERT INTO `alimentacion` VALUES (1,'Se recomienda dar un puñado de alimento por vez que se le de de comer al gato','Este alimento es especial para gatos adultos que han sido castrados. Es un alimento rico en nutrientes, económico y fácil de conseguir en cualquier mercado','cada 8 horas','CatChow Castrados'),(2,'Se recomienda dar medio puñado de alimento por vez que se le de de comer al gato','Este alimento es especial para gatos cachorros de 3 a 8 meses. Es un alimento rico en nutrientes, económico y fácil de conseguir en cualquier mercado','cada 8 horas','CatChow Cachorros'),(3,'Se recomienda dar un puñado de alimento por vez que se le de de comer al gato','Este alimento es especial para gatos adultos y castrados. Es un alimento rico en nutrientes y es óptimo para cuidar la salud de nuestras mascotas, previniendo enfermedades de riñones y vía urinaria','cada 6 horas','Pro Plan urinario');
/*!40000 ALTER TABLE `alimentacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comportamientos`
--

DROP TABLE IF EXISTS `comportamientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comportamientos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(1000) DEFAULT NULL,
  `nombre` varchar(255) NOT NULL,
  `sugerencia` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comportamientos`
--

LOCK TABLES `comportamientos` WRITE;
/*!40000 ALTER TABLE `comportamientos` DISABLE KEYS */;
INSERT INTO `comportamientos` VALUES (1,'Cola arriba: feliz y alegre que probablemente sea accesible. Cola hacia abajo: asustado o amenazado. Cola se mueve rápidamente hacia adelante y hacia atrás: está agitado y debe dejarse en paz','¿Cómo usa su cola para comunicarse?','Se recomienda prestar atención a estos movimientos de nuestro gato, sobretodo cuando estén en etapa de conocerse, para evitar conflictos y malestar en nuestra mascota'),(2,'Existen varias respuestas: amasar para mostrar satisfacción o aliviar el estrés, amasar para crear un lugar suave para dormir o amasar para marcar su territorio','¿Por qué amasan los gatos?','Se recomienda permitir a nuestra mascota amasar tranquilamente, sin interrumpirlo para no generarle estrés. Para evitar que rompa telas/sábanas, etc, acostumbrarlo a amasar sobre su propia manta');
/*!40000 ALTER TABLE `comportamientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gatos`
--

DROP TABLE IF EXISTS `gatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gatos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adoptado` bit(1) NOT NULL,
  `color` varchar(255) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `edad` varchar(255) NOT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `nombre` varchar(255) NOT NULL,
  `peso` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) NOT NULL,
  `id_adoptante` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbv86xikko724bgokwtgdxe9r6` (`id_adoptante`),
  CONSTRAINT `FKbv86xikko724bgokwtgdxe9r6` FOREIGN KEY (`id_adoptante`) REFERENCES `adoptantes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gatos`
--

LOCK TABLES `gatos` WRITE;
/*!40000 ALTER TABLE `gatos` DISABLE KEYS */;
INSERT INTO `gatos` VALUES (1,_binary '\0','Tricolor tonalidades marrones','Mini es una gatita carey, es tranquila y cariñosa. Aún no está castrada. Se da en adopción con compromiso de castración a los 6 meses por parte del adoptante. Sabe usar las piedras sanitarias y alimentarse por su cuenta.','4 meses','2023-11-02','Mini','500 gramos','hembra',1),(2,_binary '\0','Beige','Felipe es un gato acostumbrado a convivir con otras mascotas, tanto perros como gatos. Está castrado, tiene las vacunas completas y reciéntemente se le aplicó una pipeta desparasitaria. Sabe usar piedras sanitarias y es muy educado','3 años',NULL,'Felipe','3 kilogramos','macho',1),(3,_binary '\0','Gris y blanco','Charly no está acostumbrado a vivir con otras mascotas, se requiere una familia que pueda adoptarlo para ser única mascota. Está castrado, tiene vacunación completa y está desparasitado.','4 años','2023-11-02','Charly','6 kilogramos','macho',NULL),(4,_binary '\0','Negro','Tita es una gata adulta mayor. Es sana, está castrada y vacunada. El único cuidado extra es brindarle alimento de tipo urinario, para cuidar su salud','10 años','2023-11-02','Tita','4 kilogramos','hembra',NULL);
/*!40000 ALTER TABLE `gatos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salud`
--

DROP TABLE IF EXISTS `salud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salud` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(1000) DEFAULT NULL,
  `nombre` varchar(255) NOT NULL,
  `tratamiento` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salud`
--

LOCK TABLES `salud` WRITE;
/*!40000 ALTER TABLE `salud` DISABLE KEYS */;
INSERT INTO `salud` VALUES (1,'La castración tiene muchas ventajas: evita el riesgo de embarazos no deseados y reduce la población de gatos callejeros. Además, reduce la probabilidad de que tu gato sufra determinadas enfermedades y se comporte de forma poco sociable','¿Por qué debemos esterilizar a nuestros gatos?','Se recomienda castrar a los gatos machos a partir de los 8 meses. Mientras que a las gatas hembras se recomienda castrarlas desde los 6 meses para evitar embarazos. Antes de castrar a nuestras mascotas debemos asesorarnos con un veterinario'),(2,'Un macho tendrá una distancia mayor entre los genitales y el ano. Pero si los dos están adyacentes en un gatito o a menos de 1/2 pulgada de distancia en un adulto, es una hembra','¿Cómo determinar el sexo de nuestro gato?','En caso de no poder identificar el sexo del gato, es muy importante acudir a veterinario que pueda dejarnos tranquilos con una respuesta certera');
/*!40000 ALTER TABLE `salud` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-02 22:17:57
