package classwork.lesson170712;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("asd");
        Stack st = new Stack();

        String a = "asd";
    }
}

//стоит прошариться в нескольких разных парадигмах хотя бы на общем уровне; js - musthave, go - про многопоточку, frontend, облачные технологии, scala
//hw global: hackerrank 30 days of coding && hw* cracking the coding interview (read also)
//hw - сделать стек на массиве через TDD. При чем TDD важнее всего



/*
Queue - FIFO
Stack - push, pop, peek/tos/top/whatever, size, traverse; tos - top of stack
для стека как правило ограничивают размер ввиду решаемых задач. Отсюда StackOverFlow
обратный случай - StackUnderFlow - когда пытаемся удалить из пустого стека
в джаве он работает как ArraayList с capacity и перевыделениями
//стоит пересмотреть 2 часть урока, он там объясняет, что и почему кодит в стеке
//протокол - набор правил if A than B
guard condition - настолько ок, что в некоторых языках под него есть специальная синтаксическая конструкция
некоторые структуры данных позволяют помещать в себя null-элемент, надо быть к этому внимательным

    - It's time for some OOP, bitches!  - No, Zaal, please, stop!   - MUAHAHAHAHAHA!!!
прога - совокупность взаимод объектов путем передачи сообщений, у каждого есть состояния (поля) и поведение (методы); для общения объектам нужны ссылки на объекты
    encapsulation
1) Объединение данных и способов их обраюотки - отличие от процедурных языков (С, паскаль)
2) Ну и сокрытие внутреннего содержимого офк; поля почти необходимо делать private
модификаторы доступа применимы ок всем членам класса (поля, методы, внут. классы)
public      - всем классам
private     - только внутри класса
package     - внутри пакета
protected   - внутри пакета и у всех наследников
с протектедом есть хитрость; к этому полю можно обращаться у наследника, при чем через его экземпляр, а не у исходного класса; последний видос - пересмотреть
основная идея protected - чтобы переопределять методы
у внешних классов тоже есть модификаторы доступа и действуют так же
package-досуп инкапсулирует класс внутри пакета

*/