> [!NOTE]
> The notes are taken from the official Java documentation provided by oracle.

# Basic concepts

## What is an Object? 

- Objects are something which has a *state* and *behaviour*.
- Example: A Dog, state(name, color, breed) and behaviour(barking, fetching, wagging tail).
- Objects stores its state in *fields* (also known as *variables* ) and its behaviours in *methods*.  
- an objects *methods* allows object-to-object communication without revealing their internal state, this is called *data encapsulation*  

## What is a Class? 
- Blueprint from which individual objects are created.
- Further expanding the first point: Let's take a real world object as our example.
- In this world there are multiple bicycles that may be of the same make and model. Each of these bicycles was built from the same blueprint.
- In object oriented terms we can say that our bicycle object is an *instance* of the class of objects know as bicycles. 

Example: 
```java 
class Bicycle{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed = speed + increment;
    }

    void applyBrake(int decrement){
        speed = speed - decrement;
    }

    void printStates(){
        System.out.println(" cadence: " + cadence + " speed: " + speed + " gear: " + gear);
    }
}
```
You might have noticed that this class does not have a `main` method, that is because this class will just be used as a blueprint to make more objects.
Below is a demo that creates two bicycle objects using the above class and uses it's methods.

```java 
class BicycleDemo{
    public static void main(String[] args){
        // Create two different objects.
        Bicycle bike1 = new Bicycle()
        Bicycle bike2 = new Bicycle()

        // Invoke methods on these instantiated objects. 
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.applyBrake(10);
        bike2.printStates();
    }
}
```

## What is Inheritance? 

- In Java, each class is allowed to have one *superclass*. This is the class that can then be used to create more classes which will inherit the state and methods of its superclass. This concept is also called *inheritance*.  
- Inheritance is useful since different kinds of objects will still have some states and behaviours that are common between them.
- For Example: there are many types of bicycles: dirt bike, road bike etc, but all of them will have speed, brakes, cadence etc.
- The syntax for creating a subclass is simple: 
```java 
class MountainBike extends Bicycle{
    //new fields and methods.
}
```

## What is an Interface? 

As you've already learned, objects define their interaction with the outside world through the methods that they expose.
Methods form the object's interface with the outside world; the buttons on the front of your television set,for example, are the 
interface between you and the electrical wiring on the other side of its plastic casing.
You press the "power" button to turn the television on and off.

Implementing an interface allows a class to become more formal about the behavior it promises to provide.
Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler.
If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.

In short it's just a collection of methods with no implementation. It's implementation is done via a class using the implements keyword.

