class Solution {
    public static boolean checkRedundancy(String s) {
    Stack<Character> st = new Stack<>();
    char[] str = s.toCharArray();

    for (char ch : str) {
        if (ch == ')') {
            int operatorCount = 0;
            while (!st.isEmpty() && st.peek() != '(') {
                char top = st.pop();
                if (top == '+' || top == '-' || top == '*' || top == '/') {
                    operatorCount++;
                }
            }
            if (!st.isEmpty()) st.pop(); 
            if (operatorCount == 0) {
                return true;
            }
        } else {
            st.push(ch);
        }
    }
    return false;
}
}

