public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Set and return idx as data array length
        int idx = data.length - 1;

        // For loop goes through the array, could also use a while loop
        for (int i = 0; i < data.length; i++)
        {
            // Finds target
            if(data[i] == target)
            {
                // If it finds target, sets idx to i
                idx = i;
                break;
            }
            else
            {
                // If not, idx = -1
                idx = -1;
            }
        }
        return idx;
    }
}
