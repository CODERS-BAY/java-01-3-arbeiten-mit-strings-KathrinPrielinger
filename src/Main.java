
public class Main {
    public static void main(String[] args) {

        //Lege einen String mit dem Inhalt “ Hello World! ” an (enthält vorne und hinten Leerzeichen).
        String hW = " Hello World ";

        //Gib den String und seine Länge auf der Konsole aus:
        System.out.println(hW);
        System.out.println(hW.length());

        //Gib den String in einigen Abwandlungen auf der Konsole aus:
        //alle Buchstaben in Großbuchstaben
        System.out.println(hW.toUpperCase());

        //alle Buchstaben in Kleinbuchstaben
        System.out.println(hW.toLowerCase());

        //ersetze “World” mit “Codersbay”
        System.out.println(hW.replaceFirst("World", "Codersbay"));

        //ersetze einen Buchstaben/char
        System.out.println(hW.replace('o', 'ü'));

        //ohne Leerzeichen zu Beginn des Texts
        System.out.println(hW.trim());

        //ohne Leerzeichen zu Beginn des Texts
        System.out.println(hW.stripLeading());

        //Gib den String 15 mal wiederholt mit einem Zeilenumbruch zum Trennen aus (ohne die Codezeile 15 mal zu kopieren 😉)
        System.out.println(hW.repeat(15));

    }
}