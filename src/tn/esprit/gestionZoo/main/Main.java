package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal();
        Zoo myZoo = new Zoo();

        lion.name = "simba";
        lion.family = "king";
        lion.age = 10;
        lion.isMammal = true;
        myZoo.animals = new Animal[myZoo.NBR_CAGES];
        myZoo.animals[0] = lion;
        myZoo.name = "myZoo";
        myZoo.city = "Ariana";



        Animal giraffe = new Animal("forest", "timon", 12, true);
        Zoo bel = new Zoo("bel", "tunis", 25);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(giraffe);
        System.out.println(giraffe.toString());


        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(giraffe);
        myZoo.searchAnimal(giraffe);
        System.out.println("Search Giraffe: " + myZoo.searchAnimal(giraffe));

        System.out.println("Removing Giraffe: " + myZoo.removeAnimal(giraffe));
        myZoo.addAnimal(giraffe);
        myZoo.displayAnimals();


        System.out.println(bel.isZooFull());
        System.out.println(myZoo.isZooFull());

        System.out.println(myZoo.comparerZoo(bel));

        Aquatic aqua1 = new Aquatic("aqua", "aqua1", 20, true,"North Sea");
        Terrestrial terr1 = new Terrestrial("terrestrial", "terr1", 20, true,5);

        Dolphin dol1 = new Dolphin("aqua", "dol1", 20, true,"North Sea", 520);
        Penguin penguin1 = new Penguin("aqua", "PENGUIN1", 20, true,"North Sea", 530);

        System.out.println(aqua1.toString());
        System.out.println(dol1.toString());
        System.out.println(penguin1.toString());

        aqua1.swim();
        dol1.swim();
        penguin1.swim();
    }
}