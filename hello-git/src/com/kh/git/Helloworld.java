package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.animal.Snake;

/**
 * SCM (Software Configuration Management: 소프트웨어 형상관리)
 * 	- 코드 추적(버전관리) 외에 build, packaing, deploy 등 프로젝트 관련 프로세스를 관리하는 것.
 * 
 * VCS (Version Control System: 버전관리 시스템)
 * 	- 프로젝트 작성/수정/보완에 따른 변경내역을 버전으로 관리
 * 
 * 버전관리 프로그램(두 가지 종류)
 * 	- server-client로 관리하는 경우
 * 		- 중앙저장소를 공유한 각각의 클라이언트에서(개발자) 저장소의 일부만 가져와서 작업 후, 중앙저장소에 반영
 * 		- 대표적: subversion
 * 	- 분산형으로 관리하는 경우
 * 		- 참여하는 각각의 클라이언트에서 전체 저장소에 대한 복제본을 가지고 작업.
 * 		- 대표적: git
 *
 */
public class Helloworld {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Dog dog = new Dog();
		dog.bark();
		
		Cat cat = new Cat();
		cat.cry();
		
		Snake snake = new Snake();
		snake.move();
	}
}
