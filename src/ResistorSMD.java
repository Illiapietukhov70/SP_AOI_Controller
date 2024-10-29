import java.util.Arrays;

public class ResistorSMD extends CompSMD {
    String compName;
    String packType;
    int compSapNumber;
    double compGlobalX;
    double compGlobalY;
    int compGlobalRot;
    int compLength;
    int compHigth;
    int compWidth;
    boolean polary;
    final int pinCount = 2;


    public ResistorSMD(String compName, String packType, int compSapNumber, double compGlobalX, double compGlobalY, int compGlobalRot, boolean polary) {
        super(compName, packType, compSapNumber, compGlobalX, compGlobalY, compGlobalRot);
        this.compName = compName;
        this.packType = packType;
        this.compSapNumber = compSapNumber;
        this.compGlobalX = compGlobalX;
        this.compGlobalY = compGlobalY;
        this.compGlobalRot = compGlobalRot;
        this.polary = polary;
        Pin[] pins = new Pin[pinCount];
        setCase(packType);
        setPinResistor(this.packType, pins);


    }

    @Override
    public String getCompName() {
        return compName;
    }

    @Override
    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    @Override
    public int getCompSapNumber() {
        return compSapNumber;
    }

    @Override
    public void setCompSapNumber(int compSapNumber) {
        this.compSapNumber = compSapNumber;
    }

    @Override
    public double getCompGlobalX() {
        return compGlobalX;
    }

    @Override
    public void setCompGlobalX(double compGlobalX) {
        this.compGlobalX = compGlobalX;
    }

    @Override
    public double getCompGlobalY() {
        return compGlobalY;
    }

    @Override
    public void setCompGlobalY(double compGlobalY) {
        this.compGlobalY = compGlobalY;
    }

    @Override
    public int getCompGlobalRot() {
        return compGlobalRot;
    }

    @Override
    public void setCompGlobalRot(int compGlobalRot) {
        this.compGlobalRot = compGlobalRot;
    }

    public int getCompHigth() {
        return compHigth;
    }

    public void setCompHigth(int compHigth) {
        this.compHigth = compHigth;
    }

    private void setCase(String packType) {
        if (packType.equals("0201")) {
            compLength = 600;
            compWidth = 300;
        } else {
            if (packType.equals("0402")) {
                compLength = 1000;
                compWidth = 500;
            } else {
                if (packType.equals("0603")) {
                    compLength = 1500;
                    compWidth = 800;
                } else {
                    if (packType.equals("0805")) {
                        compLength = 2000;
                        compWidth = 1300;
                    } else {
                        if (packType.equals("1008")) {
                            compLength = 2500;
                            compWidth = 2000;
                        } else {
                            if (packType.equals("1206")) {
                                compLength = 2500;
                                compWidth = 2000;
                            } else {
                                System.out.println("Wrong Type of Resistor");
                            }
                        }
                    }
                }
            }
        }
    }
    @Override
    public String toString() {
        return "ResistorSMD{" +
                "compName='" + compName + '\'' +
                ", packType='" + packType + '\'' +
                ", compSapNumber=" + compSapNumber +
                ", compGlobalX=" + compGlobalX +
                ", compGlobalY=" + compGlobalY +
                ", compGlobalRot=" + compGlobalRot +
                ", compLength=" + compLength +
                ", compHigth=" + compHigth +
                ", compWidth=" + compWidth +
                ", polary=" + polary +
                ", pinCount=" + pinCount +
                '}';
    }

    public static Pin[] setPinResistor(String packType, Pin[] pins) {
        int pinWidth = 100, pinLength = 100;
        if (packType.equals("0201")) {
            pinLength = 100;
            pinWidth = 320;
        } else {
            if (packType.equals("0402")) {
                pinLength = 120;
                pinWidth = 520;
            } else {
                if (packType.equals("0603")) {
                    pinLength = 150;
                    pinWidth = 820;
                } else {
                    if (packType.equals("0805")) {
                        pinLength = 200;
                        pinWidth = 1320;
                    } else {
                        if (packType.equals("1008")) {
                            pinLength = 250;
                            pinWidth = 2000;
                        } else {
                            if (packType.equals("1206")) {
                                pinLength = 250;
                                pinWidth = 2050;
                            } else {
                                System.out.println("Wrong Type of Resistor");
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0, localPinRot = 0; i < pins.length; i++, localPinRot += 180) {
            Pin pin = new Pin(i + 1, pinLength, pinWidth, 300, localPinRot, new PinType("Flat"));
            System.out.println(i + " Class Pin " + pin); // Class Pin как бы создается
            pins[i] = pin;
        }
        return pins;

    }
    public static Pin getPinResistor(Pin[] pins, int localPinNumber) {
        return pins[localPinNumber]; // Хочу достучаться но --- пока еще НЕОСИЛИЛ
    }

}




