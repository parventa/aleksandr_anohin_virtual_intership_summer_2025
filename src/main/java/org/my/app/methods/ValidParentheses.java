package org.my.app.methods;

public class ValidParentheses {
    public boolean isValid(String s) {

        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.isEmpty();
    }

}
