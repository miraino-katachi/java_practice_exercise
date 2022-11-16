
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("ぽち", 5);
		Cat cat = new Cat("たま", 3);

		dog.showProfile();
		cat.showProfile();

		dog.run();
		cat.sleep();

		dog.speak();
		cat.speak();

		System.out.println();

		Animal[] animals = new Animal[4];

		animals[0] = new Dog("シロ", 7);
		animals[1] = new Cat("みけ", 6);
		animals[2] = new Dog("たろう", 2);
		animals[3] = new Cat("ジジ", 13);

		for (Animal animal : animals) {
			animal.speak();
		}
	}

}
