package com.kh.animal;

/**
 * reset: 지정버전으로 돌아감
 * - reset의 옵션 3가지 
 * 	- hard : 이후 변경사항 모두 제거
 * 	- mixed : 이후 변경사항을 unstaged chages에서 관리
 * 	- soft : 이후 변경사항을 staging area에 추가
 * 
 * revert : 지정한 버전의 취소버전을 새로 추가
 * 	- history를 변경할 수 없는 경우 유용하다.
 * 	- conflict 발생 가능성 있음.
 *
 */

public class Cow {
	private String name; 
	
	public void run() {
		System.out.println("소가 달립니다.");
	}

}