package classwork.lesson170719;

public class Main {
    public static void main(String[] args) {
        System.out.println("asd");
//        System.out.println(Integer.MAX_VALUE);
//
//        int x = Integer.MAX_VALUE;
//        int y = 10;
//
//        x += y;
//        y = x - y;
//        x = x - y;
//
//        System.out.println(x);
//        System.out.println(y);


//        Float d = Float.MAX_VALUE;
//        System.out.println(d);
//        d += 10;
//        System.out.println(d);
//        d -= 10;
//        System.out.println(d);

    }
}

//проверить хитрый свап интов при переполнении - проверил, работает норм
//как посмотреть в классе все наследуемые классы и интерфейсы

/*
параметры передаются по значению, т.е. передаются копии примитивов, или ссылок
нельза написать свап
    способы/виды наследования (частично по Бадду)
1) Specialization (специализация)           is a сохраняется
из стандартной модели сделали спец.версию

2) Specification (спецификация)             is a сохраняется
погуглить

3) Construction (конструирование)           is a не сохраняется
не сохраняем св-во "is a"; нам что-то надо от предка, но мы его не используем целиком как он задуман

4) Generalization (обобщение)               непонятно, сохраняется ли is a
делаем машину цветной машиной. Раньше могли делть только монохромные, а теперь указываем цвет, т.е. расширяем спектр возможностей
по сути мы добавляем то, что могло быть и предка, но почему-то не было. Как правило поля

5) Extension (расширение)                   is a сохраняется
вводим новые св-ва, новое поведение, потомок становится более продвинутой версией родителя.
Отличие от обобщения в том, что тут мы прикручиваем штуки, которых у предка быть не должно было. Как правило методы

6) Restriction (ограничение)                is a не сохраняется
когда мы урезаем функционал предка, напр dequeue -> stack
оверрайдим и прописываем вместо тела throw new UnsupportedOperationException();
недостаток в том, что мы узнаем, что методы нельзя юзать, только во время выполнения программы

7) Variation (вариация)                     is a не сохраняется
небольшая вроде модификация, но делающая наследника и предка невзаимозаменяемыми
это скорее вынужденная ситуация, по-хорошему их бы обоих унаследовать от одного предка. Но у нас не всегда есть такая возможность

8) Combination/combining (комбинирование)   not implemented in java for classes
берем 2+ штуки и адово миксуем

SOLID
is a == L == Liskov substitution principle - потомков можно юзать везде, где можно юзать родителя
конструкторы не наследуются
super(); - вызов конструктора отца
в 3 части про протектед какой-то классный замут+
при наследовании можно расширять видимость методов, но не сужать
//мысля про приватные методы как инструмент создания методов у наследников с лругим названием

    Интерфейсы
помогают объединить в один код действия над изначально разными типами
интерфейс - тоже тип
по умолчанию все методы в них abstract public
реализации методов тоже обязаны быть public
implements means that this class and all its heirs have to implement all of the interface methods
интерфейс без методов - интефейс-метка
 */