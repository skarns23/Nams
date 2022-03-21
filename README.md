# 📌[2022]

<details>
<summary> 2022.2.13(SUN)</summary>
<div markdown="1">

## 📝컬렉션 프레임워크


### 컬렉션 프레임워크란?
- 프로그램 구현에 필요한 자료구조를 구현해 놓은 라이브러리
- java.util 패키지에 구현
- 최적화 된 알고리즘을 활용할 수 있어 개발 소요시간을 단축
- 여러 인터페이스와 구현 클래스 사용법을 이해해야 한다.

### Collection
- 하나의 데이터들만 다룬다.
- 하위에 List와 Set 인터페이스가 존재한다.
- List는 선형 자료구조로 ArrayList, LinkedList 등이 존재한다. (순서가 존재, 중복 허용)
- Set은 집합과 닮아 있어서 중복을 허용하지 않는다. 주로 유일한 데이터를 관리할 때 활용하며 순서에 구애받지 않는다.

#### Collection에서 자주 사용하는 메소드
| 메소드 | 설명 |
|:---:|:---:|
| boolean add(E e) | Collection에 객체를 추가|
| void clear() | Collection의 모든 객체를 제거|
| Iterator<E> iterator | Collection을 순환할 반복자를 반환|
| boolean remove(Object o) | Collection에 매개변수에 해당하는 인스턴스가 존재하면 제거|
| int size() | Collection에 있는 요소의 개수를 반환|


### Map
- 쌍으로 관리된 객체를 관리하며 Key, Value로 쌍을 만든다.
- Key는 중복될 수 없다.
- HashTable, HashMap, TreeMap, Properties가 존재하며 주로 HashMap을 사용한다. TreeMap의 경우에는 Key에 대해 정렬한다.


</div>
</details>
 
<details>

<summary> 2022.2.14(MON)</summary>
<div markdown="1">

### 1. 자바 collection 프레임워크 실습 공부  
https://github.com/skarns23/Nams/tree/master/learn_java/Chapter12/src/collection

 
 ### 2. Stack
 - 스택은 상자를 쌓듯이 자료를 관리하는 방법
.- 맨 나중에 들어간 요소가 제일 처음으로 나오는 LIFO (Last In First Out) 형식이다.
 ### 4. LinkedList
 - ArrayList에 비해 중간에 자료를 넣고 제거하는 시간이 적게 걸린다.
 - 크기를 동적으로 증가시킬 수 있다.
</div>
</details>
 
