import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        for(int i = 20; i <= 50; i++) {
            list.add(i);
            System.out.println(i);
        }

        System.out.println("Final list " + list);
    }
}