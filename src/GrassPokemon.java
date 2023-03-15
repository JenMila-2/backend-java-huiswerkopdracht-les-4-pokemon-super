import java.util.ArrayList;

public class GrassPokemon extends PokemonSuper {

    //*** Additional Variables ***//
    private String category;
    private String grassPokemonWeakness;


    //*** Parameterized Constructor ***//
    public GrassPokemon(String name, String type, double weight, double height, double level, double hp, String category, String sound, String food, String grassPokemonWeakness) {
        super(name, type, weight, height, level, hp, sound, food);
        this.category = category;
        this.grassPokemonWeakness = grassPokemonWeakness;
    }


    //*** Getters and Setters ***//
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGrassPokemonWeakness() {

        return this.grassPokemonWeakness;
    }

    public void setGrassPokemonWeakness(String grassPokemonWeakness) {

        this.grassPokemonWeakness = grassPokemonWeakness;
    }


    //*** Methods ***//
    public void leafStorm() {
        System.out.println(getName() + " dont give in. Use Leaf Storm!");
    }
    //Leaf Storm | power: 130, accuracy: 90%, PP count: 5 (max 8)
    //Leaf Storm deals damage but lowers the user's Special Attack by two stages after attacking.

    public void leechSeed() {
        System.out.println("You got this " + getName() + ". It's time to use your Leech Seed!");
    }
    //Leach Seed | power: n/a, accuracy: 90%, PP count: 10 (max 16)
    //Leech Seed plants a seed on the target that drains 1⁄8 of its maximum HP at the end of each turn and restores it to the user, or any Pokémon that takes its place. It does not work on Grass-type Pokémon;.


    //*** Abstract Methods - From the PokemonSuper class ***//
    @Override
    public void speaks() {
        System.out.println(getName() + " say your name! >>> " + getSound());
    }
    @Override
    public void mainWeaknesses() {
        System.out.println("Grass Pokemon " + getName() + " weaknesses are: fire, ice and flying.");
    }

}
