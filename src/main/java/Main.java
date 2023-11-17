import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        int number = 0;
        ArrayList<Integer> numbersList = new ArrayList<>();

        while (!(number < 0)) {
            System.out.println("Podaj dowolną liczbę całkowitą: ");
            number = scanner.nextInt();
            numbersList.add(number);
        }

        try {
            numbersList.remove(numbersList.size() - 1);

            Collections.reverse(numbersList);

            for (int i = 0; i < numbersList.size(); i++) {
                System.out.print(numbersList.get(i));
                if (!(i + 1 == numbersList.size())) {
                    System.out.print(", ");
                }
            }

            System.out.println();

            Collections.reverse(numbersList);

            StringBuilder sumText = new StringBuilder(String.valueOf(numbersList.get(0)));
            for (int i = 0; i < numbersList.size(); i++) {
                if (!(i == 0)) {
                    sumText.append(" + ").append(numbersList.get(i));
                }
            }

            int sum = 0;
            for (int i : numbersList) {
                sum = sum + i;
            }

            System.out.println(sumText + " = " + sum);

            int maximum = numbersList.get(0);
            int minimum = numbersList.get(0);
            for (int i = 1; i < numbersList.size(); i++) {
                if (maximum < numbersList.get(i)) {
                    maximum = numbersList.get(i);
                }
                if (minimum > numbersList.get(i)) {
                    minimum = numbersList.get(i);
                }
            }

            System.out.println("Najmniejsza liczba w liście to " + minimum);
            System.out.println("Największa liczba w liście to " + maximum);

        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Brak wartości na liście, koniec programu.");
        }
    }
}