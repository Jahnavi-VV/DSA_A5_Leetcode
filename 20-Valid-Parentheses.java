class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                char ele=st.pop();
                if(ele=='(' && ch!=')') return false;
                if(ele=='[' && ch!=']') return false;
                if(ele=='{' && ch!='}') return false;
            }
        }
        return st.size()==0?true:false;
    }
}