package school.sorokin.javacore.oop;

import java.util.Objects;

/**
 * Общие данные публикации и счётчик созданных публикаций.
 */
public abstract class Publication implements Printable {

  private String title;
  private String author;
  private int year;
  private static int publicationCount = 0;

  /**
   * Создаёт общую часть публикации и увеличивает счётчик.
   */
  protected Publication(String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
    publicationCount++;
  }

  /**
   * Возвращает название типа публикации.
   */
  public abstract String getType();

  /**
   * Возвращает название публикации.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Изменяет название публикации.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Возвращает автора публикации.
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Изменяет автора публикации.
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Возвращает год выпуска публикации.
   */
  public int getYear() {
    return year;
  }

  /**
   * Изменяет год выпуска публикации.
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * Возвращает количество созданных публикаций.
   */
  public static int getPublicationCount() {
    return publicationCount;
  }

  /**
   * Возвращает строку с общими полями публикации.
   */
  @Override
  public String toString() {
    return "Publication{title='" + title + "', author='" + author
        + "', year=" + year + "}";
  }

  /**
   * Сравнивает общие поля публикаций одного конкретного класса.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Publication other = (Publication) obj;
    return year == other.year
        && Objects.equals(title, other.title)
        && Objects.equals(author, other.author);
  }

  /**
   * Вычисляет хеш по общим полям публикации.
   */
  @Override
  public int hashCode() {
    return Objects.hash(title, author, year);
  }
}
