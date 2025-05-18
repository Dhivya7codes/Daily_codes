package apnacollege;
import java.util.Scanner;
public class LibraryApplication {
    static class Book {
        int id;
        String title;
        String author;

        Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Title: " + title + ", Author: " + author;
        }
    }

    static Book books[] = new Book[100];
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    deleteBook(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        books[bookCount++] = new Book(id, title, author);
        System.out.println("Book added successfully.");
    }

    private static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("No books found.");
        } else {
            System.out.println("\n--- List of Books ---");
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }

    private static void deleteBook(Scanner scanner) {
        if (bookCount == 0) {
            System.out.println("No books to delete.");
            return;
        }

        System.out.print("Enter Book ID to delete: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].id == id) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--bookCount] = null;
                found = true;
                System.out.println("Book deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + id + " not found.");
        }
    }
}
