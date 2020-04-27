public class Main {
	public static void main(String[] args) {
        Animal[] myPets = new Animal[4];

        myPets[0] = new Dog();
        myPets[1] = new Cat();
        myPets[2] = new Dog();
        myPets[3] = new Cat();

        for( Animal pet : myPets )
            pet.speak();
	}

}