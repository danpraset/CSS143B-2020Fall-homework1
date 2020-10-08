import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int [][] inputs =
                {
                        {},
                        {3},
                        {3, 1},
                        {3, 5, 9},
                        {13, 4, 9, 26, 1},
                        {5, 3, 11, 21},
                        {1, 12, 6, 17},
                };

        int [][] expected =
                {
                        {},
                        {3},
                        {1, 3},
                        {3, 5, 9},
                        {1, 4, 9, 13, 26},
                        {3, 5, 11, 21},
                        {1, 6, 12, 17}
                };
        for (int i = 0; i < inputs.length; i++)
        {
            Problem2.bubbleSort(inputs[i]);
            assertArrayEquals(inputs[i], expected[i]);
        }
    }
}
