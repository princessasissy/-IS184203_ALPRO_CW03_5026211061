import java.util.Scanner;
public class TestClass5026211061 {
    public static void main(String[]args){
        //number 1
        ComputeMethods5026211061 com = new ComputeMethods5026211061();
        Scanner nasa = new Scanner(System.in);
        double fahrenheit,celcius;
        System.out.print("Temperature in Fahrenheit: ");
        fahrenheit = nasa.nextDouble();
        celcius = com.fToC(fahrenheit);
        System.out.println("Temp in celcius is" + celcius);

        //number 2
        int a,b;
        double c;
        System.out.print("masukkan nilai a :");
        a= nasa.nextInt();
        System.out.print("masukkan nilai b :");
        b= nasa.nextInt();
        c= com.hypotenuse(a, b);
        System.out.println("The hypotenuse is "+c);

        //number 3
        System.out.println("the sum of the dice values is "+com.roll());
    }
}
