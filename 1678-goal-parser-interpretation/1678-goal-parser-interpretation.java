class Solution {
    public String interpret(String command) {

        char[] arr = command.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 'G')
            {
                sb.append(arr[i]);
            } 
           else if (arr[i] == '(')
           {
              if (arr[i + 1] == ')') 
              {
                sb.append("o");
                ++i;
              } 
             else if (arr[i + 1] == 'a')
             {
              sb.append("al");
              ++i;
             }
          }
        }
      return sb.toString();
    }
}