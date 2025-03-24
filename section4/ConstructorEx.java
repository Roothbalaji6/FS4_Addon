package hello;

public class ConstructorEx {
       public int sum(int a, int b) {
    	   int res = a + b;
    	   return res;
       }
       
       
       public static void main(String[]args) {
    	   ConstructorEx ce = new  ConstructorEx();
    	   System.out.println(ce.sum(5, 10));
       }
}
 