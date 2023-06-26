package pattern.structural.façade;

public class FaçadeRobotCreator {

	public void createRobot() {
		Head head = new Head();
		Body body = new Body();
		Arms arms = new Arms();
		Legs legs = new Legs();
		Brain brain = new Brain();
		Eyes eye = new Eyes();
			
		head.create();
		body.create();
		arms.create();
		legs.create();
		brain.create();
		eye.create();
		
		System.out.println("Robot Created Successfully");
	}
	
}
