DROP TABLE IF EXISTS todos;

CREATE TABLE todos (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  text VARCHAR(250) NOT NULL,
  done VARCHAR(250) NOT NULL,
);

INSERT INTO todos (text, done) VALUES
  ('this is my first todo item', 'Dangote'),
  ('this is my second todo item', 'Gates'),
  ('this is my third todo item', 'Alakija');