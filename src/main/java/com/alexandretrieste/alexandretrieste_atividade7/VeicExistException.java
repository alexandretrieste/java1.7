/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandretrieste.alexandretrieste_atividade7;

/**
 *
 * @author xande
 */
public class VeicExistException extends Exception {
    public VeicExistException(String tipoVeiculo, String placa) {
        super(String.format("\n====================ATENÇÃO=====================\n"+
                "Já existe um veículo (%s) cadastrado com a placa %s\n", tipoVeiculo,placa));
    }

    public VeicExistException(String tipoVeiculo){
        super("\n======================== ATENÇÃO! ========================\n"+
                "Veículo " + tipoVeiculo + " não encontrado com a placa informada.\n");
    }
}
