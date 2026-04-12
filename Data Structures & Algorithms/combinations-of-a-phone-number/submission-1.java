class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())  return new ArrayList<String>();
        List<String> resString = new ArrayList<>();
        resString.add("");
        String[] wordMap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(char dig : digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            for(String currStr : resString){
                for(char c : wordMap[dig-'0'].toCharArray()){
                    temp.add(currStr+c);
                }
            }
            resString=temp;
        }
        return resString;
    }
}
