package apnacollege;
import java.util.Scanner;
public class Day1_Program3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		/*int a=s.nextInt();
		int b=s.nextInt();
		double c=a+b;
		System.out.println(c);


		String str1=s.nextLine();
		String str2=s.nextLine();
		int a=s.nextInt();
		char ch=s.next().charAt(0);
		double d=s.nextDouble();
		System.out.println("Event Name:"+str1);
		System.out.println("Event Type:"+str2);
		System.out.println("Excepted count:"+a);
		System.out.println("Paid Entry:"+ch);
		System.out.println("Expense:"+d);

		String name=s.nextLine();
		int age=s.nextInt();
		System.out.println(name+" age is "+age);
		*/
        int ra=s.nextInt();
        int ro=s.nextInt();
        int sa=s.nextInt();
        int so=s.nextInt();
        int sea=s.nextInt();
        int reo=s.nextInt();
		/*System.out.println("Ramu apple:"+ra);
		System.out.println("Ramu orange:"+ro);
		System.out.println("somu apple:"+(sa+ra));
		System.out.println("somu orange:"+(so+ro));*/
        System.out.println("Balance apple:"+(ra+sa-sea));
        System.out.println("Balance orange:"+(ro+so-reo));
    }
}
