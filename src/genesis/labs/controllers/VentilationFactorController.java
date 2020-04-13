package genesis.labs.controllers;

import genesis.lab.models.VentilationFactor;

public class VentilationFactorController 
{
	double heightOfCompartment = 0;
	double floorArea = 0;
	double ventilationArea = 0;
	double heightOfVentilationOpening = 0;
	double areaOfHorizontalOpening = 0;
	double alphaV;
	double ventilationFactorValue;
	
	public void ventilationFactor(VentilationFactor ventilationFactor)
	{
		heightOfCompartment = ventilationFactor.getHeightOfCompartment();
		floorArea = ventilationFactor.getFloorArea();
		ventilationArea = ventilationFactor.getVentilationArea();
		heightOfVentilationOpening = ventilationFactor.getHeightOfVentilationOpening();
		areaOfHorizontalOpening = ventilationFactor.getAreaOfHorizontalOpening();
		alphaV = ventilationArea/floorArea;
		ventilationFactorValue = Math.pow((6/heightOfCompartment), 0.3)*(0.62 + 90*(Math.pow((0.4-alphaV), 4)));
		ventilationFactor.setVentilationFactorValue(ventilationFactorValue);
	}
	
}
