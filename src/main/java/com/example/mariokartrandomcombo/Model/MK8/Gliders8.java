package com.example.mariokartrandomcombo.Model.MK8;

import java.util.HashMap;
import java.util.Map;

public enum Gliders8
{
    SUPER_GLIDER("0"),
    CLOUD_GLIDER("1"),
    WARIO_WING("2"),
    WADDLE_WING("3"),
    PEACH_PARASOL("4"),
    PARACHUTE("5"),
    PARAFOIL("6"),
    FLOWER_GLIDER("7"),
    BOWSER_KITE("8"),
    PLANE_GLIDER("9"),
    MKTV_PARAFOIL("10"),
    GOLD_GLIDER("11");

    private final String value;

    private static final Map<String, Gliders8> lookup = new HashMap<>();

    static {
        for (Gliders8 gliders8 : Gliders8.values()) {
            lookup.put(gliders8.getValue(), gliders8);
        }
    }

    Gliders8(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Gliders8 getByValue(String value) {
        return lookup.get(value);
    }
}
