import java.util.*;
public class Sum_of_first_N{
    public static int sum(int n)
    {
        if(n==1)  // base case
        {
            return n;
        }
        return n+sum(n-1); // recurssion called
    }
    public static void main(String[] args) {
        int ans=sum(5);
        System.out.println(ans);
    }
}
