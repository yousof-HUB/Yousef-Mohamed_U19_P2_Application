import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Network {
    private LinkedList<Library> itemList = new LinkedList();
    Scanner input = new Scanner(System.in);
    Library device = new Library();


    public void add() {
        System.out.println("enter equipment name");
        String name = input.nextLine();
        System.out.println("enter manufacturer");
        String manufacturer = input.nextLine();
        System.out.println("enter modelNumber");
        String modelNumber = input.nextLine();
        System.out.println("enter serialNumber");
        String serialNumber = input.nextLine();
        System.out.println("enter  macAddress");
        String macAddress = input.nextLine();
        System.out.println("enter previousIpAddress");
        String previousIpAddress = input.nextLine();
        System.out.println("enter currentIpAddress");
        String currentIpAddress = input.nextLine();
        System.out.println("enter currentLocation");
        String currentLocation = input.nextLine();
        System.out.println("enter previousLocation");
        String previousLocation = input.nextLine();
        System.out.println("enter Connections");
        String Connections = input.nextLine();
        device.setName(name);
        device.setManufacturer(manufacturer);
        device.setModelNumber(modelNumber);
        device.setSerialNumber(serialNumber);
        device.setMacAddress(macAddress);
        device.setPreviousIpAddress(previousIpAddress);
        device.setCurrentIpAddress(currentLocation);
        device.setCurrentLocation(currentLocation);
        device.setPreviousLocation(previousLocation);
        device.setConnections(Connections);

        //itemsList is our LikedList

        itemList.add(device);
        for (Library device : itemList) {
            System.out.println("device " + device.getName() + device.getManufacturer() + " added successfully");


            Library lib = new Library(name, manufacturer, modelNumber, serialNumber, macAddress, previousIpAddress, currentIpAddress, currentLocation, previousLocation, Connections);


        }

        //public void display () {
        for (Library item : itemList) {
            System.out.println(item);
        }

        try {
            FileWriter writer = new FileWriter("devices", true);
            BufferedWriter out = new BufferedWriter(writer);
            out.write(String.valueOf("\n" + device));
            out.close();
        } catch (Exception e) {
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }

    }

}





