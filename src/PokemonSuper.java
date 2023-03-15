public abstract class PokemonSuper {

    //*** Main Variables ***//
    private String name;
    private String type;
    private double weight;
    private double height;
    private double level;
    private double hp;
    private String sound;
    private String food;


    //*** No-Arg Constructor ***//
    public PokemonSuper() {

    }

    //*** Parameterized Constructor ***//
    public PokemonSuper(String name, String type, double weight, double height, double level, double hp, String sound, String food) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.level = level;
        this.hp = hp;
        this.sound = sound;
        this.food = food;
    }

    //*** Abstract Methods ***//
    //These methods are abstract because they do not have a body, the body is replaced by ;
    public abstract void speaks();
    public abstract void mainWeaknesses();


    //*** Regular Methods ***//
    public void eats()  {
        System.out.println(name + " likes to eat " + food);
    }
    public void battleOpeningPhrase1() {
        System.out.println(name + "! It's showtime!");
    }
    public void battleOpeningPhrase2() {
        System.out.println(name + "! I choose you!");
    }
    public  void battleOpeningPhrase3() {
        System.out.println(name + ", stand by for battle!");
    }
    public void battleOpeningPhrase4() {
        System.out.println(name + "! Come out and play!");
    }
    void attack() {
        System.out.println(name + " attack!");
    }

    //*** Getters and Setters ***//
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getLevel() {
        return this.level;
    }
    public void setLevel(double level) {
        this.level = level;
    }

    public double getHp() {
        return this.hp;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getSound() {
        return this.sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return this.food;
    }
    public void setFood(String food) {
        this.food = food;
    }


}

//NOTES
//PokemonSuper is an abstract class and cannot be instantiated, but we can create subclasses from it.
//We cannot create objects of an abstract class.
//All the abstract methods in the (PokemonSuper) abstract class need to be implemented in the subclasses (inheritance).
//A subclass must override all abstract methods of an abstract class.
//If a subclass doesn't provide the implementation (override) of the abstract method, then the subclass should also be declared as abstract.
//Why do we use abstract classes? To achieve abstraction (hide unnecessary details and only show the needed information).