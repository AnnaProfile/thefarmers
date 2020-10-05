package com.company;

public class Cow extends Animal {

    int milkAmount=10;
    int totalMilk =30;


Cow(String name){
    super(name);
    this.name=name;
}

public int mjölka()
{
   totalMilk=totalMilk-milkAmount;
   return milkAmount;
}



}
