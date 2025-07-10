import java.util.Stack;

public class largest_histogram {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++)
        {
            int current=(i==n)?0:heights[i];
            while(!st.isEmpty()&&current<heights[st.peek()])
            {
                int h=heights[st.pop()];
                int w=(st.isEmpty())?i:i-st.peek()-1;
                maxArea=Math.max(maxArea,h*w);
            }
            st.push(i);
        }
    return maxArea;
}
}
