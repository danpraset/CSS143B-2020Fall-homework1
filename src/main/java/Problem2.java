public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        int x = data.length;

        for (int i = 0; i <= x - 1; i++)
        {
            // Second loop goes through array
            for (int j = 0; j < x - i - 1; j++)
            {
                if (data[j] > data[j + 1]) {
                    // Swap j with j+1
                    // Set int temp to equal j
                    int temp = data[j];

                    // Sets data[j] to equal j+1
                    data[j] = data[j + 1];

                    // Sets j+1 to equal temp, swapping them
                    data[j + 1] = temp;
                }
            }
        }
    }
}
