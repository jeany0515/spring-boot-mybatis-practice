DROP TABLE IF EXISTS todos;

CREATE TABLE IF NOT EXISTS `Todo` (
                                        `id`         INTEGER  PRIMARY KEY AUTO_INCREMENT,
                                        `text` VARCHAR(50) NOT NULL,
                                        `done`        bool  NOT NULL
);

  INSERT INTO todo (text, done) VALUES
    ('this is my first todo item', 1),
    ('this is my second todo item', 0),
    ('this is my third todo item', 1);