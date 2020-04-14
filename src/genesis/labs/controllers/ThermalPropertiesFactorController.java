package genesis.labs.controllers;

public class ThermalPropertiesFactorController 
{
	String materials[] = {"concrete", "plasterboard"};
	int thermalInertias[] = {2280, 520};
	int thermalInertiaValue = -1;
	
	public int thermalPropertiesFactor(String material)
	{
		for(int x=0; x < materials.length; x++)
		{
			String value = materials[x];
			if(value.equals(material.toLowerCase()))
			{
				thermalInertiaValue = thermalInertias[x];
			}
		}
		return thermalInertiaValue;
	}
}
