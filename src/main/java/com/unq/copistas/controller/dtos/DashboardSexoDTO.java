package com.unq.copistas.controller.dtos;

public class DashboardSexoDTO {
    private long mujer;
    private long hombre;

    public DashboardSexoDTO(long cantidadDestinatariosFemeninos, long cantidadDestinatariosMasculinos) {
        this.mujer = cantidadDestinatariosFemeninos;
        this.hombre = cantidadDestinatariosMasculinos;
    }

    public long getMujer() {
        return mujer;
    }

    public void setMujer(long mujer) {
        this.mujer = mujer;
    }

    public long getHombre() {
        return hombre;
    }

    public void setHombre(long hombre) {
        this.hombre = hombre;
    }
}
