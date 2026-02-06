package ru.hse.lab1;

import ru.hse.lab1.second.Person;
/**
 * Основной класс приложения для работы с персональными данными.
 * <p>
 * Демонстрирует базовые операции с объектами класса Person.
 * </p>
 */

public class Main {
    /**
     * Главный метод программы.
     * <p>
     * Выполняет следующие действия:
     * <ol>
     *   <li>Создает объект класса Person</li>
     *   <li>Получает данные объекта через геттеры</li>
     *   <li>Выводит данные в форматированном виде</li>
     * </ol>
     * </p>
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создание и инициализация объекта Person
        Person person = new Person("Иван", 20);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}