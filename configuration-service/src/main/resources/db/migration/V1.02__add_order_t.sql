DROP TABLE IF EXISTS orders;

CREATE TABLE orders (
  id      BIGINT PRIMARY KEY NOT NULL,
  user_id BIGINT             NOT NULL,
  status  TEXT               NOT NULL,
  comment TEXT               NOT NULL
);
