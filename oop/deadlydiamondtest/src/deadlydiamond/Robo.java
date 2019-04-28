package deadlydiamond;

public interface Robo extends Pet {
	public default void moving() {
		System.out.println("Moving from Robo");
	}
	public abstract void charging();
	public default  void noise() {
		System.out.println("noise from Robo");
	}
	
	
}