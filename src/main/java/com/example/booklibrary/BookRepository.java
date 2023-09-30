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
        return jdbcTemplate.query("SELECT id,book,rating FROM book", BeanPropertyRowMapper.newInstance(Book.class));
    }

    public Book getById(int id){
        return jdbcTemplate.queryForObject("SELECT id,name,rating FROM book where id=?",BeanPropertyRowMapper.newInstance(Book.class),id);
    }
}
