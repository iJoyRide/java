package codeAcademy;

public class expPolymorphism {
    public static void main(String[] args) {
        Animals myAnimal = new Animals();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.eat();

        Cat myCat = new Cat();
        myCat.eat();
        myCat.eat(5);
    }
}

class Animals {
    //Parent class
    public void eat() {
        System.out.println("Munch");
    }
}

class Dog extends Animals{
    //Child class
    //Polymorphism
    public void eat() {
        System.out.println("Chomp Chomp");
    }
}

class Cat extends Animals {
    //Child class
    //Polymorphism
    public void eat() {
        System.out.println("Nom Nom");
    }
    public void eat(int numberOfTimes) {

        //Method overloading
        for(int i = 0; i < numberOfTimes; i++ ){
            System.out.println("YUM YUM!");
        }
    }
}
