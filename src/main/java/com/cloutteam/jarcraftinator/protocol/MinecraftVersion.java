package com.cloutteam.jarcraftinator.protocol;

public enum MinecraftVersion {
    v1_7_2("1.7.2", 4),
    v1_7_4("1.7.4", 4),
    v1_7_5("1.7.5", 4),
    v1_7_6("1.7.6", 5),
    v1_7_7("1.7.7", 5),
    v1_7_8("1.7.8", 5),
    v1_7_9("1.7.9", 5),
    v1_7_10("1.7.10", 5),
    v1_8("1.8", 47),
    v1_8_1("1.8.1", 47),
    v1_8_2("1.8.2", 47),
    v1_8_3("1.8.3", 47),
    v1_8_4("1.8.4", 47),
    v1_8_5("1.8.5", 47),
    v1_8_6("1.8.6", 47),
    v1_8_7("1.8.7", 47),
    v1_8_8("1.8.8", 47),
    v1_8_9("1.8.9", 47),
    v1_9("1.9", 107),
    v1_9_1("1.9.1", 108),
    v1_9_2("1.9.2", 109),
    v1_9_3("1.9.3", 110),
    v1_9_4("1.9.4", 110),
    v1_10("1.10", 210),
    v1_10_1("1.10.1", 210),
    v1_10_2("1.10.2", 210),
    v1_11("1.11", 315),
    v1_11_1("1.11.1", 316),
    v1_11_2("1.11.2", 316),
    v1_12("1.12", 335);

    private final String name;
    private final int protocol;

    MinecraftVersion(String name, int protocol) {
        this.name = name;
        this.protocol = protocol;
    }

    public String getName() {
        return name;
    }

    public int getProtocol() {
        return protocol;
    }
}