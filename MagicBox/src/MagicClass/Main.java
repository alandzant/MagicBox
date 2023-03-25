package MagicClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        MagicBox<String> strMagicBox = new MagicBox<>(6);

        strMagicBox.add("Petya");
        strMagicBox.add("Kolya");
        strMagicBox.add("Misha");
        strMagicBox.add("Masha");
        strMagicBox.add("Nastya");
        strMagicBox.add("Alekxey");

        String magic = strMagicBox.pick();
        System.out.println(magic);

    }
}
