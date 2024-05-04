/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandretrieste.alexandretrieste_atividade7;

/**
 *
 * @author xande
 */
import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {

    private List <Passeio> BDPas = new ArrayList<Passeio>();
    private List <Carga> BDCar = new ArrayList<Carga>();

    public BDVeiculos() {}

    public List<Passeio> getListaPasseio() {
        return BDPas;
    }

    public void setListaPasseio(List<Passeio> listaPasseio) {
        this.BDPas = listaPasseio;
    }

    public List<Carga> getListaCarga() {
        return BDCar;
    }

    public void setListaCarga(List<Carga> listaCarga) {
        this.BDCar = listaCarga;
    }
}
