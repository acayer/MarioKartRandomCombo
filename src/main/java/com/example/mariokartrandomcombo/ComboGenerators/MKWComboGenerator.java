package com.example.mariokartrandomcombo.ComboGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MKWComboGenerator implements RandomComboGenerator {
    final Integer RacerOptions = 50;
    final Integer KartOptions = 40;

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

        return kartCombo;
    }
}
