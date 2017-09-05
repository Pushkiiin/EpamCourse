package classwork.lesson170707;

public class StringStuff {
    public static void main(String[] args) {
        String s = " hel lo ";

        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('e'));
        System.out.println(s.contains("a"));
        System.out.println(s.substring(4));
        System.out.println(s.toUpperCase());
        System.out.println(s.replace('e', 'a'));
        System.out.println(s.trim());               //удаляет пробелы только в конце и начале строки
    }
}
