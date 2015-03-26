import java.util.*;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n, ArrayList<Integer> tempList)
    {
        if (n <= 0)  // The smallest list we can make
        {
            return tempList;


        }
        else        // All other size lists are created here
        {
            tempList.add(0,n);
            n --;
            makeList(n, tempList);


        }
        return tempList;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) 
    {
        ArrayList<Integer> revList = deepClone(list);
        if (revList.size() <=1 ) //empty or one element
        {
            return revList;
        }
        else
        {
            int num = revList.remove(revList.size()-revList.size());
            reverseList(revList);
            
            revList.add(num);
            
            return revList;
        }
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (Integer i : tList)
        {
            list.add(new Integer(i));
        }
        return list;
    }
}