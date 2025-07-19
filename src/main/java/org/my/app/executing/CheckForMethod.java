package org.my.app.executing;

import org.my.app.methods.Palindrome;

import java.util.ArrayList;
import java.util.List;

class CheckForMethod {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(121);



    }

    List<String> names = new ArrayList<>();

    public void createPersonsList(String name) {
        names.add(name);

    }

//    public void listOfPersons() {
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }

    public void findPersonByIndex(int index) {
        names.get(index);
        System.out.println(names.get(index));
    }

    public List<String> getNames() {
        return names;
    }

    public CheckForMethod(List<String> names) {
        this.names = names;
    }
}
