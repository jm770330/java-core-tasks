package school.sorokin.javacore.oop;

import java.util.Objects;

/** Книга с ISBN. */
public class Book extends Publication {

  private String isbn;

  /** Создаёт книгу с общими полями и ISBN. */
  public Book(String title, String author, int year, String isbn) {
    super(title, author, year);
    this.isbn = isbn;
  }

  @Override
  public String getType() {
    return "Книга";
  }

  /** Возвращает ISBN книги. */
  public String getIsbn() {
    return isbn;
  }

  /** Изменяет ISBN книги. */
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public String toString() {
    return "Book{title='" + getTitle() + "', author='" + getAuthor()
        + "', year=" + getYear() + ", isbn='" + isbn + "'}";
  }

  @Override
  public boolean equals(Object obj) {
    if (!super.equals(obj)) {
      return false;
    }
    Book other = (Book) obj;
    return Objects.equals(isbn, other.isbn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), isbn);
  }

  @Override
  public void printDetails() {
    System.out.println(this);
  }
}
