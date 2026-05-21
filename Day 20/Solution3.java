import java.util.*;
class Solution3 {
    static String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> combination = new ArrayList<>();
        solve(digits, 0, "", combination);
        return combination;
    }
    public void solve(String s,int index,String result,List<String> combination)
    {
        if(index==s.length())
        {
            combination.add(result);
            return;
        }
        int digit=s.charAt(index)-'0';
        String letters=mapping[digit];
        for(int i=0;i<letters.length();i++)
        {
            solve(s,index+1,result+letters.charAt(i),combination);
        }
    }
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        String digits = "23";
        //output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(solution.letterCombinations(digits));
    }
}