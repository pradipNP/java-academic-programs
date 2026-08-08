public class StaticVariable {
    
    static int staticCounter = 0;

    public StaticVariable() {
        staticCounter++;
    }

    public static void main(String[] args) {
       
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();

        System.out.println("Static Counter: " + StaticVariable.staticCounter);
    }
}
