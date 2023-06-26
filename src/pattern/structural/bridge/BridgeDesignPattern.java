package pattern.structural.bridge;

public class BridgeDesignPattern {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl(new TV());
		remote.power();
		remote.volumeUp();
		remote.volumeUp();
		remote.volumeUp();
		remote.volumeDown();
		remote.power();
	}
	
}
