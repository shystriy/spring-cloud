DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id       BIGINT PRIMARY KEY NOT NULL,
  email    TEXT               NOT NULL,
  name     TEXT               NOT NULL,
  password TEXT               NOT NULL
);
