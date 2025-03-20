package com.apple.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args); //스프링으로 만든 웹 사이트를 뛰워주세요 ~ 의 코드

		var test = new Friend("Park");
		System.out.println(test.name);
	}
}

//친구 여러명의 이름과 나이를 변수로 저장하려면??
class Friend {
	String name = "kim";
	int age = 20;
	Friend(String 구멍){ // 슈퍼 함수, new Friend() 때 실행됨
		this.name = 구멍; //왜 이렇게 사용하는데? => 잘 쓰면 매번 다른 변수값으로 object 뽑을 수 있음
	}
}

