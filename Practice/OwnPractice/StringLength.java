package Practice.OwnPractice;

public class StringLength {
    public static void main(String[] args){
        String name = "Pradeep";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name2 = "  pkL   ";
        System.out.println(name2.trim());

        System.out.println(name.substring(2,4));

        System.out.println(name.replace('p','k'));

    }
}
