package org.my.app.teya_interview_task;

public class testClass {
    public static void main(String[] args) {

        int count = 0;

        for (int q = 0; q < 10; q++) {
            for (int d = 0; d < 10; d++) {
                for (int n = 0; n < 10; n++) {
                    count++;
                    System.out.println("q=" + q + " d=" + d + "n=" + n + " -> X");
                }
            }
            System.out.println("Itteration size: " + count);
            System.out.println();
        }

    }
}
