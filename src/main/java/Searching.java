package src.main.java;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Searching {
    public static String binarySearch(List<Integer> list, int item) {
        Instant init = Instant.now();
        DecimalFormat decimalFormat = new DecimalFormat("0.0000000000");
        boolean found = false;
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int kick = list.get(mid);
            if (kick == item) {
                System.out.println("◕‿◕ :" + "'(teu elemento está aqui!) '");
                found = true;
                break;
            }
            if (kick > item) {
                high = mid - 1;
                System.out.println("(︶^︶) :" + "'(hmm, meu chute do número "+ kick + "está mais alto que o esperado...) '");
            } else {
                low = mid + 1;
                System.out.println("(︶^︶) :" + "'(hmm, meu chute do número "+ kick + " está menor que o esperado ...) '");
            }
        }
        if (!found) {
            System.out.println("(︶^︶) :" + "'(teu elemento" + item +  "não está na lista!) '");
        }

        Instant finish = Instant.now();
        long timeInNanos = Duration.between(init, finish).toNanos();
        double timeInSeconds = timeInNanos / 1_000_000_000.0;
        return decimalFormat.format(timeInSeconds);
    }

    public static String iteratorSearch(List<Integer> list, int item) {
        Instant init = Instant.now();
        DecimalFormat decimalFormat = new DecimalFormat("0.0000000000");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == item) {
                System.out.println("◕‿◕ :" + "'(teu elemento está aqui pelo iterador!) '");
                break;
            } else if (list.get(i) != item && i == list.size()) {
                System.out.println("(︶^︶) :" + "'(teu elemento não está na lista!) '");
            }
            else {
                System.out.println("(︶^︶) :" + "'(hmm ainda não está aqui nesse iterador " + i + " ...) ");
            }

        }
        Instant finish = Instant.now();
        long timeInNanos = Duration.between(init, finish).toNanos();
        double timeInSeconds = timeInNanos / 1_000_000_000.0;
        return decimalFormat.format(timeInSeconds);
    }

    public static List<Integer> replaceSearch(String input) {
        String[] numbers = input.replaceAll("\\s+", "").split(",");
        List<Integer> listOfValues = new ArrayList<>();
        for (String number : numbers) {
            listOfValues.add(Integer.parseInt(number));
        }
        return listOfValues;
    }

}
