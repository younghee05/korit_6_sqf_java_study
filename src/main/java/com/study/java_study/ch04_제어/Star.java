package com.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {
        /*

        *
        **
        ***
        ****
        *****

         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*"); // 옆으로 가는 것
            }
            System.out.println();
        }

        System.out.println("");

        /*

         *****
         ****
         ***
         **
         *

         */

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
                *
               **
              ***
             ****
            *****
         */

        // 방법1
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // [선생님풀이] 방법 2
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*
        *****
         ****
          ***
           **
            *
         */

        // 방법 1
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 방법2 [선생님 풀이]

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();


        /*

            *
           ***
          *****
         *******
        *********

         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
