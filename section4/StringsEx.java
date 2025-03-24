package hello;

public class StringsEx {
     public static void main(String[] args) {
		/*String s1 = "java ";
		String s2 = "Program";
		String s3 = "Program";
		
		String s4 = s1 + s2 ;
		
		System.out.println(s4);*/
    	 
   /* 	 String s1 = "java ";
 		String s2 = "Program";
 		String s3 = "Program";
 		s1 = s1+s2;
		
 		System.out.println(s1);
		*/
    	 
    	 //True or false checking
    	 
    	/* String s2 ="rooth";
    	 String s3 ="Rooth";
    	 System.out.println(s2.equals(s3));*/
    	 
    	//==
    	 
    	/* String s4 ="rooth";
    	 String s5 ="rooth";
		System.out.println(s4==s5);*/
    	
    	 //String name = new String("Mugilan");
    	 //String name1 = new String("hello");
    	 //System.out.println(name==name1);
		
		
		//compareTo
    	 
    	 //s1>s2--->postive no
    	 //s1<s2--->negative no
    	 //s1==s2-->0
    	 
    	 
		 //String s6 ="rooth";
    	 //String s7 ="rooth";
    	 //System.out.println(s6.compareTo(s7));
    	 
    	 
    	 //concat()
    	 String str1 = "static";
    	 String str2= new String("Program");
    	 System.out.println(str1.concat(str2));
    	 
    	 
    	 //toCharArray()
    	 String str3 = "Welcome to java";
    	 System.out.println("Value of method: ");
    	 char[] ch = str3.toCharArray();
    	 for(char st: ch) {
    		 System.out.println(st);
    	 }
    	 
    	 //char[] ch = str3. tocharArray();
    	 
    	 System.out.println(str3.toCharArray());
	
    	 //ubString()
    	 System.out.println(str3.substring(5));
    	 System.out.println(str3.substring(0, 9));
    	 
    	 
    	 //intern()
    	 String clg ="kgisl";
    	 String clg1 = new String("kgisl");
    	 String str4 = clg1.intern();
    	 
    	 System.out.println(clg==str4);
	}
}
