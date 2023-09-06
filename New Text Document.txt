set ProjectLocetation=D:\ECLIPSE\Frameworks
cd %projectLocation%
Set Classpath=&ProjectLocation%\bin;
%ProjectLocation%\lib\*
java org.testng.TestNG%ProjectLocation%\testng.xml
