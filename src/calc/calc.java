/*
OPPGAVETEKST
Lag en enkel kalkulator som kan regne ut utrykk med +, - og *:

Eks.
Skriv inn regnestykke:
1 + 1
Svaret er: 2

Andre regnestykker: 3 - 2, og 2 * 2.
Regnestykkene angis som en streng som må tolkes. Tips: split(" ").
Forvent at formatet er <heltall><space><operator><space><heltall>.
Ekstra utfordring (vanskelig). Støtt flere tall og operatorer: 1 + 2 * 3

ALGORITHM
1. Take in user input as string
2. Split string by space -> array
3. Add all elements to ArrayList
4. Loop through list
    - FOR each element
        - If element.equals("*")
            - extract n1 = list(i-1), n2 = list(i+1)
            - delete element
            - calculate (n1)*(n2)
            - insert result at list(i-1)
 */

package calc;

import java.util.ArrayList;
import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        System.out.println("What do you want to calculate?");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");

        ArrayList<String> inputList = new ArrayList<>();
        for (String element : inputArray) {
            inputList.add(element);
        }

        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).equals("*")) {
                result += Integer.parseInt(inputList.get(i - 1)) * Integer.parseInt(inputList.get(i + 1));

                inputList.remove(i - 1);
                inputList.remove(i - 1);
            }
        }
        for (int i = 0; i < inputList.size(); i++) {
            if (i == 0) {
                result += Integer.parseInt(inputList.get(i));
            }

            if (inputList.get(i).equals("-")) {
                result -= Integer.parseInt(inputList.get(i + 1));
            } else if (inputList.get(i).equals("+")) {
                result += Integer.parseInt(inputList.get(i + 1));
            }
        }
        System.out.println(result);
    }
}
