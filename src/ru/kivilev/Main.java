package ru.kivilev;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> birthdayStringList = Arrays.asList(
                "Дорогой, Александр! \uD83D\uDC83",
                "от всей души поздравляю с днем рождения!",
                "всех благ, хорошего настроения",
                "успехов во всех делах, на работе, дома",
                "чтоб дорогие люди были рядом",
                "чтоб здоровья хватало",
                "",
                "В общем, с днем рождения! \uD83C\uDF82");
        birthdayStringList.forEach(System.out::println);
    }
}
