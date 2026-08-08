package Practice;

public class MultipleException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
           
            int x = 10;
            int y = 0;
           arr[4] = x/y;
        } catch (ArrayIndexOutOfBoundsException e) {
           
            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
         
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
          
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}