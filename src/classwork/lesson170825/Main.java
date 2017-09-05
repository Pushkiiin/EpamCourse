package classwork.lesson170825;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("asd");
        String[] asd = new String[2];
        Arrays.stream(asd);
    }
}

//.map(lambda) - terminal op? - nope
//optional - это не стрим, но с которым можно обращаться, как со стримом?

/*
можно сделать статик импорт - импорт статиков из класса, можно импортировать один метод например
flatMap - превращает поток потоков в один поток тех эл-тов, из которых состоят внутренние стримы/коллекции
//str.split(""); возвращает массив строк по 1 букве из исходной строки
.map(lambda) - сделать лямбду для каждого эл-та из потока
.reduce() - внутри уже содержит аккумулятор, с которым взаимодействует каждый элемент
.peek() - выводит, чего настримили на данный момент - полезно для отладки
SummaryStatistics - если хотим из стрима примитивов вынести насколько разных результатов
spliterator оказывается тут где-то рядом, но кто такой - все еще непонятно

если есть несколько перегруженных методов, надо будет писать лямбду, при передаче метода по ссылке если оно само не ресолвнется
filter() is opposite to removeIf()
основная идея Optional<Sth> - обозначить поля, которые могут быть, а могут не быть
flatMap контрит Optional<Optional<Sth>>

ссылки на методы - краткая запись лямбд


 */
