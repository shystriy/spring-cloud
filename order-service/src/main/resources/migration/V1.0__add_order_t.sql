DROP TABLE IF EXISTS order;

CREATE TABLE order (
  id      BIGINT PRIMARY KEY NOT NULL,
  user_id BIGINT             NOT NULL,
  status  TEXT               NOT NULL,
  comment TEXT               NOT NULL
);
