package studentdb;

import java.util.Scanner;

public class main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        studentdao dao = new studentdao();
        System.out.println("========WELCOME TO ADMIN LOGIN PAGE=====");
        System.out.println("ENTER THE USERNAME");
        // sc.nextLine();
        String username = sc.nextLine();
        System.out.println("ENTER THE PASSWORD");
        String password = sc.nextLine();

        if (!dao.login(username, password)) {
            System.out.println("INVALID CREDENTIALS");
            System.exit(0);
        }
        System.out.println("LOGIN SUCCESSFUL");
        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("1.ADD STUDENT DATA");
            System.out.println("2.DISPLAY STUDENT DATA");
            System.out.println("3.SEARCH STUDENT DATA");
            System.out.println("4.UPDATE STUDENT DATA");
            System.out.println("5.DELETE STUDENT DATA");
            System.out.println("6.EXIT");
            System.out.println("Enter choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ADD ID");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD NAME");
                    String name = sc.nextLine();
                    System.out.println("ADD COURSE");
                    String course = sc.nextLine();
                    System.out.println("ADD MARKS");
                    int marks = sc.nextInt();
                    student s = new student(id, name, course, marks);

                    dao.addstudent(s);
                    break;
                case 2:
                    dao.displaystudent();
                    break;

                case 3:
                    System.out.println("SEARCH BY ID");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    dao.searchstudent(sid);
                    break;
                case 4:
                    System.out.println("ADD ID");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD NAME");
                    String uname = sc.nextLine();
                    System.out.println("ADD COURSE");
                    String ucourse = sc.nextLine();
                    System.out.println("ADD MARKS");
                    int umarks = sc.nextInt();
                    dao.updatestudent(uid, uname, ucourse, umarks);
                    break;

                case 5:
                    System.out.println("DELETE BY ID");
                    int did = sc.nextInt();
                    sc.nextLine();
                    dao.deletestudent(did);
                    break;

                case 6:
                    System.out.println("THANK YOU");
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }
}
