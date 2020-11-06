package org.vortex.cicddemoapp.entity;

public class Vitals {

    private String hostname;
    private String ip;
    private String timestamp;
    private String temp;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "====> " + "hostname='" + hostname + '\'' +
                ", ip='" + ip + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", temp=" + temp +
                " <====";
    }
}
