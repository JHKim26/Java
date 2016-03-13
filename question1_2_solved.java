public class HW1 {
	public static void main(String[] args) {
		int a = 30;
		int b = 36;
		int i, m;
		int g = 1;
		
		if(a<b) m = a;
		else m = b;
		
		for(i=1; i<m; i++){
			if(a%i==0 && b%i==0){
				g = i;
			}
		}
		
		System.out.println(g);
	}
}
