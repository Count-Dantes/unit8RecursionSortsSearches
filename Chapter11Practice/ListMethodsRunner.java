import java.util.ArrayList;

public class ListMethodsRunner
{
    public static void main(String[] args)
    {
        ArrayList<Integer> startList = new ArrayList<Integer>();
        ArrayList<Integer> tempList = ListMethods.makeList(5, startList);
        if (tempList.size() == 0)
        {
            System.out.println("The list is empty");
        }
        else
        {
            for (Integer i : tempList)
            {
                System.out.println(i);
            }
        }
        for (Integer i : ListMethods.reverseList(tempList))
        {
            System.out.println(i);
        }
    }
}