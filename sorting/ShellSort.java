import java.util.Arrays;

/**
 *
 * @author sagars
 */
public class ShellSort {

    public static void main(String[] args) {
        int array[] = {12, 34, 54, 2, 3};
        System.out.println(Arrays.toString(array));
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap = gap / 2) {

            for (int i = gap; i < n; i++) {

                int temp = array[i];
                int j= i;
                for (; j >= gap && array[j - gap] > temp; j = j - gap) {
                    array[j] = array[j - gap];
                }
                //put temp (the original a[i]) in its correct
                array[j] = temp;
                System.out.println(Arrays.toString(array));
            }
        }
        
        System.out.println("output-->" + Arrays.toString(array));

    }
}
