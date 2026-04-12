package org.example.pollock;

public abstract class Art {
    protected String pieceName;
    protected Artist artistName;

    public Artist getArtistName() {
        return artistName;
    }

    public String getPieceName() {
        return pieceName;
    }
}
