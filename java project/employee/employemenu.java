package employee;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class employemenu {
    public static void main(String[] args) {
        Vector<employe> v = new Vector<employe>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR USERNAME");
        String username = sc.nextLine();
        System.out.println("ENTER YOUR PASSWORD");
        int password = sc.nextInt();
        sc.nextLine();

        if (username.equals("admin") && password == (1234)) {
            System.out.println("login successful");
            System.out.println("----------------");

            int choice;
            do {
                System.out.println("Employee Menu");
                System.out.println("1. Add Employee");
                System.out.println("2. Search Employee");
                System.out.println("3. View Employee");
                System.out.println("4. Update Employee");
                System.out.println("5. Delete Employee");
                System.out.println("6. Sort Employee by Salary");
                System.out.println("7. Attendance Management System");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter Employee Salary: ");
                        double salary = sc.nextDouble();
                        employe emp = new employe(id, name, salary);
                        v.add(emp);
                        System.out.println("Employee Added: " + emp);
                        break;
                    case 2:
                        System.out.print("Enter Employee ID to search: ");
                        int searchId = sc.nextInt();
                        sc.nextLine();
                        boolean found = false;
                        for (employe e : v) {
                            if (e.getId() == searchId) {
                                System.out.println("Employee Found: " + e);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Employee not found.");
                        }
                        break;
                    case 3:
                        Iterator<employe> i = v.iterator();
                        while (i.hasNext()) {
                            employe e = i.next();
                            System.out.println(e);
                        }
                        break;
                    case 4:
                        System.out.print("Enter Employee ID to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        boolean updated = false;
                        for (int idx = 0; idx < v.size(); idx++) {
                            employe e = v.get(idx);
                            if (e.getId() == updateId) {
                                System.out.println("Employee Found: " + e);
                                System.out.print("Enter New Employee Name: ");
                                String newName = sc.nextLine();
                                System.out.print("Enter New Employee Salary: ");
                                double newSalary = sc.nextDouble();
                                sc.nextLine();
                                employe newEmp = new employe(updateId, newName, newSalary);
                                v.set(idx, newEmp);
                                System.out.println("Employee Updated: " + newEmp);
                                updated = true;
                                break;
                            }
                        }
                        if (!updated) {
                            System.out.println("Employee not found.");
                        }

                        break;
                    case 5:
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = sc.nextInt();
                        sc.nextLine();
                        boolean deleted = false;
                        Iterator<employe> delIter = v.iterator();
                        while (delIter.hasNext()) {
                            employe e = delIter.next();
                            if (e.getId() == deleteId) {
                                delIter.remove();
                                System.out.println("Employee Deleted: " + e);
                                deleted = true;
                                break;
                            }
                        }
                        if (!deleted) {
                            System.out.println("Employee not found.");
                        }
                        break;
                    case 6:
                        for (int i1 = 0; i1 < v.size(); i1++) {
                            for (int j = 0; j < v.size() - 1 - i1; j++) {
                                employe e1 = v.get(j);
                                employe e2 = v.get(j + 1);
                                if (e1.getSalary() > e2.getSalary()) {
                                    v.set(j, e2);
                                    v.set(j + 1, e1);
                                }
                            }
                        }
                        break;
                    case 7:
                        System.out.print("Enter Employee ID for attendance: ");
                        int attendId = sc.nextInt();
                        sc.nextLine();
                        boolean found1 = false;
                        for (employe e : v) {
                            if (e.getId() == attendId) {
                                found1 = true;
                                System.out.println("Employee Found: " + e);
                                System.out.print("Is the employee present? (yes/no): ");
                                String attendance = sc.nextLine();
                                if (attendance.equalsIgnoreCase("yes")) {
                                    System.out.println("Attendance marked as present for: " + e);
                                } else {
                                    System.out.println("Attendance marked as absent for: " + e);
                                }
                                break;
                            }
                        }
                        if (!found1) {
                            System.out.println("Employee not found.");
                        }
                        break;
                    case 8:
                        System.out.println("Thank you !!!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 8);
        } else {
            System.out.println("Invalid username or password");
            return;
        }
    }
}
