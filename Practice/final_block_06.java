package Practice;

class Resource {
    public void cleanup() {
        System.out.println("Cleaning up...");
    }
}

class MyResource extends Resource {
    public void cleanup() {
        System.out.println("Cleaning up my resource...");
    }
}

public class final_block_06 {
    public static void main(String[] args) {
        MyResource res = null;
        try {
            res = new MyResource();
            // final block is executed here
            System.out.println("Exiting try block...");
        } catch (Exception e) {
            // exception handling code
            // ...
        } finally {
            // final block is executed here
            System.out.println("Executing final block...");
            res.cleanup();
        }
    }
}