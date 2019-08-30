package com.ibm;

import java.util.Scanner;

public class GerenciarBanco {
        Banco banco = new Banco();

        public static void main(String[] args) {
            GerenciarBanco gb = new GerenciarBanco();
            int op = 0;
            Scanner in = new Scanner(System.in);
            do {
                System.out.println("######## Banco #########");
                System.out.println("1..Cadastrar");
                System.out.println("2..Depositar");
                System.out.println("3..Sacar");
                System.out.println("4..Consultar");
                System.out.println("9..Sair");
                System.out.println("########################");
                System.out.println("Digite a opção desejada:");
                op = Integer.parseInt(in.nextLine());

                switch (op) {
                    case 1:
                        gb.execCadastrar();
                        break;
                    case 2:
                        gb.execDepositar();
                        break;
                    case 3:
                        gb.execSacar();
                        break;
                    case 4:
                        gb.execConsultar();
                        break;
                    case 9:
                        System.out.println("\nFim\n");
                        break;
                    default:
                        System.out.println("\nOpçao Inválida!\n");
                        break;
                }
            }while(op!=9);
        }//main

        public void execCadastrar() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o nome do Cliente:");
            banco.setNomeCliente(in.nextLine());

            System.out.println("Digite o nome da Agência:");
            banco.setAgencia(in.nextLine());

            System.out.println("Digite o número da Conta:");
            banco.setConta(in.nextLine());
            System.out.println("Cliente cadastrado com sucesso!");
            System.out.println("\n");
        }

        public void execConsultar() {
            System.out.println(banco.toString());
        }

        public void execDepositar() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o valor do Depósito: ");
            banco.depositar(Double.parseDouble(in.nextLine()));
            System.out.println("Depósito efetuado com sucesso!");
            System.out.println("\n");
        }

        public void execSacar() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o valor do Saque: ");
            if(banco.sacar(Double.parseDouble(in.nextLine())) == 1) {
                System.out.println("Saque efetuado com sucesso!");
                System.out.println("\n");
            }else {
                System.out.println("Impossível efetuar o saque, o seu saldo tem um limite inferior!");
                System.out.println("\n");
            }
        }
    }