package com.itschool.library.respositories;

import com.itschool.library.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long> {

}
