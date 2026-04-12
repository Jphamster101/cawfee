package org.example.pollock;

public class Main {
    public static void main(String[] args) {
        Artist dave = new Artist("Dave Rees", 26,  "London");
        Painting rabbitInASnowstorm = new Painting("Rabbit in a Snowstorm", dave);
        rabbitInASnowstorm.setPaintType(Painting.PaintMediums.GOUACHE);
    }
}
