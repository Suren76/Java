package Homework13;


class Sportsman {
    private int[] scores;

    Sportsman(int ... scores) {
        for (int score: scores) {
            if (!(score >=0 && 100>= score)) {
                System.out.println("Out of range");
                System.exit(0);
            }
        }
        this.scores = scores;

    }

    int getAverageOfScores () {
        int sum = 0;
        for (int item: this.scores) {
            sum += item;
        }
        return sum/this.scores.length;
    }

    int compareToObject (Sportsman odjToCompare) {
        if (odjToCompare.getAverageOfScores() > this.getAverageOfScores()) {
            return -1;
        }
        if (odjToCompare.getAverageOfScores() > this.getAverageOfScores()) {
            return 1;
        }
        return 0;
    }
}

public class SportsmenList {
    public static void main(String[] args) {
        Sportsman S1 = new Sportsman(45, 46, 47);
        Sportsman S2 = new Sportsman(55, 56, 57);
        Sportsman S3 = new Sportsman(18, 19, 20);
        Sportsman S4 = new Sportsman(48, 56, 64);

        Sportsman[] sportsmenList = {S1, S2, S3, S4};

        for (Sportsman sportBoy: sportsmenList) {
            System.out.println(sportBoy.getAverageOfScores());
        }

        System.out.println(S1.compareToObject(S2));
    }
}
