public class Dog {

	private String name;
	private int age;
	private String kind;

	public Dog(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showName() {
		System.out.println("名前は、" + name + "です。");
		System.out.println("年齢は、" + age + "です。");
		System.out.println("犬種は、" + kind + "です。");
	}

}
