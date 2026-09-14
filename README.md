## ACTIVIDAD 1 - ENTORNO DE TRABAJO
    -Java: 21
    -Javac: 21
    -Git: 2.55.0.windows.5
    -Sistema Operativo: Windows 10 Pro
    -Editor utilizado: Visual Code Studio
## PREGUNTAS TEÓRICAS
    1.**¿Qué función cumple main?**
    Cumple la función de ser el punto de entrada de la aplicación. Es el primer método que la Máquina Virtual de Java (JVM) busca y ejecuta automáticamente al iniciar el programa.
    2.**¿Qué diferencia existe entre javac y java?*
    javac: Es el compilador de Java. Se encarga de traducir el código fuente legible por humanos (.java) a un lenguaje intermedio llamado bytecode (.class).java: Es el ejecutor (intérprete). Toma el archivo de bytecode generado y lo corre dentro de la Máquina Virtual de Java.
    3.**¿Qué archivo se genera después de compilar?**
    Se genera un archivo con la extensión .class (en este caso, Main.class), el cual contiene el bytecode que entiende la JVM.
    4.**¿Por qué el archivo se llama Main.java?**
    Porque en Java existe una regla estricta: el nombre del archivo debe coincidir exactamente con el nombre de la clase pública que contiene (public class Main), respetando también las mayúsculas y minúsculas.
    5.**¿Qué ocurre si la clase se llama Programa pero el archivo se llama Main.java?**
    El programa no va a compilar. El comando javac arrojará un error indicando que la clase es pública y debe ser declarada en un archivo llamado Programa.java.