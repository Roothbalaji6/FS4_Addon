package hello;

public class ConstructorOverloadingEx {
	
	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverloadingEx( String empname,int empid,String location) 
	{
	this.empname = empname;
	this.empid = empid;
	this.location = location;
	}
	


	public void displayinfo() {
		System.out.println("EmpName: "+this.empname);
		System.out.println("EmpID: "+this.empid);
		System.out.println("Emp Location: "+this.location);
	}
	public static void main(String[] args) {
		ConstructorOverloadingEx cox = new ConstructorOverloadingEx("Rooth",9003,"srp");
		cox.displayinfo();

}
	
	
	
}
