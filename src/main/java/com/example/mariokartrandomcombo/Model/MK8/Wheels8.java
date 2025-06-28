package com.example.mariokartrandomcombo.Model.MK8;

import java.util.HashMap;
import java.util.Map;

public enum Wheels8
{
    STANDARD("0"),
    MONSTER("1"),
    ROLLER("2"),
    SLIM("3"),
    SLICK("4"),
    METAL("5"),
    BUTTON("6"),
    OFF_ROAD("7"),
    SPONGE("8"),
    WOOD("9"),
    CUSHION("10"),
    BLUE_STANDARD("11"),
    HOT_MONSTER("12"),
    AZURE_ROLLER("13"),
    CRIMSON_SLIM("14"),
    CYBER_SLICK("15"),
    RETRO_OFF_ROAD("16"),
    GOLD_TIRES("17"),
    GLA_TIRES("18");

    private final String value;

    private static final Map<String, Wheels8> lookup = new HashMap<>();

    static {
        for (Wheels8 wheels8 : Wheels8.values()) {
            lookup.put(wheels8.getValue(), wheels8);
        }
    }

    Wheels8(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Wheels8 getByValue(String value) {
        return lookup.get(value);
    }

}
