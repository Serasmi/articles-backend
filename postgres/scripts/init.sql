CREATE USER article_user WITH PASSWORD 'password';
CREATE DATABASE articles;
GRANT ALL PRIVILEGES ON DATABASE articles TO article_user;