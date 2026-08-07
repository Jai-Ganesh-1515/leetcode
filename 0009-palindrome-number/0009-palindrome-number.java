class Solution {
    public boolean isPalindrome(int x) {
        int temp=0,rev=0,check=x;
        while(x>0){
            temp=x%10;
            rev=(rev*10)+temp;
            x=x/10;
        }
        if(rev==check){
            return true;
        }
        else{
            return false;
        }
    }
}