\c articles;

CREATE TABLE users(
   id serial PRIMARY KEY,
   name varchar(50) UNIQUE NOT NULL,
   role integer REFERENCES roles
);
GRANT SELECT, UPDATE, INSERT, DELETE ON users TO article_user;