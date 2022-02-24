import java.util.Arrays;

/**
 *
 * @author sagars
 */
public class SelectionSort {

    public static int find_min_index(int array[], int start, int end) {

        int mindex = start;
        for (int i = start + 1; i < end; i++) {
            if (array[mindex] > array[i]) {
                mindex = i;
            }
        }
        return mindex;
    }

    public static void main(String[] args) {

        int array[] = {5, 2, 6, 7, 2, 1, 0, 3};
        int end = array.length;

        System.out.println(Arrays.toString(array));

        for (int start = 1; start < end; start++) {
            int right_unsorted_index = find_min_index(array, start, end);
            int left_sorted_index = start - 1;
            System.out.println("start is " + start + "  and min element in right = " + array[right_unsorted_index]);
            if (array[left_sorted_index] > array[right_unsorted_index]) {
                //swap
                int temp = array[left_sorted_index];
                array[left_sorted_index] = array[right_unsorted_index];
                array[right_unsorted_index] = temp;
            }
            System.out.println("after swap==>" + Arrays.toString(array));
            System.out.println("");
        }

        System.out.println("===>output");
        System.out.println(Arrays.toString(array));

    }

}
