package com.example.mariokartrandomcombo.Model.MK8;

import java.util.HashMap;
import java.util.Map;

public enum Racers8
{
    MARIO("0"),
    LUIGI("1"),
    PEACH("2"),
    DAISY("3"),
    ROSALINA("4"),
    TANOOKI_MARIO("5"),
    CAT_PEACH("6"),
    YOSHI("7"),
    TOAD("8"),
    KOOPA("9"),
    SHY_GUY("10"),
    LAKITU("11"),
    TOADETTE("12"),
    KING_BOO("13"),
    BABY_MARIO("14"),
    BABY_LUIGI("15"),
    BABY_PEACH("16"),
    BABY_DAISY("17"),
    BABY_ROSALINA("18"),
    METAL_MARIO("19"),
    ROSEGOLD_PEACH("20"),
    WARIO("21"),
    WALUIGI("22"),
    DONKEY_KONG("23"),
    BOWSER("24"),
    DRY_BONES("25"),
    BOWSER_JR("26"),
    DRY_BOWSER("27"),
    LEMMY("28"),
    LARRY("29"),
    WENDY("30"),
    LUDWIG("31"),
    IGGY("32"),
    ROY("33"),
    MORTON("34"),
    INKLING_GIRL("35"),
    INKLING_BOY("36"),
    LINK("37"),
    VILLAGER_BOY("38"),
    VILLAGER_GIRL("39"),
    ISABELLE("40"),
    MII("41");

    private final String value;

    private static final Map<String, Racers8> lookup = new HashMap<>();

    static {
        for (Racers8 racers8 : Racers8.values()) {
            lookup.put(racers8.getValue(), racers8);
        }
    }

    Racers8(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Racers8 getByValue(String value) {
        return lookup.get(value);
    }
}
