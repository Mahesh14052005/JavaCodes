import java.util.*;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> L = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            L.add(sc.nextInt());
        }

        // Clear newline after list input
        if (sc.hasNextLine()) sc.nextLine();

        while (sc.hasNext()) {
            String command = sc.next();

            if (command.equals("Insert")) {
                if (sc.hasNextInt()) {
                    int index = sc.nextInt();
                    int value = sc.nextInt();
                    if (index >= 0 && index <= L.size()) {
                        L.add(index, value);
                    }
                }
            } else if (command.equals("Delete")) {
                if (sc.hasNextInt()) {
                    int index = sc.nextInt();
                    if (index >= 0 && index < L.size()) {
                        L.remove(index);
                    }
                }
            } else {
                // Skip unrecognized commands (like '2' in your input)
                continue;
            }
        }

        // Print final list
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i));
            if (i != L.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
