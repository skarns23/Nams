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
	 
	 
<details>
 <summary> 2022.3.28(MON)</summary>
 <div markdown ="1">	 
 
## 📝 직렬화

### serialization 이란
- 인스턴스의 상태를 그대로 파일 저장하거나 네트웍으로 전송하고 이를 다시 복원하는 방식
- 자바에서는 보조 스트림을 활용하여 직렬화를 제공
- ObjectInputStream과 ObjectOutputStream

### Serializable 인터페이스
- 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
- 구현 코드가 없는 marker interface
- 상속해줌으로써 직렬화가 가능하다는 표시
- transient로 선언을 해주면 직렬화를 하지않는다, 직렬화가 불가능한 (소켓) 객체에 선언

### Externalizable 인터페이스
- writerExternal()과 readExternal()메서드를 구현해야 함
- 프로그래머가 직접 객체를 읽고 쓰는 코드를 구현할 수 있음

## 📝 여러가지 입출력 클래스들

### File 클래스
- 파일 개념을 추상화한 클래스
- 입출력 기능은 없고, 파일의 이름, 경로, 읽기 전용등의 속성을 알수 있음
- 이를 지원하는 여러 메서드들이 제공됨

### RandomAccessFile 클래스
- 이불력 클래스 중 유일하게 파일에 대한 입력과 출력을 동시에 할 수 있는 클래스
- 파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능함
- 다양한 메서드가 제공됨 
 </div>
 </details>
	  
<details>
 <summary> 2022.3.29(TUE)</summary>
 <div markdown ="1">	 

## 📝 [데코레이터 패턴을 활용한 커피 머신 프로그램](https://github.com/skarns23/Nams/tree/master/learn_java/Chapter14/src/ch16)

### Decorator Pattern
- 객체의 결합을 통해 기능을 동적으로 유연하게 확장 가능
- 자바의 입출력 스트림은 decorator pattern 임
- 여러 decorator들을 활용하여 다양한 기능을 제공
- 상속 보다 유연한 구현 방식
- 데코레이터는 다른 데코레이터 혹은 컴포넌트를 포함해야 함
- 지속적인 기능의 추가와 제거가 용이함
- 데코레이터와 컴포넌트는 동일하지 않음

## 📝 자바에서 Thread 만들기

### Thread란
- 프로세스가 단순히 실행 중인 프로그램이라면 thread는 프로세스내에서 실제로 작업을 수행하는 주체를 의미
- 모든 프로세스에는 한 개 이상의 thread가 존재하여 작업을 수행
- 실제 작업을 수행하는 단위는 thread 임
- 공유 자원에 대해 동기화 기법이 필요함

### multi-threading
- 여러 thread가 동시에 수행되는 프로그래밍. 여러 작업이 동시에 실행
- thread는 각각 자신만의 작업 공간을 가짐 ( context )
- 각 thread 사이에서 공유하는 자원이 있을 수 있음 ( 자바에서는 static interface )
- 자원을 공유하여 여러 thread가 작업을 수행하는 경우 서로 자원을 차지하려는 race condition이 발생할 수 있음
- 해결을 위해 critical section에 대한 동기화를 구현해야 함


### Thread 구현
- Thread 구현은 Thread 클래스를 상속받아서 구현하는 방법
- Runnable 인터페이스를 상속하여 구현하는 방법
- Thread 클래스를 상속하는 경우 기존에 상속받은 클래스가 없는 경우에 구현 가능
- Runnable 인터페이스는 상속받은 클래스가 있더라도 인터페이스이기때문에 구현가능

