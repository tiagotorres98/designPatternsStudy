package pattern.structural.bridge;

public interface IDevice {

	public String getName();
	
	public void setName(String name);
	
	public Integer getVolume();
	
	public void setVolume(Integer volume);
	
	public void power();
	
}
