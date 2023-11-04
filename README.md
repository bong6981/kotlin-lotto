# kotlin-lotto

## step1

### 프로그래밍 요구 사항
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
- 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.

### 기능목록
- [ ] 문자열 계산기는 문자열을 입력 받는다
- [x] 기준 구분자로 문자열을 분리한다
  - [x] 쉼표(,) 로 숫자를 구분한다 
  - [x] 콜론(:)으로 숫자를 구분한다
  - [x] 커스텀 구분자를 지정할 수 있다 
    - [x] 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자다 
- [ ] 분리된 문자열 리스트를 정수 리스트로 변환한다 
- [x] 숫자 이외의 값이 들어오는 경우 RuntimeException 을 내뱉는다
- [x] 음수가 들어오는 경우 RuntimeException 을 내뱉는다
- [ ] 숫자의 합을 구해 반환한다
  - [ ] 빈 문자열 또는 null이 들어온 경우 0을 반환해야 한다
  - [ ] 숫자 하나가 들어온 경우 해당 숫자를 반환한다
