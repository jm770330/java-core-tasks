package school.sorokin.javacore.oop;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Запускает консольный библиотечный каталог темы ООП.
 */
public class Main {

  /**
   * Показывает меню; числа вводятся корректно, выход выполняется пунктом 0.
   */
  public static void main(String[] args) {
    Library library = new Library();
    try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8)) {
      boolean running = true;
      while (running) {
        System.out.println();
        System.out.println("1 - Добавить публикацию");
        System.out.println("2 - Вывести все публикации");
        System.out.println("3 - Поиск по автору");
        System.out.println("4 - Количество созданных публикаций");
        System.out.println("0 - Выход");
        int option = readInt(scanner);

        switch (option) {
          case 1:
            addPublication(scanner, library);
            break;
          case 2:
            library.listPublications();
            break;
          case 3:
            System.out.println("Введите автора:");
            library.searchByAuthor(scanner.nextLine());
            break;
          case 4:
            System.out.println("Всего создано публикаций: "
                + Publication.getPublicationCount());
            break;
          case 0:
            running = false;
            System.out.println("До свидания.");
            break;
          default:
            System.out.println("Неизвестный пункт меню.");
        }
      }
    }
  }

  // Общие поля читаются один раз; конкретный конструктор выбирается по типу.
  private static void addPublication(Scanner scanner, Library library) {
    System.out.println("Выберите тип: 1 - Book, 2 - Magazine, 3 - Newspaper");
    int type = readInt(scanner);
    if (type < 1 || type > 3) {
      System.out.println("Неизвестный тип публикации.");
      return;
    }

    System.out.println("Введите название:");
    String title = scanner.nextLine();
    System.out.println("Введите автора:");
    String author = scanner.nextLine();
    System.out.println("Введите год:");
    int year = readInt(scanner);

    Publication publication;
    switch (type) {
      case 1:
        System.out.println("Введите ISBN:");
        String isbn = scanner.nextLine();
        publication = new Book(title, author, year, isbn);
        break;
      case 2:
        System.out.println("Введите номер выпуска:");
        int issueNumber = readInt(scanner);
        publication = new Magazine(title, author, year, issueNumber);
        break;
      case 3:
        System.out.println("Введите день публикации:");
        String publicationDay = scanner.nextLine();
        publication = new Newspaper(title, author, year, publicationDay);
        break;
      default:
        return;
    }

    library.addPublication(publication);
    System.out.println("Публикация добавлена.");
  }

  private static int readInt(Scanner scanner) {
    return Integer.parseInt(scanner.nextLine().trim());
  }
}
