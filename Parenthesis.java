import java.util.ArrayList;

public class Parenthesis {

    public static ArrayList<String> generateParenthesis(int A) {

        ArrayList<String> result = new ArrayList<String>();
        for(int i =1; i <= A; i++)
            parenthesis(0, 0, i, "", result, A);

        return result;
    }

    static void parenthesis(int open, int close, int pair, String res, ArrayList<String> result, int A){

        if(open == pair && close == pair && res.length() == 2*A){
            result.add(res);
        }
        else{
            if(open < pair){
                parenthesis( open + 1, close, pair, res + "(", result, A);
            }
            if(close < open){
                parenthesis( open, close + 1, pair, res + ")", result, A);
            }
        }
    }



    public static void main (String[] args){
        int a = 3;
        ArrayList<String> result = generateParenthesis(a);
        System.out.println(result);
    }
}


