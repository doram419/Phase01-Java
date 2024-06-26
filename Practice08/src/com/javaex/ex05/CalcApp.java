package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Add add = new Add();
    	Mul mul = new Mul();    	
    	Div div = new Div();
    	Sub sub = new Sub();
    	
    	Scanner scanner = new Scanner(System.in);
    	String userInput;
    	
    	boolean isContinue = true;
    	while(isContinue)
    	{
    		userInput = scanner.nextLine();
    		
    		// 종료를 찾음!
    		if(userInput.indexOf("/q") != -1)
    		{
    			isContinue = false;
    			System.out.println("종료합니다.");
    		}
    		else
    		{
    			String[] splits = userInput.split(" ");
    			
    			int a = Integer.parseInt(splits[0]);
    			String operator = splits[1];
				int b = Integer.parseInt(splits[2]);
    			int result = 0;
    			
    			switch (operator) {
					case "+": {
						add.setValue(a, b);
						result = add.calculate();
						System.out.println(result);
						break;
					}
					case "-": {
						sub.setValue(a, b);
						result = sub.calculate();
						System.out.println(result);
						break;
					}
					case "*": {
						mul.setValue(a, b);
						result = mul.calculate();
						System.out.println(result);
						break;
					}
					case "/": {
						div.setValue(a, b);
						result = div.calculate();
						System.out.println(result);
						break;
					}
					default: {
	    				System.out.println("알 수 없는 연산입니다.");
					}
    			}
    		}
    	}
    	
    	scanner.close();
    }
}
