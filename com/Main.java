package com;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BigDecimal result = Calculator.Calculate("(10+2*3)*(3+1)");
//		boolean result = IfCalculator.Calculate("(3>2)||(1<2)");		
		boolean result = Calculator.Calculate("((6<(2+2))||((2*2-2)==2))||(5<6)");		
		System.out.println(result);
	}
}
