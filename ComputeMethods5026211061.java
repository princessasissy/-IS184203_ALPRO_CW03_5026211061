import java.util.Random;
public class ComputeMethods5026211061 {

    public static void main(String[]args){


    }
    public double fToC(double degreesF){
        return 5*(degreesF-32)/9;
    }
    public double hypotenuse(int a, int b){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
    }
    public int roll(){
        Random nasa = new Random();
        int dadu1 = nasa.nextInt(6)+1;
        int dadu2 = nasa.nextInt(6)+1;
        return dadu1+dadu2;
    }
}