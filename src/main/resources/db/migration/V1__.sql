CREATE TABLE user (
  id BIGINT NOT NULL,
   first_name VARCHAR(255) NULL,
   last_name VARCHAR(255) NULL,
   age BIGINT NULL,
   email VARCHAR(255) NULL,
   CONSTRAINT pk_user PRIMARY KEY (id)
);