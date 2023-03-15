import java.util.ArrayList;

public class FirePokemon extends PokemonSuper {

    //*** Additional Variables ***//
    private String category;
    private String firePokemonWeakness;


    //*** Parameterized Constructor ***//
    public FirePokemon(String name, String type, double weight, double height, double level, double hp, String category, String sound, String food, String firePokemonWeakness) {
        super(name, type, weight, height, level, hp, sound, food);
        this.category = category;
        this.firePokemonWeakness = firePokemonWeakness;
    }


    //*** Getters and Setters ***//
    public String getCategory() {

        return this.category;
    }
    public void setCategory(String category) {

        this.category = category;
    }

    public String getFirePokemonWeakness() {

        return this.firePokemonWeakness;
    }
    public void setFirePokemonWeakness(String firePokemonWeakness) {

        this.firePokemonWeakness = firePokemonWeakness;
    }


    //*** Methods ***//
    public void searingShot() {
        System.out.println(getName() + " use your Searing Shot!");
    }
    //Searing Shot | power: 100, accuracy: 100%, PP count: 5
    //Searing Shot is a special attack
    //Searing Shot has a chance of burning the opponent

    public void fireLash() {
        System.out.println("Use your Fire Lash " + getName() + "!");
    }
    //Fire Lash | power: 80, accuracy: 100%, PP count: 15
    //Fire Lash is a physical attack
    //Fire Lash lowers the opponent's Defense


    //*** Abstract Methods - From the PokemonSuper class ***//
    @Override
    public void speaks() {
        System.out.println(getName() + " says >>> " + getSound());
    }
    @Override
    public void mainWeaknesses() {
        System.out.println("Fire Pokemon " + getName() + " weaknesses are: water, ground and rock.");
    }


}
