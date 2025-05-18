package apnacollege;

public class class1 {
    public static void main(String[] args){
        int d = 20;
        System.out.print(d);//println leaves a line down and print does not check it out .

        int age = 30;
        String name = "aman";
        String skl = "alpha"; // we can assign a value in a container named variable (to store data in memory)
        String ishuskl = skl; // we can directly assign a variable to another variable (it will access its value)
        /*applies to same datatype */
        System.out.println(" " + ishuskl);

        //BYTE
        Byte b =127; // BYTE --> -128 TO 127 (1 BYTE)
        /* SHORT --> 2 BYTE
        INT --> 4 BYTE
        LONG --> 8 BYTE
        FLOAT --> 4 BYTE // after decimal only it will print only 6 digits 9.897897
        DOUBLE --> 8 BYTE // 15-16 digits
        CHAR --> 2 BYTE
        BOOLEAN --> 1 BYTE (TRUE/FALSE)
         */
        System.out.println(b);

    }

}
