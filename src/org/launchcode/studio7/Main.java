package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD music = new CD("album");
        DVD movie = new DVD("film");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        music.spinDisc();
        movie.spinDisc();

        music.getName();

        System.out.println(music.getTotalCapacity());
        System.out.println(music.getUnUsedCapacity());
        System.out.println(music.getUsedCapacity());

        System.out.println(music.readData());
        music.writeData("Some meta data...");
        System.out.println(music.readData());

        System.out.println(music.getTotalCapacity());
        System.out.println(music.getUnUsedCapacity());
        System.out.println(music.getUsedCapacity());

        System.out.println(movie.getType());

    }
}
