import java.util.ArrayList;
import java.util.Collections;

public class FindMinXor {


    public static void main (String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(15);
        list.add(5);
        list.add(1);
        list.add(10);
        list.add(2);

        System.out.println(findMinXor(list));
    }


    public static int findMinXor(ArrayList<Integer> A) {


        Collections.sort(A);
        System.out.println(A.toString());

        int min_xor = Integer.MAX_VALUE;
        int value = 0;
        int n = A.size();

        for(int i=0; i< n-1; i++)
        {
            value = A.get(i) ^ A.get(i+1);
            min_xor = Math.min(min_xor, value);
            System.out.println("A.get(i) "+A.get(i)+"A.get(i+1) "+A.get(i+1)+"="+min_xor);
        }

        return min_xor;
    }
}
