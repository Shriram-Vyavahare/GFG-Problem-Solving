// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int rem,count=0,temp=n;
        while(n>0){
                 rem=n%10;
                if(rem!=0 && temp%rem==0){
                    count++;
                }
            n=n/10;
        }
        return count;
    }
}