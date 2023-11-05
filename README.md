# kotlin-lotto

## step1

### 프로그래밍 요구 사항
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
- 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.

### 기능목록
- [x] 문자열 계산기는 문자열을 입력 받는다
- [x] 빈 문자열 또는 null이 들어온 경우 0을 반환해야 한다
- [x] 기준 구분자로 문자열을 분리한다
  - [x] 쉼표(,) 로 숫자를 구분한다 
  - [x] 콜론(:)으로 숫자를 구분한다
  - [x] 커스텀 구분자를 지정할 수 있다 
    - [x] 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자다 
- [x] 숫자 이외의 값이 들어오는 경우 RuntimeException 을 내뱉는다
- [x] 음수가 들어오는 경우 RuntimeException 을 내뱉는다
- [x] 숫자의 합을 구해 반환한다
  - [x] 숫자 하나가 들어온 경우 해당 숫자를 반환한다


## step2

### 프로그래밍 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

### 기능 목록
- [x] 구입 금액을 입력 받는다
- [x] 구입 금액을 검증한다 
  - [x] 구입 금액은 0보다 커야 한다 
  - [x] 구입 금액은 로또 1장의 가격의 배수여야 한다
- [x] 구입 금액을 수익으로 저장한다
- [x] 구입 금액에 맞는 로또를 생성한다
  - [x] 로또 한 장당 숫자 6개를 가진다 
  - [x] 숫자는 1-45 의 숫자 중 랜덤한 번호로 부여된다 
  - [x] 로또 한 장 안에 숫자는 중복되지 않는다 
- [ ] 구입한 로또 번호를 출력한다 
  - [ ] 안에 숫자를 , 로 구분하여 출력한다 (예) [8, 21, 23, 41, 42, 43]
- [ ] 지난 주 당첨 번호를 입력 받는다 
  - [ ] 당첨번호는 ", " (쉼표 + 스페이스) 를 구분자로 입력 받는다 
- [ ] 당첨 번호를 검증한다
  - [ ] 당첨번호가 6개를 넘어가면 에러를 발생시킨다 
  - [ ] 당첨번호가 1-45 숫자 범위에 포함되지 않으면 에러를 발생시킨다 
- [ ] 수익률을 계산한다 
  - [ ] 맞춘 갯수 별 장수를 구한다 
  - [ ] 상금을 구한다 
    - 3개 : 5000원 / 4개 : 50000원 / 5개 : 1500000원 / 6개 : 2000000000원
  - [ ] 로또수익금 / 상금 으로 수익률을 계산한다
    - 소수점 셋째 자리에서 반올림한다 
- [ ] 수익률 결과를 출력한다
