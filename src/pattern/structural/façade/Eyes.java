package pattern.structural.fa�ade;

public class Eyes implements RobotPartCreator{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Creating %s;",this.getClass().getSimpleName()));
	}

}
