package Prototype;

import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using Prototype Design");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadImportantData();

        NetworkConnection networkConnection2;
        try {
            networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection);
            networkConnection.getDomains().remove(0);
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
// Shallow copy and Deep copy