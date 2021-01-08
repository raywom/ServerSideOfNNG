package server.netty;

public class ResponseData {
    private int intValue;
    private String stringValue;

    int getIntValue() {
        return intValue;
    }

    void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    String getStringValue() {
        return stringValue;
    }

    void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return "ResponseData{" + "intValue=" + intValue + ", stringValue='" + stringValue + '\'' + '}';
    }
}
