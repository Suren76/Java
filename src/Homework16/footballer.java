package Homework16;

class footballPlayer {
    private String name;
    private String surname;
    private String nationality;
    private int position;
    private static footballPlayer[] footballerList;

    footballPlayer(String name, String surname, String nationality, int position){
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.position = position;
        add(name, surname, nationality, position);
    }

    static void add(String name, String surname, String nationality, int position){
        footballPlayer[] tempClass = footballerList;
        footballerList = new footballPlayer[footballerList.length+1];

        for (int i = 0; i < tempClass.length; i++) {
            footballerList[i] = tempClass[i];
        }
        footballerList[tempClass.length] = new footballPlayer(name, surname, nationality, position);;
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
}

public class footballer {
    public static void main(String[] args) {

    }
}
