class Solution {
    public int evalRPN(String[] tokens) {

		List<String> operators = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		operators.add("+");
		operators.add("-");
		operators.add("*");
		operators.add("/");
		for (String s : tokens) {
			if (operators.contains(s) && !stack.isEmpty()) {
				switch (s) {
				case "+": {
					stack.push(stack.pop() + stack.pop());

					continue;
				}

				case "-": {
					int a = stack.pop();
					int b = stack.pop();
					stack.push(b - a);
					continue;
				}

				case "*": {
					stack.push(stack.pop() * stack.pop());
					continue;
				}

				case "/": {
					int a = stack.pop();
					int b = stack.pop();
					 stack.push(b/a);
					continue;
				}
				}
			} else
				stack.push(Integer.parseInt(s));
		}
		return stack.peek();
}}