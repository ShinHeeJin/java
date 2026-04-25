# Java 100+ Examples - 완전 가이드 (마크다운 버전)

## 📚 목차

이 프로젝트는 자바를 기초부터 고급까지 학습하기 위한 100개 이상의 예제를 마크다운 형식으로 제공합니다.

### 📖 학습 자료

1. **[01_BASICS.md](01_BASICS.md)** - 기초 (15개 예제)
   - 변수와 데이터 타입
   - 연산자
   - 제어문 (if, switch)
   - 반복문 (for, while, do-while)
   - 배열
   - 메서드
   - 재귀
   - 문자열
   - 변수 범위
   - 타입 변환

2. **[02_OOP.md](02_OOP.md)** - 객체지향 프로그래밍 (20개 예제)
   - 클래스와 객체
   - 생성자
   - 접근 제어자
   - Getter와 Setter
   - static 키워드
   - 상속
   - super 키워드
   - 메서드 오버라이딩
   - 메서드 오버로딩
   - this 키워드
   - final 키워드
   - 다형성
   - Object 클래스
   - 구성 (Composition)
   - 캡슐화
   - 추상 클래스
   - 인터페이스
   - 다중 인터페이스 상속
   - 내부 클래스
   - 익명 클래스

3. **[03_COLLECTIONS.md](03_COLLECTIONS.md)** - 컬렉션 (15개 예제)
   - ArrayList
   - LinkedList
   - HashSet
   - HashMap
   - TreeSet
   - TreeMap
   - LinkedHashMap
   - Collections 유틸리티
   - 컬렉션 반복
   - Comparator
   - Comparable
   - Queue
   - Deque
   - Stack

4. **[04_STRINGS.md](04_STRINGS.md)** - 문자열과 정규표현식 (10개 예제)
   - String 메서드
   - StringBuilder
   - StringBuffer
   - 문자열 비교
   - 문자열 포매팅
   - 정규표현식
   - 패턴 매칭
   - split과 join
   - trim과 strip
   - Character 클래스

5. **[05_FILE_IO.md](05_FILE_IO.md)** - 파일 I/O (3개 예제)
   - 파일 읽기
   - 파일 쓰기
   - 버퍼링된 I/O

6. **[06_EXCEPTIONS.md](06_EXCEPTIONS.md)** - 예외 처리 (6개 예제)
   - try-catch
   - 다중 catch
   - try-with-resources
   - finally 블록
   - throw와 throws
   - 사용자 정의 예외

7. **[07_GENERICS.md](07_GENERICS.md)** - 제네릭 (5개 예제)
   - 제네릭 클래스
   - 제네릭 메서드
   - 제한된 타입 파라미터
   - 와일드카드
   - 타입 소거

8. **[08_FUNCTIONAL.md](08_FUNCTIONAL.md)** - 함수형 프로그래밍 (15개 예제)
   - Lambda 표현식
   - 함수형 인터페이스
   - Predicate
   - Function
   - Consumer
   - Supplier
   - Stream 기초
   - Stream filter
   - Stream map
   - Stream reduce
   - 메서드 참조
   - Lambda로 Comparator
   - Stream collect
   - 병렬 Stream
   - 터미널 연산

---

## 🎯 각 마크다운 파일의 구조

각 마크다운 파일은 다음과 같이 구성되어 있습니다:

### 예제 형식

```
## Example N: 제목

설명 (학습 목표)

### 코드
```java
// 완전한 실행 가능한 자바 코드
```

### 실행 결과
```
실제 프로그램 실행 결과
```

### 학습 포인트
- 핵심 개념 1
- 핵심 개념 2
- 핵심 개념 3
```

---

## 💡 사용 방법

### 1. 순서대로 학습
- `01_BASICS.md`부터 시작
- 기초를 충분히 이해한 후 OOP로 진행
- 각 섹션을 완료한 후 다음 섹션으로 이동

### 2. 코드 실행
각 예제의 코드를 IDE(IntelliJ, Eclipse, VS Code)에 복사하여 실행:

```bash
# 명령줄에서 실행
javac Example01_Variables.java
java Example01_Variables
```

### 3. 실행 결과 확인
- 마크다운에 표시된 "실행 결과" 섹션과 비교
- 같은 결과가 나오는지 확인
- 다른 입력값으로 실습

### 4. 코드 수정해보기
```java
// 원본 코드를 수정하여:
// - 출력 형식 변경
// - 입력값 변경
// - 로직 추가/변경
// 결과 확인
```

---

## 📊 학습 로드맵

```
기초 (15)
    ↓
객체지향 (20)
    ↓
컬렉션 (15) ← 동시에 학습 가능
문자열 (10)
파일I/O (3)
예외처리 (6)
    ↓
제네릭 (5)
함수형 (15)
```

---

## ✅ 체크리스트

각 섹션을 완료하면 체크:

### 기초
- [ ] 변수와 데이터 타입 이해
- [ ] 연산자 마스터
- [ ] 제어문 활용
- [ ] 반복문 활용
- [ ] 배열 다루기
- [ ] 메서드 작성
- [ ] 재귀 이해
- [ ] 타입 변환

### 객체지향
- [ ] 클래스와 객체 개념
- [ ] 상속 이해
- [ ] 인터페이스 구현
- [ ] 다형성 활용
- [ ] 캡슐화 원리

### 중고급
- [ ] 컬렉션 활용
- [ ] 정규표현식 사용
- [ ] 파일 I/O 처리
- [ ] 예외 처리
- [ ] 제네릭 사용
- [ ] Stream API 마스터

---

## 🚀 다음 단계

이 예제들을 마스터한 후:

1. **프로젝트 만들기**
   - 간단한 콘솔 애플리케이션
   - 학생 관리 시스템
   - 은행 계좌 관리

2. **고급 주제 학습**
   - 멀티스레딩
   - 파일 I/O 심화
   - 네트워크 프로그래밍
   - GUI (Swing, JavaFX)

3. **프레임워크**
   - Spring
   - Hibernate
   - JUnit

---

## 📝 학습 팁

1. **이해하면서 학습**: 코드를 읽고 이해한 후 직접 입력
2. **주석 달기**: 각 줄의 의미를 주석으로 설명
3. **변형해보기**: 예제를 수정하여 다른 결과 시도
4. **관련 개념 정리**: 각 예제의 학습 포인트 정리
5. **반복 학습**: 어려운 부분은 여러 번 반복

---

## 📞 질문 및 피드백

- 각 예제는 실제로 실행되는 코드입니다
- 실행 결과는 정확합니다
- 마크다운에 표시된 대로 복사하여 실행 가능

---

**Happy Learning! 행운을 빕니다! 🎉**
