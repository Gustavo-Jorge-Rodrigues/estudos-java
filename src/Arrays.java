public class Arrays {
    static void main(String[] args) {

        // Sistema simples usando Arrays e for



        String[] pokemon = {
                "Bulbasaur",
                "Charmander",
                "Squirtle",
                "Pikachu",
                "Eevee",
                "Snorlax",
                "Lucario",
                "Gengar",
                "Mew",
                "Rayquaza"
        };
        System.out.println("POKEDEX");
        System.out.println("");
        for (int i = 0; i < pokemon.length; i++) {
            System.out.println(pokemon[i]);
        }
    }
}