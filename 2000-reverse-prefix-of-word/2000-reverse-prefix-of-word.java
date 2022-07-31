class Solution {
    public String reversePrefix(String word, char ch) {
        char[] array=word.toCharArray();
        int i=0;
        int j=0;
        
        while(i<=j&& j<array.length){
            if(array[j]==ch){
                 while(i<=j && j<array.length){
                char temp=array[j];
                array[j]=array[i];
                array[i]=temp;
                i++;
                j--;
            }
            return String.valueOf(array);             
            }
            j++;
        }
        return String.valueOf(array);  
       
    }
}