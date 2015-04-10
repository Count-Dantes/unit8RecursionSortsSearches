import java.util.Arrays;
public class BubbleSort
{

    public static void sort(int[] a)
    {
        boolean end = false;
        while (end == false)
        {
            boolean swapped = false;
            for (int i = 0; i < a.length-1; i ++)
            {
                if ( a[i] > a[i+1] )
                {
                    int tempInt = a[i+1];
                    a[i+1] = a[i];
                    a[i] = tempInt;
                    swapped = true;
                    System.out.println("swap");
                }
            }
            if(swapped = false)
            {
                System.out.println("/tendlind");
                end = true;
            }

        }
    }
    
    public static void main( String[] args )
    {
        int[] a = new int[5];
        for( int i = 0; i < a.length; i++)
        {
            a[i] = (int)( Math.random()*100 );
        }
        
        System.out.println( Arrays.toString( a ));
        
        sort( a );
        System.out.println( Arrays.toString( a ));
    }
}


