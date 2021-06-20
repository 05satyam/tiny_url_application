db name: url-shortner

CREATE TABLE `tiny_url` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `expire_date` datetime DEFAULT NULL,
  `hash` varchar(255) DEFAULT NULL,
  `original_url` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

