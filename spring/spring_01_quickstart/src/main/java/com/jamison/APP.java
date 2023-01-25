package com.jamison;

import com.jamison.service.impl.BookServiceImpl;

public class APP {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }
}
