# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table `person` (`pname` VARCHAR(254) NOT NULL,`padd` VARCHAR(254) NOT NULL);

# --- !Downs

drop table `person`;

