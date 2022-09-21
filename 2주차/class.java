class TV {
    String color; // 색깔
    boolean power; // 전원
    int channel; // 채널

    void power () { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }