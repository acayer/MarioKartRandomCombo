package com.example.mariokartrandomcombo;

import com.example.mariokartrandomcombo.ComboGenerators.*;
import com.example.mariokartrandomcombo.Model.MK8.*;

import java.util.List;

public class RandomComboService
{
    public static String RandomComboMK8()
    {
        Integer racer;
        List<Integer> kart;
        StringBuilder buildCombo = new StringBuilder();

        MK8ComboGenerator generator = new MK8ComboGenerator();
        racer = generator.racerChoice();
        kart = generator.kartChoice();

        buildCombo.append("Racer: ");
        buildCombo.append(Racers8.getByValue(racer.toString()));
        buildCombo.append("\nKart: ");
        buildCombo.append(Karts8.getByValue(kart.get(0).toString()));
        buildCombo.append(" with ");
        buildCombo.append(Wheels8.getByValue(kart.get(1).toString()));
        buildCombo.append(" wheels and ");
        buildCombo.append(Gliders8.getByValue(kart.get(2).toString()));
        buildCombo.append(" glider. ");

        return buildCombo.toString();
    }
}
