package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private final List<Book> books; //Libraryクラス内部からのみアクセス可能 不変

  //書籍のリストを受け取って、Libraryインスタンスを初期化
  public Library(List<Book> books) {
    this.books = books; //booksロストを初期化
  }

  //タイトルによる検索
  public List<Book> searchBooksByTitle(String keyword) {
    List<Book> searchResult = new ArrayList<>();  //検索結果を格納するリストを定義、初期化
    for (Book book : books) { //booksリストにある本を1冊ずつ
      if (book.matchesTitle(keyword)) { //キーワードがタイトルに一致するかチェック
        searchResult.add(book); //一致する場合、searchResultに追加
      }
    }
    return searchResult;
  }

  // 著者名による検索
  public List<Book> searchBooksByAuthor(String keyword) {
    List<Book> searchResult = new ArrayList<>();
    for (Book book : books) {
      if (book.matchesAuthor(keyword)) {
        searchResult.add(book);
      }
    }
    return searchResult;
  }

  public List<Book> searchBooksByNumber(int number) {
    List<Book> searchResult = new ArrayList<>();
    for (Book book : books) {
      if (book.matchesNumber(number)) {
        searchResult.add(book);
      }
    }
    return searchResult;
  }
}
