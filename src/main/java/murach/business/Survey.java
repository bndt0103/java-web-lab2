package murach.business;

import java.io.Serializable;

public class Survey implements Serializable {
    private String heardFrom;
    private String wantsUpdates;
    private String emailNews;
    private String contactVia;

    public Survey() {
        heardFrom = "";
        wantsUpdates = "";
        emailNews = "";
        contactVia = "";
    }

    public Survey(String heardFrom, String wantsUpdates, String emailNews, String contactVia) {
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.emailNews = emailNews;
        this.contactVia = contactVia;
    }

    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    public String getWantsUpdates() {
        return wantsUpdates;
    }

    public void setWantsUpdates(String wantsUpdates) {
        this.wantsUpdates = wantsUpdates;
    }

    public String getEmailNews() {
        return emailNews;
    }

    public void setEmailNews(String emailNews) {
        this.emailNews = emailNews;
    }

    public String getContactVia() {
        return contactVia;
    }

    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }
}
