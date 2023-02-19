package Homework13;

class Building {
    private int flours;
    private int[] with2rooms;
    private int[] with3rooms;
    private String type;

    Building(int flours, int[] with2rooms, int[] with3rooms, String type) {
        this.flours = flours;
        this.with2rooms = with2rooms;
        this.with3rooms = with3rooms;
        if (type.equalsIgnoreCase("panel") || type.equalsIgnoreCase("monolithic")) {
            this.type = type;
        } else {System.exit(1);}
    }

    int houseCount() {
        return this.with2rooms.length + this.with3rooms.length;
    }
}

class District {
    private Building[] buildingsList;
    private int parkArea;

    District(Building[] buildingsList, int parkArea) {
        this.buildingsList = buildingsList;
        this.parkArea = parkArea;
    }

    float getParkAreaPiece() {
        int housesCount = 0;

        for (Building building :buildingsList) {
            housesCount += building.houseCount();
        }

        return ((int) ((1f*this.parkArea/housesCount*100)))/100f;
    }
}

public class Districts {
    public static void main(String[] args) {
        Building b1 = new Building(3, new int[] {14, 18, 34, 27}, new int[] {15, 16, 35, 28},"monolithic");
        Building b2 = new Building(4, new int[] {14, 18, 34, 27, 45}, new int[] {15, 16, 35, 28, 42},"panel");
        Building b3 = new Building(2, new int[] {14, 18, 27}, new int[] {15, 16, 28},"panel");
        Building b4 = new Building(1, new int[] {13, 11}, new int[] {15, 16},"panel");

        District d1 = new District(new Building[] {b1, b2, b3, b4}, 820);

        System.out.println(d1.getParkAreaPiece());


        Building b5 = new Building(3, new int[] {15, 17, 33, 23}, new int[] {12, 18, 39, 22},"monolithic");
        Building b6 = new Building(4, new int[] {14, 18, 34, 27, 45}, new int[] {15, 16, 32, 27, 42},"panel");
        Building b7 = new Building(2, new int[] {17, 13, 22}, new int[] {11, 19, 23},"panel");
        Building b8 = new Building(1, new int[] {3, 1}, new int[] {5, 6},"panel");

        District d2 = new District(new Building[] {b5, b6, b7, b8}, 520);

        System.out.println(d2.getParkAreaPiece());
    }
}
