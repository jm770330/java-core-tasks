package school.sorokin.javacore.oop;

import java.util.Objects;

/**
 * Журнал с номером выпуска.
 */
public class Magazine extends Publication {

  private int issueNumber;

  /**
   * Создаёт журнал с общими полями и номером выпуска.
   */
  public Magazine(String title, String author, int year, int issueNumber) {
    super(title, author, year);
    this.issueNumber = issueNumber;
  }

  @Override
  public String getType() {
    return "Журнал";
  }

  /**
   * Возвращает номер выпуска журнала.
   */
  public int getIssueNumber() {
    return issueNumber;
  }

  /**
   * Изменяет номер выпуска журнала.
   */
  public void setIssueNumber(int issueNumber) {
    this.issueNumber = issueNumber;
  }

  @Override
  public String toString() {
    return "Magazine{title='" + getTitle() + "', author='" + getAuthor()
        + "', year=" + getYear() + ", issueNumber=" + issueNumber + "}";
  }

  @Override
  public boolean equals(Object obj) {
    if (!super.equals(obj)) {
      return false;
    }
    Magazine other = (Magazine) obj;
    return issueNumber == other.issueNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), issueNumber);
  }

  @Override
  public void printDetails() {
    System.out.println(this);
  }
}
