package com.example.mariokartrandomcombo.Model.World;

import java.util.HashMap;
import java.util.Map;

public enum RacersWorld {
    // --- Main Characters (Mario Universe) ---
    MARIO("0"),
    LUIGI("1"),
    PEACH("2"),
    DAISY("3"),
    ROSALINA("4"),
    YOSHI("5"),
    TOAD("6"),
    TOADETTE("7"),
    KOOPA_TROOPA("8"),
    BOWSER("9"),
    DONKEY_KONG("10"),
    WARIO("11"),
    WALUIGI("12"),
    PAULINE("13"),
    BOWSER_JR("14"),
    KING_BOO("15"),
    BIRDO("16"),
    SHY_GUY("17"),
    LAKITU("18"),
    BABY_MARIO("19"),
    BABY_LUIGI("20"),
    BABY_PEACH("21"),
    BABY_DAISY("22"),
    BABY_ROSALINA("23"),

    // --- NPC / Obstacle Characters ---
    GOOMBA("24"),
    WIGGLER("25"),
    DRY_BONES("26"),
    HAMMER_BRO("27"),
    NABBIT("28"),
    PIRANHA_PLANT("29"),
    SIDESTEPPER("30"),
    MONTY_MOLE("31"),
    STINGBY("32"),
    PENGUIN("33"),
    CHEEP_CHEEP("34"),
    COW("35"),
    PARA_BIDDYBUD("36"),
    POKEY("37"),
    SNOWMAN("38"),
    CATAQUACK("39"),
    CHARGIN_CHUCK("40"),
    COIN_COFFER("41"),
    CONKDOR("42"),
    DOLPHIN("43"),
    FISH_BONE("44"),
    PEEPA("45"),
    PIANTA("46"),
    ROCKY_WRENCH("47"),
    SPIKE("48"),
    SWOOP("49");


    private final String value;

    private static final Map<String, RacersWorld> lookup = new HashMap<>();

    static {
        for (RacersWorld racersWorld : RacersWorld.values()) {
            lookup.put(racersWorld.getValue(), racersWorld);
        }
    }

    RacersWorld(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static RacersWorld getByValue(String value) {
        return lookup.get(value);
    }
}