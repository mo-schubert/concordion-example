# Rabatt Spezifikation

## Regeln:

### Allgemeine Regeln:
- Fuer jeden Kurs kann ein individueller Preis festgelegt werden.
- Early Bird und Gruppenrabatte koennen kombiniert werden

### Early Bird Regeln:
- Bei Buchungen 3 Monate im Voraus gibt es einen Rabatt von 20% auf den Preis des Kurses
- Bei Buchungen 2 Monate im Voraus gibt es einen Rabatt von 10% auf den Preis des Kurses

### Gruppenrabatt Regeln:
- Ab einer Anmeldung von 3 oder mehr Mitarbeitern fuer denselben Kurs gibt es einen Rabatt von 15% auf den Preis des Kurses
- Ein Gruppenrabatt wird nur innerhalb eines Buchungsvorganges gewaehrt, Nachmeldungen von Mitarbeitern fuer einen Kurs fuehren nicht zur nachtraeglichen Anrechnung eines Mengenrabattes.

## Beispiele:

### [Beispiel: 20% Rabatt einfach](-)

Der Kurs hat einen Preis von [500](- "#coursePrice") Euro und beginnt am [1.5.2017](- "#courseDate") statt. [1](- "#numberOfPeople") Kursteilnehmer meldet sich am [1.1.2017](- "#bookingDate") an. Dann wird ein Rabatt von 20% Euro gewaehrt und er zahlt [400.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") Euro. 

Note:
* mit 400 funktioniert das Beispiel nicht, aber mit 400.0. Problem: interner cast von concordion
* die Anzahl der Kursteilnehmer muss auch als Zahl uebergeben werden


### [Beispiel: 20% Rabatt Randzeit](-)

Der Kurs hat einen Preis von [500](- "#coursePrice") Euro und beginnt am [1.8.2017](- "#courseDate") statt. [1](- "#numberOfPeople") Kursteilnehmer meldet sich am [31.5.2017](- "#bookingDate") an. Dann wird ein Rabatt von 20% Euro gewaehrt und er zahlt [400.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") Euro. 


### [Beispiel: 10% Rabatt Randzeit](-)

Der Kurs hat einen Preis von [500](- "#coursePrice") Euro und beginnt am [1.8.2017](- "#courseDate") statt. [1](- "#numberOfPeople") Kursteilnehmer meldet sich am [1.6.2017](- "#bookingDate") an. Dann wird ein Rabatt von 10% Euro gewaehrt und er zahlt [450.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") Euro. 


### [Beispieltabelle fuer Early-Bird-Rabatte](-)

| Preis des Kurses         | Datum des Kurses              | Anzahl an Personen fuer die Anmeldung | Tag der Anmeldung              | Rabatt | Preis des Kurses (inkl. Rabatt)           |
|--------------------------|-------------------------------|---------------------------------------|--------------------------------|--------|-------------------------------------------|
| [500](- "#coursePrice")  | [1.5.2017](- "#courseDate")   | [1](- "#numberOfPeople")              | [1.1.2017](- "#bookingDate")   |    20% | [400.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |
| [500](- "#coursePrice")  | [1.8.2017](- "#courseDate")   | [1](- "#numberOfPeople")              | [31.5.2017](- "#bookingDate")  |    20% | [400.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |
| [500](- "#coursePrice")  | [1.8.2017](- "#courseDate")   | [1](- "#numberOfPeople")              | [1.6.2017](- "#bookingDate")   |    10% | [450.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |
| [500](- "#coursePrice")  | [5.8.2017](- "#courseDate")   | [1](- "#numberOfPeople")              | [4.6.2017](- "#bookingDate")   |    20% | [400.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |
| [500](- "#coursePrice")  | [5.8.2017](- "#courseDate")   | [1](- "#numberOfPeople")              | [5.6.2017](- "#bookingDate")   |    10% | [450.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |

### [Beispieltabelle fuer kombinierte Rabatte](-)

| Preis des Kurses         | Datum des Kurses              | Anzahl an Personen fuer die Anmeldung | Tag der Anmeldung              | Rabatt | Preis des Kurses (inkl. Rabatt)           |
|--------------------------|-------------------------------|---------------------------------------|--------------------------------|--------|-------------------------------------------|
| [500](- "#coursePrice")  | [10.10.2017](- "#courseDate") | [3](- "#numberOfPeople")              | [9.10.2017](- "#bookingDate")   |    15% | [425.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |
| [500](- "#coursePrice")  | [1.8.2017](- "#courseDate")   | [4](- "#numberOfPeople")              | [31.5.2017](- "#bookingDate")  |    35% | [325.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |
| [500](- "#coursePrice")  | [1.8.2017](- "#courseDate")   | [5](- "#numberOfPeople")              | [1.6.2017](- "#bookingDate")   |    25% | [375.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |
| [500](- "#coursePrice")  | [5.8.2017](- "#courseDate")   | [3](- "#numberOfPeople")              | [4.6.2017](- "#bookingDate")   |    35% | [325.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |
| [500](- "#coursePrice")  | [5.8.2017](- "#courseDate")   | [3](- "#numberOfPeople")              | [5.6.2017](- "#bookingDate")   |    25% | [375.0](- "?=calculatePriceToPay(#coursePrice, #courseDate, #numberOfPeople, #bookingDate)") |







