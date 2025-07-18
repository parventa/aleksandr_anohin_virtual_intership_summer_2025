
CREATE SCHEMA IF NOT EXISTS sql_practice_ddl_lesson_4
DEFAULT CHARACTER SET utf8;

USE sql_practice_ddl_lesson_4;

commit;


CREATE TABLE movies (
    id BIGINT AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    director VARCHAR(100) NOT NULL,
    year_of_issue INT NOT NULL,
    length_minutes INT NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE boxoffices (
    movie_id BIGINT NOT NULL,
    rating DOUBLE NOT NULL,
    domestic_sales INT NOT NULL,
    international_sales INT NOT NULL
);

commit;


INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(1, "Toy Story", "John Lasseter", 1995, 81);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(2, "A Bug's Life", "John Lasseter", 1995, 95);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(3, "Toy Story 2", "John Lasseter", 1999, 93);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(4, "Monsters, Inc.", "Pete Docter", 1999, 92);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(5, "Finding Nemo", "Andrew Stanton", 2003, 107);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(6, "The Incredibles", "Brad Bird", 2003, 116);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(7, "Cars", "John Lasseter", 2006, 117);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(8, "Ratatouille", "Brad Bird", 2007, 115);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(9, "WALL-E", "Andrew Stanton", 2008, 104);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(10, "Up", "Pete Docter", 2009, 101);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(11, "Toy Story 3", "Lee Unkrich", 2010, 103);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(12, "Cars 2", "John Lasseter", 2011, 120);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(13, "Brave", "Brenda Chapman", 2012, 102);

INSERT INTO movies(id, title, director, year_of_issue, length_minutes)
VALUES(14, "Monsters University", "Dan Scanlon", 2013, 110);

commit;

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(5, 8.2, 380843261, 555900000);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(14, 7.4, 268492764, 475066843);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(8, 8, 206445654, 417277164);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(12, 6.4, 191452396, 368400000);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(3, 7.9, 245852179, 239163000);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(6, 8, 261441092, 370001000);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(9, 8.5, 223808164, 297503696);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(11, 8.4, 415004880, 648167031);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(1, 8.3, 191796233, 170162503);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(7, 7.2, 244082982, 217900167);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(10, 8.3, 293004164, 438338580);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(4, 8.1, 289916256, 272900000);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(2, 7.2, 162798565, 200600000);

INSERT INTO boxoffices(movie_id, rating, domestic_sales, international_sales)
VALUES(13, 7.2, 237283207, 301700000);

commit;