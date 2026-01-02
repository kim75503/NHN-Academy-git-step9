# Step 9: review & intermediate evaluation


---

**학습 목표**:
- Step 2~8 내용 종합 복습
- 코드 리팩토링 실습
- 중간 평가를 통한 이해도 점검

**복습 활동**:
1. Step 2~8까지 전체 코드 재작성 (50분 제한)
2. 코드 리뷰 및 개선점 도출
3. enum 활용 숙달
4. 예외 처리 적용

---

## 중간 평가 과제

**구현 목표**: Step 2~8에서 학습한 내용을 종합하여 TODO 앱 기본 기능을 완성한다.

### 요구사항

**1. 콘솔 입력 처리**
- BufferedReader로 사용자 입력 받기
- String, int, boolean 타입 변환 처리

**2. 메뉴 UI**
- 메뉴 반복 출력 (while 루프)
- switch 또는 if-else로 메뉴 분기 처리
- 0 입력 시 프로그램 종료
- 메뉴: 1.등록, 2.조회, 3.수정, 4.삭제, 0.종료

**3. TODO CRUD**
- Todo 클래스 정의 (title, hours, done 필드)
- ArrayList에 Todo 저장
- 저장된 목록 출력 (for-each)
- ID로 수정/삭제 기능

**4. 클래스 분리**
- Main.java: 메뉴 UI, 사용자 입력
- Todo.java: 데이터 모델
- TodoService.java: 비즈니스 로직 (등록, 조회, 수정, 삭제)

**5. enum 활용**
- Category enum: WORK, STUDY, PERSONAL, HEALTH, OTHER
- Priority enum: LOW, MEDIUM, HIGH
- Todo 클래스에 category, priority 필드 추가

**6. 예외 처리**
- try-catch-finally로 입력 오류 처리
- 적절한 예외 메시지 출력
- 사용자 정의 Exception 정의 (TodoNotFoundException)

**7. 입력값 검증**
- 빈 문자열 입력 시 재입력 요청
- 숫자 범위 검증 (예상 시간 0 이상)
- enum 선택 범위 검증

**8. 중복 검증**
- 동일 제목의 일정 등록 시 오류 메시지 출력
- 중복 여부 확인 후 등록 진행

**9. 다단계 메뉴 (추가 기능)**
- 조회 메뉴 선택 시 하위 메뉴 출력
  - 1.전체 조회, 2.구분별 조회, 3.중요도별 조회, 0.이전

### 실행 예시

```
=== TODO 앱 ===
1. 등록
2. 조회
3. 수정
4. 삭제
0. 종료
선택 > 1

=== TODO 등록 ===
제목 > Java 공부하기
예상 시간 > 2
구분 (1:WORK, 2:STUDY, 3:PERSONAL, 4:HEALTH, 5:OTHER) > 2
중요도 (1:LOW, 2:MEDIUM, 3:HIGH) > 3
등록 완료!

=== TODO 앱 ===
1. 등록
2. 조회
3. 수정
4. 삭제
0. 종료
선택 > 1

=== TODO 등록 ===
제목 > Java 공부하기
동일한 제목의 일정이 이미 존재합니다.

=== TODO 앱 ===
1. 등록
2. 조회
3. 수정
4. 삭제
0. 종료
선택 > 2

=== 조회 메뉴 ===
1. 전체 조회
2. 구분별 조회
3. 중요도별 조회
0. 이전
선택 > 1

=== TODO 목록 ===
[1] Java 공부하기 | 2시간 | STUDY | HIGH | [ ]

=== TODO 앱 ===
1. 등록
2. 조회
3. 수정
4. 삭제
0. 종료
선택 > 3

수정할 TODO ID > 1
새 제목 > Java 심화 학습
새 예상 시간 > 3
수정 완료!

=== TODO 앱 ===
1. 등록
2. 조회
3. 수정
4. 삭제
0. 종료
선택 > 4

삭제할 TODO ID > 1
삭제 완료!

=== TODO 앱 ===
1. 등록
2. 조회
3. 수정
4. 삭제
0. 종료
선택 > 0
프로그램을 종료합니다.
```

### 확인 항목 (산출물 체크리스트)

- [ ] BufferedReader로 모든 타입 입력 처리
- [ ] 메뉴 반복 출력 및 종료 정상 동작
- [ ] switch/if로 메뉴 분기 처리
- [ ] Todo 클래스 정의 및 오브젝트 생성
- [ ] ArrayList에 등록/조회/수정/삭제 동작
- [ ] Main/Todo/TodoService 클래스 분리
- [ ] Category, Priority enum 구현 및 활용
- [ ] try-catch로 예외 처리
- [ ] 사용자 정의 Exception 정의 및 활용
- [ ] 빈 문자열, 숫자 범위 입력 검증
- [ ] 중복 제목 검증
- [ ] 다단계 메뉴 (조회 하위 메뉴)

### 프로젝트 구조

```
src/main/java/com/nhn/academy/todo/
├── Main.java           # 메뉴 UI, 사용자 입력
├── model/
│   ├── Todo.java       # 데이터 모델
│   ├── Category.java   # enum
│   └── Priority.java   # enum
├── service/
│   └── TodoService.java # 비즈니스 로직
└── exception/
    └── TodoNotFoundException.java  # 사용자 정의 예외
```

