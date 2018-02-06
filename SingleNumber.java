import java.util.ArrayList;
import java.util.List;

public class SingleNumber {


    public static int singleNumber(final List<Integer> A) {
        int result =0;

        for(int i = 0; i < A.size(); i++){
            result ^= A.get(i);
        }
        return result;

    }

    public static void main (String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);

        System.out.println(singleNumber(list));
    }
}
