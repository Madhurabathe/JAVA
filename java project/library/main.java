package library;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<book> books = new ArrayList<>();
        TreeSet<String> categories = new TreeSet<>();

        int choice;
        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Categories");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    book book1 = new book(id, title, category);

                    books.add(book1);
                    categories.add(category);

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:

                    if (books.isEmpty()) {
                        System.out.println("No Books Available.");
                    } else {
                        for (book b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Book id you want to search: ");
                    id = sc.nextInt();
                    boolean found = false;
                    for (book b : books) {
                        if (b.getId() == id) {
                            b.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:

                    System.out.print("Enter Book ID to Issue: ");
                    id = sc.nextInt();
                    found = false;
                    for (book b : books) {
                        if (b.getId() == id) {
                            if (b.isAvailable()) {
                                b.setAvailable(false);
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book Already Issued!");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Return: ");
                    id = sc.nextInt();
                    found = false;
                    for (book b : books) {
                        if (b.getId() == id) {
                            if (!b.isAvailable()) {
                                b.setAvailable(true);
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book Already Available!");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 6:
                    System.out.println("\nBooks by Category:");
                    for (String c : categories) {
                    System.out.println("\nCategory: " + c);
                    for (book b : books) {
                    if (b.getCategory().equalsIgnoreCase(c)) {
                    b.display();
                     }
                        }
                    }
                case 7:
                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}

