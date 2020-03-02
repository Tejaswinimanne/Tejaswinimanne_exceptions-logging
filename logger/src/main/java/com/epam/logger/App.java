package com.epam.logger;

import java.util.Scanner;

import com.epam.logger.CompoundInterest;
import com.epam.logger.Construction;
import com.epam.logger.SimpleInterest;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	LOGGER.debug("Choose 1 for calculating Interest.");
    	LOGGER.debug("Choose 2 for house construction.");
    	int option = sc.nextInt();
    	if(option==1) {
    		LOGGER.debug("Enter principal amount");
    		double principal=sc.nextDouble();
    		LOGGER.debug("Enter rate of interest");
    		float rateOfInterest=sc.nextFloat();
    		LOGGER.debug("Enter time in years");
    		float time=sc.nextFloat();
    		LOGGER.debug("1.Simple Interest\r\n"+"2.Compound Interest\r\n"+"Choose an option from the above\r\n");
    		int typeOfInterest=sc.nextInt();
    		if(typeOfInterest==1) {
    			SimpleInterest SI=new SimpleInterest(principal,rateOfInterest,time);
    			LOGGER.debug("The simple interest is : "+SI.caluculateSimpleInterest());
    		}
    		else {
    			CompoundInterest SI=new CompoundInterest(principal,rateOfInterest,time);
    			LOGGER.debug("The compound interest is : "+SI.caluculateCompoundInterest());
    		}
    	}
    	else if(option==2){
    		LOGGER.debug("1:1200INR if we use standard materials\r\n"+ 
    				     "2:1500INR if we use above standard materials\r\n"+ 
    				     "3: 1800INR if customers needs high standard material\r\n"+ 
    				     "4: 2500INR if customer needs high standard material and fully automated home\r\n");
    		LOGGER.debug("Choose the type of material from the above");
    		int typeOfMaterial=sc.nextInt();
    		LOGGER.debug("Enter the area of your home in square feet");
    		float area=sc.nextFloat();
    		Construction c=new Construction(typeOfMaterial,area);
    		LOGGER.debug("The total cost is : "+c.calculateTotalCost());
    	}
    }
}
