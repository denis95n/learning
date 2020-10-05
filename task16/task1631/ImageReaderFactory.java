package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader (ImageTypes imageTypes){
        if (imageTypes == null) throw new IllegalArgumentException();
            if (imageTypes.name().equals(ImageTypes.JPG.name())) {
                return new JpgReader();
            } else if (imageTypes.name().equals(ImageTypes.PNG.name())) {
                return new PngReader();
            } else if (imageTypes.name().equals(ImageTypes.BMP.name())) {
                return new BmpReader();
            } else return null;
    }
}
