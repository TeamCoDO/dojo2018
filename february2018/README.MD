#Copyright
  * @author Max Crone
  * @since 15-9-2016.
  * @source https://gist.github.com/Vogeltak
 
# Aufgabe Tresor Code

Ein Tresor ist mit einem 4-Stelligen Code geschützt. Der Code ist  per Zufallszahl Generator  erzeugt. Der User soll den Code stellenweise erraten.   Nach jedem Versuch soll der User darüber informiert werden, der wievielte Versuch es war, ob er richtig oder falsch liegt, und wenn er falsch liegt ob die gesuchte Zahl grösser oder kleiner als die vom User eingegebene ist. Erratene Zahlen werden gespeichert und ausgegeben.  Falls an einer Stelle die Zahl nicht erraten wurde, dann muss ein X ausgegeben werden. Man hat 3 Versuche pro Zahl. User wird per Logging in der Console informiert. Logging Nachrichten werden farblich in gestaltet.

Beispiel:

(gelb) Ausgabe                                __         __          __          __

(rot ) Eingabe                   5             Ausgabe „Zahl  ist grösser.  Anzahl der Versuche:  2„ 

(rot) Eingabe                    7            Ausgabe „Zahl  ist kleiner  Anzahl der Versuche:  1 „

(grün) Eingabe                 6            Ausgabe „Zahl  ist richtig.“

(gelb) Ausgabe                                 _6_        __          __          __

(rot) Eingabe                     2              Ausgabe „Zahl  ist grösser.  Anzahl der Versuche:  2„ 

(rot) Eingabe                     9              Ausgabe „Zahl  ist kleiner.  Anzahl der Versuche:  1„ 

(rot) Eingabe                     3             Ausgabe „Zahl  ist grösser.  Anzahl der Versuche:  0„ 

(gelb) Ausgabe                                 _6_        _X_        __          __

usw…

# Abnahmekriterien

Input/Output funktioniert

Messages sind in der Console per Logger ausgegeben

Logging Messages sind farblich in der Console dargestellt

Code muss ausreichend kommentiert und  Anzahl der Tests wird bewertet

# Projektumgebung

Log4J2: Apache Log4j 2 is an upgrade to Log4j that provides significant improvements over its predecessor, Log4j 1.x, and provides many of the improvements available in Logback while fixing some inherent problems in Logback’s architecture.

log4j-core-2.10.0.jar

log4j-api-2.10.0.jar

 
JANSI: This Eclipse plugin interprets the ANSI escape sequences to color the console output. jansi-1.16.jar

ANSI Escape in Console: This Eclipse plugin interprets the ANSI escape sequences to color the console output.

To install the plugin in Eclipse select Help -> Install New Software… and click “Add…” to add the following URL:
http://www.mihai-nita.net/eclipse
