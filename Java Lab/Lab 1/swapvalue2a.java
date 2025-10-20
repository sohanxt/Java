public class swapvalue2a {

    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        System.out.println("Before swapping value a = "+ a + " value b = "+ b);
        int swap = a;
        a = b;
        b = swap;

        System.out.println("After swapping value a = "+ a + " value b = "+ b);
    }
}
