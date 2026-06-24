package train;
import java.util.*;
class TrainManagementSystem {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            TrainLinkedList train = new TrainLinkedList();

            while (true) {

                System.out.println("\n1.Add Coach at Start");
                System.out.println("2.Add Coach at End");
                System.out.println("3.Insert After Coach");
                System.out.println("4.Remove Coach");
                System.out.println("5.Display Coaches");
                System.out.println("6.Count Coaches");
                System.out.println("7.Search Coach");
                System.out.println("8.Exit");

                System.out.print("Enter Choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Coach Name: ");
                        train.addAtStart(sc.nextLine());
                        break;

                    case 2:
                        System.out.print("Enter Coach Name: ");
                        train.addAtEnd(sc.nextLine());
                        break;

                    case 3:
                        System.out.print("Enter Existing Coach: ");
                        String oldCoach = sc.nextLine();

                        System.out.print("Enter New Coach: ");
                        String newCoach = sc.nextLine();

                        train.insertAfter(oldCoach, newCoach);
                        break;

                    case 4:
                        System.out.print("Enter Coach Name to Remove: ");
                        train.deleteCoach(sc.nextLine());
                        break;

                    case 5:
                        train.display();
                        break;

                    case 6:
                        train.countCoaches();
                        break;

                    case 7:
                        System.out.print("Enter Coach Name to Search: ");
                        train.searchCoach(sc.nextLine());
                        break;

                    case 8:
                        System.out.println("Thank You!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        }
    }