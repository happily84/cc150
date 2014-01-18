package chapter1;
public class question1 {
    public static boolean isUnique( String s ){
        if ( s.length() > 256 )
            return false;
        boolean[] checker = new boolean[256];
        for ( int i = 0; i < s.length(); ++i ){
            int location = (int)(s.charAt(i));
            if ( checker[location] == true)
                return false;
            else
                checker[location] = true;
        }
        return true;
    }
    
    public static boolean isUniqueChars(String str) {
        if (str.length() > 256) {
                return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
                int val = str.charAt(i) - 'a';
                if ((checker & (1 << val)) > 0) return false;
                checker |= (1 << val);
        }
        return true;
}
    
    public static void main( String[] args) {
        String word[] = { "tes-1","t-test"};
        for ( String s: word){
            System.out.println(s + ":" + isUniqueChars(s));
        }
    }

}
