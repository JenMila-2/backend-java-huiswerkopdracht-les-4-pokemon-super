public class NormalPokemon extends PokemonSuper {

    //*** Additional Variables ***//
    private String category;
    private String normalPokemonWeakness;
    private String abilities;


    //*** Parameterized Constructor ***//
    public NormalPokemon(String name, String type, double weight, double height, double level, double hp, String category, String sound, String food, String normalPokemonWeakness, String abilities) {
        super(name, type, weight, height, level, hp, sound, food);
        this.category = category;
        this.normalPokemonWeakness = normalPokemonWeakness;
        this.abilities = abilities;
    }


    //*** Getters and Setters ***//
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNormalPokemonWeakness() {

        return this.normalPokemonWeakness;
    }

    public void setNormalPokemonWeakness(String normalPokemonWeakness) {

        this.normalPokemonWeakness = normalPokemonWeakness;
    }
    public String getAbilities() {

        return this.abilities;
    }
    public void setAbilities(String abilities) {

        this.abilities = abilities;
    }


    //*** Methods ***//
    public void meowthQuotes() {
        System.out.println("Funny Meowth Quotes:");
        System.out.println("\"I hate water, especially WET water.\"");
        System.out.println("\"I’m totally unprepared to deal with life’s realities.\"");
        System.out.println("\"I know we gotta grab some rare Pokémon for the Boss… but it wouldn’t be such a bad idea if we grabbed a little bite to eat.\"");
        System.out.println("\"You, humans, are a dangerous species. You brought me into your world with no purpose but to be your slave. But now I have my own purpose. My storm will create my own world, by destroying yours.\"");
    }


    //*** Abstract Methods - From the PokemonSuper class ***//
    @Override
    public void speaks() {
        System.out.println(getName() + " " + getSound());
    }

    @Override
    public void mainWeaknesses() {

    }
}
