package hw2;

public class Student {
	protected String NameOfSch;
	
	// DEFAULT CONSTRUCTOR
	public Student() {
        super();
		this.NameOfSch = "";
    }

	//CONSTRUCTOR
    public Student(String str1, int a, String str2) {
        super(str1, a);
    	this.NameOfSch = str2;
    }
    
	public void saySchool(){
		System.out.println(this.NameOfSch);
	}
    
	public static void main (String[] args) {
	}
}
