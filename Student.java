package hw2;

public class Student {
	protected String Name, NameOfSch;
	protected int Age;
	
	// DEFAULT CONSTRUCTOR
	public void Profile() {
		this.Name = "";
		this.Age = 0;
		this.NameOfSch = "";
    }
	//CONSTRUCTOR
    public void Constructor(String str1, int a, String str2) {
    	this.Name = str1;
    	this.Age = a;
    	this.NameOfSch = str2;
    }
    
	public void saySchool(){
		System.out.println(this.NameOfSch);
	}
    
	public static void main (String[] args) {
	}
}
