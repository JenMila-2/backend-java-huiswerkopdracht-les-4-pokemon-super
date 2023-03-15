import java.util.ArrayList;

public class WaterPokemon extends PokemonSuper {

    //*** Additional Variables ***//
    private String category;
    private String waterPokemonWeakness;


    //*** Parameterized Constructor ***//
    public WaterPokemon(String name, String type, double weight, double height, double level, double hp, String category, String sound, String food, String waterPokemonWeakness) {
        super(name, type, weight, height, level, hp, sound, food);
        this.category = category;
        this.waterPokemonWeakness = waterPokemonWeakness;
    }


    //*** Getters and Setters ***//
    public String getCategory() {

        return this.category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public String getWaterPokemonWeakness() {

        return this.waterPokemonWeakness;
    }

    public void setWaterPokemonWeakness(String waterPokemonWeakness) {

        this.waterPokemonWeakness = waterPokemonWeakness;
    }


    //*** Methods ***//
    public void bouncyBubble() {
        System.out.println("Oke " + getName() + ", use Bouncy Bubble!");
    }
    //Bouncy Bubble| power: 90, accuracy: 100%, PP count: 15 (max 24)
    //Bouncy Bubble heals the user by 50% of the damage dealt to the opponent

    public void rainDance() {
        System.out.println("Rain Dance " + getName() + ", lets go!");
    }
    //Rain Dance | power: n/a, accuracy: 5%, PP count: 8
    //While the move doesn’t directly deal damage, it causes it to rain, it causes Water-type moves to deal 50% more damage while fire-type moves deal 50% less.


    //*** Abstract Methods - From the PokemonSuper class ***//
    @Override
    public void speaks() {
        System.out.println(getName() + " likes to say >>> " + getSound());
    }
    @Override
    public void mainWeaknesses() {
        System.out.println("Water Pokemon " + getName() + " weaknesses are: grass and electric.");
    }

}
