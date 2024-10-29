public abstract class CompSMD {
    String compName;
    String packType;
    int compSapNumber;
    double compGlobalX;
    double compGlobalY;
    int compGlobalRot;

    public CompSMD(String compName, String packType, int compSapNumber, double compGlobalX, double compGlobalY, int compGlobalRot) {
        this.compName = compName;
        this.packType = packType;
        this.compSapNumber = compSapNumber;
        this.compGlobalX = compGlobalX;
        this.compGlobalY = compGlobalY;
        this.compGlobalRot = compGlobalRot;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    public int getCompSapNumber() {
        return compSapNumber;
    }

    public void setCompSapNumber(int compSapNumber) {
        this.compSapNumber = compSapNumber;
    }

    public double getCompGlobalX() {
        return compGlobalX;
    }

    public void setCompGlobalX(double compGlobalX) {
        this.compGlobalX = compGlobalX;
    }

    public double getCompGlobalY() {
        return compGlobalY;
    }

    public void setCompGlobalY(double compGlobalY) {
        this.compGlobalY = compGlobalY;
    }

    public int getCompGlobalRot() {
        return compGlobalRot;
    }

    public void setCompGlobalRot(int compGlobalRot) {
        this.compGlobalRot = compGlobalRot;
    }
}