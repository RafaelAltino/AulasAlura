// public class App {
//     public static void main(String[] args) throws Exception {
//         Banheiro banheiro = new Banheiro();
//         Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
//         Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Maria");
//         Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Faxineira");
//         limpeza.setDaemon(true);
//         convidado1.start();
//         convidado2.start();
//         limpeza.start();

//     }
// }

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class App {

    public final char S = '(';
    public final char E = ')';
    public final char X = '\\';

    String errorMessage = "Malformed expression: ";

    /**
     * Actual Output:
     *    Groups: [(//), (\d{1,2}), (\d{1,2}), (\d{2,4})]
     * Expected Output:
     *    Groups: [\\b((\\d{1,2})/(\\d{1,2})/(\\d{2,4}))\\b, ((\\d{1,2})/(\\d{1,2})/(\\d{2,4})), (\d{1,2}), (\d{1,2}), (\d{2,4})]
     */

    public App() {
        String expression = "\\b((\\d{1,2})/(\\d{1,2})/(\\d{2,4}))\\b";
        String output = "";

        if (isValidExpression(expression)) {
            List<String> groups = findGroups(expression);
            output = "Groups: " + groups;
        } else {
            output = errorMessage;
        }

        System.out.println(output);
    }

    public List<String> findGroups(String expression) {
        List<String> groups = new ArrayList<>();
        int[] pos;
        int start;
        int end;
        String sub;
        boolean done = false;

        while (expression.length() > 0 && !done) {
            pos = scanString(expression);
            start = pos[0];
            end = pos[1];

            if (start == -1 || end == -1) {
                done = true;
                continue;
            }

            sub = expression.substring(start, end);
            expression = splice(expression, start, end);
            groups.add(0, sub);
        }

        return groups;
    }

    public int[] scanString(String str) {
        int[] range = new int[] { -1, -1 };
        int min = 0;
        int max = str.length() - 1;
        int start = min;
        int end = max;
        char curr;

        while (start <= max) {
            curr = str.charAt(start);
            if (curr == S) {
                range[0] = start;
            }
            start++;
        }

        end = range[0];

        while (end > -1 && end <= max) {
            curr = str.charAt(end);
            if (curr == E) {
                range[1] = end + 1;
                break;
            }

            end++;
        }

        return range;
    }

    public String splice(String str, int start, int end) {
        if (str == null || str.length() < 1)
            return "";

        if (start < 0 || end > str.length()) {
            System.err.println("Positions out of bounds.");
            return str;
        }

        if (start >= end) {
            System.err.println("Start must not exceed end.");
            return str;
        }

        String first = str.substring(0, start);
        String last = str.substring(end, str.length());

        return first + last;
    }

    public boolean isValidExpression(String expression) {
        try {
            Pattern.compile(expression);
        } catch (PatternSyntaxException e) {
            errorMessage += e.getMessage();
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        new App();
    }
}