package hw2;

public class FindZero {
	int[] List = {1, 2, 0, 5, -1, 4, 0, 0, 3, 9};
	int len = List.length;
	public int det = process(0);
	
	public int process(int lev){
		if(lev>len){
			return 1;
		}
		else if(List[lev] == 0){
			return 0;
		}
		else{
			process(lev+1);
		}
	}
	
	public void start(){
		if(det == 0){
			System.out.println("There is at least one '0'");
		}
		else{
			System.out.println("There is no '0'");
		}
	}
	
	public static void main (String[] args) {
	}
}
