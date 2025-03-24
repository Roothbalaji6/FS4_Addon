package hello;

public class AdvancedStrintgsEX {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		//append(old string to new string)
		sb.append("World");
		System.out.println("After append: "+sb);
		
		//insert
		sb.insert(5, ",");
		System.out.println("After insert:"+sb);
		
		//replace
		sb.replace(6,11, "java");
		System.out.println("After replace:"+sb);//sourceindex,destinationindex,string to replace
		
		
		//reverse
		sb.reverse();
		System.out.println("After reverse:"+sb);
		
	}

}
