class Solution {
    public boolean isHappy(int n) {
        int temp=0,digit=0;
        while(n>0){
            digit=0;
            while(n>0){
                temp=n%10;
                digit=digit+(temp*temp);
                n=n/10;
            }
            if(digit==1){
                return true;
            }
            if(digit==4){
                return false;
            }
            n=digit;
        }
        return false;
    }
}