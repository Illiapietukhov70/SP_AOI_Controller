public class PinType {
    private String pinTypeNume;

    public PinType(String pinTypeNume) {
        this.pinTypeNume = pinTypeNume;
    }
    private boolean setPinTestMiniscusValue (int testMiniscusValue) {
        int testValue = testMiniscusValue;
        return testValue < 600? false: testValue > 1000 ? false: true;
    }
    private boolean setPinTestSolderValue (int testSolderValue) {
        int testValue = testSolderValue;
        return testValue < 0 ? false : testValue > 200 ? false : true;
    }
    private boolean setPinDisplacement (int pinX, int pinY, int pinLength, int pinWidth) {
        if (this.pinTypeNume == "GullWing") {
            int testPinX = pinX, testPinY = pinY, testPinLength = pinLength, testPinWidth = pinWidth;
            if(Math.abs(testPinX) > 200 || Math.abs(testPinY) >200
                    || testPinLength < 0 || testPinLength > 3000
                    || testPinWidth < 100 || testPinWidth > 3000) {
                return false;
            } else {
                return true;
            }

        } else {
            return false;
        }
    }
}
