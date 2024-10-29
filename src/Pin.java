public class Pin {
    public int pinNumber;
    public int pinLength;
    public int pinWigth;
    public int pinHigth;
    public int pinRot;
    public PinType pinType;

    public Pin(int pinNumber, int pinLength, int pinWigth, int pinHigth, int pinRot, PinType pinType) {
        this.pinNumber = pinNumber;
        this.pinLength = pinLength;
        this.pinWigth = pinWigth;
        this.pinHigth = pinHigth;
        this.pinRot = pinRot;
        this.pinType = pinType;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getPinLength() {
        return pinLength;
    }

    public void setPinLength(int pinLength) {
        this.pinLength = pinLength;
    }

    public int getPinWigth() {
        return pinWigth;
    }

    public void setPinWigth(int pinWigth) {
        this.pinWigth = pinWigth;
    }

    public int getPinHigth() {
        return pinHigth;
    }

    public void setPinHigth(int pinHigth) {
        this.pinHigth = pinHigth;
    }

    public int getPinRot() {
        return pinRot;
    }

    public void setPinRot(int pinRot) {
        this.pinRot = pinRot;
    }

    public PinType getPinType() {
        return pinType;
    }

    public void setPinType(PinType pinType) {
        this.pinType = pinType;
    }
}
