package sem4;

import java.util.Stack;

public class task5 {
    public static void main(String[] args) {
        System.out.println("simplifyPath = " + simplifyPath("/home//fool/"));
    }

    public static  String simplifyPath(String path) {
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] tokens = path.split("/");
        for (String token : tokens) {
            if (tokens.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!tokens.equals(".")){ //&& !tokens.isBlank()) {
                stack.push(token);
            }
        }
            while (stack.isEmpty()){
                result.insert(0,stack.pop()).insert(0, "/");
            }
        return result.toString();
    }
}
