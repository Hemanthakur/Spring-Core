package mediator;

public class MediatorPatternDemo {
	   public static void main(String[] args) {
	      User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage("Hi! John!");
	      john.sendMessage("Hello! Robert!");
	      robert.sendMessage("How are you John?");
	      john.sendMessage("I am Fine.What about you?");
	      robert.sendMessage("I am good.");
	      
	   }
	}