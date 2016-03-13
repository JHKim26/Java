public class HW1 {
	public static void main(String[] args) {
		int n = 23;
		int sqn = 1;
		int i;
		int check = 0;
		
		while(sqn*sqn < n){
			sqn = sqn+1;
		}
		
		for(i=2; i<=sqn; i++){
			if(n%i==0){
				check += 1;
			}
		}
		
		if(check == 0){
			System.out.println(n + " is a prime");
		}
		else{
			System.out.println(n + " is not a prime");
		}
	}
}
