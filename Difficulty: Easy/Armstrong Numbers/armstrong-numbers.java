// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        
        int sum=0,rem,cube,temp=n;
        
        while(n>0){
            rem=n%10;
            cube=(rem*rem*rem);
            sum=sum+cube;
            n=n/10;
        }
        
        if(sum==temp)
            return true;
        else 
            return false;
    }
}