import java.util.ArrayList;
import java.util.List;

public class LetterPhone {


    public static void main (String[] args){

        System.out.println(letterCombinations("23"));

    }

    public static ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> result=new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        String[] keyboard={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if (digits==null) return result;

        combination(digits, 0, sb, keyboard, result);

        return result;

    }
    private static void combination(String digits, int index, StringBuilder sb, String[] keyboard, ArrayList<String> result){
        if (index==digits.length()){
            result.add(sb.toString());
            return;
        }

        for (int i=0; i<keyboard[digits.charAt(index)-'0'].length(); i++){
            sb.append(keyboard[digits.charAt(index)-'0'].charAt(i));
            combination(digits, index+1, sb, keyboard, result);
            sb.deleteCharAt(sb.length()-1);
        }


    }
}
