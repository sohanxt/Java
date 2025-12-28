public class lab4minmaxcheck {
    public static void main(String[] args) {
int[] arr ={ 1,4,5,3,4,6,7,8} ;

int max = arr[0];
int min = arr[0];

for (int i = 0; i < 8 ; i++)
{
if (arr[i] > max)
{
max = arr[i];
}
if (arr[i] < min)
{
min = arr[i];
}
}
int sum = max + min;
System.out.println( "Here smallest number " + min +   " Largest number "  +max +  " And Their Sum "  +
sum );
}
    
}
