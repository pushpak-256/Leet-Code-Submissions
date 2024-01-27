class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            switch(c){
                case '{': { stack.push('}'); continue;}
                case '(': { stack.push(')'); continue;}
                case '[': { stack.push(']'); continue;}
                default : { 
                    if(stack.isEmpty() || c!=stack.pop())
                        return false;
                }
              
             }
        }
        return stack.isEmpty();
    }
}