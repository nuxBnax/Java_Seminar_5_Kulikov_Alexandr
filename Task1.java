// Задание:
//
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре
// будут повторяющиеся имена с разными телефонами, их необходимо
// считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

public class Task1 {
    public static void main(String[] args) {
        Phones passports = new Phones();
        passports.add("123456","Иван");
        passports.add("321456","Вася");
        passports.add("234561","Петя");
        passports.add("234432","Иван");
        passports.add("654321","Катя");
        passports.add("345678","Александр");
        System.out.println(passports.getByName("Иванов"));
        System.out.println(passports.getByPhoneNum("321456"));
        System.out.println(passports.getAll());
    }
}
