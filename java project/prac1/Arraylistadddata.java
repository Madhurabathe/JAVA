package prac1;

import java.util.ArrayList;

public class Arraylistadddata {
    public static void main(String[] args) {
        collegedata D1=new collegedata(21,"madhura");
        collegedata D2=new collegedata(22,"sneha");
        collegedata D3=new collegedata(23,"priya");
        ArrayList<collegedata> A1=new ArrayList<>();
        A1.add(D1);
        A1.add(D2);
        A1.add(D3);
        for(collegedata obj : A1){
            System.out.println(obj);
        }
    }
}
