package com.makros.education.enums;

import java.awt.*;

/**
 * Created by mohamed.iben-el-abed on 12/24/2021
 */
public enum Genre {
    FEMME("Femme", Color.pink),
    HOMME("Homme", Color.blue);

    private String genreName;
    private Color colorName;

    public String getGenreName() {
        return genreName;
    }

    public Color getColorName() {
        return colorName;
    }

    Genre(String genreName, Color colorName) {
        this.genreName = genreName;
        this.colorName = colorName;
    }
}
