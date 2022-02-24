import java.util.Arrays;

/**
 *
 * @author sagars adjecent element is questioned
 */
public class InsertionSort {

    public static void main(String[] args) {

        int array[] = {25, 17, 31, 13, 2};
        int n = array.length;

        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                //swap
                int t = array[i];
                array[i] = array[i + 1];
                array[i + 1] = t;
                // insert
                int k = i;
                System.out.println(Arrays.toString(array));
                while (k > 0 && array[k] < array[k - 1]) {
                    int t2 = array[k];
                    array[k] = array[k-1];
                    array[k-1] = t2;
                    System.out.println("---"+Arrays.toString(array));
                    k-=1;
                }               
            }
        }
        
        System.out.println("===>");
        System.out.println(Arrays.toString(array));

    }

}
