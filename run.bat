set projectLocation=E:\ECLIPSE\Frameworks
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG%projectLocation%\testng.xml