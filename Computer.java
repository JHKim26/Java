public class Computer {
	private String CPU;
	private int RAM, OSCode,weight;
	
	// DEFAULT CONSTRUCTOR
    public Computer() {
        CPU = "i3";
        RAM = 4;
        OSCode = 1;
        weight = 980;
    }

    // CONSTRUCTOR
    public Computer(String str, int x, int y, int z) {
        CPU = str;
        RAM = x;
        OSCode = y;
        weight = z;
    }
	
	public static void main (String[] args) {
	}
}

public class printOS { //?????????
	String[] OS = {"Windows", "Microsoft", "Others"};
    Computer CompA = new Computer("i7", 4, 1, 980);
}
