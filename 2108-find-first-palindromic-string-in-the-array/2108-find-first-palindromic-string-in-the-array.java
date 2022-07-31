class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder sb = null;

        for(String word: words){
            sb = new StringBuilder(word);

			//Check if word is palindrome
            if(sb.reverse().toString().equals(word))
                return word;
        }
        return "";
    }
}