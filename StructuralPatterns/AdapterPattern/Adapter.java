//Inheritance
//Adapter class inherits from ThreePoingPlug interface
class Adapter implements ThreePointPlug {
	//Composition
	//Adpater class is composed of TwoPointPlug class
	private TwoPointPlug twoPointPlug; 
	public void plugIn() {
		twoPointPlug = new TwoPointPlug();
	};
}