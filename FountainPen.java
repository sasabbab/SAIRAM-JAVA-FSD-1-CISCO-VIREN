package cisco.java.programs;

class FountainPen extends Pen {
	void write() {
		System.out.println("This was overriden from pen() and implemented in child class");
	}
	void refill() {
		System.out.println("This was overriden fromrefill and Implemented in child class");
	}
	void ChangeNib() {
		System.out.println("This method implemented in chils class");
	}
}
