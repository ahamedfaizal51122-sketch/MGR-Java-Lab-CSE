public class Solution1 {
    public static void main(String[] args){
        String s="egg";
        String t="add";
        Solution1 s1=new Solution1();
        System.out.println(s1.isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t) {
        int hash[]=new int[256];
        boolean isMapped[]=new boolean[256];
        for(int i=0;i<s.length();i++){
            char src=s.charAt(i);//e
            char tar=t.charAt(i);//a
            if(hash[src]==0){
                if(isMapped[tar]){
                    return false;
                }
                hash[src]=tar;
                isMapped[tar]=true;
            }else{
                if(hash[src]!=tar){
                    return false;
                }
            }
        }
        return true;
    }
}
    

