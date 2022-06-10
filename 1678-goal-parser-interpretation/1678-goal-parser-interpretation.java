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
                sb.append(getDecodedString("("));
                ++i;
              } 
             else if (arr[i + 1] == 'a')
             {
              sb.append(getDecodedString("a"));
              ++i;
             }
          }
        }
      return sb.toString();
    }

    public String getDecodedString(String choice) {
        switch (choice)
        {
            case "a":
                return "al";
            case "(":
                return "o";
        }
        return null;
    }
}