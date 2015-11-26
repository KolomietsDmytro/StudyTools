package ua.artcode.library;

import java.util.List;

/**
 * Created by Administrator on 26.11.2015.
 */
public class LibraryManager implements LibraryI {
    @Override
    public List<Reader> getUsers() {
        return null;
    }

    @Override
    public List<Book> getAvailibleBook() {
        return null;
    }

    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public boolean addUser(Reader user) {
        return false;
    }

    @Override
    public Book getBook(Book book, Reader user) {
        return null;
    }

    @Override
    public List<Book> getBookListInUser(Reader user) {
        return null;
    }

    @Override
    public List<Book> getBookListInUsers(List<Reader> listUser) {
        return null;
    }

    @Override
    public boolean addUserToBlackList(Reader user) {
        return false;
    }

    @Override
    public List<Book> getBookListByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> getBookListLaterThan(int year) {
        return null;
    }
}
