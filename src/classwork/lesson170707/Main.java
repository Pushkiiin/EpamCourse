package classwork.lesson170707;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(){{      //блок инициализации в анонимном классе
            add("one");
            add("two");
            add("tri");
        }};

        List<String> list2 = Arrays.asList("asd", "dsa");   //с помошью var args; нельзя изменить размер
    }
}


//hw1 test driven replace() for string; после каждого успешного прохождения тестов делаем коммит[
//hw2 в класс StringArrayList добавтьб методы get, set, size, isempty, tostring
//и чо-то там еще
//iluwatar design patterns gh - zbs

/*
    It's ArrayList time!
//зачастую всякие сложные проверки стоит выделить в отдельный метод с говорящим названием (пример - isEmpty())
//Arrays.asList - какая-то адовая наркота - то ли массив, то ли ArrayList; сложна
remove(Object obj) удаляет первое включение obj; сравнение идет по equals

Collections.unmodifiablecollections - kinda readonly

 */