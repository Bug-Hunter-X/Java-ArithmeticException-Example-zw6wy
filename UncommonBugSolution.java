public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            if (y == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                int z = x / y; 
                System.out.println(z);
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Program continues execution.");
        }
    }
}