import java.util.*;
public class Library {
//defining each requirement for the network library
    private String name;
    private String manufacturer;
    private String modelNumber;
    private String serialNumber;
    private String macAddress;
    private String previousIpAddress;
    private String currentIpAddress;
    private String currentLocation;
    private String previousLocation;
    private String Connections;



    public Library (String name, String manufacturer, String modelNumber, String serialNumber, String macAddress, String previousIpAddress, String currentIpAddress, String currentLocation, String previousLocation, String Connections){
        this.name = name;
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.serialNumber = serialNumber;
        this.macAddress = macAddress;
        this.previousIpAddress = previousIpAddress;
        this.currentIpAddress = currentIpAddress;
        this.currentLocation = currentLocation;
        this.previousLocation = previousLocation;
        this.Connections = Connections;




    }

    public Library() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getPreviousIpAddress() {
        return previousIpAddress;
    }

    public void setPreviousIpAddress(String previousIpAddress) {
        this.previousIpAddress = previousIpAddress;
    }

    public String getCurrentIpAddress() {
        return currentIpAddress;
    }

    public void setCurrentIpAddress(String currentIpAddress) {
        this.currentIpAddress = currentIpAddress;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getPreviousLocation() {
        return previousLocation;
    }

    public void setPreviousLocation(String previousLocation) {
        this.previousLocation = previousLocation;
    }

    public String getConnections() {
        return Connections;
    }

    public void setConnections(String connections) {
        Connections = connections;
    }

    @Override
    public String toString(){
        return "Equipment name  = "+ name
                + " ,Equipment manufacturer = " + manufacturer + " ,Equipment modelNumber = " + modelNumber + " ,Equipment serialNumber = "
                + serialNumber + " ,Equipment macAddress = " + macAddress + " ,Equipment previousIpAddress = " + previousIpAddress +
                " ,Equipment currentIpAddress = " + currentIpAddress + " ,Equipment currentLocation = " + currentLocation + " ,Equipment previousLocation = "+ previousLocation
                +" ,Equipment Connections = " + Connections;

    }
}
