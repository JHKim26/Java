package hw2;

public class Teacher {
	protected String Name, NameOfSch;
	protected int Age;
	protected String[] ListOfStu = new String[10];
	protected int L;
	
	//DEFAULT CONSTRUCTOR
	public void Profile(){
		this.Name = "";
		this.Age = 0;
		int i;
		for(i=0; i<10; i++){
			ListOfStu[i] = "";
		}
	}
	
	//CONSTRUCTOR
	public void Constructor(String str1, int a, String str2, String[] list){
		this.Name = str1;
		this.Age = a;
		this.NameOfSch = str2;
		
		int i;
		L = (10<list.length?10:list.length);
		for(i=0; i<L; i++){
			this.ListOfStu[i] = list[i];
		}
	}
	
	public void RoasterCall(){
		int i = 0;
		for(i=0; i<L; i++){
			System.out.println(this.ListOfStu[i] + "\n");	
		}
	}
	
	public static void main (String[] args) {
	}
}
