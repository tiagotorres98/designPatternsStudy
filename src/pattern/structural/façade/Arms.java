package pattern.structural.façade;

public class Arms implements RobotPartCreator{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Creating %s;",this.getClass().getSimpleName()));
	}

}
