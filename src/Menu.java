import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Mazlicek> mazlic;

    public static void start(ArrayList<Mazlicek> mazlicci) {
        mazlic = mazlicci;
        boolean running = true;
        String input;
        while (running) {
            input = scanner.nextLine();
            switch (input) {
                case "help" -> help();
                case "view" -> view();
                case "add" -> add();
                case "remove" -> remove();
                default -> help();
            }
        }

    }

    private static void help() {
        System.out.println("help, view, add, remove");
    }
    private static void view() {
        int param = scanner.nextInt();
        scanner.nextLine();
        System.out.println(mazlic.get(param));
    }
    private static void add() {
        System.out.println("format: jmeno druh vek vaha");
        String param = scanner.nextLine();
        String[] params = param.split(" ");
        try {
            if (params.length != 4)
                throw new RuntimeException("invalid parameters");
            mazlic.add(
                    new Mazlicek(
                            params[0],
                            Druh.valueOf(params[1]),
                            Integer.parseInt(params[2]),
                            Double.parseDouble(params[3]
                            )
                    )
            );
            System.out.println(params[0]+" was added");
        } catch (Exception e) {
            System.out.printf(e.toString());
        }
    }
    private static void remove() {
        int param = scanner.nextInt();
        scanner.nextLine();
        try {
            mazlic.remove(param);
            System.out.println(mazlic.get(param).getJmeno()+" was removed");
        } catch (Exception e) {
            System.out.printf(e.toString());
        }
    }
}
