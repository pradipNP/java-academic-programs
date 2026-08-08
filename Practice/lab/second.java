package Practice.lab;

import java.util.*;
public class second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String name1 = sc.nextLine();

        System.out.println("Enter the second String : ");
        String name2 = sc.nextLine();

        if(name1==name2){
            System.out.println("Both strings are equals.");
        }
        else{
            System.out.println("Both the strings are not equal");
        }

        System.out.println("First string is: " + name1);
        System.out.println("Second string is: " + name2);
        
        String concatenate = name1 + name2;
        System.out.println("Concatenated string is " + concatenate);

        
        
    }

}
