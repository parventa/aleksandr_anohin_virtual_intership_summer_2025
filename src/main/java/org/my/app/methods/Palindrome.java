package org.my.app.methods;

public class Palindrome {

    public boolean isPalindrome(int x) {
        String parameter = Integer.toString(x);
        int leftSide = 0;
        int rightSide = parameter.length() - 1;

        while (leftSide < rightSide) {
            if (parameter.charAt(leftSide) != parameter.charAt(rightSide)) {
                System.out.println("Number is not palindrome");
                return false;
            }
            leftSide++;
            rightSide--;
        }
        System.out.println("Number is palindrome!");
        return true;
    }

}
