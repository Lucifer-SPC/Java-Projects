// Demonstrate casts.
public class Conversion {
    public static void main(String args[]){
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion of int to byte.");
        //The result is the remainder of the division of 257 by 256(the range of a byte)
        b = (byte) i;
        System.out.println("i and b are " + i + " " + b);

        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i are " + d + " " +i);
        
        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b are " + d + " " +b);

    }
    
}
