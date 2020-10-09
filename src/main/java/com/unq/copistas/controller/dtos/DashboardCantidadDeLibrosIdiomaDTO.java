package com.unq.copistas.controller.dtos;

public class DashboardCantidadDeLibrosIdiomaDTO {
    private long espaniol;
    private long ingles;
    private long italiano;
    private long aleman;
    private long frances;
    private long japones;
    private long chino;
    private long holandes;


    public DashboardCantidadDeLibrosIdiomaDTO(long espaniol, long ingles, long italiano, long aleman, long frances, long japones, long chino, long holandes) {
        this.espaniol = espaniol;
        this.ingles = ingles;
        this.italiano = italiano;
        this.aleman = aleman;
        this.frances = frances;
        this.japones = japones;
        this.chino = chino;
        this.holandes = holandes;
    }

    public long getEspaniol() {
        return espaniol;
    }

    public void setEspaniol(long espaniol) {
        this.espaniol = espaniol;
    }

    public long getIngles() {
        return ingles;
    }

    public void setIngles(long ingles) {
        this.ingles = ingles;
    }

    public long getItaliano() {
        return italiano;
    }

    public void setItaliano(long italiano) {
        this.italiano = italiano;
    }

    public long getAleman() {
        return aleman;
    }

    public void setAleman(long aleman) {
        this.aleman = aleman;
    }

    public long getFrances() {
        return frances;
    }

    public void setFrances(long frances) {
        this.frances = frances;
    }

    public long getJapones() {
        return japones;
    }

    public void setJapones(long japones) {
        this.japones = japones;
    }

    public long getChino() {
        return chino;
    }

    public void setChino(long chino) {
        this.chino = chino;
    }

    public long getHolandes() {
        return holandes;
    }

    public void setHolandes(long holandes) {
        this.holandes = holandes;
    }
}
