package Stack;

import java.util.Stack;

public class nge {
    public static int[] nextGreaterElement(int[] nums){
        int n = nums.length;
        int ngelem[] = new int[n];

        Stack<Integer> st  = new Stack<>();
        for(int i= n-1;i>=0;i--){
            while(st.isEmpty() == false && st.peek() <= nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty() == false) ngelem[i] = st.peek();
                else  ngelem[i] = -1;
            }
            st.push(nums[i%n]);
        }
        return ngelem;
    }

    public static void main(String[] args) {
        int arr[] = {5,7,1,2,6,0};
        int arr2[] = nextGreaterElement(arr);

        System.out.println("The next Greater Element are :");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
    
}
