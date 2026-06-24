package hospitaldb;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        admindao dao = new admindao();
        System.out.println("======WELCOME TO HOSPITAL MANAGMENT======");
        System.out.println("ENTER THE USERNAME :");
        String username = sc.nextLine();
        System.out.println("ENTER THE PASSWORD :");
        String password = sc.nextLine();

        if (!dao.login(username, password)) {
            System.out.println("INVALID CREDENTIALS");
            System.exit(0);
        }
        System.out.println("LOGIN SUCCESSFUL");

        while (true) {
            System.out.println("\n======= MAIN MENU =======");
            System.out.println("1.PATIENT");
            System.out.println("2.DOCTOR");
            System.out.println("3.APPOINTMENT");
            System.out.println("4.PRESCRIPTION");
            System.out.println("5.MEDICINE");
            System.out.println("6.BILL");
            System.out.println("7.DEPARTMENT");
            System.out.println("8.EXIT");
            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    patientMenu();
                    break;
                case 2:
                    doctorMenu();
                    break;
                case 3:
                    appointmentMenu();
                    break;
                case 4:
                    prescriptionMenu();
                    break;
                case 5:
                    medicineMenu();
                    break;
                case 6:
                    billMenu();
                    break;
                case 7:
                    departmentMenu();
                    break;
                case 8:
                    System.out.println("THANK YOU FOR USING HOSPITAL MANAGEMENT SYSTEM");
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }

    public static void patientMenu() {
        patientdao pdao = new patientdao();
        while (true) {
            System.out.println("\n--- PATIENT MENU ---");
            System.out.println("1.ADD PATIENT");
            System.out.println("2.VIEW ALL PATIENTS");
            System.out.println("3.SEARCH PATIENT");
            System.out.println("4.UPDATE PATIENT");
            System.out.println("5.DELETE PATIENT");
            System.out.println("6.BACK TO MAIN MENU");
            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD PATIENT ID");
                    int pid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD PATIENT NAME");
                    String pname = sc.nextLine();
                    System.out.println("ADD PATIENT AGE");
                    int page = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD PATIENT GENDER");
                    String gender = sc.nextLine();
                    System.out.println("ADD PATIENT CITY");
                    String city = sc.nextLine();
                    System.out.println("ADD PATIENT CONTACT");
                    int contact = sc.nextInt();
                    patient p = new patient(pid, pname, page, gender, city, contact);
                    pdao.addpatient(p);
                    break;
                case 2:
                    System.out.println("\n=== ALL PATIENTS ===");
                    pdao.viewpatient();
                    break;
                case 3:
                    System.out.println("SEARCH BY PATIENT ID");
                    int searchpid = sc.nextInt();
                    pdao.searchpatient(searchpid);
                    break;
                case 4:
                    System.out.println("UPDATE PATIENT ID");
                    int upid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD NAME");
                    String uname = sc.nextLine();
                    System.out.println("ADD AGE");
                    int uage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD GENDER");
                    String ugender = sc.nextLine();
                    System.out.println("ADD CITY");
                    String ucity = sc.nextLine();
                    System.out.println("ADD CONTACT");
                    int ucontact = sc.nextInt();
                    pdao.updatepatient(upid, uname, uage, ugender, ucity, ucontact);
                    break;
                case 5:
                    System.out.println("DELETE PATIENT ID");
                    int dpid = sc.nextInt();
                    pdao.deletepatinet(dpid);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }

    public static void doctorMenu() {
        doctordao ddao = new doctordao();
        while (true) {
            System.out.println("\n--- DOCTOR MENU ---");
            System.out.println("1.ADD DOCTOR");
            System.out.println("2.VIEW ALL DOCTORS");
            System.out.println("3.SEARCH DOCTOR");
            System.out.println("4.UPDATE DOCTOR");
            System.out.println("5.DELETE DOCTOR");
            System.out.println("6.BACK TO MAIN MENU");
            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD DOCTOR ID");
                    int did = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD DOCTOR NAME");
                    String dname = sc.nextLine();
                    System.out.println("ADD EXPERIENCE (years)");
                    int exp = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD SPECIALIZATION");
                    String spec = sc.nextLine();
                    System.out.println("ADD SALARY");
                    int salary = sc.nextInt();
                    System.out.println("ADD DEPARTMENT ID");
                    int deptid = sc.nextInt();
                    doctor d = new doctor(did, dname, exp, spec, salary, deptid);
                    ddao.adddoctor(d);
                    break;
                case 2:
                    System.out.println("\n=== ALL DOCTORS ===");
                    ddao.viewdoctor();
                    break;
                case 3:
                    System.out.println("SEARCH BY DOCTOR ID");
                    int searchdid = sc.nextInt();
                    ddao.searchdoctor(searchdid);
                    break;
                case 4:
                    System.out.println("UPDATE DOCTOR ID");
                    int udid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD NAME");
                    String udname = sc.nextLine();
                    System.out.println("ADD EXPERIENCE");
                    int uexp = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD SPECIALIZATION");
                    String uspec = sc.nextLine();
                    System.out.println("ADD SALARY");
                    String usalary = sc.nextLine();
                    System.out.println("ADD DEPARTMENT ID");
                    int udeptid = sc.nextInt();
                    ddao.updatedoctor(udid, udname, uexp, uspec, usalary, udeptid);
                    break;
                case 5:
                    System.out.println("DELETE DOCTOR ID");
                    int ddid = sc.nextInt();
                    ddao.deletedoctor(ddid);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }

    public static void appointmentMenu() {
        appointdao apdao = new appointdao();
        while (true) {
            System.out.println("\n--- APPOINTMENT MENU ---");
            System.out.println("1.ADD APPOINTMENT");
            System.out.println("2.VIEW ALL APPOINTMENTS");
            System.out.println("3.SEARCH APPOINTMENT");
            System.out.println("4.DELETE APPOINTMENT");
            System.out.println("5--.BACK TO MAIN MENU");
            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD APPOINTMENT ID");
                    int apid = sc.nextInt();
                    System.out.println("ADD PATIENT ID");
                    int appatientid = sc.nextInt();
                    System.out.println("ADD DOCTOR ID");
                    int apdoctorid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD DATE");
                    String apdate = sc.nextLine();
                    System.out.println("ADD TIME");
                    int fee = sc.nextInt();
                    appointment ap = new appointment(apid, appatientid, apdoctorid, apdate, fee);
                    apdao.addappoint(ap);
                    break;
                case 2:
                    System.out.println("\n=== ALL APPOINTMENTS ===");
                    apdao.viewappoint();
                    break;
                case 3:
                    System.out.println("SEARCH BY APPOINTMENT ID");
                    int searchapid = sc.nextInt();
                    apdao.searchappoint(searchapid);
                    break;
                case 4:
                    System.out.println("DELETE APPOINTMENT ID");
                    int dapid = sc.nextInt();
                    apdao.deleteappoint(dapid);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }

    public static void prescriptionMenu() {
        prescriptiondao prdao = new prescriptiondao();
        while (true) {
            System.out.println("\n--- PRESCRIPTION MENU ---");
            System.out.println("1.ADD PRESCRIPTION");
            System.out.println("2.VIEW ALL PRESCRIPTIONS");
            System.out.println("3.SEARCH PRESCRIPTION");
            System.out.println("4.DELETE PRESCRIPTION");
            System.out.println("5.BACK TO MAIN MENU");
            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD PRESCRIPTION ID");
                    int prid = sc.nextInt();
                    System.out.println("ADD APPOINTMENT ID");
                    int appoint_id = sc.nextInt();
                    System.out.println("ADD MEDICINE ID");
                    int med_id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD QUANTITY");
                    int quantity = sc.nextInt();
                    prescription pr = new prescription(prid, appoint_id,med_id,quantity);
                    prdao.addpresc(pr);
                    break;
                case 2:
                    System.out.println("\n=== ALL PRESCRIPTIONS ===");
                    prdao.viewpresc();
                    break;
                case 3:
                    System.out.println("SEARCH BY PRESCRIPTION ID");
                    int searchprid = sc.nextInt();
                    prdao.searchpresc(searchprid);
                    break;
                case 4:
                    System.out.println("DELETE PRESCRIPTION ID");
                    int dprid = sc.nextInt();
                    prdao.deletepresc(dprid);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }

    public static void medicineMenu() {
        medicinedao medao = new medicinedao();
        while (true) {
            System.out.println("\n--- MEDICINE MENU ---");
            System.out.println("1.ADD MEDICINE");
            System.out.println("2.VIEW ALL MEDICINES");
            System.out.println("3.SEARCH MEDICINE");
            System.out.println("4.DELETE MEDICINE");
            System.out.println("5.BACK TO MAIN MENU");
            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD MEDICINE ID");
                    int medid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD MEDICINE NAME");
                    String medname = sc.nextLine();
                    System.out.println("ADD PRICE");
                    int medprice = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD EXPIRY DATE");
                    String expiry = sc.nextLine();
                    System.out.println("AVAIL");
                    String avail=sc.nextLine();
                    medicine med = new medicine(medid, medname, medprice,expiry,avail);
                    medao.addmed(med);
                    break;
                case 2:
                    System.out.println("\n=== ALL MEDICINES ===");
                    medao.viewmed();
                    break;
                case 3:
                    System.out.println("SEARCH BY MEDICINE ID");
                    int searchmedid = sc.nextInt();
                    medao.searchmed(searchmedid);
                    break;
                case 4:
                    System.out.println("DELETE MEDICINE ID");
                    int dmedid = sc.nextInt();
                    medao.deletemed(dmedid);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }

    public static void billMenu() {
        billdao bdao = new billdao();
        while (true) {
            System.out.println("\n--- BILL MENU ---");
            System.out.println("1.ADD BILL");
            System.out.println("2.VIEW ALL BILLS");
            System.out.println("3.SEARCH BILL");
            System.out.println("4.DELETE BILL");
            System.out.println("5.HIGHEST BILL");
            System.out.println("6.BACK TO MAIN MENU");
            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD BILL ID");
                    int bid = sc.nextInt();
                    System.out.println("ADD PATIENT ID");
                    int bpatientid = sc.nextInt();
                    System.out.println("ADD AMOUNT");
                    int bamount = sc.nextInt();
                    sc.nextLine();
                    System.out.println("PAYMENT MODE");
                    String mode = sc.nextLine();
                    System.out.println("PAYMENT DATE");
                    String date = sc.nextLine();
                    bill b = new bill(bid, bpatientid, bamount,mode,date);
                    bdao.addbill(b);
                    break;
                case 2:
                    System.out.println("\n=== ALL BILLS ===");
                    bdao.viewbill();
                    break;
                case 3:
                    System.out.println("SEARCH BY BILL ID");
                    int searchbid = sc.nextInt();
                    bdao.searchbill(searchbid);
                    break;
                case 4:
                    System.out.println("DELETE BILL ID");
                    int dbid = sc.nextInt();
                    bdao.deletebill(dbid);
                    break;
                case 5:
                    System.out.println("HIGHEST BILL GENERATED IS ");
                    bdao.highestBill();
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }

    public static void departmentMenu() {
        deptdao depdao = new deptdao();
        while (true) {
            System.out.println("\n--- DEPARTMENT MENU ---");
            System.out.println("1.ADD DEPARTMENT");
            System.out.println("2.VIEW ALL DEPARTMENTS");
            System.out.println("3.DELETE DEPARTMENT");
            System.out.println("4.BACK TO MAIN MENU");
            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD DEPARTMENT ID");
                    int deptid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ADD DEPARTMENT NAME");
                    String deptname = sc.nextLine();
                    dept dep = new dept(deptid, deptname);
                    depdao.adddept(dep);
                    break;
                case 2:
                    System.out.println("\n=== ALL DEPARTMENTS ===");
                    depdao.viewdept();
                    break;
                case 3:
                    System.out.println("DELETE DEPARTMENT ID");
                    int ddeptid = sc.nextInt();
                    depdao.deletedept(ddeptid);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }
}
