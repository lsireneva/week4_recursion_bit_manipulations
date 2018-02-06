public class NumberOf1Bits {

    public static int numSetBits(long a) {
        int result = 0;

        while(a > 0){
            if(a % 2 == 1)
                result++;

            a = a/2;
        }
        return result;
    }

    public static void main (String[] args){
        long a = 11;
        System.out.println(numSetBits(a));
    }
}
