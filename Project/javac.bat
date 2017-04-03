set basedir="C:\Program Files (x86)\Java\jdk1.8.0_121"

set cp=%basedir%lib\rt.jar

%basedir%\bin\javac.exe -classpath %cp%;.;C:\Users\James\Desktop\Project\antlr-4.6-complete.jar %1 %2 %3 %4