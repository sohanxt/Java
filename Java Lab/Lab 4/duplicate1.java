public class duplicate1 {
    public static void main (String [] args)
    {
        int[] arr = {9,-5,7,9,-5,5,7};

        System.out.println("Array before update :");
        for(int i = 0 ;i <7 ;i++)
        {
            System.out.print(" " +arr[i]);
        }

        for( int i =0 ; i < 7 ; i++)
        {
            for (int j = i+1 ; j < 7 ; j++)
            {
               if(arr[i] == arr[j])
               {
                 arr[j] = 0;
               }
            }
        }

        System.out.println("Array after updating duplicate with 0 :");
        for(int i = 0 ;i <7 ;i++)
        {
            System.out.print(" " +arr[i]);
        }
        
    }
    
}
