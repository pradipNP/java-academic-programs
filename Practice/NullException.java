
package Practice;
public class NullException {
    public static void main(String[] args){
        String name = null;
        try{
            System.out.println(name.toUpperCase());
        }
        catch(NullPointerException n){
            System.out.println(n);
        }
    }
}
