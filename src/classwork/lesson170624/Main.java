package classwork.lesson170624;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        java.util.Random rnd = new java.util.Random();
        ArrayList list = new ArrayList();
        System.out.println(ArrayList.class.getName());  //тут работаем с классом как с объектом

    }
}

//можно ли настроить каждый вывод sout отдельным цветом в idea?
//посмотреть organize imports
//как разнести классы по разным окошкам

/*
идея TDD:
1) пишем код теста в мэйне в классе для теста, который не скомпилится
2) делаем чтоб скомпилился - создаем классы, методы и тд
3) пишем тесты, которые не взлетят
4) делаем их взлететь
5) триангуляция - меняем входные параметры и значение того же теста
5) repeat until...
дальше проверяют граничные значения, потом недопустимые

можно посмотреть и отредактировать список слов типа TODO, FIXME and so on
строковые литералы помещаются в буфер, поэтому "Hello" == "Hello" returns true
метод триангуляции - в тестировании метод, когда наша ф-ция тестируется как минимум двумя сильно различными наборами данных
serr - sout analogue for errors
sout & serr aren't used in production; there are special libs and frameworks
Yoda-style string compare is OK
inline - убираем переменную, а код, который её инициализировал используется вместо неё

    ну а теперь actually java core
oracle sertified assosiate - java 8 (1z0-808)
между пакетом и сигнатурой класа можно вписать импорты
java.lang по умолчанию всегда импортирован
импорты вообще необязательны, можно в коде просто указывать ПОЛНОЕ имя метода/поля/whatever

компановка программы
мы создавем просто набор классов, состоящих из наших исходных кодов. Импорты не являются частью проекта
в JRE есть 100500 стандартных библиотек
project - properties - java build path - добавление левых штук в проект; там еще classpath замешан как-то
крч импорты не грузят ничего; это не подключение библиотек

zaal_lyanov@epam.com - мыло, туда гх скинуть можно
 */