package com.zxm.spider.model;

public class DiyGameVO {
    private Integer basicid;

    private String host;

    private String guest;

    private String gametime;

    private String gametype;

    private String ishot;

    private String livetitle;

    private String hostpic;

    private String guestpic;

    private String gamestate;

    private String linkone;

    private String linktwo;

    private String linkthree;

    public Integer getBasicid() {
        return basicid;
    }

    public void setBasicid(Integer basicid) {
        this.basicid = basicid;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest == null ? null : guest.trim();
    }

    public String getGametime() {
        return gametime;
    }

    public void setGametime(String gametime) {
        this.gametime = gametime == null ? null : gametime.trim();
    }

    public String getGametype() {
        return gametype;
    }

    public void setGametype(String gametype) {
        this.gametype = gametype == null ? null : gametype.trim();
    }

    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot == null ? null : ishot.trim();
    }

    public String getLivetitle() {
        return livetitle;
    }

    public void setLivetitle(String livetitle) {
        this.livetitle = livetitle == null ? null : livetitle.trim();
    }

    public String getHostpic() {
        return hostpic;
    }

    public void setHostpic(String hostpic) {
        this.hostpic = hostpic == null ? null : hostpic.trim();
    }

    public String getGuestpic() {
        return guestpic;
    }

    public void setGuestpic(String guestpic) {
        this.guestpic = guestpic == null ? null : guestpic.trim();
    }

    public String getGamestate() {
        return gamestate;
    }

    public void setGamestate(String gamestate) {
        this.gamestate = gamestate == null ? null : gamestate.trim();
    }

    public String getLinkone() {
        return linkone;
    }

    public void setLinkone(String linkone) {
        this.linkone = linkone == null ? null : linkone.trim();
    }

    public String getLinktwo() {
        return linktwo;
    }

    public void setLinktwo(String linktwo) {
        this.linktwo = linktwo == null ? null : linktwo.trim();
    }

    public String getLinkthree() {
        return linkthree;
    }

    public void setLinkthree(String linkthree) {
        this.linkthree = linkthree == null ? null : linkthree.trim();
    }
}