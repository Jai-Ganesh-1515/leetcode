class Solution {
    public int reverse(int x) {
        int temp=0,rev=0;
        int a=(int)Math.abs(x);
        while(a>0){
            if(rev > (Integer.MAX_VALUE - temp) / 10) {
                return 0;
            }
            temp=a%10;
            rev=(rev*10)+temp;
            a=a/10;
        }
        if(x>0){
            return rev;
        }
        else{
            rev=-rev;
            return rev;
        }
    }
}