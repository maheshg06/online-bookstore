package com.ecommerceproject.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ecommerceproject.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookcategory",path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {

}
