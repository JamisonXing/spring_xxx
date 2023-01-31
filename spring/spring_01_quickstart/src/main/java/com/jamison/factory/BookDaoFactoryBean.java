package com.jamison.factory;

import com.jamison.dao.BookDao;
import com.jamison.dao.impl.BookDaoImpl;

/**
 * @author jamison
 */
public class BookDaoFactory {
    public static BookDao bookDaoFactory() {
        System.out.println("bookDaoFactory setup...");
        return new BookDaoImpl();
    }
}
