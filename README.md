# localhost:3000에서 CORS 이슈를 확인할 수 있는 리포지토리

## 절차
1. 이 프로젝트를 clone 받는다.
2. Intellij로 열어서 실행한다.
   * application.properties 에 default port가 3000으로 설정되어 있다. (React default port와 동일)
3. 다른 Spring Boot 프로젝트를 마찬가지로 Intellij로 실행한다.
4. Spring Boot 프로젝트에서 아래와 같이 Controller를 하나 만든다.
```java
@GetMapping("/hello")
public String hello() {
    System.out.println("hello 요청 들어옴");
    return "localhost:3000 에서 요청이 잘 들어 왔습니다.";
}

```
5. http://localhost:3000/loc/hello 를 주소창에 입력한다.
6. 이후 크롬이나 사파리의 Console 창에서 결과를 확인한다. 