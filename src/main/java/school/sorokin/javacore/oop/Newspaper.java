package school.sorokin.javacore.oop;

import java.util.Objects;

/**
 * Газета с обозначением дня публикации.
 */
public class Newspaper extends Publication {

  private String publicationDay;

  /**
   * Создаёт газету с общими полями и днём публикации.
   */
  public Newspaper(String title, String author, int year, String publicationDay) {
    super(title, author, year);
    this.publicationDay = publicationDay;
  }

  @Override
  public String getType() {
    return "Газета";
  }

  /**
   * Возвращает день публикации газеты.
   */
  public String getPublicationDay() {
    return publicationDay;
  }

  /**
   * Изменяет день публикации газеты.
   */
  public void setPublicationDay(String publicationDay) {
    this.publicationDay = publicationDay;
  }

  @Override
  public String toString() {
    return "Newspaper{title='" + getTitle() + "', author='" + getAuthor()
        + "', year=" + getYear() + ", publicationDay='" + publicationDay + "'}";
  }

  @Override
  public boolean equals(Object obj) {
    if (!super.equals(obj)) {
      return false;
    }
    Newspaper other = (Newspaper) obj;
    return Objects.equals(publicationDay, other.publicationDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), publicationDay);
  }

  @Override
  public void printDetails() {
    System.out.println(this);
  }
}