### Thread Status
- Runnable: 스레드가 시작되면 스레드 풀에 들어감. CPU 배분을 기다리는 상태 
- Run : 스레드가 CPU를 배분받아 실행되는 상태
- Dead : 스레드가 수행되서 종료된 상태
- Not Runnable : CPU를 점유할 수 없는 상태 3가지의 메소드 호출을 통해서 가능
1) sleep() (ms가 들어감) : 잠시 쉬었다가 실행
2) wait() : 자원을 사용할 수 있는 상태까지 대기 notify(), notifyAll()메소드를 통해 자원 사용가능 여부를 회신
3) join() : 다른 스레드의 실행결과를 참조해야하는 경우 join()을 실행한 스레드가 Not Runnable에 빠지고 다른 스레드가 종료되면 다시 실행

### Thread 우선순위
- Thread.MIN_PRIORITY( 1 ) ~ Thread.MAX_PRIORITY( 10 )
- 디폴트 우선 순위 : Thread.NORMAL_PRIORITY ( 5 )
- 우선 순위가 높을 수록 CPU 배분을 받을 확률이 높다
- setPriority(), getPriority() 메소드 제공

### join()
- 동시에 두 개 이상의 Thread가 실행 될 때 다른 Thread의 결과를 참조 하여 실행해야 하는 경우 join()함수를 사용
- join() 함수를 호출한 Thread가 not-runnable 상태로 감
- 다른 Thread의 실행이 끝나면 runnable 상태로 돌아옴

### interrupt()
- 다른 Thread에 예외를 발생시키는 interrupt를 보냄
- Thread가 join(), sleep(), wait() 메서드에의해 not-runnable 상태일 때 interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음 

### Thread 종료
- 무한 반복의 경우 while(flag)의 flag 변수 값을 false로 바뀌어 종료를 시킴
- Thread 종료하기 예제

``` JAVA
package ch18;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	
	private boolean flag = false;
	int i;
	
	public TerminateThread(String nm) {
		super(nm);
	}
	
	public void run() {
		while(!flag) {
			try {
				System.out.print(this.getName()+" ");
				sleep(100);
			}catch (Exception e) {
				
			}
		}
		System.out.println(getName() +" end");
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TerminateThread A = new TerminateThread("A");
		TerminateThread B = new TerminateThread("B");
		TerminateThread C = new TerminateThread("C");
		
		A.start();
		B.start();
		C.start();
		int in;
		while(true) {
			in = System.in.read();
			switch (in) {
			case 'A':
				A.setFlag(true);
				break;
			case 'B':
				B.setFlag(true);
				break;
			case 'C':
				C.setFlag(true);
				break;
			case 'M':
				A.setFlag(true);
				B.setFlag(true);
				C.setFlag(true);
				break;
			}
		}
	}

}
```

 </div>
 </details>

<details>
 <summary> 2022.3.30(WEN)</summary>
 <div markdown ="1">

## 📝 multi-thread 프로그래밍 동기화

### critical section 과 semaphore
- critical section은 두 개 이상의 thread가 동시에 접근 하는 경우 문제가 생길 수 있기 때문에 동시에 접근할 수 없는 임계 영역
- semaphore는 특별한 형태의 시스템 객체이며 get/release 두 개의 기능이 존재
- 한 순간 오직 하나의 thread만이 semaphore를 얻을 수 있으며, 나머지 thread는 대기 상태
- semaphore를 얻은 thread 만이 critical setion에 들어갈 수 있음

### 은행 예제
- 공유 자원에 대해서 접근 권한을 제한하기 위해 synchronized 방식이 제공
- 블록형식으로도 사용 가능
- 동기화 (synchronized)는 임계영역에 접근한 경우 공유 자원을 lock하여 다른 thread의 접근을 제어
- 동기화를 잘못 구현하면 deadlock에 빠질 수 있음

