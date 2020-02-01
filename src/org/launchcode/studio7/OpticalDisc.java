package org.launchcode.studio7;

public interface OpticalDisc {

    void spinDisc();

    void writeData(String data);

    String readData();

    String getName();

    int getTotalCapacity();

    int getUsedCapacity();

    int getUnUsedCapacity();

    String getType();

}
