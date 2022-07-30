class Solution {
    public String reverseWords(String s) {
        char[] c=s.toCharArray();
        int start=0,end=0;
        for(;end<c.length;end++){
            if(c[end]== ' '){
                reverse(c,start,end-1);
                start=end+1;
                
            }
        }
         reverse(c,start,end-1);
        return new String(c);
    }
    public void reverse(char[] ch,int start,int end){
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        
    }
}