<details>
 <summary> 2022.3.7(MON)</summary>
 <div markdown ="1">
  
  ### [백준 단계별 문제 풀기 (for문 ~ 1차원 배열 2번까지)](https://github.com/skarns23/Nams/tree/master/Baek/BaekJoon/src/baekjoon)
  - 기존에 코드의 구성을 할때는 Scanner를 이용하여 입력을 받았는데 [백준 빠른 A+B](https://www.acmicpc.net/problem/15552) 문제를 통해 BufferedReader 와 BufferedWriter 방식의 입 출력형태를 활용해보고 있다.
 
  ### Scanner와 BufferedReader 비교
  1. Scanner는 BufferedReader보다 활용성이 높다.
  - Scanner의 경우 자료형을 지정하여 읽을 수 있는 반면, BufferedReader의 경우에는 String값으로만 읽을 수 있다.
  2. BufferedReader의 경우에는 파싱 (Parsing), 예외처리 (throws Exception or try catch)가 필요하다.
  - 그러나 효율성 및 속도의 측면에서 Scanner보다 BufferedReader가 빠르기때문에 BufferedReader또한 많이 사용된다.
  - 파싱의 경우에는 StringTokenizer을 활용한다.
  
  </div>
 </details>
 
 <details>
 <summary> 2022.3.17(THU)</summary>
 <div markdown ="1">
  
  ### [백준 단계별 문제 풀기 (매일 5문제가량 진행 중 )](https://github.com/skarns23/Nams/tree/master/Baek/BaekJoon/src/baekjoon)
  - 재귀함수 부분의 [하노이 타워 문제](https://www.acmicpc.net/problem/11729)에 대한 공식을 알게되었다.
  - 브루트 포스 중 [체스판 문제](https://www.acmicpc.net/problem/1018)에서 노가다 형식의 코드로 진행하여 코드가 지저분한데 다른 분들의 코드의 경우에는 함수를 선언하여 깔끔하고 좀 더 좋은 방식을 활용한 분들이 많았다.
 - 정렬 부분에서 카운팅 정렬에대해 알게되었으며, 카운팅 정렬의 경우에는 수의 범위가 작을 경우에 사용하는 것이 좋다.
 - 정렬 중 [통계학](https://www.acmicpc.net/problem/2108) 문제에서 최빈값을 구하는 알고리즘에서 애를 먹어서 참고를 했는데, 최빈 값중 두번째로 작은 값을 출력해야해서 카운팅정렬을 활용하는 것이 인상적이였다.
  

  
  </div>
 </details>
 
  <details>
 <summary> 2022.3.20(SUN)</summary>
 <div markdown ="1">

### 지역 내부 클래스
  - 지역 변수와 같이 메서드 내부에서 정의하여 사용하는 클래스
  - 메서드의 호출이 끝나면 메서드에 사용된 지역변수의 유효성은 사라짐
  - 메서드 호출 이후에도 사용해야하는 경우가 있을 수 있으므로 지역 내부 클래스에서 사용하는 메서드의 변수는 final로 선언
  
 ### 익명 내부 클래스
  - 이름이 없는 클래스 
  - 클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환
  - 인터페이스나 추상 클래스 자료형의 변수에 직접 대입하여 클래스를 생성하거나 지역 내부 클래스의 메서드 내부에서 생성하여 반환 할 수 있음
 
  ### 람다식
  - 함수의 구현과 호출만으로 프로그래밍이 수행되는 방식
  - 함수형 프로그래밍에서 활용되고, 주어진 매개변수만을 활용하여 외부 자료에 side effect를 주지않음
  - 매개변수 외에는 외부 자료를 사용하지 않아서 병렬처리가 가능함
  - 동일한 자료에 대해 동일한 결과를 보장하여 함
  
  ### 람다식 문법
  - 익명 함수 만들기
  - 매개 변수와 매개변수를 이용한 실행문 (매개변수)->(실행문;)
	 
  ```JAVA
  int add(int x, int y){
   return x+y;
  }
   
  (int x, int y) -> (return x+y;)

```
  
  ### 함수형 인터페이스 선언하기
  - 람다식을 선언하기 위한 인터페이스
  - 익명 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선언해야함
  - @FunctionalInterface 어노테이션 : 함수형 인터페이스라는 의미로 내부에 여러 개의 메서드를 선언하면 에러가 남
	 
  ```JAVA
public static void main(String[] args) {
		
	MyNumber myNumber = (x,y)-> x>y ? x:y; 
	System.out.println(myNumber.getMax(20, 33));
}
```
  
  </div>
 </details>

 <details>
 <summary> 2022.3.22(TUE)</summary>
 <div markdown ="1">
   
   
## 📝 스트림 (Stream)
   
   
 ### 스트림 이란?
   - 자료의 대상과 관계없이 동일한 연산을 수행
   - 한번 생성하고 사용한 스트림은 재사용 할 수 없음
   - 스트림 연산은 기존 자료를 변경하지 않음
   - 스트림 연산은 중간 연산과 최종 연산으로 구분 됨
   - 중간 연산은 여러 개의 연산이 적용될 수 있으나, 최종 연산은 마지막에 한 번만 적용됨
   - 중간 연산에 대한 결과를 연산 중에 알수 없음 ( 지연 연산)
  
  ### 중간 연산과 최종 연산
   - 중간 연산의 예 - filter(), map(), sorted() 등
     조건에 맞는 요소를 추출하거나 요소를 변환 함(map)
   - 문자열 리스트에서 문자열의 길이가 5 이상인 요소만 출력하기
 ```JAVA
   sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
 ```
   - 고객 클래스 배열에서 고객 이름만 가져오기
 ```JAVA
   customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
  ```
   - 최종 연산의 예 - forEach(), count(), sum() 등
   
   
   </div>
 </details>
	
	

 
