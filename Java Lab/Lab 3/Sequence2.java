public class Sequence2 {
    public static void main (String [] args)
{
    int token = 1;
     for(int i=18 ; i <= 63 ; i+=9 )
        {
            System.out.print(i*token);
            if(i<63){
                System.out.print(", ");
            }
            token *=-1;
        }
}    
}
