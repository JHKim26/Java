package hw2;

public class Person {
	protected String Name;
	protected int Age;
	
	// DEFAULT CONSTRUCTOR
	public Person() {
		this.Name = "";
		this.Age = 0;
    }
	//CONSTRUCTOR
    public Person(String str, int a) {
    	this.Name = str;
    	this.Age = a;
    }
    
	public void sayName(){
		System.out.println(this.Name);
	}
    
	public static void main (String[] args) {
	}
}
