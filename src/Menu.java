import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Mazlicek> mazlic;
    private static boolean running = true;

    public static void start(ArrayList<Mazlicek> mazlicci) {
        mazlic = mazlicci;
        String input;
        System.out.println("Running mazlíčci manager");
        while (running) {
            try {
                System.out.print("action: ");
                input = scanner.nextLine();
                input = input.toLowerCase();
                switch (input) {
                    case "help" -> help();
                    case "view" -> view();
                    case "view all" -> viewall();
                    case "view by name" -> viewByName();
                    case "add" -> add();
                    case "remove" -> remove();
                    case "exit" -> exit();
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

    private static void viewByName() {
        String input = scanner.nextLine();
        Mazlicek mazlicek = mazlic.stream().filter(mazlicekus -> input.equals(mazlicekus.getJmeno())).findFirst().orElse(null);
        if (mazlicek == null)
            throw new RuntimeException("Mazlicek with name " + input + " does not exist");
        System.out.println(mazlicek);
    }

    private static void viewall() {
        System.out.println("Jmena mazlicku jsou:");
        mazlic.forEach(mazlicek -> {
            System.out.print(mazlicek.getJmeno());
            if (!mazlicek.equals(mazlic.getLast()))
                System.out.println(", ");
            else
                System.out.println(".");
        });
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
            System.out.println(params[0] + " was added");
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
            System.out.println(mazlic.get(param).getJmeno() + " was removed");
        } catch (Exception e) {
            System.out.printf(e.toString());
        }
    }

    private static void exit() {
        System.out.println("Bye bye");
        running = false;
    }
}