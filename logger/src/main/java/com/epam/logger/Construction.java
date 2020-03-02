package com.epam.logger;

public class Construction {
    int typeOfMaterial;
    float area;
    double totalCost=0.0;
    Construction(int typeOfMaterial,float area){
   	 	this.typeOfMaterial=typeOfMaterial;
   	 	this.area=area;
   	 	if(typeOfMaterial==1)
   	 		this.totalCost=this.area*1200.00F;
   	 	else if(typeOfMaterial==2)
   	 		this.totalCost=this.area*1500.00F;
   	 	else if(typeOfMaterial==3)
   	 		this.totalCost=this.area*1800.00F;
   	 	else
   	 		this.totalCost=this.area*2500.00F;
    }
    public double calculateTotalCost() {
   	 	return this.totalCost;
    }
    
}