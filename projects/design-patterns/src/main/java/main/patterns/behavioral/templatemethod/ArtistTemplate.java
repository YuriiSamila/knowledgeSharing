package main.patterns.behavioral.templatemethod;

public abstract class ArtistTemplate {

    public void drawPicture() {
        System.out.println("Preparation of the canvas");
        draw();
        System.out.println("Insertion the finished picture into the frame");
    }

    public abstract void draw();

}
