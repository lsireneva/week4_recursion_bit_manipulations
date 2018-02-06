import java.util.ArrayList;

public class Combinations {

    public static ArrayList<ArrayList<Integer>> combine(int A, int B) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        recursion(result,new ArrayList<Integer>(),A,B,1);
        return result;
    }
    public static void recursion(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp, int n, int k, int start){
        if(temp.size()==k)
            list.add(new ArrayList<>(temp));
        else if(temp.size()>k)return;

        for(int i=start;i<=n;i++){
            temp.add(i);
            recursion(list,temp,n,k,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main (String[] args){

        int  A = 4, B = 2;

        System.out.println(combine(A, B));
    }



}