---

## 평가 기준

### 루브릭 (70점 만점)

| 평가 영역 | 항목 | 배점 | 우수 (100%) | 양호 (70%) | 미흡 (40%) |
|-----------|------|------|-------------|------------|------------|
| **기본 기능** | BufferedReader 입력 | 5점 | 모든 타입 정상 처리 | 일부 누락 | 동작 안 함 |
| | 메뉴 반복 | 5점 | 정상 동작 + 종료 | 부분 동작 | 미구현 |
| | CRUD 기능 | 10점 | 등록/조회/수정/삭제 모두 정상 | 등록/조회만 동작 | 미구현 |
| **데이터 모델** | enum 활용 | 7점 | Category, Priority 완전 구현 | 하나만 구현 | 미사용 |
| **코드 구조** | 클래스 분리 | 8점 | Main/Service/Model 명확 | 2개 분리 | 단일 클래스 |
| | 메서드 설계 | 5점 | 단일 책임, 재사용 가능 | 일부 중복 | 거대 메서드 |
| **입력 처리** | 타입 변환 | 6점 | int, boolean 정상 | 일부 누락 | String만 처리 |
| | 입력값 검증 | 6점 | 빈 문자열, 숫자 범위, enum 범위 모두 검증 | 일부 검증 | 검증 없음 |
| | 중복 검증 | 4점 | 제목 중복 시 오류 처리 | 부분 동작 | 미구현 |
| **예외 처리** | try-catch-finally | 6점 | 모든 입력에 예외 처리 | 부분 처리 | 예외 처리 없음 |
| | 사용자 정의 Exception | 4점 | 정의 및 활용 | 정의만 함 | 미구현 |
| **추가 기능** | 다단계 메뉴 | 4점 | 조회 하위 메뉴 완전 구현 | 부분 동작 | 미구현 |

### 등급 기준

- **A (63점 이상)**: 모든 기능 완벽 구현, 코드 품질 우수
- **B (56~62점)**: 핵심 기능 완성, 일부 미흡
- **C (49~55점)**: 기본 CRUD 동작
- **D (42~48점)**: 기본 기능 부분 동작
- **F (42점 미만)**: 핵심 기능 미완성

---

## 복습 체크리스트

### Step 2: 콘솔 입력
- [ ] BufferedReader, InputStreamReader 생성
- [ ] readLine()으로 문자열 입력
- [ ] Integer.parseInt()로 숫자 변환
- [ ] while(true) 무한 루프
- [ ] 종료 조건 break

### Step 3: 메뉴 UI
- [ ] 메뉴 출력 메서드
- [ ] switch-case 분기
- [ ] 잘못된 입력 처리

### Step 4: 등록/조회
- [ ] Todo 클래스 필드, 생성자
- [ ] ArrayList<Todo> 선언
- [ ] add(), size(), get() 사용
- [ ] for-each 순회

### Step 5: 클래스 분리
- [ ] model 패키지 생성
- [ ] service 패키지 생성
- [ ] TodoService 클래스 구현
- [ ] Main에서 Service 호출

### Step 7: enum
- [ ] Category enum 정의
- [ ] Priority enum 정의
- [ ] enum에 필드, 생성자, 메서드
- [ ] values(), valueOf() 사용
- [ ] 숫자 입력을 enum으로 변환

### Step 8: 예외 처리
- [ ] try-catch 구문 사용
- [ ] 적절한 예외 메시지 출력
- [ ] 사용자 정의 Exception 활용

---

## 자주 하는 실수

### 1. BufferedReader 닫지 않음
```java
// ❌ 잘못된 코드
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// reader.close() 호출 없음

// ✅ 올바른 코드 (try-with-resources)
try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
    // 사용
} // 자동으로 닫힘
```

### 2. parseInt 예외 처리 없음
```java
// ❌ 잘못된 코드
int num = Integer.parseInt(reader.readLine());  // "abc" 입력 시 예외

// ✅ 올바른 코드
try {
    int num = Integer.parseInt(reader.readLine());
} catch (NumberFormatException e) {
    System.out.println("숫자를 입력해주세요.");
}
```

### 3. enum 비교 시 equals 사용
```java
// ❌ 불필요 (작동은 함)
if (category.equals(Category.WORK)) { }

// ✅ enum은 == 비교 권장
if (category == Category.WORK) { }
```

### 4. static 변수 초기화 위치
```java
// ❌ 잘못된 코드 (인스턴스 생성마다 초기화됨)
public class Todo {
    private static int idCounter;
    public Todo() {
        idCounter = 1;  // 매번 1로 리셋
    }
}

// ✅ 올바른 코드 (클래스 로드 시 한 번만 초기화)
public class Todo {
    private static int idCounter = 1;
    public Todo() {
        this.id = idCounter++;
    }
}
```

---

[← 이전: Step 8](step_08.md) | [목차](00.overview.md) | [다음: Step 10 →](step_10.md)