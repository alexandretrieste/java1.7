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

public final class Passeio extends Veiculo implements Calcular{

    private int qtdPassageiros;

    public Passeio() {
        this.qtdPassageiros = 0;
    }

    public Passeio(String placa, String marca, String modelo, String cor, int velocMax, int qtdRodas, int qtdPassageiros,
                   int potenciaMotor, int qtdPistoesMotor){
        super(placa, marca, modelo, cor, velocMax, qtdRodas, potenciaMotor, qtdPistoesMotor);
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public final void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
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
                "Velocidade Máxima (m/h) := " + calcVelFormatado + " m/h\n" +
                "Qtd Passageiros := " + getQtdPassageiros() + "\n" +
                "Potência do Motor := " + getMotor().getPotencia() + "\n" +
                "Qtd Pistões Motor := " + getMotor().getQtdPist() + "\n" +
                "Valor calculado Interface := " + calcular() + "\n";
    }

    @Override
    public float calcVel() {
        return super.getVelocMax() * 1000;
    }

    @Override
    public int calcular() {
        int total = 0;
        total += getMarca().length();
        total += getModelo().length();
        total += getPlaca().length();
        total += getCor().length();
        return total;
    }
}
