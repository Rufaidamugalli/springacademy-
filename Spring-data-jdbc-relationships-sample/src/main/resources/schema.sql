drop table if exists rental;
drop table if exists movie;


 create table movie(
 id serial primary key,
 title text,
 description text
 );
create table rental(
   id serial primary key,
   movie integer references movie(id),
   movie_key text,
   duration text,
   price integer
);