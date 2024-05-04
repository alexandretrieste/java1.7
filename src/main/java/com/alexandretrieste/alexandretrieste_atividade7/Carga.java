/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandretrieste.alexandretrieste_atividade7;

/**
 *
 * @author xande
 */
import java.text.DecimalFormat;

public final class Carga extends Veiculo implements Calcular{

    private int cargaMax;
    private int tara;

    public Carga(){
        this.cargaMax = 0;
        this.tara = 0;
    }

    public Carga(String placa, String marca, String modelo, String cor, int velocMax, int qtdRodas, int cargaMax,
                 int tara, int potenciaMotor, int qtdPistoesMotor){
        super(placa, marca, modelo, cor, velocMax, qtdRodas, potenciaMotor, qtdPistoesMotor);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.000");
        String calcVelFormatado = decimalFormat.format(calcVel());
        return  "Marca := " + getMarca() + "\n" +
                "Modelo := " + getModelo() + "\n" +
                "Cor := " + getCor() + "\n" +
                "Placa := " + getPlaca() + "\n" +
                "QtdRodas := " + getQtdRodas() + "\n" +
                "Velocidade Máxima (km/h) := " + super.getVelocMax() + " km/h\n" +
                "Velocidade Máxima (cm/h) := " + calcVelFormatado + " cm/h\n" +
                "Quantidade de Carga Maxima := " + getCargaMax() + "\n" +
                "Tara := " + getTara() + "\n" +
                "Potência do Motor := " + getMotor().getPotencia() + "\n" +
                "Qtd Pistões Motor := " + getMotor().getQtdPist() + "\n" +
                "Valor calculado Interface := " + calcular() + "\n";
    }
    @Override
    public float calcVel() { return super.getVelocMax() * 100000; }

    @Override
    public int calcular() {
        int total = 0;
        total += getCargaMax();
        total += getTara();
        total += getVelocMax();
        total += getQtdRodas();
        total += getMotor().getPotencia();
        total += getMotor().getQtdPist();
        return total;
    }
}


