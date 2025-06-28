package com.example.mariokartrandomcombo.Model.MK8;

import java.util.HashMap;
import java.util.Map;

public enum Karts8
{
    STANDARD_KART("0"),
    PIPE_FRAME("1"),
    MACH_8("2"),
    STEEL_DRIVER("3"),
    CAT_CRUISER("4"),
    CIRCUIT_SPECIAL("5"),
    TRI_SPEEDER("6"),
    BADWAGON("7"),
    PRANCER("8"),
    BIDDYBUGGY("9"),
    LANDSHIP("10"),
    SNEEKER("11"),
    SPORTS_COUPE("12"),
    GOLD_STANDARD("13"),
    GLA("14"),
    SILVER_ARROW("15"),
    ROADSTER("16"),
    STANDARD_BIKE("17"),
    COMET("18"),
    SPORTS_BIKE("19"),
    THE_DUKE("20"),
    FLAME_RIDER("21"),
    VARMINT("22"),
    MR_SCOOTY("23"),
    JET_BIKE("24"),
    YOSHI_BIKE("25"),
    STANDARD_ATV("26"),
    WILD_WIGGLER("27"),
    TEDDY_BUGGY("28");

    private final String value;

    private static final Map<String, Karts8> lookup = new HashMap<>();

    static {
        for (Karts8 karts8 : Karts8.values()) {
            lookup.put(karts8.getValue(), karts8);
        }
    }

    Karts8(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Karts8 getByValue(String value) {
        return lookup.get(value);
    }
}
