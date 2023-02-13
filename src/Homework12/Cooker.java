package Homework12;


class CookerByObjects {
    private Gas[] gasEyesList;
    private Electric[] electricEyesList;

    CookerByObjects(int gasEyesCount, int electricEyesCount) {
        if (!(gasEyesCount >=3 && gasEyesCount <=8 && electricEyesCount >=1 && electricEyesCount <=3)) {
            System.out.println("Out of Range ");
            System.exit(0);
        }

        this.gasEyesList = new Gas[gasEyesCount];
        this.electricEyesList = new Electric[electricEyesCount];

        for (int i = 0; gasEyesCount>i; i++) {this.gasEyesList[i] = new Gas();}
        for (int i = 0; electricEyesCount>i; i++) {this.electricEyesList[i] = new Electric();}

    }


    void setStatusGas(boolean status) {
        for (Gas eye: this.gasEyesList) {
            eye.status = status;
        }
    }

    void setStatusElectric(boolean status) {
        for (Electric eye: this.electricEyesList) {
            eye.status = status;
        }
    }

    private int boolToInt(boolean boolValue) {return boolValue?1:0;}

    private int sum(Gas[] list) {
        if (!this.gasEyesList[0].status) {return 0;}

        int sum = 0;
        for (Gas eye: list) {
            sum += eye.energyPoint;
        }

        return sum;
    }

    private int sum(Electric[] list) {
        if (!this.electricEyesList[0].status) { return 0;}

        int sum = 0;
        for (Electric eye: list) {
            sum += eye.energyPoint;
        }

        return sum;
    }

    int getEnergyAmount() {
        return sum(this.electricEyesList)+sum(this.gasEyesList);
    }
}

class Gas {
    int energyPoint = 80;
    boolean status = false;
}

class Electric {
    int energyPoint = 100;
    boolean status = false;
}


class CookerObject {
    private int gasEyesCount;
    private int electricEyesCount;
    private boolean statusGas = false;
    private boolean statusElectric = false;

    CookerObject(int gasEyesCount, int electricEyesCount, boolean statusGas, boolean statusElectric) {
        new CookerObject(gasEyesCount,electricEyesCount);
        this.statusGas = statusGas;
        this.statusElectric = statusElectric;
    }

    CookerObject(int gasEyesCount, int electricEyesCount) {
        this.gasEyesCount = 3<=gasEyesCount && gasEyesCount<=8? gasEyesCount: -1;
        this.electricEyesCount = 1<=electricEyesCount && electricEyesCount<=3? electricEyesCount: -1;

        if (this.gasEyesCount == -1 || this.electricEyesCount == -1) {
            System.out.println("Out of range");
            System.exit(0);
        }
    }

    void setStatusGas(boolean status) {
        this.statusGas = status;
    }

    void setStatusElectric(boolean status) {
        this.statusElectric = status;
    }

    private int boolToInt(boolean boolValue) {return boolValue?1:0;}

    int getEnergyAmount() {
        return this.gasEyesCount*80 * boolToInt(this.statusGas)  +  this.electricEyesCount*100 * boolToInt(this.statusElectric);
    }
}



public class Cooker {
    public static void main(String[] args) {
        CookerByObjects cooker1 = new CookerByObjects(5,2);
        CookerObject cooker2 = new CookerObject(5,2);

        cooker1.setStatusElectric(true);
        cooker1.setStatusGas(true);

        cooker2.setStatusElectric(true);
        cooker2.setStatusGas(true);

        System.out.println(cooker1.getEnergyAmount());
        System.out.println(cooker2.getEnergyAmount());

    }
}
