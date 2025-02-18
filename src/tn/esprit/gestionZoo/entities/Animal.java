package tn.esprit.gestionZoo.entities;

public class Animal {
    public String family;
    public String name;
    public int age;
    public boolean isMammal;

    public Animal(){}
    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        if(age > 0) {

            this.age = age;
        }
        else {
            System.out.println("age under 0, is it in conception ?");
        }
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionZoo.entities.Animal { family: " + family + ", name: " + name + ", age: " + age + ", isMammal: " + isMammal + " }";
    }
}
