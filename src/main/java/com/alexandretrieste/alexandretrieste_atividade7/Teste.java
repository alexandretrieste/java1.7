/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.alexandretrieste.alexandretrieste_atividade7;

/**
 *
 * @author xande
 */
public class Teste {
    public static void main(String[] args) {

        int resp = 0;
        boolean adicionarNovoVeiculo = false;
        Leitura leitura = new Leitura();
        BDVeiculos bdVeiculos = new BDVeiculos();

        //Menu
        do{
            System.out.println("=============================================\n");
            System.out.println("Sistema de Gestão de Veículos - Menu Inicial\n");
            System.out.println("1)  Cadastrar Veiculo de Passeio");
            System.out.println("2)  Cadastrar Veiculo de Carga");
            System.out.println("3)  Imprimir Todos os Veiculos de Passeio");
            System.out.println("4)  Imprimir Todos os Veiculos de Carga");
            System.out.println("5)  Imprimir Veiculo de Passeio pela Placa");
            System.out.println("6)  Imprimir Veiculo de Carga pela Placa");
            System.out.println("7)  Excluir Veículo de Passeio pela Placa");
            System.out.println("8)  Excluir Veículo de Carga pela Placa");
            System.out.println("9)  Sair do Sistema\n\n");
            System.out.println("=============================================");
            resp = leitura.entDadosInt("Digite uma das opções acima: ");

            switch (resp){
                case 1:
                    do {
                        System.out.println("=================== CADASTRO DE VEICULO DE PASSEIO ===================");
                        System.out.println("Insira os dados e valores solicitados abaixo");
                        System.out.println("======================================================================");
                        String placa = leitura.entDadosString("Placa: ");
                        boolean placaExistente = false;
                        try {
                            for (Passeio passeio : bdVeiculos.getListaPasseio()) {
                                if (passeio != null && passeio.getPlaca().equalsIgnoreCase(placa)) {
                                    throw new VeicExistException("passeio", placa);
                                }
                            }
                            String marca = leitura.entDadosString("Marca: ");
                            String modelo = leitura.entDadosString("Modelo: ");
                            String cor = leitura.entDadosString("Cor: ");
                            int qtdRodas = leitura.entDadosInt("Quantidade de Rodas: ");
                            int qtdPassageiros = leitura.entDadosInt("Quantidade de Passageiros: ");
                            int velocMax = leitura.entDadosInt("Velocidade Máxima: ");
                            try {
                                if (velocMax < 80 || velocMax > 110) {
                                    throw new VelocException();
                                }
                            } catch (VelocException e) {
                                System.out.println(e.getMessage());
                                velocMax = 100;
                            }
                            int potenciaMotor = leitura.entDadosInt("Potência do Motor: ");
                            int qtdPistoesMotor = leitura.entDadosInt("Quantidade de Pistões do Motor: ");
                            Passeio novoVeiculo = new Passeio(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPassageiros,
                                    potenciaMotor, qtdPistoesMotor);
                            bdVeiculos.getListaPasseio().add(novoVeiculo);
                            System.out.println("Veículo de passeio cadastrado com sucesso!");
                            System.out.println("Deseja adicionar um novo veículo? (S/N)");
                            String resposta = leitura.entDadosString("");
                            if (resposta.equalsIgnoreCase("S")) {
                                adicionarNovoVeiculo = true;
                            } else {
                                adicionarNovoVeiculo = false;
                            }
                        } catch (VeicExistException e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                    }while(adicionarNovoVeiculo);
                    adicionarNovoVeiculo = true;
                    break;
                case 2:
                    do{
                        System.out.println("=================== CADASTRO DE VEICULO DE CARGA ===================");
                        System.out.println("Insira os dados e valores solicitados abaixo");
                        System.out.println("====================================================================");
                        String placa = leitura.entDadosString("Placa: ");
                        boolean placaExistente = false;
                        try {
                            for (Carga carga : bdVeiculos.getListaCarga()) {
                                if (carga != null && carga.getPlaca().equalsIgnoreCase(placa)) {
                                    throw new VeicExistException("carga", placa);
                                }
                            }
                            String marca = leitura.entDadosString("Marca: ");
                            String modelo = leitura.entDadosString("Modelo: ");
                            String cor = leitura.entDadosString("Cor: ");
                            int qtdRodas = leitura.entDadosInt("Quantidade de Rodas: ");
                            int cargaMaxima = leitura.entDadosInt("Carga Máxima: ");
                            int tara = leitura.entDadosInt("Tara: ");
                            int velocMax = leitura.entDadosInt("Velocidade Máxima: ");
                            try {
                                if (velocMax < 80 || velocMax > 110) {
                                    throw new VelocException();
                                }
                            } catch (VelocException e) {
                                System.out.println(e.getMessage());
                                velocMax = 90;
                            }
                            int potenciaMotor = leitura.entDadosInt("Potência do Motor: ");
                            int qtdPistoesMotor = leitura.entDadosInt("Quantidade de Pistões do Motor: ");
                            Carga novoVeiculo = new Carga(placa, marca, modelo, cor, velocMax, qtdRodas, cargaMaxima, tara,
                                    potenciaMotor, qtdPistoesMotor);
                            bdVeiculos.getListaCarga().add(novoVeiculo);
                            System.out.println("Veículo de carga cadastrado com sucesso!");
                            System.out.println("Deseja adicionar um novo veículo? (S/N)");
                            String resposta = leitura.entDadosString("");
                            if (resposta.equalsIgnoreCase("S")) {
                                adicionarNovoVeiculo = true;
                            } else {
                                adicionarNovoVeiculo = false;
                            }
                        }catch (VeicExistException e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                    }while(adicionarNovoVeiculo);
                    adicionarNovoVeiculo = true;
                    break;
                case 3:
                    System.out.println("Todos os Veículos de Passeio:");
                    for (Passeio passeio : bdVeiculos.getListaPasseio()) {
                        if (passeio != null) {
                            System.out.println("\n=============== VEICULO PASSEIO ===============\n");
                            System.out.println(passeio);
                            System.out.println("===============================================\n");
                        }
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 4:
                    System.out.println("Todos os Veículos de Carga:");
                    for (Carga carga : bdVeiculos.getListaCarga()) {
                        if (carga != null) {
                            System.out.println("\n=============== VEICULO CARGA ===============\n");
                            System.out.println(carga);
                            System.out.println("===============================================\n");
                        }
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 5:
                    try {
                        String placaPasseio = leitura.entDadosString("Insira a placa que deseja pesquisar: ");
                        boolean encontradoPasseio = false;
                        for (Passeio passeio : bdVeiculos.getListaPasseio()) {
                            if (passeio != null && passeio.getPlaca().equalsIgnoreCase(placaPasseio)) {
                                System.out.println("\n=============== VEICULO DE PASSEIO PLACA " + placaPasseio + " ===============\n");
                                System.out.println(passeio);
                                System.out.println("===============================================\n");
                                encontradoPasseio = true;
                                break;
                            }
                        }
                        if (!encontradoPasseio) {
                            throw new VeicExistException("passeio");
                        }
                    } catch (VeicExistException e) {
                        System.out.println(e.getMessage());
                        adicionarNovoVeiculo = true;
                        break;
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 6:
                    try{
                        String placaCarga = leitura.entDadosString("Insira a placa que deseja pesquisar: ");
                        boolean encontradoCarga = false;
                        for (Carga carga : bdVeiculos.getListaCarga()) {
                            if (carga != null && carga.getPlaca().equalsIgnoreCase(placaCarga)) {
                                System.out.println("\n=============== VEICULO DE CARGA PLACA "+ placaCarga +" ===============\n");
                                System.out.println(carga);
                                System.out.println("===============================================\n");
                                encontradoCarga = true;
                                break;
                            }
                        }
                        if (!encontradoCarga) {
                            throw new VeicExistException("carga");
                        }
                    } catch(VeicExistException e) {
                        System.out.println(e.getMessage());
                        adicionarNovoVeiculo = true;
                        break;
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 7:
                    try{
                        String placaPasseio = leitura.entDadosString("Insira a placa do veículo que deseja excluir: ");
                        boolean encontradoPasseio = false;
                        for (Passeio passeio : bdVeiculos.getListaPasseio()) {
                            if (passeio != null && passeio.getPlaca().equalsIgnoreCase(placaPasseio)) {
                                System.out.println("\n====================ATENÇÃO=====================\n");
                                System.out.println("Excluindo veículo selecionado...\n");
                                bdVeiculos.getListaPasseio().remove(passeio);
                                encontradoPasseio = true;
                                break;
                            }
                        }
                        if (!encontradoPasseio) {
                            throw new VeicExistException("carga");
                        }
                    } catch(VeicExistException e) {
                        System.out.println(e.getMessage());
                        adicionarNovoVeiculo = true;
                        break;
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 8:
                    try{
                        String placaCarga = leitura.entDadosString("Insira a placa do veículo que deseja excluir: ");
                        boolean encontradoCarga = false;
                        for (Carga carga : bdVeiculos.getListaCarga()) {
                            if (carga != null && carga.getPlaca().equalsIgnoreCase(placaCarga)) {
                                System.out.println("\n====================ATENÇÃO=====================\n");
                                System.out.println("Excluindo veículo selecionado...\n");
                                bdVeiculos.getListaCarga().remove(carga);
                                encontradoCarga = true;
                                break;
                            }
                        }
                        if (!encontradoCarga) {
                            throw new VeicExistException("carga");
                        }
                    } catch(VeicExistException e) {
                        System.out.println(e.getMessage());
                        adicionarNovoVeiculo = true;
                        break;
                    }
                    adicionarNovoVeiculo = true;
                    break;
                case 9:
                    System.out.println("Saindo do sistema...");
                    adicionarNovoVeiculo = false;
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");
                    adicionarNovoVeiculo = true;
                    break;
            }
        }while(adicionarNovoVeiculo);
    }
}
