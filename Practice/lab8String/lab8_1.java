package Practice.lab8String;

import java.util.Scanner;
class NegativeNumberException extends Exception{
    NegativeNumberException(String s){
        super(s);
    }
}
public class lab8_1 {
     void processinput(int a) throws NegativeNumberException{ 
        if(a<0){
            throw new NegativeNumberException("Number should  be positive");

        }
        else{
            System.out.println(a*2);
        }

    }


    public static void main(String args[]){
        try{
        int a;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        lab8_1 obj=new lab8_1();
        obj.processinput(a);
    }catch(Exception m){
        System.out.println(m);

}
}
}
