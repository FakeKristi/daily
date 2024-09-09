import java.util.ArrayList;
import java.util.Collection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Mazlicek> mazlicci = new ArrayList<>();
        mazlicci.add(new Mazlicek("The Void", Druh.kocka, 1000000, 3));
        mazlicci.add(new Mazlicek("The Endless", Druh.kocka, 999000, 3));
        mazlicci.add(new Mazlicek("The Cosmic", Druh.kocka, 990000, 3));
        mazlicci.add(new Mazlicek("The Forgotten", Druh.kocka, 900000, 3.2));
        mazlicci.add(new Mazlicek("The Uninvited", Druh.kocka, 900000, 3));
        mazlicci.add(new Mazlicek("The Wierd", Druh.kocka, 900000, 3));
        mazlicci.add(new Mazlicek("The Darkness", Druh.kocka, 998000, 3));
        mazlicci.add(new Mazlicek("The Perverse", Druh.kocka, 900000, 3));
        mazlicci.add(new Mazlicek("The Returned", Druh.kocka, 900000, 3));

        //mazlicci.forEach(mazlicek -> System.out.println(mazlicek));

        Menu.start(mazlicci);
    }
}