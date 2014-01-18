package chapter1;

public class question4 {
	public static char[] replaceSpace ( char[] original, int len ) {
		int spaceCount = 0;
		for ( int i = 0; i < len; ++i) {
			if ( ' ' == original[i] )
				spaceCount++;
		}
		int index = len + spaceCount *2;
		char[] result = new char[len + spaceCount * 2 + 1];
		result[index] = '\0';
		-- index;
		for ( int i = len - 1; i >=0; --i) {
			if ( ' ' == original[i]) {
				result[index] = '0';
				result[index-1] = '2';
				result[index-2] = '%';
				index -= 3;
			}else {
				result[index] = original[i];
				-- index;
			}
		}
		
		return result;
	}
	public static void main( String[] args) {
		char[] str= "test for replaceSpace.".toCharArray();
		char[] result = replaceSpace(str,22);
		System.out.println(result);
	}
}
