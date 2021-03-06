package chapter1;

public class question5 {
	public static String stringCompression( String original) {
		int compressedCount = 0;
		for ( int i = 0; i < original.length();++i) {
			char current = original.charAt(i);
			if ( i+1 < original.length() && original.charAt(i+1) == current) {
				while ( ++i < original.length() && original.charAt(i) == current)
					++ compressedCount;
			}
			-- compressedCount;
		}
		
		if ( compressedCount <= 0 )
			return original;
		
		StringBuilder result = new StringBuilder();
		
		for ( int i = 0; i < original.length();) {
			char current = original.charAt(i);
			int count = 1;
			if ( i+1 < original.length() && original.charAt(i+1) == current) {
				while ( ++i < original.length() && original.charAt(i) == current) {
					++ count;
				}
				result.append(current);
				result.append(count);
			}else {
				result.append(current);
				result.append(count);
				++i;
			}
		}
		return result.toString();
	}
	public static String stringCompressionBetter( String original ) {
		int size = 0;
		int count = 1;
		if ( original.length() == 0 )
			return original;
		char last = original.charAt(0);
		for ( int i = 1; i < original.length(); i++) {
			if( original.charAt(i) == last) {
				count ++;
			}else {
				size += 1 + String.valueOf(count).length();
				last = original.charAt(i);
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		if ( size >= original.length())
			return original;
		
		last = original.charAt(0);
		count = 1;
		StringBuilder result = new StringBuilder();
		for ( int i = 1; i < original.length(); i++) {
			if( original.charAt(i) == last) {
				count ++;
			}else {
				result.append(last);
				result.append(count);
				last = original.charAt(i);
				count = 1;
			}
		}
		result.append(last);
		result.append(count);
		return result.toString();
	}
	public static void main( String[] args ) {
		String str = "aabcccccaaa";
		System.out.println("original string: " + str + "\t" + "compressed string: " + stringCompression(str));
		System.out.println("original string: " + str + "\t" + "compressed string: " + stringCompressionBetter(str));
	}
}
