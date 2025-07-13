package Adapter;

class CassetteAdapter implements DigitalPlayer {
    private final CassettePlayer cassettePlayer;

    public CassetteAdapter(CassettePlayer player) {
        this.cassettePlayer = player;
    }

    public void playSong(String song) {
        cassettePlayer.playCassette(song);
    }
}
