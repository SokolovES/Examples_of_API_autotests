# Examples_of_autotests
### Created some API's tests for "The Star Wars API" (https://swapi.dev).  
To create autotests were used:  
Java, Gradle, TestNG, Rest-assured, Allure.  
Some tests use data-provider and all suites execute in parallel mode.   

For positive scenario API's tests acceptance requirements:
- status code: 200 ;
- response data (type data): JSON ;
- accordance with JSON schema;

For negative scenario API's tests acceptance requirements:  
- status code: 404 ;
- response data (type data): JSON ;
- body equals to {"detail":"Not found"}. 

For run API's tests:

1. Open http://jenkins.servehttp.com:8181/ (temporary isn't working)
2. Run a job "Star_Wars_API_tests".
3. For looking at the test report click to Allure Report.

OR

1. Install the Java environment (https://java.com/en/download/)
2. Clone: https://github.com/SokolovES/Examples_of_API_autotests.git
3. Go to the project dir and run in the CLI "gradlew clean API_Tests" and "gradlew allureReport".
4. For looking at the test report open in the browser: ..\Examples_of_autotests\build\reports\allure-report\index.html  

OR  

1. Clone: https://github.com/SokolovES/Examples_of_API_autotests.git
2. Open project in the IDE.
3. Choose ..\Examples_of_autotests\src\test\resources\Test_suites\Test_suit_API_tests.xml, click right button and run it.
4. For looking at the Test report open in the browser: ..\Examples_of_autotests\build\reports\tests\index.html

#### !!! Attention spoiler !!!  
One test will be a failure because it found a bug:)
