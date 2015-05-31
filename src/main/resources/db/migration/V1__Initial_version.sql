CREATE TABLE `tasks` (
  `id` int(11)  NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `finished` tinyint(1) NOT NULL,
  `version` int(11) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;