package com.example.mariokartrandomcombo.ComboGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MK8ComboGenerator implements RandomComboGenerator
{
    final Integer RacerOptions = 41;
    final Integer KartOptions = 29;
    final Integer WheelOptions = 18;
    final Integer GliderOptions = 12;

    public Integer racerChoice()
    {
        Integer racer;

        Random r = new Random();
        racer = r.nextInt(RacerOptions);

        return racer;
    }
    public List<Integer> kartChoice()
    {
        List<Integer> kartCombo = new ArrayList<>();

        Random r = new Random();
        kartCombo.add(r.nextInt(KartOptions));
        kartCombo.add(r.nextInt(WheelOptions));
        kartCombo.add(r.nextInt(GliderOptions));

        return kartCombo;
    }
}
