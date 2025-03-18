package org.example;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    //書籍情報の追加
    Book book1 = new Book("正体", "染井為人", 1);
    Book book2 = new Book("タルト・タタンの夢", "近藤史恵", 2);
    Book book3 = new Book("白夜行", "東野圭吾", 3);
    Book book4 = new Book("夢十夜", "夏目漱石", 4);
    Book book5 = new Book("夜歩く", "横溝正史", 5);

    //Listの作成
    List<Book> bookList = List.of(book1, book2, book3, book4, book5);

    Library library = new Library(bookList);

    String searchTitle = "夜";   // タイトルから検索（部分一致）

    String searchAuthor = "近藤";  // 著者名から検索（部分一致）

    int searchNumber = 1;       // numberから検索（完全一致)

    Printer.allBooks(bookList); //所蔵一覧

    //libraryクラスのsearchBooksByTitleメソッドを呼び出し
    List<Book> foundBooks1 = library.searchBooksByTitle(searchTitle);
    Printer.printBooksByTitle(searchTitle, foundBooks1);

    List<Book> foundBooks2 = library.searchBooksByAuthor(searchAuthor);
    Printer.printBooksByAuthor(searchAuthor, foundBooks2);

    List<Book> foundBooks3 = library.searchBooksByNumber(searchNumber);
    Printer.printBooksByNumber(searchNumber, foundBooks3);
  }
}
