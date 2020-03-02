package com.epam.logger;

public class SimpleInterest {
	Double principalamount;
    float rateOfInterest;
    float timePeriodInYears;
    SimpleInterest(Double p,float r,float t){
 	   	principalamount=p;
 	   	timePeriodInYears=t;
 	   	rateOfInterest=r; 	   
    }
    public double caluculateSimpleInterest() {
   	 	return((principalamount *rateOfInterest* timePeriodInYears)/100);
    }
}