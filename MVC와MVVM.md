1) MVC



● 구조

  Model : 어플리케이션에서 사용되는 데이터와 그 데이터를 처리하는 부분

  View : 사용자에게서 보여지는 UI 부분

  Controller : 사용자의 입력(Action)을 받고 처리하는 부분



● 동작

  \1. 사용자의 Action들은 Controller에 들어오게 된다.

  \2. Controller는 사용자의 Action을 확인하고 Model을 업데이트한다.

  \3. Controller는 Model을 나타내 줄 View를 선택한다.

  \4. View는 Model을 이용하여 화면을 나타낸다.

  \5. View가 Model을 이용하여 직접 업데이트 하는 방법

  \6. Model에서 View에게 Notify 하여 업데이트 하는 방법

  \7. View가 Polling으로 주기적으로 Model의 변경을 감지하여 업데이트 하는 방법



● 특징

  Controller는 여러개의 View를 선택할 수 있는 1:N 구조이다.

  Controller는 View를 선택할 뿐 직접 업데이트 하지 않는다. (View는 Controller를 알지 못한다.)



● 장점

  널리 사용되고 있는 패턴, 가장 단순하여 보편적으로 많이 사용된다.



● 단점

  View와 Model 사이의 의존성이 높다. 어플리케이션이 커질 수록 복잡해지고 유지보수가 어렵다.





2) MVVM



● 구조

  Model : 어플리케이션에서 사용되는 데이터와 그 데이터를 처리하는 부분

  View : 사용자에게서 보여지는 UI 부분

  View Model : View를 표현하기 위해 만든 Model. View를 나타내주고 나타내기 위한 데이터 처리를 하는 부분



● 동작

  \1. 사용자의 Action들은 View를 통해 들어온다.

  \2. View에 Action이 들어오면, Command 패턴으로 View Model에 Action을 전달한다.

  \3. View Model은 Model에게 데이터를 요청한다.

  \4. Model은 View Model에게 요청받은 데이터를 응답한다.

  \5. View Model은 응답 받은 데이터를 가공하여 저장한다.

  \6. View는 View Model과 Data Binding하여 화면을 나타낸다.



● 특징

  MVVM 패턴은 Command 패턴과 Data Binding 두 가지 패턴을 사용하여 구현된다.

  Command 패턴과 Data Binding을 이용하여 View와 View Model 사이의 의존성을 없앴다.

  View Model과 View는 1:N 관계이다.



● 장점

  View와 Model 사이의 의존성이 없다. Command-DataBinding으로 View와 View Model 사이의 의존성 또한 없다. 각각의 부분이 독립적이기 때문에 모듈화 하여 개발할 수 있다.



● 단점

  View Model의 설계가 쉽지 않다.