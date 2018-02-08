
#Aufgabe: Passwortgenerator

Damit man sich Passwörter gut merken kann, ohne das diese sich leicht erraten lassen, kann man Passwörter aus Merksätzen bilden. Wir wollen nach folgenden Regeln Passwörter aus Sätzen bilden:
Das Passwort wird als Folge der ersten Zeichen eines jeden Wortes im Satz gebildet.

    Wörter des Satzes sollen alle durch beliebig viele Leerzeichen abgetrennten Teilfolgen sein.
    Werden Satzzeichen direkt hinter ein Wort geschrieben, so gehören diese zu dem Wort.
    Das Passwort soll durch eine Zahl abgeschlossen werden, die sich aus der Anzahl der Einzelwörter des Satzes ergibt.

Beispiel: "Wenn es regnet, dann wird es nass ." besteht aus den Teilwörtern "Wenn" "es" "regnet," "dann"
"wird" "es" "nass" "." und das dazugehörige Passwort ist "Werdwen.8" Implementieren Sie nun eine Methode pwdgen, die zu einem Satz (String) ein Passwort nach obigen Regeln zurückgibt (String).
Testen Sie ihr Programm mit den folgenden Eingaben:

    “Mein Fahrrad fährt Tango.” (ergibt MFfT4)
    “Ein Passwort ist nur so gut , wie sein geheimer Platz .” (ergibt EPinsg,wsgP.12)
    “Selber programmieren ist überraschend !” (Spiü!5)

#Abnahmekriterien

    Coding Dojo Ziel ist JUnit --> Anzahl der JUnit Tests
    Ein Testsatz wird am Ende bereitgestellt und generiertes Passwort muss mit dem erwarteten übereinstimmen
    Source Code muss dokumentiert werden --> Umfang von Inline Comments

