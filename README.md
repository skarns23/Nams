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
 <summary> 2022.3.24(THU)</summary>
 <div markdown ="1">	 
  ### reduce() 연산
   - 정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 적용
	 
   ``` JAVA 
   T reduce(T identify, BinaryOperator<T>, accumulator)
   ```  
	 
   - 최종 연산으로 스트림의 요소를 소모하며 연산을 수행
   - 배열의 모든 요소의 합을 구하는 reduce() 연산 구현 예
   ```JAVA     
   Arrays.stream(arr).reduce(0, (a,b)->(a+b)); 
   ```
   - 람다식을 직접 구현하거나 람다식이 긴 경우 BinaryOperator를 구현한 클래스를 사용 함
         
  ## 📝 예외처리
     
  ### 프로그램에서의 오류
  - 컴파일 오류 : 프로그램 코드 작성 중 발생하는 문법적 오류 (최근에는 개발 환경에서 대부분 오류 detection 됨)
  - 실행오류 : 실행 중인 프로그램이 의도 하지 않은 동작을 하거나 프로그램이 중지되는 오류
  
  ### 예외 처리의 중요성
  - 프로그램의 비정상 종료를 피하며 시스템이 원활하게 실행되도록 함
- 실행 오류가 발생한 경우 오류의 과정을 재현하는 것이 현실적으로 어려움
- 오류가 발생한 경우 log를 남겨서 추후 log 분석을 통해 그 원인을 파악하여 bug를 수정하는 것이 중요함
### 오류와 예외 클래스
- 시스템 오류 : 가상 머신에서 발생, 프로그래머가 처리할 수 없는 오류 (스택 메모리 오버플로우등)
- 예외 : 프로그램에서 제어 할 수 있는 오류 (읽을려는 파일이 존재하지 않거나, DB연결 실패등)
- 자바는 안정성이 중요한 언어로 대부분 프로그램에서 발생하는 오류에 대해 문법적으로 예외 처리해야함   
 
 </div>
 </details>

 <details>
 <summary> 2022.3.25(FRI)</summary>
 <div markdown ="1">	 
 
### 예외 처리하기와 미루기

- try 블록에는 예외가 발생할 가능성이 있는 코드를 작성하고 try 블록 안에서 예외가 발생하는 경우 catch 블록이 수행됨

```JAVA
try{
  예외가 발생할 수 있는 코드 부분
} catch (처리할 예외 타입 e){
  try 블록 안에서 예외가 발생했을 때 예외를 처리하는 부분
 }
```

#### try-catch-finally 문
- finally 블럭에서 파일을 닫거나 네트웍을 닫는 등의 리소스 해제 구현을 함
- try{} 블럭이 수행되는 경우, finally{} 블럭은 항상 수행 됨
- 여러 개의 예외 블럭이 있는 경우 각각에서 리소스를 해제하지 않고, finally 블록에서 해제하도록 구현


#### try-with-resources 문
- 리소스를 사용하는 경우 close() 하지 않아도 자동으로 해제 되도록 함
- 리소스를 try{} 내부에서 선언해야만 함
- 해당 리소스 클래스가 AutoCloseable 인터페이스를 구현 애햐 함
 
 </div>
 </details>
	  
<details>
 <summary> 2022.3.27(SUN)</summary>
 <div markdown ="1">	 
 
### 예외 처리 미루기
- 예외 처리는 예외가 발생하는 문장에서 try-catch 블록으로 처리하는 방법과 이를 사용하는 부분에서 처리하는 방법 두 가지가 있음
- throws를 이용하면 예외가 발생할 수 있는 부분을 사용하는 문장에서 예외를 처리할 수 있음

### 사용자 정의 예외 클래스 구현하기
- 자바에서 제공되는 예외 클래스외에 프로그래머가 직접 만들어 처리해야하는 예외가 있을 수 있음
- 기존 예외 클래스 중 가장 유사한 예외 클래스를 상속 받아 사용자 정의 예외 클래스를 만듬
- Exception 클래스를 상속해서 만들 수 있음 


## 📝 오류의 로그를 남기기 Logger 활용

### logging
- 시스템 운영에 대한 기록
- 오류가 발생 했을 때 그 오류에 대한 기록을 남겨 디버깅을 용이하게 함
- 로그 파일에 기록하는 코드를 추가하여 필요한 정보가 로그로 남을 수 있도록 함
- 너무 적은 로그 : 정확한 시스템의 상황을 파악하기 어려움
- 너무 많은 로그 : 빈번한 file I/O의 오버헤드와 로그 파일의 백업 문제 발생

### java.util.logging
- 자바에서 기본적으로 제공되는 log package
- 파일이나 콘솔에 로그 내용을 출력할 수 있음
- jre/lib/logging.properties 파일 편집을 통해 로그의 출력방식, 로그 레벨을 변경 가능
- logging 패키지에서 제공하는 로그 레벨은 severe, warning, info, config, fine, finer, finest 임
- 오픈소르로는 log4j를 많이 사용

## 📝 I/O 스트림

### 바이트 단위 입출력 스트림
- InputStream : 바이트 단위 입력 스트림 최상위 추상 클래스

- 주요 하위 클래스
> - FileInputStream : 파일에서 바이트 단위로 자료를 읽음
> - ByteArrayInputStream : byte 배열 메모리에서 바이트 단위로 자료를 읽음
> - FilterInputStream : 기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스 

- OutputStream : 바이트 단위 출력 스트림 최상위 추상 클래스

- 주요 하위 클래스
> - FileOutputStream : 파일에서 바이트 단위로 자료를 씀
> - ByteArrayOutputStream : byte 배열 메모리에서 바이트 단위로 자료를 씀
> - FilterOutputStream : 기반 스트림에서 자료를 쓸 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
 </div>
 </details>
	  
