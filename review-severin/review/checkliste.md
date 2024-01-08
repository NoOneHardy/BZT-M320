# Codereview

## Übersicht

| Checklist Item                                    | Erklärung                                                                                | Status |
|---------------------------------------------------|------------------------------------------------------------------------------------------|--------|
| Use Intention-Revealing Names                     | Namen (Klassen, Funktionen, Variablen) sollen den Verwendungszweck abbilden              | Ok     |
| Use Solution/Problem Domain Names                 | Namen (Klassen, Funktionen, Variablen) sollen der Aufgabenstellung gemäss genutzt werden | Ok     |
| Klassen gross                                     | Klassen sind gross geschrieben                                                           | Ok     |
| Functions should be small!                        | Methoden sind klein geschrieben                                                          | Ok     |
| Do one Thing                                      | Eine Methode soll genau eine Aufgabe erfüllen                                            | Ok     |
| Don't Repeat Yourself (Avoid Duplication)         | Keine Repetition im Source-Code                                                          | Ok     |
| Explain yourself in code                          | Kommentar im Source-Code!                                                                | Ok     |
| Make sure the code formatting is applied          | Code soll formatiert sein                                                                | Ok     |
| Don't return Null                                 | Achten Sie darauf, dass nie/wenn möglich `null` zurückgegeben wird                       | Ok     |
| Avoid duplication of code                         | Kein duplizierter Code                                                                   | Ok     |
| Minimize the accessibility of classes and members | Zugriffsmodifizierer sind angewendet                                                     | Ok     |

## Konventionen

### Use Intention-Revealing Names

Namen (Klassen, Funktionen, Variablen) sollen den Verwendungszweck abbilden

| Filename        | Kommentar                                  | Status |
|-----------------|--------------------------------------------|--------|
| Aufgabe.java    | -                                          | Ok     |
| Benutzer.java   | enterPassword() kann missverstanden werden | Ok     |
| Bild.java       | -                                          | Ok     |
| Main.java       | -                                          | Ok     |
| SharedList.java | -                                          | Ok     |


### Use Solution/Problem Domain Names

Namen (Klassen, Funktionen, Variablen) sollen der Aufgabenstellung gemäss genutzt werden

| Filename        | Kommentar                                                          | Status               |
|-----------------|--------------------------------------------------------------------|----------------------|
| Aufgabe.java    | -                                                                  | Ok                   |
| Benutzer.java   | -                                                                  | Ok                   |
| Bild.java       | -                                                                  | Ok                   |
| Main.java       | Get-Methoden werden aufgerufen, aber der Returnwert wird ignoriert | Verbesserung möglich |
| SharedList.java | -                                                                  | Ok                   |

### Klassen gross

Klassen sind gross geschrieben

| Filename        | Kommentar | Status |
|-----------------|-----------|--------|
| Aufgabe.java    | -         | Ok     |
| Benutzer.java   | -         | Ok     |
| Bild.java       | -         | Ok     |
| Main.java       | -         | Ok     |
| SharedList.java | -         | Ok     |

### Functions should be small!

Methoden sind klein geschrieben

| Filename        | Kommentar | Status |
|-----------------|-----------|--------|
| Aufgabe.java    | -         | Ok     |
| Benutzer.java   | -         | Ok     |
| Bild.java       | -         | Ok     |
| Main.java       | -         | Ok     |
| SharedList.java | -         | Ok     |

### Do one Thing

Eine Methode soll genau eine Aufgabe erfüllen

| Filename        | Kommentar | Status |
|-----------------|-----------|--------|
| Aufgabe.java    | -         | Ok     |
| Benutzer.java   | -         | Ok     |
| Bild.java       | -         | Ok     |
| Main.java       | -         | Ok     |
| SharedList.java | -         | Ok     |

### Don't Repeat Yourself (Avoid Duplication)

Keine Repetition im Source-Code

| Filename        | Kommentar                                                     | Status |
|-----------------|---------------------------------------------------------------|--------|
| Aufgabe.java    | Konstruktoren hätten mit ```this()``` überladen werden können | Ok     |
| Benutzer.java   | -                                                             | Ok     |
| Bild.java       | Konstruktoren hätten mit ```this()``` überladen werden können | Ok     |
| Main.java       | -                                                             | Ok     |
| SharedList.java | Konstruktoren hätten mit ```this()``` überladen werden können | Ok     |

### Explain yourself in code

Kommentar im Source-Code!

| Filename        | Kommentar                            | Status |
|-----------------|--------------------------------------|--------|
| Aufgabe.java    | Kommentare sind im JavaDoc vorhanden | Ok     |
| Benutzer.java   | Kommentare sind im JavaDoc vorhanden | Ok     |
| Bild.java       | Kommentare sind im JavaDoc vorhanden | Ok     |
| Main.java       | -                                    | Ok     |
| SharedList.java | Kommentare sind im JavaDoc vorhanden | Ok     |

### Make sure the code formatting is applied

Code soll formatiert sein

| Filename        | Kommentar                                              | Status |
|-----------------|--------------------------------------------------------|--------|
| Aufgabe.java    | -                                                      | Ok     |
| Benutzer.java   | -                                                      | Ok     |
| Bild.java       | -                                                      | Ok     |
| Main.java       | Kleine Verbesserung möglich bei Multi-line-Kommentaren | Ok     |
| SharedList.java | -                                                      | Ok     |

### Don't return Null

Achten Sie darauf, dass nie/wenn möglich `null` zurückgegeben wird

| Filename        | Kommentar | Status |
|-----------------|-----------|--------|
| Aufgabe.java    | -         | Ok     |
| Benutzer.java   | -         | Ok     |
| Bild.java       | -         | Ok     |
| Main.java       | -         | Ok     |
| SharedList.java | -         | Ok     |

### Minimize the accessibility of classes and members

Zugriffsmodifizierer sind angewendet

| Filename        | Kommentar                          | Status |
|-----------------|------------------------------------|--------|
| Aufgabe.java    | Inklusive Datenkapselung vorhanden | Ok     |
| Benutzer.java   | Inklusive Datenkapselung vorhanden | Ok     |
| Bild.java       | Inklusive Datenkapselung vorhanden | Ok     |
| Main.java       | -                                  | Ok     |
| SharedList.java | Inklusive Datenkapselung vorhanden | Ok     |

## Rückblick

### Wie habe ich mich beim Codereview gefühlt?

Gut, Severin war sehr freundlich und respektvoll.  
Ich habe sehr gut formuliertes konstruktives Feedback erhalten.

### Was habe ich gelernt (im Vorgehen)?

* Man sollte Richtlinien/Konventionen erstellen um eine Struktur zu behalten
* Für ein Codereview sollten im voraus "Lernziele" besprochen werden

### Was habe ich gelernt (technisch)?

Ich sollte mehr Inline-Kommentare schreiben.