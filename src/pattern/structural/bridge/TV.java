package pattern.structural.bridge;

public class TV implements IDevice {

	private String name = "TV";
	private Integer volume = 20;
	private Boolean power = Boolean.FALSE;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	@Override
	public Integer getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}
	@Override
	public void setVolume(Integer volume) {
		// TODO Auto-generated method stub
		if(volume < 0) return;
		if(volume > 100)return;
		this.volume = volume;
	}
	@Override
	public void power() {
		// TODO Auto-generated method stub
		power = !power;
		System.out.println("Power: " + (power?"On":"Off"));
	}

}
