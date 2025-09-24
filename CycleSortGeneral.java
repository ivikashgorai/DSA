

public class CycleSortGeneral {

    public static void cycleSort(int[] arr) {
        int n = arr.length;

        // Traverse array to place elements at correct position
        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];

            // Find position where we put the element
            int pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            // If element is already in correct position
            if (pos == cycleStart) {
                continue;
            }

            // Skip duplicates (if present)
            while (item == arr[pos]) {
                pos++;
            }

            // Put item to its right position
            if (pos != cycleStart) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            // Rotate the rest of the cycle
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 40, 50, 10, 30};

        cycleSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

