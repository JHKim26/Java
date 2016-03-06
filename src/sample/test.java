C++ // Physics, Applied Math

public class test { // class name must equal file name
    private int x;
    private int y;
    private int z;


    public test() { // DEFAULT CONSTRUCTOR
        x = 3;
        y = 4;
        z = 5;
    }

    // CONSTRUCTOR
    public test(int x, int y, int z) {
        x = x;
        y = y;
        z = z;
    }

    /// INTERFACE
    void setX(int x) {
        x = x;
    }

    void getX() {
    }

    void setY(int y) {
        y = y;
    }
        
	public static void main (String[] args) {
	}
}

public class test2 {
    int x = 3;
    int y = 5;
    char c = 'a';

    test t;
    test t2 = new test(1, 2, 3);
}
