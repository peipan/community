CREATE TABLE question
(
	id INT AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(50),
	description TEXT,
	gtm_create BIGINT,
	gtm_modify BIGINT,
	comment_count INT DEFAULT 0,
	creator INT,
	view_count INT DEFAULT 0,
	like_count INT DEFAULT 0,
	tag VARCHAR(256)
)ENGINE=INNODB DEFAULT CHARSET=utf8;