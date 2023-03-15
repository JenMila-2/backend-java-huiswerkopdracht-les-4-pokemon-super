import java.util.ArrayList;

public class PokemonGym extends PokemonSuper{

    ArrayList<PokemonSuper> pokemonIndex = new ArrayList<>();

    //Work in progress
    //PokemonGym is een extra class bedoeld om te oefenen met het creeren van lijsten. Er zijn waarschijnlijk betere alternatieven maar ik ben die nog aan het onderzoeken.//

    //*** Pokemon Skill Level *** //
    public void skillList() {
        System.out.println("*** List of Skill Levels per Pokemon ***" + "\n");
        System.out.println("Fire Pokemons" + "\n");
        System.out.println("Name: " + charmander.getName() + "\n" + "Level: " + charmander.getLevel() + "\n" + "HP: " + charmander.getHp() + "\n");
        System.out.println("Name: " + vulpix.getName() + "\n" + "Level: " + vulpix.getLevel() + "\n" + "HP: " + vulpix.getHp() + "\n");
        System.out.println("Name: " + growlithe.getName() + "\n" + "Level: " + growlithe.getLevel() + "\n" + "HP: " + growlithe.getHp() + "\n");
        System.out.println("Name: " + victini.getName() + "\n" + "Level: " + victini.getLevel() + "\n" + "HP: " + victini.getHp() + "\n");
        System.out.println("Water Pokemons" + "\n");
        System.out.println("Name: " + squirtle.getName() + "\n" + "Level: " + squirtle.getLevel() + "\n" + "HP: " + squirtle.getHp() + "\n");
        System.out.println("Name: " + totodile.getName() + "\n" + "Level: " + totodile.getLevel() + "\n" + "HP: " + totodile.getHp() + "\n");
        System.out.println("Name: " + slowking.getName() + "\n" + "Level: " + slowking.getLevel() + "\n" + "HP: " + slowking.getHp() + "\n");
        System.out.println("Name: " + piplup.getName() + "\n" + "Level: " + piplup.getLevel() + "\n" + "HP: " + piplup.getHp() + "\n");
        System.out.println("Name: " + oshawott.getName() + "\n" + "Level: " + oshawott.getLevel() + "\n" + "HP: " + oshawott.getHp() + "\n");
        System.out.println("Grass Pokemons" + "\n");
        System.out.println("Name: " + bulbasaur.getName() + "\n" + "Level: " + bulbasaur.getLevel() + "\n" + "HP: " + bulbasaur.getHp() + "\n");
        System.out.println("Name: " + celebi.getName() + "\n" + "Level: " + celebi.getLevel() + "\n" + "HP: " + celebi.getHp() + "\n");
        System.out.println("Name: " + cherubi.getName() + "\n" + "Level: " + cherubi.getLevel() + "\n" + "HP: " + cherubi.getHp() + "\n");
        System.out.println("Name: " + shaymin.getName() + "\n" + "Level: " + shaymin.getLevel() + "\n" + "HP: " + shaymin.getHp() + "\n");
        System.out.println("Name: " + sprigatito.getName() + "\n" + "Level: " + sprigatito.getLevel() + "\n" + "HP: " + sprigatito.getHp() + "\n");
        System.out.println("Electric Pokemons" + "\n");
        System.out.println("Name: " + pikachu.getName() + "\n" + "Level: " + pikachu.getLevel() + "\n" + "HP: " + pikachu.getHp() + "\n");
        System.out.println("Name: " + shinx.getName() + "\n" + "Level: " + shinx.getLevel() + "\n" + "HP: " + shinx.getHp() + "\n");
        System.out.println("Name: " + pachirisu.getName() + "\n" + "Level: " + pachirisu.getLevel() + "\n" + "HP: " + pachirisu.getHp() + "\n");
        System.out.println("Name: " + dedenne.getName() + "\n" + "Level: " + dedenne.getLevel() + "\n" + "HP: " + dedenne.getHp() + "\n");
        System.out.println("Name: " + jolteon.getName() + "\n" + "Level: " + jolteon.getLevel() + "\n" + "HP: " + jolteon.getHp() + "\n");
        System.out.println("Normal Pokemons" + "\n");
        System.out.println("Name: " + meowth.getName() + "\n" + "Level: " + meowth.getLevel() + "\n" + "HP: " + meowth.getHp() + "\n");
    }

