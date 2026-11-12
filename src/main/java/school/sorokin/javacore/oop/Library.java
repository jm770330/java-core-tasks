package school.sorokin.javacore.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Хранит публикации в памяти и выполняет команды каталога.
 */
public class Library {

  private List<Publication> publications = new ArrayList<>();

  /**
   * Добавляет уже созданную публикацию в список.
   */
  public void addPublication(Publication pub) {
    publications.add(Objects.requireNonNull(pub, "Публикация не должна быть null."));
  }

  /**
   * Выводит все публикации в порядке добавления.
   */
  public void listPublications() {
    if (publications.isEmpty()) {
      System.out.println("Каталог пуст.");
    }
    for (Publication publication : publications) {
      System.out.println(publication.toString());
    }
  }

  /**
   * Находит и выводит все публикации с точно совпавшим автором.
   */
  public void searchByAuthor(String author) {
    boolean found = false;
    for (Publication publication : publications) {
      if (Objects.equals(publication.getAuthor(), author)) {
        System.out.println(publication.toString());
        found = true;
      }
    }
    if (!found) {
      System.out.println("Публикации не найдены.");
    }
  }
}
