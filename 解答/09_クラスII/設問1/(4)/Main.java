
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("ぽち", 5);
		Cat cat = new Cat("たま", 3);

		dog.showProfile();
		cat.showProfile();

		dog.run();
		cat.sleep();
	}

}
