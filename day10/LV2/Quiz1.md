## 📚 Day 10 
### 🚀 Level 2 

#### 🤔 문제 설명

- 입력 문자열이 제공됩니다.
문자열의 각 기호가 첫 번째 문자 인 경우 `'1'`로 바꾸고, 그렇지 않으면 이미 본 횟수로 바꾸십시오.
- 코드의 성능에 유의해서 작성하세요.

Examples:
```javascript
input   =  "Hello, World!"
result  =  "1112111121311"

input   =  "aaaaaaaaaaaa"
result  =  "123456789101112"
```
- 문자열에 ASCII가 아닌 문자가 있을 수 있습니다.

📌 Note: `int` 도메인 오버플로가 발생하지 않습니다 (문자 발생 수가 20 억 개 미만).


#### 🎯 TestCase

```javascript
"11121111213112111131224132411122", "Hello, World! It's me, JomoPipi!"
"11121122342", "hello hello"
```