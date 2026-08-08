package Practice;
public class NumberPointerException{
    public static void main(String[] args){
        String name = "p";

        try{
            int n = Integer.parseInt(name);
        }
        catch(NumberFormatException e){
            System.out.println("Number format exception");
        }
    }
}
