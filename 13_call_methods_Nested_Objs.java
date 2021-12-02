// create a Class named Dog
class Dog {
  String name;  // variable

  void bark() { // method
    System.out.println("Ruff!");
  }
}

// Tester Class (to make obj)
class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog(); // new object
    dog1.bark();
    dog1.name = "Bart"; // assign name to obj

    // make new Dog array called 'myDogs'
    Dog[] myDogs = new Dog[3]; 
    // add dogs to the array
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;

    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";

    // print myDog's 2nd element's name
    System.out.print("Last dog's name is ");
    System.out.println(myDogs[2].name);

    // loop through the array and tell all dogs to bark
    for(int i = 0; i < myDogs.length; i++) {
      myDogs[i].bark();
    }
  }
}
