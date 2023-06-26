package pattern.structural.bridge;

public class RemoteControl {

	private IDevice device;
	
	RemoteControl(IDevice device){
		this.device = device;
	}
	
	public void power() {
		device.power();
	}
	
	public void volumeUp() {
		Integer oldVolume = device.getVolume();
		device.setVolume(device.getVolume()+10);
		System.out.println("Device volume has changed "+oldVolume+" to "+device.getVolume());
	}
	
	public void volumeDown() {
		Integer oldVolume = device.getVolume();
		device.setVolume(device.getVolume()-10);
		System.out.println("Device volume has changed "+oldVolume+" to "+device.getVolume());

	}
	
}
