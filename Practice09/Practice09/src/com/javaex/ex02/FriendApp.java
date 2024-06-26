package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Java.util.Scanner 클래스를 이용하여 친구정보를 입력받아 Friend 객체를 생성하고 이들을 Friend 객체 배열에
//저장하세요.
//친구 즉, 친구(Friend)객체를 3개 입력 받으면 이들을 모두 화면에 출력하세요.
//ArrayList를 사용하세요.(배열사용X)

public class FriendApp {

    public static void main(String[] args) {
    	// ArrayList를 이용한 친구 객체 배열 생성
    	ArrayList<Friend> friendsList = new ArrayList<Friend>();

    	// Scanner 생성
    	Scanner scanner = new Scanner(System.in);
    	
    	String input;
    	
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	// 친구 객체 배열 입력/생성
    	for (int i = 0; i < 3; i++) {
    		System.out.print("친구" + (i+1) +" 입력 : ");
    		input = scanner.nextLine();
    		
    		String splits[] = input.split(" ");
    		
    		//Scanner 통한 값 입력
			friendsList.add(new Friend(splits[0], splits[1], splits[2]));
		}
    	
    	Iterator<Friend> iterator = friendsList.iterator();
    	Friend friend;
    	// 친구 객체 배열 출력
    	while (iterator.hasNext()) {
    		friend = iterator.next();
    		System.out.println(friend);
		}
    	
    	// Scanner 해제
    	scanner.close();
    }

}
