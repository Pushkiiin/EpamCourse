package classwork.lesson170901;

public class Main {
    public static void main(String[] args) {
        System.out.println("asd");
        int clazz = 4;
    }
}

//swing - про UI
//можно почекать у него на гх chatPractice, concurrency
//про нереляционные бд

/*
    equals
equals на вход принимает Object

обязательные св-ва equals:
1) рефлексивность               x.equals(x) == true
2) симметрия                    x.equals(y) <=> y.equals(x)
3) транзитивность               x.equals(y) && y.equals(z) <=> x.equals(z)
4) consistent                   x.equals(y) должно всегда выдавать один и тот же результат
5) x.equals(null) == false;

public boolean equals(Object o){
    if(!o instanceof SomeClass){
        return false;               - включает в себя проверку на null
    }
    а дальше собственно код проверок }

    hashcode
нужен, чтобы юзать объекты нашего класса в качестве ключа в хэшмапе
должен быть целым
для вычисления хэшкода лучше всего использовать те же поля, что и для equals
основное правило: переопределили equals() - переопределяем hashcode()
1) consistent                   x.hashcode() == x.hashcode() - объект должен быть immutable, Хотя бы пока они юзаются как ключи
2) x.equals(y) <=> x.hashcode() == y.hashcode()
3) if (!x.equals(y)) !=> x.hashcode() != y.hashcode()

    enums
по сути особый вид класса
предоставляет набор констант для использования в программе по именам
удобно итерировать по значениям в foreach через EnumName.values()
по сути каждое значение - это экземпляр класса
метод .ordinal - возвращает порядковый номер константы
можно юзать в свиче
Seasons current = Seasons.AUTUMN;
нельзя наследоваться от enum'ов, в то время как сами они - наследники абстрактного класса Enum
сами по себе енумы - это классы, они могут имплементить интерфейсы, содержать конструкторы, методы
через енам делают потокобезопасный синглтон
сами константы - это объекты этого класса, которые инициализируются в момент обращения к одному из них

    reflection (3 - пересмотреть, норм объяснения есть)
при запуске приложение создается экземпляр класслоадера, обслуживающий конкретно классы этого приложения
может получиться несколько
можно получить список конструкторов, имя класса, список полей и методов, в т.ч. приватных
там чет 100500 нюансов, я хз
все это надо чтобы например во время работы программы анализировать содержимое класса, или еще чего-нибудь

    jdbc - java db connectivity(4)
DriverManager - начало работы с бд
основные бд для java - это Derby (embedded - встроена в jdk), Mysql, postgres, oracle, IBM db2
если бд не embedded - с ней надо общаться по протоколу tcp/ip
реляционные бд - бд, основанные на отношениях
колонки и ряды - домены и кортежи (с точки зрения реляционной алгебры)
важное:
use - указываем бд
select from where, insert, update
connector - совокупность классов для разных яп для работы с бд. Создатель бд делает набор классов, позволяющих работать с бд на каком-то языке
//jar-файл - на самом деле zip-архив - зипнутый набор скомпиленных классов
"точка входа" в этот connector - класс Driver
ORM - object-relational mapping - соспоставление таблицы и класса - Hibernate, MyBatis
JPA - java persistence API - стандартизация ORM. Wat?
примеры нереляционных:
иерархические таблицы
сетевые бд - информация в виде графа, много сложностей было
mongoDB - пример noSQL (kinda нереляционные бд, хранят данные в виде ключ-значение со всякмим сложными связями)

    аннотации(6, нихрена не понятно)
доп. средства, позволяющие поместить некую метаинформацию
аннотировать можно все что угодно, если не указано обратное
юзаются с помощью reflection
крч какая-то адово простая вещь, которую сам никто не пишет как правило, дунно
это не интерфейс, не класс, не объект - хер пойми что вообще
не бомбануло, а устал.

в среду 6 сентября в 11-20
zaal_lyanov@epam.com - share
*/