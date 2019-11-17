\c articles;

CREATE TABLE articles(
   id serial PRIMARY KEY,
   title varchar(255) NOT NULL,
   link varchar(1024) NOT NULL,
   created_at timestamp NOT NULL WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
   user_id integer REFERENCES users
);
GRANT SELECT, UPDATE, INSERT, DELETE ON articles TO article_user;
GRANT USAGE, SELECT ON SEQUENCE articles_id_seq TO article_user;