    //*** Fire Pokemon Weaknesses ***//
    public void firePokemonWeaknessList() {
        System.out.println("*** Fire Pokemon Weaknesses ***" + "\n");
        System.out.println("Name: " + charmander.getName() + "\n" + "Weaknesses: " + charmander.getFirePokemonWeakness() + "\n");
        System.out.println("Name: " + vulpix.getName() + "\n" + "Weaknesses: " + vulpix.getFirePokemonWeakness() + "\n");
        System.out.println("Name: " + growlithe.getName() + "\n" + "Weaknesses: " + growlithe.getFirePokemonWeakness() + "\n");
        System.out.println("Name: " + victini.getName() + "\n" + "Weaknesses: " + victini.getFirePokemonWeakness() + "\n");
        System.out.println("Name: " + scorbunny.getName() + "\n" + "Weaknesses: " + scorbunny.getFirePokemonWeakness() + "\n");
    }

    //*** Water Pokemon Weaknesses ***//
    public void waterPokemonWeaknessList() {
        System.out.println("*** Water Pokemon Weaknesses ***" + "\n");
        System.out.println("Name: " + squirtle.getName() + "\n" + "Weaknesses: " + squirtle.getWaterPokemonWeakness() + "\n");
        System.out.println("Name: " + totodile.getName() + "\n" + "Weaknesses: " + totodile.getWaterPokemonWeakness() + "\n");
        System.out.println("Name: " + slowking.getName() + "\n" + "Weaknesses: " + slowking.getWaterPokemonWeakness() + "\n");
        System.out.println("Name: " + piplup.getName() + "\n" + "Weaknesses: " + piplup.getWaterPokemonWeakness() + "\n");
        System.out.println("Name: " + oshawott.getName() + "\n" + "Weaknesses: " + oshawott.getWaterPokemonWeakness() + "\n");
    }

    //*** Grass Pokemon Weaknesses ***//
    public void grassPokemonWeaknessList() {
        System.out.println("*** Grass Pokemon Weaknesses ***" + "\n");
        System.out.println("Name: " + bulbasaur.getName() + "\n" + "Weaknesses: " + bulbasaur.getGrassPokemonWeakness() + "\n");
        System.out.println("Name: " + celebi.getName() + "\n" + "Weaknesses: " + celebi.getGrassPokemonWeakness() + "\n");
        System.out.println("Name: " + cherubi.getName() + "\n" + "Weaknesses: " + cherubi.getGrassPokemonWeakness() + "\n");
        System.out.println("Name: " + shaymin.getName() + "\n" + "Weaknesses: " + shaymin.getGrassPokemonWeakness() + "\n");
        System.out.println("Name: " + sprigatito.getName() + "\n" + "Weaknesses: " + sprigatito.getGrassPokemonWeakness() + "\n");
    }

    //*** Electric Pokemon Weaknesses ***//
    public void electricPokemonWeaknessList() {
        System.out.println("*** Electric Pokemon Weaknesses ***" + "\n");
        System.out.println("Name: " + pikachu.getName() + "\n" + "Weaknesses: " + pikachu.getElectricPokemonWeakness() + "\n");
        System.out.println("Name: " + shinx.getName() + "\n" + "Weaknesses: " + shinx.getElectricPokemonWeakness() + "\n");
        System.out.println("Name: " + pachirisu.getName() + "\n" + "Weaknesses: " + pachirisu.getElectricPokemonWeakness() + "\n");
        System.out.println("Name: " + dedenne.getName() + "\n" + "Weaknesses: " + dedenne.getElectricPokemonWeakness() + "\n");
        System.out.println("Name: " + jolteon.getName() + "\n" + "Weaknesses: " + jolteon.getElectricPokemonWeakness() + "\n");
    }

