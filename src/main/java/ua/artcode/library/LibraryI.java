package ua.artcode.library;

import java.util.List;


public interface LibraryI {

        List<Reader> getUsers();

        List<Book>  getAvailibleBook();

        boolean addBook(Book book);

        boolean addUser(Reader user);

        Book getBook(Book book, Reader user);

        List<Book> getBookListInUser (Reader user);

        List<Book> getBookListInUsers (List<Reader> listUser);

        boolean addUserToBlackList(Reader user);

        List<Book> getBookListByAuthor(String author);

        List<Book> getBookListLaterThan(int year);

    }

