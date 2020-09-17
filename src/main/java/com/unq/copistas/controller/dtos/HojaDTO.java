package com.unq.copistas.controller.dtos;

public class HojaDTO {
    private long destinatario_id;
    private long solicitante_id;
    private long libro_id;

    public HojaDTO(long destinatario_id, long solicitante_id, long libro_id) {
        this.destinatario_id = destinatario_id;
        this.solicitante_id = solicitante_id;
        this.libro_id = libro_id;
    }

    public long getDestinatario_id() {
        return destinatario_id;
    }

    public void setDestinatario_id(long destinatario_id) {
        this.destinatario_id = destinatario_id;
    }

    public long getSolicitante_id() {
        return solicitante_id;
    }

    public void setSolicitante_id(long solicitante_id) {
        this.solicitante_id = solicitante_id;
    }

    public long getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(long libro_id) {
        this.libro_id = libro_id;
    }
}
