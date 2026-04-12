package org.example.pollock;

public class Painting extends Art{
    public enum PaintMediums {
        ACRYLIC,
        OIL,
        WATERCOLOR,
        GOUACHE,
        SPRAY
    };
    private PaintMediums paintType = PaintMediums.GOUACHE;

    public Painting(String pieceName, Artist artist) {
        this.pieceName = pieceName;
        this.artistName = artist;
        System.out.println("This is the Painting constructor");
    }

    public void setPaintType(PaintMediums paintType) {
        this.paintType = paintType;
    }
}
