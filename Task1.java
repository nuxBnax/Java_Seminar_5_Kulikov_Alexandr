// Задание:
//
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре
// будут повторяющиеся имена с разными телефонами, их необходимо
// считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

public class Task1 {
    public static void main(String[] args) {
        Phones phones = new Phones();
        phones.add("Иван",1);
        phones.add("Василий",2);
        phones.add("Петя",3);
        phones.add("Катя",4);
        phones.add("Марина",5);
        phones.add("Генадий",6);
        phones.add("Артур",7);
        phones.add("Иван",8);
        phones.add("Артур",17);
        phones.add("Иван",18);

//        System.out.println(phones.getByPhoneNum(1));
//        phones.getByName("Иван");
        System.out.println(phones.getAll());

        System.out.println(phones.print());

    }
}
