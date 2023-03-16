import java.util.ArrayList;

public class ElectricPokemon extends PokemonSuper {

    //*** Additional Variables ***//
    private String category;
    private String electricPokemonWeakness;


    //*** Parameterized Constructor ***//
    public ElectricPokemon(String name, String type, double weight, double height, double level, double hp, String category, String sound, String food, String electricPokemonWeakness) {
        super(name, type, weight, height, level, hp, sound, food);
        this.category = category;
        this.electricPokemonWeakness = electricPokemonWeakness;
    }


    //*** Getters and Setters ***//
    public String getCategory() {

        return this.category;
    }
    public void setCategory(String category) {

        this.category = category;
    }

    public String getElectricPokemonWeakness() {

        return this.electricPokemonWeakness;
    }
    public void setElectricPokemonWeakness(String electricPokemonWeakness) {

        this.electricPokemonWeakness = electricPokemonWeakness;
    }


    //*** Methods ***//
    public void electroBall() {
        System.out.println("Come on " + getName() + ", you can do it! Use Electro Ball!");
    }
    //Electro Ball | power: n/a, accuracy: 100%, PP count: 10 (max 16)

    public void voltTackle() {
        System.out.println("Volt Tackle!!!" + " Do it now " + getName()+ "!");
    }
    //Volt Tackle | power: 120, accuracy: 100%, PP count: 15 (max 24)
    //Volt Tackle deals damage and has a 10% chance of paralyzing the target, but the user receives 1⁄3 of the damage it inflicted in recoil. In other words, if the attack does 90 HP damage to the opponent, the user will lose 30 HP.

    public void printImagePikachu() {
        System.out.println("⠀⠀⠀⠀⠀⠀⣰⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⣰⠟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀\n" +
                "⠀⠀⠀⠀⢀⠁⠀⠇⠀⠀⠀⠀⠀⠀⠀⢀⠀⠤⠀⠒⣶⣶⠆⠀⠀⢀⠔⠁⢠⠀\n" +
                "⠀⠀⠀⠀⠘⢀⠼⠤⠀⠀⠀⠄⡠⠐⠈⠀⠀⠀⠀⡰⠟⠁⠀⢀⠔⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢜⡁⠀⠀⠀⣖⣦⠀⠀⠤⣤⠄⠐⠂⠁⠀⠀⢀⠔⠁⠀⠀⠀⠀⠀⡇\n" +
                "⠀⠀⠀⡸⠷⢁⡀⢀⡀⠈⢉⠤⢄⠀⠈⡀⠀⠀⠀⠀⣔⡁⠄⠄⠀⠀⢀⠠⠂⠁\n" +
                "⠀⠀⢠⢻⠀⠹⣿⠿⡇⠀⠡⠔⠜⠀⠀⢁⠀⠀⠀⠀⢡⠀⠀⢀⠄⠊⠁⠀⠀⠀\n" +
                "⠀⠀⠀⠫⡀⠀⠐⠤⠃⠀⠀⠀⠀⢀⠀⠀⢂⠀⠀⠀⠀⢃⠀⠸⠀⠀⠀⠀⠀⠀\n" +
                "⢀⠠⠐⠂⠉⠢⠀⡀⠀⠀⠀⠀⠖⠉⠉⠀⠀⢧⡀⠀⡠⠒⠀⡠⠀⠀⠀⠀⠀⠀\n" +
                "⢸⡘⠀⠀⠀⠀⢢⠈⠂⠀⠀⠀⠘⢤⣄⣤⠄⠀⠈⢊⠢⣠⣎⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠉⠀⠒⠒⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠗⣾⠿⠆⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡷⠄⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠘⡀⠀⠀⠀⣀⣀⠀⠀⢀⣀⡀⠤⢊⠆⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠐⠢⢤⣥⠒⠉⠉⠑⠂⠠⠤⡤⢺⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢛⠀⠀⠀⠀⠀⠀⠀⠐⢾⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
    }

    //*** Abstract Methods - From the PokemonSuper class ***//
    @Override
    public void speaks() {
        System.out.println(getName() + " let yourself be heard! >>> " + getSound());
    }
    @Override
    public void mainWeaknesses() {
        System.out.println("Electric Pokemon " + getName() + " weaknesses are: ground.");
    }

}
