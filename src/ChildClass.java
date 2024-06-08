
public class ChildClass extends ParentClass{
	
	void show()
	{
		System.out.println("child class------");
	}
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("child class constructor");
	}
	//System.out.println("parent class constructor");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass childobj= new ChildClass();
		 //ParentClass pobj=new ChildClass();
		 
		childobj.show();
		//pobj.show();

	}

}
