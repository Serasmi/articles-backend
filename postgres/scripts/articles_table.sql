\c articles;

CREATE TABLE articles(
   id serial PRIMARY KEY,
   title varchar(255) NOT NULL,
   link varchar(1024) NOT NULL,
   createdAt timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
   userId integer REFERENCES users
);
GRANT SELECT, UPDATE, INSERT, DELETE ON articles TO article_user;