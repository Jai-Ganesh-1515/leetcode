class Solution {
    public int findNumbers(int[] a) {
        int total=0;
        for(int b:a){
            int c=0;
            while(b>0){
                c+=1;
                b/=10;
            }
            if(c%2==0){
                total+=1;
            }
        }
        return total;
    }
}