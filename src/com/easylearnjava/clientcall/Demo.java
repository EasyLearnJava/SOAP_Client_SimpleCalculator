package com.easylearnjava.clientcall;

import com.easylearnjava.webserviceprovider.Calculator;
import com.easylearnjava.webserviceprovider.CalculatorException_Exception;
import com.easylearnjava.webserviceprovider.CalculatorImplService;

public class Demo {
	
	public static void main(String[] args) {
		
		CalculatorImplService cis = new CalculatorImplService();
		Calculator cip = cis.getCalculatorImplPort();
		
		try{
			System.out.println("Addition of 2 numbers : " + cip.add2Numbers(3, -4));
			System.out.println();
			
			System.out.println("Subtraction of 2 numbers : " + cip.sub2Numbers(3, 9));
			System.out.println();
			
			System.out.println("Multiplication of 2 numbers : " + cip.mul2Numbers(2, 7));
			System.out.println();
			
			System.out.println("Division of 2 numbers : " + cip.div2Numbers(9, 2));
			System.out.println();
		}catch(CalculatorException_Exception ce){
			System.out.println("User data input fault...");
			System.out.println(ce.getMessage());
		}catch(Exception e){
			System.out.println("Server side exception...");
			e.printStackTrace();
		}
		
	}

}
