package org.example;

import java.util.List;

public class Printer {

  // タイトル検索
  public static void printBooksByTitle(String searchTitle, List<Book> foundBooks) {
    if (!foundBooks.isEmpty()) {
      System.out.println("◆◆タイトル_検索結果:" + "'" + searchTitle + "'" + "を含む");
      for (Book book : foundBooks) {
        System.out.println(book.getTitle());
      }
    } else {
      System.out.println("◆◆タイトル_検索結果:" + "'" + searchTitle + "'" + "を含む");
      System.out.println("本が見つかりませんでした。");
    }
  }

  // 著者名検索
  public static void printBooksByAuthor(String searchAuthor, List<Book> foundBooks) {
    if (!foundBooks.isEmpty()) {
      System.out.println("◆◆著者名_検索結果:" + "'" + searchAuthor + "'" + "を含む");
      for (Book book : foundBooks) {
        System.out.println(book.getAuthor());
      }
    } else {
      System.out.println("◆◆著者名_検索結果:" + "'" + searchAuthor + "'" + "を含む");
      System.out.println("著者名が見つかりませんでした。");
    }
  }

  // 番号検索
  public static void printBooksByNumber(int searchNumber, List<Book> foundBooks) {
    if (!foundBooks.isEmpty()) {
      System.out.println("◆◆番号_検索結果:" + "'" + searchNumber + "'" + "と一致");
      for (Book book : foundBooks) {
        System.out.println(book.getNumber() + "_" + book.getTitle() + "_" + book.getAuthor());
      }
    } else {
      System.out.println("◆◆番号_検索結果:" + "'" + searchNumber + "'" + "と一致");
      System.out.println("本が見つかりませんでした。");
    }
  }
}
