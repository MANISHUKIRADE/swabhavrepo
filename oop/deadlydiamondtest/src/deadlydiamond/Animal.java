package deadlydiamond;

public interface Animal extends Pet {
	public default   void moving() {
		System.out.println("Moving from animal");
		
	}
	public abstract void eating();
	public default  void noise() {
		System.out.println("noise from animal");
	}

}
