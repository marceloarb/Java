
public interface Ringable {
	public default String ring() {
		return "BBZZZZZZ!";
	}
	public default String unlock() {
		return "Phone unlocked!";
	}
}
