
import java.util.Arrays;
import java.util.*;

 class ThreeSum {


    private ThreeSum() { }

   
    private static boolean containsDuplicates(int[] array) {
        for (int i = 1; i < array.length; i++)
            if (array[i] == array[i-1]) return true;
        return false;
    }

    
    public static void printAll(int[] array) {
        int n = array.length;
        Arrays.sort(array);
        if (containsDuplicates(array)) throw new IllegalArgumentException("array contains duplicate integers");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = Arrays.binarySearch(array, -(array[i] + array[j]));
                if (k > j) System.out.println(array[i] + " " + array[j] + " " + array[k]);
            }
        }
    } 


    public static int count(int[] array) {
        int n = array.length;
        Arrays.sort(array);
        if (containsDuplicates(array)) throw new IllegalArgumentException("array contains duplicate integers");
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = Arrays.binarySearch(array, -(array[i] + array[j]));
                if (k > j) count++;
            }
        }
        return count;
    } 


    public static void main(String[] args)  { 
        Scanner sc = new Scanner (System.in);
        int[] array = {1000,-800,-200,234,435,3243,-3,2,1,12,-11,-1};
        int count = count(array);
		System.out.print("Number of Three sum number sets are:");
        System.out.println("\t" + count);
    } 
}