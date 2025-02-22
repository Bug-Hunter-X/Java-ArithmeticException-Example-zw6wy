public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y; // Potential ArithmeticException
            System.out.println(z); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues after exception.");
    }
}