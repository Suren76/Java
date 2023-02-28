package Homework16;

import java.util.Arrays;

class footballPlayer {
    private String name;
    private String surname;
    private String nationality;
    private int position;
    private static footballPlayer[] footballerList;

    footballPlayer(String name, String surname, String nationality, int position) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.position = position;
        add();
    }

    void add() {
        footballPlayer[] tempClass = footballerList;
        footballerList = footballerList==null? new footballPlayer[1]: new footballPlayer[footballerList.length+1];

        for (int i = 0; tempClass!=null && i < tempClass.length; i++) {
            footballerList[i] = tempClass[i];
        }
        footballerList[footballerList.length-1] = footballPlayer.this;
    }

    int getPosition() {
        return position;
    }

    String getName() {
        return name;
    }

    String getNationality() {
        return nationality;
    }

    String getSurname() {
        return surname;
    }

    static footballPlayer[] getFootballerList() {
        return footballerList;
    }
}

public class Footballer {
    public static void main(String[] args) {
        footballPlayer footballBoy = new footballPlayer("Smbulk","Smbulyan","qyart",55);
        footballPlayer footballBoy2 = new footballPlayer("Smbulk","Smbulyan","qyart",77);

        System.out.println(footballBoy+", "+footballBoy2);
        System.out.println(Arrays.toString(footballPlayer.getFootballerList()));
    }
}
