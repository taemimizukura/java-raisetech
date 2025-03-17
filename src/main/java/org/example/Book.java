package org.example;

public class Book {

  String title;

  String author;

  int number;

  public Book(String title, String author, int number) {
    this.title = title;
    this.author = author;
    this.number = number;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {

    return author;
  }

  public int getNumber() {

    return number;
  }

  public boolean matchesTitle(String keyword) {
    return title.contains(keyword);  // タイトルにキーワードが含まれているか
  }

  public boolean matchesAuthor(String keyword) {
    return author.contains(keyword);
  }

  public boolean matchesNumber(int searchNumber) {
    return number == searchNumber;  // 完全一致
  }

  @Override //出力結果をテキストにする
  public String toString() {
    return "Book{" + title + ", " + author + ", " + number + "}";
  }
}

