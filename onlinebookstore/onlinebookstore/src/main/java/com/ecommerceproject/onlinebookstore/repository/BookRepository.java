package com.ecommerceproject.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceproject.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
