CREATE TABLE users(
   id serial PRIMARY KEY,
   name VARCHAR (50) UNIQUE NOT NULL,
   role integer NOT NULL
);