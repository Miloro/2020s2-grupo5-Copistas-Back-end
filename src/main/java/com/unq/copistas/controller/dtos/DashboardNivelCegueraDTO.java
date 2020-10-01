package com.unq.copistas.controller.dtos;

public class DashboardNivelCegueraDTO {

    private long total;
    private long parcial;

    public DashboardNivelCegueraDTO(long parcial, long total) {
        this.parcial = parcial;
        this.total = total;
    }

    public long getParcial() {
        return parcial;
    }
    public void setParcial(long parcial) {
        this.parcial = parcial;
    }
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
}
