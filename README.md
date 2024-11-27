IP_API
-----

Task:
-----
Кластер серверів точного часу pool.ntp.org надає наступні домени для України:
0.ua.pool.ntp.org 1.ua.pool.ntp.org 2.ua.pool.ntp.org 3.ua.pool.ntp.org 4.ua.pool.ntp.org
Для кожного домена, використовуючи API сервісу https://ip-api.com/, перевірити, що сервер дійсно знаходиться в Україні ("country": "Ukraine").
Посилання на документацію https://ip-api.com/docs/api:json
Регламент:
- завдання повинно бути виконане у вигляді автоматизованих тестів
- мова програмування java або kotlin
- система збірки maven або gradle
- бібліотека для тестування junit або testng
  Додатково як бонус (за можливості):
- інтегрувати будь-який report tool
- багатопоточне виконання тестів
- запакувати в docker контейнер

Result:
------
- Test Location: src/test/java/NtpServerTest
- Allure Report: Located at target/allure-report/index.html
- Thread Configuration: Defined in junit-platform.properties for multi-threaded execution.
  
