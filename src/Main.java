import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 20; i <= 50; i++) {
            list.add(i);
            System.out.println(i);
        }

        System.out.println("Final list: " + list);

        ArrayList<String> jordiList = new ArrayList<>();
        String item;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Add a typical elements of the Sant Jordi festival.\n" +
                    "To exit, press S.");
            item = sc.nextLine();
            if (!item.equalsIgnoreCase("S")) {
                jordiList.add(item);
            }
        } while (!item.equalsIgnoreCase("S"));

        System.out.println("The Sant Jordi list includes :" + jordiList);
    }
}