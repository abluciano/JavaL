package pack;

public abstract class Pet {

	int age;
	int older;
	
	
	
	public Pet(int age) {
	//	super();
		this.age = age;
	}

	public abstract void voice();

	
	public void setOlder(int older) {
		this.older = older;
	}
	
	public abstract void beOlder();
	
	public abstract void Eat(Human A);
	
}
