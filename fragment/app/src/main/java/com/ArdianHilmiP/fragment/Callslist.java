package com.ArdianHilmiP.fragment;

public class Callslist {
    //Method untuk mengirimkan data
    private String userIDs;
    private String userNames;
    private String dates;
    private String urlProfiles;

    public Callslist() {
    }

    //Membuat Constructor
    public Callslist(String userIDs, String userNames, String dates, String urlProfiles) {
        this.userIDs = userIDs;
        this.userNames = userNames;
        this.dates = dates;
        this.urlProfiles = urlProfiles;
    }

    //Getter and Setter
    public String getUserIDs() {
        return userIDs;
    }

    public void setUserIDs(String userIDs) {
        this.userIDs = userIDs;
    }

    public String getUserNames() {
        return userNames;
    }

    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getUrlProfiles() {
        return urlProfiles;
    }

    public void setUrlProfiles(String urlProfiles) {
        this.urlProfiles = urlProfiles;
    }
}
