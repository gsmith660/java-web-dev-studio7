package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    private int storageCapacity;
    private String data = "";
    private String discType;
    private String name;
    private String spinSpeed;

    public BaseDisc(int storageCapacity, String discType, String name, String spinSpeed) {
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.name = name;
        this.spinSpeed = spinSpeed;
    }

    @Override
    public int getTotalCapacity() {
        return storageCapacity;
    }

    @Override
    public int getUsedCapacity() {
        return data.length();
    }

    @Override
    public int getUnUsedCapacity() {
        return getTotalCapacity() - getUsedCapacity();
    }

    @Override
    public String readData() {
        return data;
    }

    @Override
    public void writeData(String data) {
        if (data.length() < getUnUsedCapacity()) {
            this.data += data;
        } else {
            System.out.println("Not enough free space on the disc.");
        }
    }

    @Override
    public String getType() {
        return discType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void spinDisc() {
        System.out.println(this.discType + " spinning at " + this.spinSpeed + " rpm.");
    }
}
