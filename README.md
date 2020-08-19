# Examples_of_autotests
### Created some API's tests for "The Star Wars API" (https://swapi.dev).  
To create autotests were used:  
Java, Gradle, TestNG, Rest-assured, Allure.  

For run API's tests:

1. Install the Java environment (https://java.com/en/download/)
2. Clone: https://github.com/SokolovES/Examples_of_autotests.git
3. Go to the project dir and run in the CLI "gradlew clean API_Tests" and "gradlew allureReport".
4. For looking the Test report open in the browser: ..\Examples_of_autotests\build\reports\allure-report\index.html  

OR  

1. Clone: https://github.com/SokolovES/Examples_of_autotests.git
2. Open project in the IDE.
3. Choose ..\Examples_of_autotests\src\test\resources\Test_suites\Test_suit_API_tests.xml, click right button and run it.
4. For looking the Test report open in the browser: ..\Examples_of_autotests\build\reports\tests\index.html  

#### !!! Attention spoiler !!!  
One test is failed because it found a bug:)
