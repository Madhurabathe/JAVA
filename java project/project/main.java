package project;
import java.util.*;
public class main {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    HospitalService hs=new HospitalService();
    while(true){
        System.out.println("============WELCOME TO HOSPITAL=============");
        System.out.println("1.Add Patient");
        System.out.println("2.View Patient");
        System.out.println("3.Search Patient");
        System.out.println("4.Delete Patient");

        System.out.println("5.Add Doctor");
        System.out.println("6.View Doctor");

        System.out.println("7.Book Appointment");
        System.out.println("8.View Appointment");
        System.out.println("9.Generate Bills");
        System.out.println("10.View Bills");

        System.out.println("11.Add Medicine");
        System.out.println("12.View Medicine");

        System.out.println("13.View Disease");
        System.out.println("14.Next Paitent");
        System.out.println("15.View History");
        System.out.println("16.EXIT");
        System.out.println("Enter your Choice:");
        int choice=sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                System.out.println("Enter patient id:");
                int pid=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the name:");
                String pname=sc.nextLine();
                System.out.println("Enter patient age:");
                int page=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter paitent disease:");
                String pdisease=sc.nextLine();
                hs.addpatient(new patient(pid, pname, page,pdisease));
                break;

            case 2:
                hs.viewpatient();
                break;
            case 3:
                System.out.println("Enter P id:");
                hs.searchpatient(sc.nextInt());
                break;
            case 4:
                System.out.println("Enter P id");
                hs.deletepatient(sc.nextInt());
                break;

            case 5:
                System.out.println("Enter Doctor id:");
                int did=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the name:");
                String dname=sc.nextLine();
                System.out.println("Enter doctor age:");
                int dage=sc.nextInt();
                sc.nextLine();
                System.out.println("Speciialization");
                String spec=sc.nextLine();
                hs.adddoctor(new doctor(did,dname,dage,spec));
                break;

            case 6:
                hs.viewdoctor();
                break;

            case 7:
                System.out.println("Enter Paitent id");
                int p=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter doctor id");
                int d=sc.nextInt();
                hs.bookappointment(p,d);
                break;
             case 8:
                hs.viewappointment();
                break;

            case 9:
                System.out.println("Bill NO");
                int billno=sc.nextInt();

                System.out.println("Paitent Id");
                int paitentid=sc.nextInt();

                System.out.println("amount");
                Double amount=sc.nextDouble();
                hs.genratebill(billno,paitentid, amount);
                break;

            case 10:
                hs.viewbill();
                break;

            case 11:
                sc.nextLine();
                System.out.println("Medcine name");
                String med=sc.nextLine();
                hs.addmedicine(med);
                break;

            case 12:
                hs.viewmedicine();
                break;
            case 13:
                hs.viewdisease();
                break;
            case 14:
                hs.nextpatient();
                break;
            case 15:
                hs.viewhistory();
                break;
            case 16:
                System.out.println("Thank YOU");
                System.exit(0);
            default:
                System.out.println("Invalid Choice");

        }
    }
 }   
}
