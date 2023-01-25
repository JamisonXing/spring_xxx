package com.jamison.service.impl;

import com.jamison.dao.BookDao;
import com.jamison.dao.impl.BookDaoImpl;
import com.jamison.service.BookService;

public class BookServiceImpl implements BookService {
    //5.删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao;

    public void save() {
        System.out.println("bookService save..");
        bookDao.save();
    }

    //6. 提供对应的Set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
