package hw2;

public class Teacher extends Person {
	protected String NameOfSch;
	protected String[] ListOfStu = new String[10];
	protected int L;
	
	//DEFAULT CONSTRUCTOR
	public Teacher(){
        super();
		int i;
		for(i=0; i<10; i++){
			ListOfStu[i] = "";
		}
	}
	
	//CONSTRUCTOR
	public Teacher(String str1, int a, String str2, String[] list){
        super(str1, a);
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
