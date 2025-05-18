package apnacollege;
import java.util.Scanner;

public class Day2_Program1 {//find jan 1 of a year

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();//year to find
        int given_year=1900;//every century starts with leap year but this year not
        int leap_year=0;
        int non_leap_year=0;
        year=(year-1)-given_year;
        leap_year=year/4;
        non_leap_year=year-leap_year;
        int total_days=(non_leap_year*365)+(leap_year*366)+1;
        int day=total_days%7;
        if(day==0)
            System.out.println("Monday");
        else if(day==1)
            System.out.println("Tuesday");
        else if(day==2)
            System.out.println("Wednesday");
        else if(day==3)
            System.out.println("Thursday");
        else if(day==4)
            System.out.println("Friday");
        else if(day==5)
            System.out.println("Saturday");
        else if(day==6)
            System.out.println("Sunday");
    }

}
