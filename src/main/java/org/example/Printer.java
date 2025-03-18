package org.example;

import java.util.List;

public class Printer {

  public static void allBooks(List<Book> bookList) {
    System.out.println("【所蔵一覧】");
    bookList.forEach(System.out::println);
  }

  // タイトル検索結果を表示
  public static void printBooksByTitle(String searchTitle, List<Book> foundBooks) {
    System.out.println("\n【タイトル_検索結果:" + "'" + searchTitle + "'" + "を含む】");
    if (foundBooks.isEmpty()) {
      System.out.println("該当する本が見つかりませんでした。");
    } else {
      foundBooks.forEach(book -> System.out.println(book.getTitle() + "__" + book.getAuthor()));
    }
  }

  // 著者名検索結果を表示
  public static void printBooksByAuthor(String searchAuthor, List<Book> foundBooks) {
    System.out.println("\n【著者名_検索結果:" + "'" + searchAuthor + "'" + "を含む】");
    if (foundBooks.isEmpty()) {
      System.out.println("該当する著者名が見つかりませんでした。");
    } else {
      foundBooks.forEach(book -> System.out.println(book.getAuthor()));
    }
  }

  // 番号検索結果を表示
  public static void printBooksByNumber(int searchNumber, List<Book> foundBooks) {
    System.out.println("\n【番号_検索結果:" + "'" + searchNumber + "'" + "と一致】");
    if (foundBooks.isEmpty()) {
      System.out.println("該当する番号の本が見つかりませんでした。");
    } else {
      foundBooks.forEach(book -> System.out.println(
          book.getNumber() + ", " + book.getTitle() + "__" + book.getAuthor()));
    }
  }
}