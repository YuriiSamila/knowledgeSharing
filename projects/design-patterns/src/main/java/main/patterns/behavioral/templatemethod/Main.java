package main.patterns.behavioral.templatemethod;

public class Main {

    public static void main(String[] args) {

        Watercolorist watercolorist = new Watercolorist();
        watercolorist.drawPicture();
        System.out.println("------------------------------------------------");
        MonotypeArtist monotypeArtist = new MonotypeArtist();
        monotypeArtist.drawPicture();

//        ArtistTemplate watercolorist = new Watercolorist();
//        ArtistTemplate monotypeArtist = new MonotypeArtist();
//        watercolorist.drawPicture();
//        System.out.println("------------------------------------------------");
//        monotypeArtist.drawPicture();

    }

}
