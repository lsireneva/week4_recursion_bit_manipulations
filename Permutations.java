import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());

        for(int i = 0; i < A.size(); i++)
        {
            ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> list : result)
            {
                for(int j = 0; j < list.size() + 1 ;j++)
                {
                    list.add(j,A.get(i));
                    ArrayList<Integer> temp = new ArrayList(list);
                    current.add(temp);
                    list.remove(j);
                }
            }
            result = new ArrayList<ArrayList<Integer>>(current);
        }

        return result;
    }

    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(permute(list));
    }

}
