package com.unq.copistas.controller.dtos;

public class DashboardCantidadDeLibrosRetiradosDTO {

    private long retirados;
    private long noRetirados;

    public DashboardCantidadDeLibrosRetiradosDTO(long retirados, long noRetirados) {
        this.retirados = retirados;
        this.noRetirados = noRetirados;
    }

    public long getRetirados() {
        return retirados;
    }

    public void setRetirados(long retirados) {
        this.retirados = retirados;
    }

    public long getNoRetirados() {
        return noRetirados;
    }

    public void setNoRetirados(long noRetirados) {
        this.noRetirados = noRetirados;
    }
}
