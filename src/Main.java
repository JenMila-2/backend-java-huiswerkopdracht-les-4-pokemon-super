public class Main {
    public static void main(String[] args) {

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


        //Outputs the favorite food of a specific Pokemon//
        victini.eats();
        cherubi.eats();

        //Blank line to keep overview ;-)//
        System.out.println("\n");

        //Outputs Attack Method//
        totodile.attack();
        jolteon.attack();

        //Blank line to keep overview ;-)//
        System.out.println("\n");

        //Outputs the 'sound' of a specific Pokemon//
        pikachu.speaks();
        charmander.speaks();
        piplup.speaks();
        sprigatito.speaks();

        //Blank line to keep overview ;-)//
        System.out.println("\n");

        //Outputs opening phrases for battles//
        oshawott.battleOpeningPhrase1();
        dedenne.battleOpeningPhrase2();
        shaymin.battleOpeningPhrase3();
        vulpix.battleOpeningPhrase4();

        //Blank line to keep overview ;-)//
        System.out.println("\n");

        //Outputs a Pokemon main weaknesses//
        celebi.mainWeaknesses();
        pachirisu.mainWeaknesses();
        slowking.mainWeaknesses();
        scorbunny.mainWeaknesses();

        //Blank line to keep overview ;-)//
        System.out.println("\n");

        //Outputs specific attacks related to type of Pokemon
        growlithe.searingShot();
        shinx.voltTackle();
        squirtle.bouncyBubble();
        bulbasaur.leechSeed();

        //Blank line to keep overview ;-)//
        System.out.println("\n");

        //Outputs funny Meowth quotes//
        meowth.meowthQuotes();

        System.out.println("\n");

        pikachu.printImagePikachu();

        System.out.println("\n");

        charmander.printImageCharmander();

        System.out.println("\n");

        bulbasaur.printImageBulbasaur();

        System.out.println("\n");

        squirtle.printImageSquirtle();

        System.out.println("\n");


        //*** Additional Methods from the PokemonGym class ***//
        //Outputs a list of weaknesses per Ppkemon type//
    /*PokemonGym electricPokemonWeaknesses = new PokemonGym();
    electricPokemonWeaknesses.electricPokemonWeaknessList();*/

    /*PokemonGym firePokemonWeaknesses = new PokemonGym();
    firePokemonWeaknesses.firePokemonWeaknessList();

    PokemonGym waterPokemonWeaknesses = new PokemonGym();
    waterPokemonWeaknesses.waterPokemonWeaknessList();

    PokemonGym grassPokemonWeaknesses = new PokemonGym();
    grassPokemonWeaknesses.grassPokemonWeaknessList();*/

        //Outputs a complete list of all Pokemon in this program (20 Pokemons)//
    /*PokemonGym pokemonIndex = new PokemonGym();
    pokemonIndex.printPokemonIndex();*/

        //Outputs a list of skills per Pokemon//
    /*PokemonGym skillList = new PokemonGym();
    skillList.skillList();*/



    }
}




