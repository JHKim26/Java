public class InsertionSort {
    private static int[] toSort = {1, 3, -2, 4, 9, 2, 1, 0};

    public static int[] sort(int[] arr) {
        int length = arr.length;
        int[] sortedArray = new int[length+1];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Looking at " + arr[i]);
            int toInsert = arr[i];
            int insertPos=0;

            for (int j = 0 ; j < i+1; j++) {
                if (toInsert > sortedArray[j]) {
                    insertPos = j;
                    break;
                }
            }
            for (int k = i; k > insertPos; k--) {
                sortedArray[k+1] = sortedArray[k];
            }
            sortedArray[insertPos] = toInsert;
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int [] resultArray = sort(toSort);
        for (int i = 0 ; i < resultArray.length-1; i++) {
            System.out.println(resultArray[i]);
        }
    }
}
