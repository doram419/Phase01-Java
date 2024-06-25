package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		// [문제] Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
		int arLotteryNumber[] = new int[6];
		int nSelectNumber = (int)(Math.random() * 44)+1;
		Boolean isRedundancy;
		
		// 배열의 크기만큼의 숫자에 전부 랜덤 값 부여
		for (int nIndex = 0; nIndex < arLotteryNumber.length; nIndex++) {
			
			// 정해진 숫자들을 처음부터 끝까지 검색하여 중복값이 있다면,
			for (int i = 0; i < nIndex; i++) {
				isRedundancy = true;
				
				// 중복값이 없을 때까지 새 값 부여.
				while (isRedundancy) {
					nSelectNumber = (int)(Math.random() * 44)+1;
					
					if(arLotteryNumber[nIndex] != nSelectNumber)
					{
						isRedundancy = false;
					}
				}
			}
			arLotteryNumber[nIndex] = nSelectNumber; 
		}
		
		for (int i = 0; i < arLotteryNumber.length; i++) {
			System.out.print(arLotteryNumber[i] + " ");
		}
	}
}
