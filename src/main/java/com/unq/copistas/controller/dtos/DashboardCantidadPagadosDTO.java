package com.unq.copistas.controller.dtos;

public class DashboardCantidadPagadosDTO {

    private long pagados;
    private long inpagos;

    public DashboardCantidadPagadosDTO(long pagados, long inpagos) {
        this.pagados = pagados;
        this.inpagos = inpagos;
    }

    public long getPagados() {
        return pagados;
    }

    public void setPagados(long pagados) {
        this.pagados = pagados;
    }

    public long getInpagos() {
        return inpagos;
    }

    public void setInpagos(long inpagos) {
        this.inpagos = inpagos;
    }
}
