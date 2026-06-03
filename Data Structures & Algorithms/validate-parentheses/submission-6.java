class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() == 1) {
                return false;
            }

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Character aux;

            switch (c) {
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }

                    aux = stack.pop();
                    if (!aux.equals('{')) {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    }

                    aux = stack.pop();
                    if (!aux.equals('[')) {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    }

                    aux = stack.pop();
                    if (!aux.equals('(')) {
                        return false;
                    }
                    break;
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
