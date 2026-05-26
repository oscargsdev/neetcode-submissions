class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {
            if (s.equals("C")) {
                stack.pop();
            }
            else if (s.equals("D")) {
                int score = stack.peek() * 2;
                stack.push(score);
            }
            else if (s.equals("+")) {
                int score1 = stack.pop();
                int score2 = score1 + stack.peek();
                stack.push(score1);
                stack.push(score2);
            }
            else {
                int score = Integer.parseInt(s);
                stack.push(score);
            }
        }

        int score = 0;
        while (!stack.isEmpty()) {
            score += stack.pop();
        }

        return score;
    }
}