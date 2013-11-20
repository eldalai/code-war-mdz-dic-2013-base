code-war-mdz-dic-2013-base
==========================

este es el proyecto base java para poder participar del codewar mendoza diciembre 2013

1) Instalar Dependencias:
***Java 7
http://www.oracle.com/technetwork/java/javase/downloads/index.html

setear JAVA_HOME

***Maven 3.0.5
http://maven.apache.org/download.cgi
apache-maven-3.0.5

setear en el PATH C:\dev\apache-maven-3.0.5\bin

***Git/SVN

***IDE
Si no posee un IDE de desarrollo, puede descargar eclipse


2) descargar proyecto base
via git:
git clone https://github.com/eldalai/code-war-mdz-dic-2013-base.git

via zip: 
https://github.com/eldalai/code-war-mdz-dic-2013-base/archive/master.zip


3) configurar proyecto en IDE

Para configurar eclipse correr por linea de commando en la carpeta donde haya descargado el proyecto
mvn eclipse:clean eclipse:eclipse

En el eclipse, importar el maven project

4) Correr test
desde linea de commando:

<pre>
<code>
mvn test

C:\dev\workspaces\code-war-dic-2013\code-war-mdz-dic-2013-base>mvn test
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building codewar 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ mdz2013-base ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\dev\workspaces\code-war-dic-2013\code-war-mdz-dic-2013-base\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ mdz2013-base ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ mdz2013-base ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\dev\workspaces\code-war-dic-2013\code-war-mdz-dic-2013-base\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:2.3.2:testCompile (default-testCompile) @ mdz2013-base ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ mdz2013-base ---
[INFO] Surefire report directory: C:\dev\workspaces\code-war-dic-2013\code-war-mdz-dic-2013-base\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.globallogic.codewar.CodeWarTest
Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.019 sec <<< FAILURE!

Results :

Failed tests:   testDiamondsAreForever(com.globallogic.codewar.CodeWarTest): el diamante a x 5 no es como debiera expected:<    a

Tests run: 1, Failures: 1, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.805s
[INFO] Finished at: Wed Nov 20 12:33:00 ART 2013
[INFO] Final Memory: 7M/148M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.10:test (default-test) on project mdz2013-base: There are test failures.
[ERROR]
[ERROR] Please refer to C:\dev\workspaces\code-war-dic-2013\code-war-mdz-dic-2013-base\target\surefire-reports for the individual test results.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
</code>
</pre>
desde eclipse:

Sobre el proyecto, "Run as"-> "JUnit Test"

LOS TEST FALLARAN

5) resolver el problema:
desarrollar la logica necesaria en 
code-war-mdz-dic-2013-base\src\main\java\com\globallogic\codewar\Diamonds.java

correr los test hasta que pasen!

6) versionar 

Crear un repositorio SVN o GIT publico ( https://code.google.com/  o https://github.com/ )

Enviar por mail la dirección del repositorio a fin de aprobar la admisión

Este repositorio será utilizado durante el code war para resolver los ejercicios!



 