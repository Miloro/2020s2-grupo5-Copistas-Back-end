package com.unq.copistas.controller.dtos;

public class DashBoardDataDTO {
    DashboardNivelCegueraDTO dashboardNivelCegueraDTO;
    DashboardSexoDTO dashboardSexoDTO;

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
}
