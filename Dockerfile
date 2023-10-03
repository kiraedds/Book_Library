FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_USERNAME=root
ENV MYSQL_DATABASE=booklibrary-mysql
ENV MYSQL_TCP_PORT=3306

COPY ./init.sql /docker-entrypoint-initdb.d/

EXPOSE 3306