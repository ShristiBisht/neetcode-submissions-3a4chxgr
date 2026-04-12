class Solution {
    public boolean alphaNum(char a){
        return (a>='A' && a<='Z') || (a>='a' && a<='z') ||
        (a>='0' && a<='9'); 
    }
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<r){
            while(l<r && !alphaNum(s.charAt(l))){
                l++;
            }
            while(l<r && !alphaNum(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) return false;
            l++; r--;
        }
        return true;
    }
}
