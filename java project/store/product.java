package store;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class product {
    public static void main(String[] args) {
        HashMap<Integer, pro> hmap = new HashMap<>();
        LinkedHashMap<Integer, pro> lmap = new LinkedHashMap<>();
        TreeMap<Integer, pro> tmap = new TreeMap<>();
        System.out.println("WELCOME TO STORE");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add product");
            System.out.println("2.search product");
            System.out.println("3.view product by insertion order");
            System.out.println("4.view product sorted by ID");
            System.out.println("5.update product");
            System.out.println("6.delete product");
            System.out.println("7.count total product");
            System.out.println("8.EXIT");
            System.out.println("enter your choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter product Id");
                    int proid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter product name");
                    String proname = sc.nextLine();
                    System.out.println("enter the price");
                    Double proprice = sc.nextDouble();
                    pro p = new pro(proid, proname, proprice);
                    hmap.put(proid, p);
                    lmap.put(proid, p);
                    tmap.put(proid, p);
                    System.out.println("Product Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter the Id of product you want to search ");
                    int sid = sc.nextInt();
                    if (hmap.containsKey(sid)) {
                        System.out.println(hmap.get(sid).getName());
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;
                case 3:
                    for (pro pp : lmap.values()) {
                        System.out.println(pp);
                    }
                    break;
                case 4:
                    for (pro ppp : tmap.values()) {
                        System.out.println(ppp);
                    }
                    break;
                case 5:
                    System.out.print("Enter Product ID to Update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    if (hmap.containsKey(uid)) {
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter New Price: ");
                        double newPrice = sc.nextDouble();
                        pro newPro = new pro(uid, newName, newPrice);
                        hmap.put(uid, newPro);
                        lmap.put(uid, newPro);
                        tmap.put(uid, newPro);
                        System.out.println("Updated Successfully");
                    } else {
                        System.out.println("Product Not Found");
                    }

                    break;
                case 6:
                    System.out.print("Enter Product ID to Delete: ");
                    int did = sc.nextInt();
                    if (hmap.containsKey(did)) {
                        hmap.remove(did);
                        lmap.remove(did);
                        tmap.remove(did);
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("No Product Found");
                    }
                    break;
                case 7:
                    System.out.println("Total Products = " + hmap.size());
                    break;
                case 8:
                    System.out.println("Thank you !");
                    break;
                default:
                    System.out.println("incorrect choice");
            }
        } while (choice != 8);

    }

}