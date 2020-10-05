package com.company;

public class Farmer extends Person{
    Barn barn;
    String konamn;

int mjölkkanna=0;

Farmer(String name,Barn barn) {
    super(name);
    this.barn = barn;
    mjölkaEnKo("Rut");
}

//public int
void mjölkaEnKo(String konamn) {
    Animal tempcow = barn.getAnimal(konamn);
    System.out.println(tempcow.getName());
    mjölkkanna+=((Cow)tempcow).mjölka();
    System.out.println(mjölkkanna);
   //return mjölkkanna;

}

}
