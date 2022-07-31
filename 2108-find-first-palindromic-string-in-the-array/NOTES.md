class Solution {
public String firstPalindrome(String[] words) {
for(String word:words){
if(isPalindrome(word)){
return word;
}
}
return "";
}
public boolean isPalindrome(String word){
char[] array=word.toCharArray();
int i=0,j=array.length-1;
while(i<j){
if(array[i]!=array[j]){
return false;
}
i++;
j--;
}
return true;
}
}
​
​
///////
class Solution {
public String firstPalindrome(String[] words) {
StringBuilder sb = null;
​
for(String word: words){
sb = new StringBuilder(word);
​
//Check if word is palindrome
if(sb.reverse().toString().equals(word))
return word;
}
return "";
}
​
​
​
//////////////////
​
​