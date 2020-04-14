package genesis.lab.models;

public class VentilationFactor 
{
	private double heightOfCompartment, floorArea, ventilationArea, heightOfVentilationOpening, areaOfHorizontalOpening, ventilationFactorValue=0;

	public double getHeightOfCompartment() {
		return heightOfCompartment;
	}

	public void setHeightOfCompartment(double heightOfCompartment) {
		this.heightOfCompartment = heightOfCompartment;
	}

	public double getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(double floorArea) {
		this.floorArea = floorArea;
	}

	public double getVentilationArea() {
		return ventilationArea;
	}

	public void setVentilationArea(double ventilationArea) {
		this.ventilationArea = ventilationArea;
	}

	public double getHeightOfVentilationOpening() {
		return heightOfVentilationOpening;
	}

	public void setHeightOfVentilationOpening(double heightOfVentilationOpening) {
		this.heightOfVentilationOpening = heightOfVentilationOpening;
	}

	public double getAreaOfHorizontalOpening() {
		return areaOfHorizontalOpening;
	}

	public void setAreaOfHorizontalOpening(double areaOfHorizontalOpening) {
		this.areaOfHorizontalOpening = areaOfHorizontalOpening;
	}

	public double getVentilationFactorValue() {
		return ventilationFactorValue;
	}

	public void setVentilationFactorValue(double ventilationFactorValue) {
		this.ventilationFactorValue = ventilationFactorValue;
	}

	
}
