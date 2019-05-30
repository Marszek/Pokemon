import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ObslugaWyboru {
    public static void wybierzPokemona() {

        Starters starter = new Starters();

        List<Pokemon> lista = new ArrayList<>(); //Lista, w ktorej znajduja sie wszystkie startery
        lista.add(starter.bulbasaur);
        lista.add(starter.charmander);
        lista.add(starter.squirtle);

        Scanner s = new Scanner(System.in);
        String wybor = s.nextLine();
        wybor = wybor.toUpperCase();


        if (wybor.equals(Wybor.LOSUJ.toString())) {
            Random r = new Random();
            int a = r.nextInt(3);
            System.out.println("Gratulacje! Twój pierwszy Pokemon to " + lista.get(a).getName() + ". Jest to pokemon typu " + lista.get(a).getType());
        }
        else if (wybor.equals(Wybor.WYBIERZ.toString())) {

            System.out.println("Wpisz nazwe swojego pokemona: Charmander, Squirtle lub Bulbasaur");
            String pokemonName = s.nextLine();
            pokemonName = pokemonName.toUpperCase();

            if (pokemonName.equals(WyborPokemona.BULBASAUR.toString())) {
                System.out.println("Gratulacje! Twój pierwszy Pokemon to " + lista.get(0).getName() + ". Jest to pokemon typu " + lista.get(0).getType());

            } else if (pokemonName.equals(WyborPokemona.CHARMANDER.toString())) {
                System.out.println("Gratulacje! Twój pierwszy Pokemon to " + lista.get(1).getName() + ". Jest to pokemon typu " + lista.get(1).getType());

            } else if (pokemonName.equals(WyborPokemona.SQUIRTLE.toString())) {
                System.out.println("Gratulacje! Twój pierwszy Pokemon to " + lista.get(2).getName() + ". Jest to pokemon typu " + lista.get(2).getType());

            } else {
                System.out.println("Nie ma takiego Pokemona \nWybierz opcję: \nLosuj \nWybierz \nWyjście");
                wybierzPokemona(); //zmuszam użytkownika, aby wybrał koniecznie jakąś opcję

            }
        } else if (wybor.equals(Wybor.WYJSCIE.toString()) || wybor.equals(Wybor.WYJŚCIE.toString())) {
            System.out.println("Do zobaczenia :)");

        } else {
            System.out.println("Nie ma takiej opcji ");
            wybierzPokemona(); //zmuszam użytkownika, aby wybrał koniecznie jakąś opcję
        }

    }
}
