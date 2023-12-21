package org.example.OOP;

public interface Vehicle {
    String manufacturer = "";
    String model = "";
    String vehicleType= "";
    int year = 0;

    public String getManufacturer();
    public void setManufacturer();
    public String getModel();
    public void setModel();
    public String getVehicleType();
    public void setVehicleType();
    public int getYear();
}
