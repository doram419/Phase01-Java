package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GoodsApp {
//    	java.util.Scanner 클래스를 이용하여 상품을 입력받아 Goods 객체를 생성하고 이들을 ArrayList 에 저장하세요.
//    	상품입력은 상품명,가격,개수 형태로 콤마(,)로 구분하여 입력합니다.
//    	“q”가 입력되면 입력이 종료되며 등록된 상품 리스트 모두가 출력됩니다

	public static void main(String[] args) {
		// 입력을 위한 Scanner 생성
		Scanner scanner = new Scanner(System.in); 
		
		// Goods 저장 위한 ArrayList 생성
		ArrayList<Goods> goodsList = new ArrayList<Goods>();
		String userInput = null;
		int total = 0;
		boolean isContinue = true;
		
		System.out.println("상품을 입력해주세요(종료 q)");
		// "q"가 들어올 때까지 반복
		while (isContinue) {
			// 상품 입력
			System.out.print(">>");
			userInput = scanner.nextLine();
			
			if(userInput.equals("q"))
			{
				isContinue = false;
			}
			else
			{
				// 입력된 상품을 콤마형태로 분리
				String[] splits = userInput.split(",");
				
				// 상품 생성
				Goods good = new Goods(splits[0], 
						Integer.parseInt(splits[1]), 
						Integer.parseInt(splits[2]));
				total += good.getCount();
				
				// ArrayList에 상품 저장
				goodsList.add(good);
			}
		}
		
		Iterator<Goods> iterator = goodsList.iterator();
		
		Goods good;
		// ArrayList 출력
		while (iterator.hasNext()) {
			good = iterator.next();
			System.out.println(good);
		}
		System.out.println("모든 상품의 개수는 " + total + "개 입니다.");
		
		// Scanner 해제
		scanner.close();
	}

}
