import java.util.Stack;

public class MathExpression {
    public static void main(String[] args) {

        String expr = "5*2+1";

        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == ' ') continue;

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    num = num * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                i--;
                values.push(num);
            }

            else if (c == '(') {
                ops.push(c);
            }

            else if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();

                    int result = 0;
                    if (op == '+') result = a + b;
                    else if (op == '-') result = a - b;
                    else if (op == '*') result = a * b;
                    else if (op == '/') result = a / b;

                    values.push(result);
                }
                ops.pop(); 
            }

            else { 

                while (!ops.isEmpty() &&
                       (
                           ((ops.peek() == '+' || ops.peek() == '-') &&
                            (c == '+' || c == '-' || c == '*' || c == '/'))
                           ||
                           ((ops.peek() == '*' || ops.peek() == '/') &&
                            (c == '*' || c == '/'))
                       )
                ) {
                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();

                    int result = 0;
                    if (op == '+') result = a + b;
                    else if (op == '-') result = a - b;
                    else if (op == '*') result = a * b;
                    else if (op == '/') result = a / b;

                    values.push(result);
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            int b = values.pop();
            int a = values.pop();
            char op = ops.pop();

            int result = 0;
            if (op == '+') result = a + b;
            else if (op == '-') result = a - b;
            else if (op == '*') result = a * b;
            else if (op == '/') result = a / b;

            values.push(result);
        }

        System.out.println("Result = " + values.pop());
    }
}
