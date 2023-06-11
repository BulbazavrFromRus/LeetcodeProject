import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {

        int numRows =10;
        System.out.println(PascalTriangle(numRows));

    }


    public static List<List<Integer>> PascalTriangle(int numRows)
    {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0)
        {
            return triangle;
        }

        //list with first element
        List<Integer> firstList = new ArrayList<>();

        //we add first list to triangle
        firstList.add(1);
        triangle.add(firstList);

        //create loop to generate subsequent lists
        for(int i = 1; i < numRows; ++i)
        {
            //list with previous values
            //we will compare current numbers with previous numbers
            List<Integer> previousList = triangle.get(i-1);
            //list with current values
            List<Integer> currentList = new ArrayList<>();

            currentList.add(1);

            //loop for generate numbers in current list
            for(int j =1; j < i; j++)
            {
                currentList.add(previousList.get(j-1) + previousList.get(j));
            }

            currentList.add(1);
            triangle.add(currentList);

        }
       return triangle;
    }
}
