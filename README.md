# happyPaw

In this folder, I gathered few files to show examples of Web-UI tests.

- Test are written in Java language with the help of Selenium WebDriver libraries and TestNG dependencies

I use page object model to separate elements from tests, for example:

- file PageLanguages.java contains all elements that are needed for tests in TestVerifyLanguageSwitcher.java, but 
- elements for TestVerifySocialButtons.java tests are described inside the test file because the test is simple and small - no need to put the elements finding code into the separate file. 

- the file TestStart.java created to initiate the web driver and open the home page and then applied to all other tests as a Precondition

- file HomePageTestSuite.xml is a suite, that contains a sequence of test to perform for Home Page, and it must be run as TestNG suite, then all dependencies of TestNg will be kept inside the running tests. 
- after the test run I see all needed information in the console and also it could be gathered by TestNg (or any side) report tools into a separate file. 

- After creating few suites, they can be gathered into Maven .xml file and be run by Jenkins or manually thru console. 
