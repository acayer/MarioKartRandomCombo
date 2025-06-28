package com.example.mariokartrandomcombo.Model.World;

import java.util.HashMap;
import java.util.Map;

public enum KartsWorld {
    // --- Karts ---
    STANDARD_KART("0"),
    RALLY_KART("1"),
    PLUSHBUGGY("2"),
    BABY_BLOOPER("3"),
    CHARGIN_TRUCK("4"),
    ZOOM_BUGGY("5"),
    BLASTRONAUT_III("6"),
    REEL_RACER("7"),
    CARPET_FLYER("8"),
    BILLDOZER("9"),
    BIG_HORN("10"),
    HOT_ROD("11"),
    STELLAR_SLED("12"),
    RIBBIT_REVSTER("13"),
    MECHA_TRIKE("14"),
    LIL_DUMPY("15"),
    HYPER_PIPE_KART("16"),
    PIPE_FRAME("17"),
    BIDDYBUGGY("18"),
    B_DASHER("19"),
    TINY_TITAN("20"),
    BUMBLE_V("21"),
    CLOUD_9("22"),
    LOBSTER_ROLLER("23"),

    // --- Bikes ---
    STANDARD_BIKE("24"),
    RALLY_BIKE("25"),
    MACH_ROCKET("26"),
    FIN_TWIN("27"),
    CUTE_SCOOT("28"),
    W_TWIN_CHOPPER("29"),
    TUNE_THUMPER("30"),
    LOCO_MOTO("31"),
    ROB_HOG("32"),
    DOLPHIN_DASHER("33"),
    HYPER_PIPE_BIKE("34"),

    // --- ATVs ---
    BOWSER_BRUISER("35"),
    FUNKY_DORRIE("36"),
    RALLY_GATOR("37"),
    DREAD_SLED("38"),
    JUNKYARD_HOG("39");

    private final String value;

    private static final Map<String, KartsWorld> lookup = new HashMap<>();

    static {
        for (KartsWorld kartsWorld : KartsWorld.values()) {
            lookup.put(kartsWorld.getValue(), kartsWorld);
        }
    }

    KartsWorld(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static KartsWorld getByValue(String value) {
        return lookup.get(value);
    }
}