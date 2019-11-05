\c articles;

CREATE TABLE roles(
   id serial PRIMARY KEY,
   name varchar(50) UNIQUE NOT NULL
);
GRANT SELECT, UPDATE, INSERT, DELETE ON roles TO article_user;
GRANT USAGE, SELECT ON SEQUENCE roles_id_seq TO article_user;