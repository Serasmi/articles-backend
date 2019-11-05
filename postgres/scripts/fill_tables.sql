\c articles;

-- Create roles
insert into roles (name) values ('admin'), ('user');

-- Create users
insert into users (name, role) values ('admin', 1), ('zoomer', 1), ('serasmi', 2);

-- Create articles
insert into articles (title, link, userId) values
    ('Title of article #1', 'http://some-article-url.org/article1', 2),
    ('Title of article #2', 'http://some-article-url.org/article2', 3),
    ('Title of article #3', 'http://some-article-url.org/article3', 3),
    ('Admin article #1', 'http://some-admin-article-url.org/article1', 1),
    ('Title of article #4', 'http://some-article-url.org/article4', 3);