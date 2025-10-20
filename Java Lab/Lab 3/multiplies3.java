public class multiplies3 {
    public static void main (String[] args)
    {  
        int sum = 0;
        for (int i = 1; i <= 600;i++)
        {
            if(i%7 == 0 || i%9 == 0)
            {
                sum+=i;
            }
        }
        System.out.println("Total Sum of multiplies of 7 and 9 = "+sum);
    }
    
}
