import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Mazlicek> mazlic;

    public static void start(ArrayList<Mazlicek> mazlicci) {
        mazlic = mazlicci;
        boolean running = true;
        String input;
        System.out.println("Running mazlíčci manager");
        while (running) {
            try {
                System.out.print("action: ");
                input = scanner.nextLine();
                switch (input) {
                    case "help" -> help();
                    case "view" -> view();
                    case "add" -> add();
                    case "remove" -> remove();
                    default -> help();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    private static void help() {
        System.out.println("You can use: help, view, add, remove");
    }
    private static void view() {
        System.out.print("index: ");
        int param = scanner.nextInt();
        scanner.nextLine();
        System.out.println(mazlic.get(param));
    }
    private static void add() {
        System.out.println("format: jmeno druh vek vaha");
        System.out.print("adding: ");
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
        System.out.print("index: ");
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
