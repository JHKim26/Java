package hw2;

public class Person {
	protected String Name;
	protected int Age;
	
	// DEFAULT CONSTRUCTOR
	public void Profile() {
		this.Name = "";
		this.Age = 0;
    }
	//CONSTRUCTOR
    public void Constructor(String str, int a) {
    	this.Name = str;
    	this.Age = a;
    }
    
	public void sayName(){
		System.out.println(this.Name);
	}
    
	public static void main (String[] args) {
	}
}