package Adapter;

public class Main {
    public static void main(String[] args) {
        DigitalPlayer player = new CassetteAdapter(new CassettePlayer());
        player.playSong("Bohemian Rhapsody");
    }
}