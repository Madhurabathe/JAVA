package ERP;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagmentSys {
    public static void main(String[] args) {
        System.out.println("welcome to student managment system");
        ArrayList<Student> student= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR USERNAME");
        String username=sc.nextLine();
        System.out.println("ENTER YOUR PASSWORD");
        int password=sc.nextInt();

        if(username.equals("admin") && password==(1234)){
            System.out.println("login successful");
            System.out.println("----------------");
        int choice;
        int choice1;
        do{
                System.out.println("1.MAIN MENU");
                System.out.println("2.EXIT");
                System.out.println("enter your choice");
                choice1=sc.nextInt();
                if(choice1==1){
        
        System.out.println("1.Add Student");
        System.out.println("2.View Student");
        System.out.println("3.Search Student by ID");
        System.out.println("4.Search Student by name");
        System.out.println("5.Update Student");
        System.out.println("6.Delete Student");
        System.out.println("7.display results top student and failure student");
        System.out.println("enter your choice");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                //add student data 
                System.out.println("enter student id");
                int id=sc.nextInt();
                System.out.println("enter student name");
                String name=sc.next();
                System.out.println("enter student mark");
                double mark=sc.nextDouble();
                Student s=new Student(id,name,mark);
                student.add(s);
                break;
            case 2:
                // View Student data
                if(student.isEmpty()){
                    System.out.println("no student data found");
                } else{
                    for(Student obj : student){
                    System.out.println(obj);
                }}
                break;
            case 3:
                // Search Student data
                System.out.println("enter student id to search");
                int searchid=sc.nextInt();
                boolean found=false;
                for(Student obj:student){
                    if(obj.getId()==searchid){
                        System.out.println(obj);
                        found=true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("student not found");
                }

                break;
            case 4:
                // Search Student by name
                System.out.println("enter student name to search");
                String searchname=sc.next();
                boolean foundname=false;
                for(Student obj:student){
                    if(obj.getName().equals(searchname)){
                        System.out.println(obj);
                        foundname=true;
                        break;
                    }
                }
                if(!foundname){
                    System.out.println("student not found");
                }
                break;
            case 5:
                // Update Student logic
                System.out.println("Enter Student Id to update ");
                int updateId=sc.nextInt();
                boolean found1=false;
                for(Student obj:student){
                    if(obj.getId()==updateId){
                        System.out.println("Enter new name");
                        String newName=sc.nextLine();
                        System.out.println("Enter new mark");
                        double newMark=sc.nextDouble();
                        obj.setName(newName);
                        obj.setMark(newMark);
                        System.out.println("Student data updated successfully");
                        found1=true;
                        break;
                    }
                    if(!found1){
                        System.out.println("student not found");
                    }
                }
                break;
            case 6:
                // Delete Student data
                System.out.println("enter student id to delete");
                int deleteId=sc.nextInt();
                boolean found2=false;
                for(Student obj:student){
                    if(obj.getId()==deleteId){
                        student.remove(obj);
                        System.out.println("student deleted successfully");
                        found2=true;
                        break;
                    }
                }
                if(!found2){
                    System.out.println("student not found");
                }
                break;
            case 7:
                // display results top student and failure student.
                if(student.isEmpty()){
                    System.out.println("no student data found");
                } else{
                    Student topStudent=student.get(0);
                    Student failureStudent=student.get(0);
                    for(Student obj:student){
                        if(obj.getMark()>topStudent.getMark()){
                            topStudent=obj;
                        }
                        if(obj.getMark()<failureStudent.getMark()){
                            failureStudent=obj;
                        }
                    }
                    System.out.println("Top Student: "+topStudent);
                    System.out.println("Failure Student: "+failureStudent);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }else if(choice1==2){
        System.out.println("thank you");
    }}
    while(choice1!=2);}
        
        else{
            System.out.println("invalid username or password");
        }
    }}