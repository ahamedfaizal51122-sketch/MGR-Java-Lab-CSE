public class Demo1 {
    public static void main(String[] args){
        String s="the sky is blue";
        Demo1 d3=new Demo1();
        System.out.println(d3.reverseWords(s));
    }
    public String reverseWords(String s){
        int end=s.length()-1;
        StringBuilder sb=new StringBuilder();
        while(end>=0){
            while(end>=0 && s.charAt(end)==' '){
                end--;
            }
            if(end<0){
                break;
            }
            int start=end;
            while(start>=0 && s.charAt(start)!=' '){
                start--;
            }
            sb.append(s.substring(start+1,end+1)+" ");
            end=start-1;
        }
        return sb.toString().trim();
    }
    
}
