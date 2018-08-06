package com.exilant.day3.abstractfactry;

public class factryclient {

	public static void main(String[] args) {
		//icolor redcol=factoriespeovider.getfactory("color").getcolor("red");
	//	icolor bluecol=factoriespeovider.getfactory("color").getcolor("blue");
		//redcol.paintcar();
	AbstractFactory vehiclefac=factoriespeovider.getfactory("vehicle");
ivehicle fordcar=vehiclefac.getVehicle("car");
fordcar.move();
fordcar.speed(120);
fordcar.paint(factoriespeovider.getfactory("color").getcolor("red"));
ivehicle mantruck=vehiclefac.getVehicle("truck");
mantruck.move();
mantruck.speed(60);
mantruck.paint(factoriespeovider.getfactory("color").getcolor("blue"));	


	}

}
