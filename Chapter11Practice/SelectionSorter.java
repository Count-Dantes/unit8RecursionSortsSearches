import java.util.Arrays;
public class SelectionSorter
{
    public static void sort( int[] a )
    {
        //repetedly scas the unsorter portion of the array for the next
        //smallest value and swap it with the element as the beginning
        //of the unsorted portuion of the array
        for( int i = 0 ; i <= a.length - 1; i++)
        {
            int smallestValue = a[i];
            int indexOfSmallestValue = i;
            
            //scan through the unsorter portion of the array anbd finf the
            //smallest valuel update the smallest value and the index of
            //that element
            for( int j = i ; j < a.length; j++)
            {
                if( a[j] < smallestValue )
                {
                    smallestValue = a[j];
                    indexOfSmallestValue = j;
                }
            }
            //swao the smallest value with the element at the begining of
            //the unsorted portion of the array
            int temp = a[i];
            a[i] = a[indexOfSmallestValue];
            a[indexOfSmallestValue] = temp;
        }
    }
    
    public static void revSort( int[] a )
    {
        //repetedly scas the unsorter portion of the array for the next
        //smallest value and swap it with the element as the beginning
        //of the unsorted portuion of the array
        for( int i = 0 ; i <= a.length - 1; i++)
        {
            int largestValue = a[i];
            int indexOfLargestValue = i;
            
            //scan through the unsorter portion of the array anbd finf the
            //smallest valuel update the smallest value and the index of
            //that element
            for( int j = i ; j < a.length; j++)
            {
                if( a[j] > largestValue )
                {
                    largestValue = a[j];
                    indexOfLargestValue = j;
                }
            }
            //swao the smallest value with the element at the begining of
            //the unsorted portion of the array
            int temp = a[i];
            a[i] = a[indexOfLargestValue];
            a[indexOfLargestValue] = temp;
        }
    }
    
    public static void main( String[] args )
    {
        int[] a = new int[20];
        for( int i = 0; i < a.length; i++)
        {
            a[i] = (int)( Math.random()*100 );
        }
        
        System.out.println( Arrays.toString( a ));
        
        bubbleSort( a );
        System.out.println( Arrays.toString( a ));
    }
}