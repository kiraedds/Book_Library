# Book_Library
Simple book library CRUD app using mysql database



## Set up MySQL database with docker using provided Dockerfile

docker build -t booklibrary-mysql .

## Run the container with the created image
docker run --publish 3306:3306 --name booklibrary-mysql booklibrary-mysql

## Supported Endpoints
### get all books in the database
- GET http://localhost:8080/books
### example response:

  ![image](https://github.com/kiraedds/Book_Library/assets/50353861/08aa4c5f-bd69-41e6-8607-23a2b5024342)
### get a book from database by the id
- GET http://localhost:8080/books/1
### add books to database 
- POST http://localhost:8080/books
### example post body
![image](https://github.com/kiraedds/Book_Library/assets/50353861/303b3ffd-5122-45d4-b15e-cc40e5b559a2)

### replace a book in the database with the given id
- PUT http://localhost:8080/books/1
### update chosen fields of a book in the database with the given id
- PATCH http://localhost:8080/books/1
### delete a book from database
- DELETE http://localhost:8080/books/1


## To check your database contents
> docker exec -it booklibrary-mysql /bin/bash
> 
> mysql -proot
> 
> use booklibrary;
> 
> SELECT * FROM book;
> 
![image](https://github.com/kiraedds/Book_Library/assets/50353861/e6453fa7-3610-4268-a1c3-b6bbd3c472ac)

