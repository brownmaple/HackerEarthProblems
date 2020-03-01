package hackerEarth;

import java.util.Stack;

public class Histogram {
    public static void meth(){
        int[] hist = {4,6,8,3,5,2};
        int width1 = 1;
        int width2 = 2;
        int max = hist[0];
        int newLargestRect;

       for(int i=1;i<hist.length;i++) {
           if (hist[i] > max) {
               max = hist[i];
           }
       }
       System.out.println(max);
    }

   public static int getMaxArea(int hist[], int n)
    {
        // Create an empty stack. The stack holds indexes of hist[] array
        // The bars stored in stack are always in increasing order of their
        // heights.
        Stack<Integer> s = new Stack();

        int max_area = 0; // Initialize max area
        int tp;  // To store top of stack
        int area_with_top; // To store area with top bar as the smallest bar

        // Run through all bars of given histogram
        int i = 0;
        while (i < n)
        {
            // If this bar is higher than the bar on top stack, push it to stack
            if (s.empty() || hist[s.peek()] <= hist[i])
                s.push(i++);

                // If this bar is lower than top of stack, then calculate area of rectangle
                // with stack top as the smallest (or minimum height) bar. 'i' is
                // 'right index' for the top and element before top in stack is 'left index'
            else
            {
                tp = s.peek();  // store the top index
                s.pop();  // pop the top

                // Calculate the area with hist[tp] stack as smallest bar
                area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);

                // update max area, if needed
                if (max_area < area_with_top)
                    max_area = area_with_top;
                System.out.println("max area from first while "+max_area);
            }
        }

        // Now pop the remaining bars from stack and calculate area with every
        // popped bar as the smallest bar
        while (s.empty() == false)
        {
            tp = s.peek();
            s.pop();
            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);

            if (max_area < area_with_top)
                max_area = area_with_top;

            System.out.println("max area from second while "+max_area);
        }

        return max_area;

    }

    public static void main(String[] args) {
        int[] hist = {4,6,8,3,5,2};
        int maxsize = Histogram.getMaxArea(hist,6);
        System.out.println(maxsize);
    }
}
