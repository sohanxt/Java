public class swapvalue2b {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        System.out.println("Before swapping value a = "+ a + " value b = "+ b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping value a = "+ a + " value b = "+ b);
    }
    
    
}
