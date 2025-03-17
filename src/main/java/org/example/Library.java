package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> books;

  public Library(List<Book> books) {
    this.books = books;
  }

  //Title検索
  public List<Book> searchBooksByTitle(String keyword) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.matchesTitle(keyword)) {
        result.add(book);
      }
    }
    return result;
  }

  public List<Book> searchBooksByAuthor(String keyword) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.matchesAuthor(keyword)) {
        result.add(book);
      }
    }
    return result;
  }

  public List<Book> searchBooksByNumber(int number) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.matchesNumber(number)) {
        result.add(book);
      }
    }
    return result;
  }
}
