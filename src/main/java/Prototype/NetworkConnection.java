package Prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();


    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadImportantData() throws InterruptedException {
        this.data = "Very Important Data";
        domains.add("www.learcode.com");
        domains.add("www.google.com");
        domains.add("www.gfg.com");
        Thread.sleep(20000);
        //it will take 5 mins
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                "domains='"+ domains + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());

        for(String d: this.getDomains()){
            networkConnection.getDomains().add(d);
        }
        return super.clone();
    }
}
