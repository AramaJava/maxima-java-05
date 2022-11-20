package org.example;



/*
   Репозиторий maxima-java-05
   Создать шаблон страницы с использованием
   тегов div, p, a, img
   Использовать на странице не менее трех классов,
   подключенных к типу элемента, к id элемента и через явное
   указание класса

   Описать класс DynamicPage с
   методом createPage(String filename),
   который будет создавать html-файл по шаблону Freemarker,
   используя данные из вспомогательного класса.
   В качестве такого класса данных использовать
   класс Cat из модуля 3.
*/

/*
    Задача:
        Установить Tomcat
        Cделать генерацию страницы через обращение к сервлету и передачу ему параметров кота:
        String name
        int weight
        boolean isAngry
*/



public class App {
    public static void main(String[] args) {

        try {
            DynamicPage.createPage("templates");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
