import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1- Rellenar ArrayList y mostrar resultado
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 20; i <= 50; i++) {
            list.add(i);
            System.out.println(i);
        }

        System.out.println("Final list: " + list);

        // 2- Preguntar al usuario elementos típicos de la fiesta de Sant Jordi
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

        // 3- CRUD: recepción internacional... y universal!

        Guest[] selected = new Guest[5];
        selected[0] = new Guest("Lionel", "Messi", 38, true);
        selected[1] = new Guest("Elon", "Musk", 53, true);
        selected[2] = new Guest("Lady", "Gaga", 39, true);
        selected[3] = new Guest("Donald", "Trump", 72, true);
        selected[4] = new Guest("Brigitte", "Vasallo", 52, true);

        System.out.println("\n" + "THE FIRST VERSION OF THE LIST IS:" + "\n" + Arrays.toString(selected));

        selected[1].setConfirmation(false);
        selected[2].setConfirmation(false);

        System.out.println("\n" + "TWO GUESTS GOT SCARED AND DROPPED OUT:" + "\n" + Arrays.toString(selected));

        selected[1] = new Guest("Pedro", "Sánchez", 45, true);

        System.out.println("\n" + "THE SECOND POSITION HAS A NEW GUEST!:" + "\n" + Arrays.toString(selected));

        selected[selected.length -1].setConfirmation(false);

        System.out.println("\n" + "THE GUEST IN THE LAST POSITION HAS CANCELLED!:" + "\n" + Arrays.toString(selected));

        selected[selected.length -1] = new Guest("Malena", "Pichot", 42, true);

        System.out.println("\n" + "A NEW GUEST HAS BEEN RECOMMENDED FOR THE LAST POSITION:" + "\n" + Arrays.toString(selected));

        selected[2] = new Guest("Anfisa", "Letyago", 30, true);

        System.out.println("THA VACANCY FOR POSITION 3 HAS BEEN FILLED" + "\n" + Arrays.toString(selected));
    }
}