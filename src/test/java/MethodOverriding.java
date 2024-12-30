 class Animal{
	void makeSound() {
		System.out.println("Animal sound");
	}
}
 class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Dog sound");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an=new Animal();
		an.makeSound();
		
		Dog dg=new Dog();
		dg.makeSound();
		
		Animal aniDog=new Dog();
		aniDog.makeSound();
	}

}
