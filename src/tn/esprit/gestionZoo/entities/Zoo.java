package tn.esprit.gestionZoo.entities;

public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public final int NBR_CAGES = 25;
    public int animalCount = 0;

    public Zoo(){}
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        if (!name.isEmpty()){
            this.name = name;
        }
        else {
            this.name = "default zoo";
        }
        this.city = city;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionZoo.entities.Zoo { name: " + name + ", city: " + city + ", nbrCages: " + NBR_CAGES + " }";
    }
    public void displayZoo(){
        System.out.println("tn.esprit.gestionZoo.entities.Zoo name is "+ this.name + " and tn.esprit.gestionZoo.entities.Zoo's city is " + this.city +  " and number of cages is " + this.NBR_CAGES);
    }

    public boolean addAnimal(Animal a) {
        if (searchAnimal(a) != -1) {
            System.out.println("Animal exists");
            return false;
        }
        if (!isZooFull()) {
            animals[animalCount] = a;
            animalCount++;
            return true;
        } else {
            System.out.println("Zoo is full");
            return false;
        }
    }

    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null;
        return true;
    }

    public boolean isZooFull() {
        return this.animalCount == NBR_CAGES;
    }

    public Zoo comparerZoo(Zoo this, Zoo z2) {
        if (this.animalCount > z2.animalCount)
            return this;
        else if (this.animalCount < z2.animalCount)
            return  z2;
        else
            return new Zoo();
    }
}
