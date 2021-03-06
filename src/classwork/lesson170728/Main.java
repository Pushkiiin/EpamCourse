package classwork.lesson170728;

public class Main {
    public static void main(String[] args) {
        String str = null;
        String str1 = null;
        System.out.println(str == str1);
    }
}

//спросить про null - что это вообще?
//как рботает Iterator, в честности в foreach

/*
AC содержит частичную реализацию и поля; юзается, когда нам надо создать иерархию объектов с одинаковой реакцией на сигнал
I - выделение некоего общего для разных объектов свойстваа
наследование дает слишком жесткую зависимость потомков от родителей
композиция - потанцевальная замена наследованию, 1 часть урока пересмотреть - там еще и про делегирование вместо наследования
Интерфейсы роляют при переходе от наследования к композиции

    exceptions (2+ часть урока, все довольно понятно, можно пересмотреть, если забудется)
помогают оповестить об ошибке и описатьреакцию программы на неё
при возникновении искл. ситуации проблема описывается при помощи специального объекта
главный класс - Throwable - имеет 2 потомка:
error (про ошибки jvm - фатальные ошибки, когда выполнение программы надо завершать) самые частые - OutOfMemoryError и StackOverFlowError
StackOverFlow - переполнение стека jvm, а не какого-то там еще
exception:
1) checked - проверяемые - подавляющее большинство - при потенциальном возникновении её в методе компилятор заставит обработать её, либо передать выше по стеку вызовов
можно пробросить вверх даже из main - тогда его обработает jvm - выведет stacktrace и завершит выполнение текущего потока (main)
в unchecked случаях именно это и происходит со всякими NPE и тд.
//с апплетами все немного иначе может быть - все зависит от кода, вызывающего нашу программу
throws - декларация, что вызов метода надо обработать
try-catch неслабо кушает ресурсы, поэтому зачастую вместо exception'a имеет смысл делать if-проверку
2) unchecked - непроверяемые ака рантайм - напр., деление на 0 (ArithmeticException) - их всегда по-разному обрабатывают, но printStackTrace - норм план
если мы не хотим работать с данными, побитыми исключением - надо делать его критичным
ClassCastException - runtime, возникает при нисходящем касте руками (помним, что восходящий каст автоматический)
NullPointerException - runtime, возникает при отправке сообщения ссылке на null
ArrayIndexOutOfBoundsException - runtime - обращение к индексу за пределами массива
по-хорошему если мы полагаем, что код может выбросить ошибку, в т.ч. unchecked, порой стоит руками выбросить новую checked exc.
смысл декларации throw - немедленно завершаем метод и говорим наверх, что произошло что-то исключительное

Ковальски, варианты!
1) сделать проверку ифом
2) если непонятно, как сделать (1) - делаем throw - сообщаем наверх, что не знаем, что делать на данном уровне
3) использовать runtime exception - не накладывать обязательство обработки
есть 2 лагеря - одни топят за checked, другие за unchecked, причины - в гугле

как правило наличие null говорит о том, что программист не позаботился о существовании "пустого объекта" (design pattern "Null Object")
с помощью дизайна классов таким образом можно избавиться от необходимости проверки на null
идея в том, чтобы создать в нашем классе внутренниий класс с единственным экземпляром, который отвечает на все те же запросы, что и внешний, но по-своему
//null == null всегда true
последняя часть урока - рисунки для пояснения терминологии, архитектура, круто все, пересмотреть обязательно
 */