    //*** Pokemon Index - A complete list of all the Pokemons in this project ***//
    public void printPokemonIndex() {
        System.out.println("\n" + "*** Pokemon Index ***" + "\n");

        System.out.println("Name: " + charmander.getName() + "\n" + "Type: " + charmander.getType() + "\n" + "Category: " + charmander.getCategory() + "\n" + "Weight: " + charmander.getWeight() + "\n" + "Height: " + charmander.getHeight() + "\n");

        System.out.println("Name: " + vulpix.getName() + "\n" + "Type: " + vulpix.getType() + "\n" + "Category: " + vulpix.getCategory() + "\n" + "Weight: " + vulpix.getWeight() + "\n" + "Height: " + vulpix.getHeight() + "\n");

        System.out.println("Name: " + growlithe.getName() + "\n" + "Type: " + growlithe.getType() + "\n" + "Category: " + growlithe.getCategory() + "\n" + "Weight: " + growlithe.getWeight() + "\n" + "Height: " + growlithe.getHeight() + "\n");

        System.out.println("Name: " + victini.getName() + "\n" + "Type: " + victini.getType() + "\n" + "Category: " + victini.getCategory() + "\n" + "Weight: " + victini.getWeight() + "\n" + "Height: " + victini.getHeight() + "\n");

        System.out.println("Name: " + scorbunny.getName() + "\n" + "Type: " + scorbunny.getType() + "\n" + "Category: " + scorbunny.getCategory() + "\n" + "Weight: " + scorbunny.getWeight() + "\n" + "Height: " + scorbunny.getHeight() + "\n");

        System.out.println("Name: " + squirtle.getName() + "\n" + "Type: " + squirtle.getType() + "\n" + "Category: " + squirtle.getCategory() + "\n" + "Weight: " + squirtle.getWeight() + "\n" + "Height: " + squirtle.getHeight() + "\n");

        System.out.println("Name: " + totodile.getName() + "\n" + "Type: " + totodile.getType() + "\n" + "Category: " + totodile.getCategory() + "\n" + "Weight: " + totodile.getWeight() + "\n" + "Height: " + totodile.getHeight() + "\n");

        System.out.println("Name: " + slowking.getName() + "\n" + "Type: " + slowking.getType() + "\n" + "Category: " + slowking.getCategory() + "\n" + "Weight: " + slowking.getWeight() + "\n" + "Height: " + slowking.getHeight() + "\n");

        System.out.println("Name: " + piplup.getName() + "\n" + "Type: " + piplup.getType() + "\n" + "Category: " + piplup.getCategory() + "\n" + "Weight: " + piplup.getWeight() + "\n" + "Height: " + piplup.getHeight() + "\n");

        System.out.println("Name: " + oshawott.getName() + "\n" + "Type: " + oshawott.getType() + "\n" + "Category: " + oshawott.getCategory() + "\n" + "Weight: " + oshawott.getWeight() + "\n" + "Height: " + oshawott.getHeight() + "\n");

        System.out.println("Name: " + bulbasaur.getName() + "\n" + "Type: " + bulbasaur.getType() + "\n" + "Category: " + bulbasaur.getCategory() + "\n" + "Weight: " + bulbasaur.getWeight() + "\n" + "Height: " + bulbasaur.getHeight() + "\n");

        System.out.println("Name: " + celebi.getName() + "\n" + "Type: " + celebi.getType() + "\n" + "Category: " + celebi.getCategory() + "\n" + "Weight: " + celebi.getWeight() + "\n" + "Height: " + celebi.getHeight() + "\n");

        System.out.println("Name: " + cherubi.getName() + "\n" + "Type: " + cherubi.getType() + "\n" + "Category: " + cherubi.getCategory() + "\n" + "Weight: " + cherubi.getWeight() + "\n" + "Height: " + cherubi.getHeight() + "\n");

        System.out.println("Name: " + shaymin.getName() + "\n" + "Type: " + shaymin.getType() + "\n" + "Category: " + shaymin.getCategory() + "\n" + "Weight: " + shaymin.getWeight() + "\n" + "Height: " + shaymin.getHeight() + "\n");

        System.out.println("Name: " + sprigatito.getName() + "\n" + "Type: " + sprigatito.getType() + "\n" + "Category: " + sprigatito.getCategory() + "\n" + "Weight: " + sprigatito.getWeight() + "\n" + "Height: " + sprigatito.getHeight() + "\n");

        System.out.println("Name: " + pikachu.getName() + "\n" + "Type: " + pikachu.getType() + "\n" + "Category: " + pikachu.getCategory() + "\n" + "Weight: " + pikachu.getWeight() + "\n" + "Height: " + pikachu.getHeight() + "\n");

        System.out.println("Name: " + shinx.getName() + "\n" + "Type: " + shinx.getType() + "\n" + "Category: " + shinx.getCategory() + "\n" + "Weight: " + shinx.getWeight() + "\n" + "Height: " + shinx.getHeight() + "\n");

        System.out.println("Name: " + pachirisu.getName() + "\n" + "Type: " + pachirisu.getType() + "\n" + "Category: " + pachirisu.getCategory() + "\n" + "Weight: " + pachirisu.getWeight() + "\n" + "Height: " + pachirisu.getHeight() + "\n");

        System.out.println("Name: " + dedenne.getName() + "\n" + "Type: " + dedenne.getType() + "\n" + "Category: " + dedenne.getCategory() + "\n" + "Weight: " + dedenne.getWeight() + "\n" + "Height: " + dedenne.getHeight() + "\n");

        System.out.println("Name: " + jolteon.getName() + "\n" + "Type: " + jolteon.getType() + "\n" + "Category: " + jolteon.getCategory() + "\n" + "Weight: " + jolteon.getWeight() + "\n" + "Height: " + jolteon.getHeight() + "\n");

        System.out.println("Name: " + meowth.getName() + "\n" + "Type: " + meowth.getType() + "\n" + "Category: " + meowth.getCategory() + "\n" + "Weight: " + meowth.getWeight() + "\n" + "Height: " + meowth.getHeight() + "\n");

    }

