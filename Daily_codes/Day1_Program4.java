package apnacollege;
import java.util.Scanner;

public class Day1_Program4 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //1hour=80rs
        //1hour=50rs
        //80+50=130
        //gn question :weekdays is 10 hours more than weekend
        double weekdays=(10*80);
        double totalsalary=s.nextInt();
        double salary=totalsalary-weekdays;
        int weekend=(int)salary/130;
        int weekday=weekend+10;
        System.out.println("Weekends:"+weekend);
        System.out.println("Weekdays:"+weekday);
    }
}
