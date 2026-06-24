package project;

import java.util.*;

public class HospitalService {
    ArrayList<patient> patients=new ArrayList<>((Arrays.asList(
        new patient(101, "Ram Sharma", 46, "Fever"),
        new patient(102, "Shyam Verma", 35, "Cold"),
        new patient(103, "Amit Patel", 28, "Diabetes"),
        new patient(104, "Priya Singh", 31, "Migraine"),
        new patient(105, "Neha Gupta", 24, "Asthma"),
        new patient(106, "Rohit Kumar", 40, "Hypertension"),
        new patient(107, "Anjali Joshi", 29, "Allergy"),
        new patient(108, "Vikram Rao", 52, "Arthritis"),
        new patient(109, "Sneha Iyer", 33, "Thyroid"),
        new patient(110, "Karan Mehta", 27, "Dengue"),
        new patient(111, "Pooja Nair", 38, "Fever"),
        new patient(112, "Arjun Reddy", 45, "Back Pain"),
        new patient(113, "Meera Desai", 26, "Anemia"),
        new patient(114, "Suresh Yadav", 55, "Diabetes"),
        new patient(115, "Kavita Mishra", 42, "Hypertension"),
        new patient(116, "Rahul Choudhary", 30, "Cold"),
        new patient(117, "Deepak Jain", 37, "Migraine"),
        new patient(118, "Nisha Agarwal", 22, "Allergy"),
        new patient(119, "Manoj Tiwari", 48, "Asthma"),
        new patient(120, "Ritu Malhotra", 34, "Fever")
)));
    ArrayList<doctor> doctors=new ArrayList<>((Arrays.asList(
        new doctor(201, "Dr. Suraj Patil", 30, "MBBS"),
        new doctor(202, "Dr. Priya Sharma", 35, "MD Medicine"),
        new doctor(203, "Dr. Amit Verma", 42, "MS Orthopedics"),
        new doctor(204, "Dr. Neha Gupta", 29, "BDS"),
        new doctor(205, "Dr. Rahul Kulkarni", 38, "MD Pediatrics"),
        new doctor(206, "Dr. Sneha Iyer", 33,"MD Dermatology")
)));
    LinkedList<appointment> appointments=new LinkedList<>();
    Stack<String> history=new Stack<>();
    HashSet<String> diseases =new HashSet<>((Arrays.asList(
        "Fever",
        "Cold",
        "Cough",
        "Diabetes",
        "Hypertension",
        "Asthma",
        "Migraine",
        "Arthritis",
        "Thyroid",
        "Dengue",
        "Malaria",
        "Allergy"
))); 
    Queue<patient> waiting=new LinkedList<>();
    HashMap<Integer,patient> patientmap=new HashMap<>();
    TreeMap<Integer,Bill> bills=new TreeMap<>();
    TreeSet<String> medicines=new TreeSet<>((Arrays.asList(
        "Paracetamol",
        "Crocin",
        "Dolo 650",
        "Calpol",
        "Cetirizine",
        "Levocetirizine",
        "Montelukast",
        "Benadryl",
        "Ascoril",
        "Ambroxol",
        "Azithromycin",
        "Amoxicillin",
        "Metformin",
        "Glimipride",
        "Insulin",
        "Telmisartan",
        "Amlodipine",
        "Losartan",
        "Salbutamol",
        "Budesonide",
        "Deriphyllin",
        "Sumatriptan",
        "Naproxen",
        "Ibuprofen",
        "Diclofenac",
        "Thyronorm",
        "Eltroxin",
        "Artemether",
        "Lumefantrine",
        "Doxycycline"
)));

    public void addpatient(patient p){
        patients.add(p);
        history.push(p.getname());
        diseases.add(p.getdisease());
        waiting.offer(p);
        patientmap.put(p.getid(), p);
        System.out.println("Patient added successfully");
    }
    public void viewpatient(){
        for(patient p:patients){
            System.out.println(p);
        }
    }
    public void searchpatient(int id){
            if(patientmap.containsKey(id)){
                System.out.println(patientmap.get(id));
            }else{
                System.out.println("Id not found");
            }
        }
    public void deletepatient(int id){
        patient p=patientmap.get(id);//here id is store in hashmap but the id in from of object store in arraylist 
        if(p!=null){
            patientmap.remove(id);
            patients.remove(p);
            System.out.println("Paitent deleted");
        }else{
            System.out.println("Patient not found");
        }
    }
    public void adddoctor(doctor d){
        doctors.add(d);
        System.out.println("Doctor Added");
    }
    public void viewdoctor(){
        for(doctor d:doctors){
            System.out.println(d);
        }
    }
    public void bookappointment(int patientid,int doctorid){
        appointments.add(new appointment(patientid, doctorid));
        System.out.println("Appoinmentt booked");
    }
    public void viewappointment(){
        for(appointment a:appointments){
            System.out.println(a);
        }
    }
    public void genratebill(int billno,int patiendid,Double amount){
        if(patientmap.containsKey(patiendid)){
            Bill bill=new Bill(billno,patiendid,amount);
            bills.put(billno,bill);
        }else{
            System.out.println("Bill not found or Patient not found");
        }}
    public void viewbill(){
        for(Bill b:bills.values()){
            System.out.println(b);
        }
    }
    public void addmedicine(String medicine){
        medicines.add(medicine);
        System.out.println("Medicine added");
    }
    public void viewmedicine(){
        System.out.println(medicines);
    }
    public void viewdisease(){
        System.out.println(diseases);
    }
    public void nextpatient(){
        System.out.println(waiting.poll());
    }
    public void viewhistory(){
        System.out.println(history);
    }

}


