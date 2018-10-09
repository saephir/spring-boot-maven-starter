package com.min.springboot.basics.springbootin10steps.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


@RestController
public class BookController {

    @GetMapping("/books")
    public List<Object> getAllBooks() {
        return Collections.singletonList(new Book(1L, "Mastering Spring 5.0", "Ranga"));
    }
}
