import java.util.Arrays;

/**
 *
 * @author sagars
 */
public class bubbleSort {

    public static void main(String[] args) {

        int array[] = {50, 33, 27, 35, 10};

        System.out.println(Arrays.toString(array));
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println(array[j] + " ," + array[j+1]);
                 if(array[j] > array[j+1]) {
                     //swap
                     int t = array[j];
                     array[j] = array[j+1];
                     array[j+1] = t;
                     System.out.println("---swaped:"+array[j] + " ," + array[j+1]);
                 }
            }
        }
        
        System.out.println("\n");
        System.out.println(Arrays.toString(array));

    }

}
