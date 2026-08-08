package Lab6;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

        try{
            int element = numbers[4];
            System.out.println("Element at index 4: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
