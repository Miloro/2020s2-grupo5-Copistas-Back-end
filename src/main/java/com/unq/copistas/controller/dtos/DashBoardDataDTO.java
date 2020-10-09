package com.unq.copistas.controller.dtos;

public class DashBoardDataDTO {
    DashboardNivelCegueraDTO dashboardNivelCegueraDTO;
    DashboardSexoDTO dashboardSexoDTO;
    DashboardCantidadPagadosDTO dashboardCantidadPagadosDTO;
    DashboardCantidadDeLibrosRetiradosDTO dashboardCantidadDeLibrosRetiradosDTO;

    DashboardCantidadDeLibrosIdiomaDTO dashboardCantidadDeLibrosIdiomaDTO;

    public DashBoardDataDTO() {

    }

    public DashboardNivelCegueraDTO getDashboardNivelCegueraDTO() {
        return dashboardNivelCegueraDTO;
    }

    public void setDashboardNivelCegueraDTO(DashboardNivelCegueraDTO dashboardNivelCegueraDTO) {
        this.dashboardNivelCegueraDTO = dashboardNivelCegueraDTO;
    }

    public DashboardSexoDTO getDashboardSexoDTO() {
        return dashboardSexoDTO;
    }

    public void setDashboardSexoDTO(DashboardSexoDTO dashboardSexoDTO) {
        this.dashboardSexoDTO = dashboardSexoDTO;
    }

    public DashboardCantidadPagadosDTO getDashboardCantidadPagadosDTO() {
        return dashboardCantidadPagadosDTO;
    }

    public void setDashboardCantidadPagadosDTO(DashboardCantidadPagadosDTO cantidadDeLibrosPagados) {
        this.dashboardCantidadPagadosDTO = cantidadDeLibrosPagados;
    }

    public DashboardCantidadDeLibrosRetiradosDTO getDashboardCantidadDeLibrosRetiradosDTO() {
        return dashboardCantidadDeLibrosRetiradosDTO;
    }

    public void setDashboardCantidadDeLibrosRetiradosDTO(DashboardCantidadDeLibrosRetiradosDTO dashboardCantidadDeLibrosRetiradosDTO) {
        this.dashboardCantidadDeLibrosRetiradosDTO = dashboardCantidadDeLibrosRetiradosDTO;
    }

    public DashboardCantidadDeLibrosIdiomaDTO getDashboardCantidadDeLibrosIdiomaDTO() {
        return dashboardCantidadDeLibrosIdiomaDTO;
    }

    public void setDashboardCantidadDeLibrosIdiomaDTO(DashboardCantidadDeLibrosIdiomaDTO dashboardCantidadDeLibrosIdiomaDTO) {
        this.dashboardCantidadDeLibrosIdiomaDTO = dashboardCantidadDeLibrosIdiomaDTO;
    }
}
