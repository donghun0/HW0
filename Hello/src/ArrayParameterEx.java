public class ArrayParameterEx {
	static void replaceSpace(char a[]) {
		for(int i = 0; i< a.length; i++)
			if(a[i] == ' ')
			System.out.print(a[i] + " ");;
		
	}
	static void printCharArray(char a[]) {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);

	}

}
