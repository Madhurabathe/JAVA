package day8;

import java.util.*;

public class browser {
    public static void main(String[] args) {
        Stack<String> backward = new Stack<String>();
        Stack<String> forward = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("main  menu");
            System.out.println("1.visit new page");
            System.out.println("2.go backward");
            System.out.println("3.go forward");
            System.out.println("4.display current page");
            System.out.println("5.show browser history");
            System.out.println("6.clear history");
            System.out.println("7.EXIT");
            System.out.println("enter your choice ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // visit new page
                    System.out.println("enter the new page url");
                    String url = sc.nextLine();
                    backward.push(url);
                    System.out.println("page successfully added to history");
                    break;

                case 2:
                    // go back
                    if (backward.isEmpty()) {
                        System.out.println("no data found");
                    } else {
                        forward.push(backward.pop());
                        System.out.println("Previous page found" + backward.peek());
                    }
                    break;

                case 3:
                    // go forward
                    if (forward.isEmpty()) {
                        System.out.println("no data found");
                    } else {
                        backward.push(forward.pop());
                        System.out.println("Foward page found" + backward.peek());
                    }
                    break;
                case 4:
                    // display current page
                    System.out.println("Your current page " + backward.peek());
                    break;

                case 5:
                    // show browser history
                    if (backward.empty() && forward.empty()) {
                        System.out.println("no data found");
                    } else {
                        System.out.println("browser history");
                        System.out.println(backward);
                        System.out.println(forward);
                    }
                    break;

                case 6:
                    // clear history
                    backward.clear();
                    forward.clear();
                    System.out.println("histoty is deleted successfully");
                    break;
                default:
                    System.out.println("page not found");
            }
        } while (choice != 7);
        sc.close();
    }
}
