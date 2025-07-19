package org.my.app.executing;

import java.util.Arrays;

public class ListCheck {
    public static void main(String[] args) {

        CheckForMethod list = new CheckForMethod(

        Arrays.asList("Aleksandr", "Anton", "Arkadij", "Aleksej", "Arnold")

        );

        list.findPersonByIndex(1);

        list.getNames().forEach(name -> System.out.println(name));

    }

}
