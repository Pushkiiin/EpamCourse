package classwork.lesson170706;

public class Main {
    public static void main(String[] args) {
        char[] c = new char[3];
        String s1 = "qwe";
        String s2 = new String("asd");
        String s3 = new String(s2);
        String s4 = new String(c);          //!!!
    }
}

//покурить основные методы класса Arrays
//стоит курс по алгоритмам Принстона на курсере; ведет Седжвик, у которого по алгоритмам еще топовая книжка есть
//hw - String 1,2,3 на codingbat;


/*
    работа со строками
единственный класс у которого существуют константы в виде строковых литералов
почему unicode? - потому что 2  байта на каждый символ
ASCII занимает 128 бит
все операции со строками всегда создают новую строку
строки immutable потому что это очень часто юзаемый, почти базовый тип, которому это надо например для потокобезопасности
StringBuilder - непотокобезопасный StringBuffer
если надо постоянно менять одну строку - гораздо лучше юзать StringBuilder; он перевыделяет примерно как ArrayList, а не каждый раз
String implements CharSequence
//можно замерить скорость работы чего-либо, посчитав разницу во времени перед исполнением и после
каждое использование new на String("") будет плодить новый объект
кэшируются только строковые литералы
в этом internal pool'e хранятся ссылки на строковые литералы; сами строковые литералы - объкты в куче
в String есть native метод intern() - помещает строку в то же хранилище, где и строковые литералы
можно указать jvm размер этого внутреннего хранилища
есть конструктор строки от массива символов

 */