```JAVA
package ch19;


class Bank{
	
	private int money = 10000;
	
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(save+m);
	}
	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m-minus);
	}
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Park extends Thread{
	public void run() {
		System.out.println("start save");
		SyncMain.bk.saveMoney(3000);
		System.out.println("saveMoney(3000) : "+SyncMain.bk.getMoney());
	}
}
class ParkWife extends Thread{
	public void run() {
		System.out.println("start minus");
		SyncMain.bk.minusMoney(2000);
		System.out.println("minusMoney(2000) : "+SyncMain.bk.getMoney());
	}
}
public class SyncMain {
	public static Bank bk = new Bank();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		ParkWife pwife = new ParkWife();
		pwife.start();
	}

}
```

### synchronized 블럭
- 현재 객체 또는 다른 객체를 lock으로 만듬
```JAVA
synchronized (참조형 수식){
	수행문 ;
}
```

### wait() / notify() 메서드를 활용한 동기화 프로그래밍
- 자원이 어떤 조건에서 더 이상 유효하지 않은 경우 자원을 기다리기 위해 Thread가 wait() 상태가 됨
- wait() 상태가 된 Thread는 notify()가 호출 될 때까지 기다림
- 유효한 자원이 생기면 notify()가 호출되고, wait() 상태인 Thread 중 무작위로 하나의 Thread를 재시작
- notifyAll()이 호출되는 경우 wait()하고 있는 모든 Thread가 재시작
- 이 경우 유효한 자원만큼의 Thread만이 수행될 수 있고, 자원을 갖지 못한 Thread의 경우는 다시 wait()
- 자바에서는 notifyAll() 메서드의 사용을 권장

 </div>
 </details>
<details>
<summary> 2022.3.31(THU) </summary>
<div markdown = "1">

## [학생 성적 산출 프로젝트 만들기](https://github.com/skarns23/Nams/tree/master/learn_java/Chapter15/src)

</div>
</details>


<details>
<summary> 2022.4.1(FRI) </summary>
<div markdown = "1">

## [백준 백트래킹 문제 해결](https://www.acmicpc.net/step/34)

### [[백준/자바JAVA]9663번 N-Queen](https://www.acmicpc.net/problem/9663)
 - [CODE](https://github.com/skarns23/Nams/blob/master/Baek/BaekJoon/src/baekjoon/step13/Baekjoon9663.java)
- 백트래킹의 대표적인 문제
- N*N 크기의 체스판에 N개의 퀸이 서로 공격하지 못하게 놓는 경우의 수를 구하는 문제
- 풀이 방법을 안다면 생각보다 쉬운 문제 해결 힌트로는
- 1개의 배열을 사용 index는 열로, 안에 값은 행으로 활용
- 대각선을 피해 놓는 방법은 좌표 값 연산으로 해결가능
- 같은 행에 대한 존재 확인

### [[백준/자바JAVA]14888번 연산자 끼워넣기](https://www.acmicpc.net/problem/14888) / [CODE](https://github.com/skarns23/Nams/blob/master/Baek/BaekJoon/src/baekjoon/step13/Baekjoon14888.java)
- 주어지는 수열과 연산자의 갯수를 통해 수식을 만들고 최솟값, 최대값을 구하는 문제
- 연산자에 대해 dfs를 진행하는 방식의 풀이법
- depth의 경우 숫자의 갯수와 같아지면 최솟값과 최대값에 연산 실행
- 주어진 수열의 값과 연산을 통해 매개변수로 넘기는 형식

### [[백준/자바JAVA]14889번 스타트와 링크](https://www.acmicpc.net/problem/14889) / [CODE](https://github.com/skarns23/Nams/blob/master/Baek/BaekJoon/src/baekjoon/step13/Baekjoon14889.java)
- N명의 사람이 주어지면 각 팀을 N/2로 나누고, 각 팀의 화합 능력치 차이가 최소가 되는 경우의 값을 구하는 문제
- 기존의 dfs 형식과 비슷하게 구성함
- A팀에서 N/2명의 사람을 다 뽑은 경우, 남은 인원들을 B팀에 배정
- 그 후 A, B팀에 대한 능력치 계산후 최솟값을 비교 및 갱신하는 형태로 구성 


</div>
</details>
