package apnacollege;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>List=new ArrayList<String>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            List.add(sc.nextLine());

        }
        System.out.println(List);
    }
}
