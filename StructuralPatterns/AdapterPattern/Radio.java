//In order to use power supply via Three point plug
//The radio must implement three point plug
class Radio implements ThreePointPlug{
	boolean pluggedIn;
	public void plugIn() {
		this.pluggedIn = true;
	};
	
	public void play() {
		if (pluggedIn) System.out.println("Playing");
		else System.out.println("Please plug in");
	}
	
	public void useAdapter() {
		Adapter adapter = new Adapter();
		adapter.plugIn();
		this.pluggedIn = true;
	}	
}