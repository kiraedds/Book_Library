package com.example.booklibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Book> getAll(){
        return jdbcTemplate.query("SELECT id,name,rating FROM book", BeanPropertyRowMapper.newInstance(Book.class));
    }

    public Book getById(int id){
        return jdbcTemplate.queryForObject("SELECT id,name,rating FROM book where id=?",BeanPropertyRowMapper.newInstance(Book.class),id);
    }

    public int save(List<Book> books) {
        books.forEach(book -> jdbcTemplate.update("INSERT into book (name,rating) values(?,?)",
                    book.getName(), book.getRating()
                    ));

        return 1;
    }
    public int update(Book book){
        return jdbcTemplate.update("update book SET name=?, rating=? WHERE id=?",
                book.getName(), book.getRating(), book.getId());
    }

    public int delete(int id) {
        return jdbcTemplate.update("delete from book where id=?",id);
    }
}
