class Solution {
    public int removeDuplicates(int[] A) {
        int n=A.length;
        int unique=0;
        for(int duplicate=1;duplicate<n;duplicate++){
            if(A[unique]!=A[duplicate]){
                unique++;
                 int temp=A[unique];
                    A[unique]= A[duplicate];
                    A[duplicate]=temp;
                    
            }
            
        }
        return unique+1;
    }
}