package chapter1;

public class Question3 {
    private static String sort( String a ){
        char[] content = a.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public static boolean isPermutation( String a, String b){
        if ( a.length() != b.length() )
            return false;
        return sort(a).equals(sort(b));
    }
    public static boolean anagram( String a, String b ){
        if ( a.length() != b.length()){
            return false;
        }
        int[] checker = new int[256];
        for ( char c : a.toCharArray()){
            checker[c]++;
        }
        for ( char c : b.toCharArray()){
            if ( checker[c] == 0)
                return false;
            checker[c]--;
        }
        return true;
    }
    public static void main( String[] args){
        String[][] sample = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for ( String[] pair : sample){
            String lh = pair[0];
            String rh = pair[1];
            System.out.println(lh + "\t" + rh + "\t" + isPermutation(lh,rh));
            System.err.println(lh + "\t" + rh + "\t" + anagram(lh,rh));
        }
    }
}
