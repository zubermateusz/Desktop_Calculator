interface Flying {
    // returns height of flying in meters
    int getHeight();

    // implements a default method getHeightInKm that returns height of flying in km as int type
    default public int getHeightInKm() {
        return getHeight() / 1000;
    }
}