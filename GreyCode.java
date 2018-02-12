import java.util.ArrayList;

public class GreyCode {

    public static void main (String[] args) {
        System.out.println(grayCode(2));

    }

    public static ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> result = new ArrayList<>();

        if(a==0){
            result.add(0);
            return result;
        }

        result = grayCode(a-1);
        int add = 1<<(a-1);

        for(int i=result.size()-1; i>=0; i--){
            result.add(add+result.get(i));
        }

        return result;
    }
}