    //*** Objects (Pokemons) created in the Main class ***//
    //*Fire Pokemons*//
    FirePokemon charmander = new FirePokemon("Charmander", "Fire", 8.5, 0.6, 1, 13, "Lizard", "Char!", "fruit", "water, ground, rock");
    FirePokemon vulpix = new FirePokemon("Vulpix", "Fire", 9.9, 0.6, 1, 12, "Fox", "Vulpix!", "berries", "water, ground, rock");
    FirePokemon growlithe = new FirePokemon("Growlithe", "Fire", 19, 0.7, 1, 15, "Puppy", "Growlithe!", "meat", "water, ground, rock");
    FirePokemon victini = new FirePokemon("Victini", "Fire", 4.0, 0.4, 1, 23, "Victory", "Victini!", "macarons", "water, ground, rock, ghost, dark");
    FirePokemon scorbunny = new FirePokemon("Scorbunny", "Fire", 4.5, 0.3, 1, 14, "Rabbit", "Scorbunny!", "plants", "water, ground, rock");

    //*Water Pekomons*//
    WaterPokemon squirtle = new WaterPokemon("Squirtle", "Water", 9, 0.5, 1, 13, "Tiny Turtle", "Squirtle squirt!!!", "berries", "grass, electric");
    WaterPokemon totodile = new WaterPokemon("Totodile", "Water", 9.5, 0.6, 1, 14, "Big Jaw", "Totodile!", "fish", "grass, electric");
    WaterPokemon slowking = new WaterPokemon("Slowking", "Water", 79.5, 2, 1, 22, "Royal", "Slowking!", "seaweed and drinking coconut milk", "grass, electric, ghost, dark, bug");
    WaterPokemon piplup = new WaterPokemon("Piplup", "Water", 5.2, 0.4, 1, 15, "Penguin", "Piplup!", "hearty grains", "grass, electric");
    WaterPokemon oshawott = new WaterPokemon("Oshawott", "Water", 5.9, 0.5, 1, 15, "Sea Otter", "Oshawott!", "berries and small fish", "grass, electric");

    //*Grass Pokemons*//
    GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", "Grass", 6.9, 0.7, 1, 13, "Seed", "Bul, ba, saur!", "photosynthesized sugars and starches", "fire, ice, flying, psychic");
    GrassPokemon celebi = new GrassPokemon("Celebi", "Grass", 5, 0.6, 1, 23, "Time Travel", "Celebi!", "berries", "fire, ice, flying, ghost, dark, poison, bug");
    GrassPokemon cherubi = new GrassPokemon("Cherubi", "Grass", 3.3, 0.4, 1, 13, "Cherry", "Cherubi!", "sweet things like honey", "fire, ice, flying, poison, bug");
    GrassPokemon shaymin = new GrassPokemon("Shaymin", "Grass", 2.1, 0.2, 1, 23, "Gratitude", "Shaymin!", "sweet food", "fire, ice, flying, poison, bug");
    GrassPokemon sprigatito = new GrassPokemon("Sprigatito", "Grass", 4.1, 0.4, 1, 13, "Grass Cat", "Sprigatito!", "spicy food", "fire, ice, flying, poison, bug");

    //*Electric Pokemons*//
    ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "Electric", 6, 0.4, 1, 12, "Mouse", "Pika Pika!", "apples and ketchup", "ground");
    ElectricPokemon shinx = new ElectricPokemon("Shinx", "Electric", 9.5, 0.5, 1, 13, "Flash", "Shinx!", "meat", "ground");
    ElectricPokemon pachirisu = new ElectricPokemon("Pachirisu", "Electric", 3.9, 0.4, 1, 16, "EleSquirrel", "Pachirisu!", "berries", "ground");
    ElectricPokemon dedenne = new ElectricPokemon("Dedenne", "Electric", 2.2, 0.2, 1, 17, "Antenna", "Dedenne!", "berries", "ground, poison");
    ElectricPokemon jolteon = new ElectricPokemon("Jolteon", "Electric", 24.5, 0.8, 1, 17, "Lightning", "Jolteon!", "vegetables, fruit and meat", "ground");

    //*Normal Pokemon*//
    NormalPokemon meowth = new NormalPokemon("Meowth", "Normal", 4.2, 0.4, 1, 13, "Scratch Cat", "speaks human language", "cholocate", "figthing", "Pickup and Technician");


    //*** Abstract Methods (not used in this class) ***//
    @Override
    public void speaks() {
    }

    @Override
    public void mainWeaknesses() {
    }
}
