package com.company;

import java.util.ArrayList;

public class Barn {
    String barnName;
    ArrayList<Animal> animals=new ArrayList<>();

    Barn(String barnName)
    {
      this.barnName=barnName;

        Animal pig=new Animal("Mimmy");
        Cow kossa1=new Cow("Rut");
        Cow kossa2=new Cow("Rut2");
        Cow kossa3=new Cow("Rut3");
        Cow kossa4=new Cow("Rut4");

        //animals.add(kossa1);
        animals.add(kossa2);
        animals.add(kossa3);
        animals.add(kossa4);

        addAnimal(kossa1);



    }

    public void addAnimal(Animal animal)
    {
        this.animals.add(animal);
    }


    public Animal getAnimal(String animalName)
    {
        for (Animal animal2:animals)

            if(animal2.getName().equals(animalName))
            {
               return animal2;

            }
        return null;
    }


}
