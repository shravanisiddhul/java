import java.util.*;
public class Practice {

    public static void main(String[] args) {

        int year = 2020;

        while (year >= 2010) {

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

                System.out.println(year);

            }

            year--;

        }

    }

}

