import java.util.Scanner;
public class ProcessAName5026211061 {
    public static void main(String[]args) {
        String name;
        Scanner nasa = new Scanner(System.in);
        System.out.print("Type your name: ");
        name= nasa.nextLine();
        int space = name.indexOf(" ");
        char first_letter = name.charAt(0);
        String lastName = name.substring(space+1);
        System.out.println("Your name is: "+lastName+", "+first_letter+".");
    }
}
