# Turmrechnung

Ein einfaches Konsolenprogramm, das eine Startzahl einliest, eine mathematische Turmrechnung (Multiplikation von 2 bis 9 und anschließende Division von 2 bis 9) durchführt und das Ergebnis formatiert ausgibt. Das Programm enthält eine Wiederholungsfunktion.

## 📋 Projektinformationen

| Feld | Inhalt |
| :--- | :--- |
| **Projektname** | Turmrechnung |
| **Klasse / Kurs** | 1a APC |
| **Schuljahr** | 2026 |
| **Abgabedatum** | 12.05.2026 |
| **Autor/in** | Betül Celik |
| **Lehrer/in** | Gerhard Jarz |
| **Fach** | Programmieren / Java |

## 📝 Projektbeschreibung

**Ziel der Anwendung:** Das Programm dient zur praktischen Anwendung und Demonstration von Kontrollstrukturen in Java – insbesondere der Kombination aus fußgesteuerten Schleifen (`do-while`) zur Programmwiederholung und Zählschleifen (`for`) zur Berechnung.

**Hauptfunktionen:**
* **Einlesen der Startzahl:** Der Benutzer gibt eine beliebige Zahl über die Konsole ein. Da die Zahlen bei der Multiplikation sehr groß werden, wird intern der Datentyp `long` verwendet.
* **Multiplikations-Turm:** Eine `for`-Schleife multipliziert das jeweilige Zwischenergebnis nacheinander mit den Zahlen von 2 bis 9.
* **Divisions-Turm:** Eine zweite `for`-Schleife dividiert das Zwischenergebnis anschließend wieder rückwärts nacheinander durch die Zahlen von 2 bis 9.
* **Formatierte Ausgabe:** Die Rechnungen werden mittels `System.out.printf` sauber rechtsbündig untereinander formatiert ausgegeben, sodass optisch die typische "Turmform" entsteht.
* **Wiederholbarkeit:** Das gesamte Programm ist in eine fußgesteuerte `do-while`-Schleife eingebettet. Nach jedem Durchlauf wird der Anwender gefragt, ob er ein weiteres Mal rechnen möchte (Eingabe von j/n).

## 📸 Bildschirmfoto

![Bildschirmfoto der Turmrechnung](bildschirmfoto.png)

## 🛠️ Entwicklungsumgebung

### Verwendete Programme & Werkzeuge

| Programm / Werkzeug | Version | Zweck |
| :--- | :--- | :--- |
| IntelliJ IDEA | Neueste Version | Entwicklungsumgebung (IDE) |
| Java Development Kit (JDK) | 17 / 21 | Kompilieren und Ausführen des Java-Quellcodes |

### Zusatzpakete & Bibliotheken

| Paket / Bibliothek | Version | Zweck |
| :--- | :--- | :--- |
| `java.util.Scanner` | Standard | Einlesen der Startzahl und der j/n-Antwort über die Konsole |

### Betriebssystem (Entwicklung)
* **Betriebssystem:** Windows

## 🚀 Installation & Ausführung

### Voraussetzungen
* [x] Java JDK ist installiert und im Systempfad (PATH) hinterlegt.
* [x] Eine Kommandozeile (Terminal) oder eine IDE (wie IntelliJ IDEA) ist vorhanden.

### Schritte über die Konsole

```bash
# 1. In den Projektordner wechseln, in dem sich die Main.java befindet
cd [Pfad-zum-Ordner]

# 2. Den Quellcode kompilieren
javac Main.java

# 3. Das Hauptprogramm starten
java Main
