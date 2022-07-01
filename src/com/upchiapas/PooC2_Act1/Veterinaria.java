package com.upchiapas.PooC2_Act1;

import com.upchiapas.PooC2_Act1.models.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Veterinaria {
    static ArrayList<Producto> listaProductos = new ArrayList<>();
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        byte opcion;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("============VETERINARIA===============");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Agregar Servicio");
            System.out.println("3. producto");
            System.out.println("4. Corte caja");
            opcion= teclado.nextByte();
            switch (opcion){
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    break;
                case 3:
                    break;

            }
        }while (opcion != 3);
    }

    public static void agregarCliente(){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int folio = 1234;
        for (int i = 0; i< listaClientes.size(); i++){ //generar el folio de cliente que va en orden ascendente
            folio++;
        }
        System.out.println("Nombre del cliente: ");
        nombre=teclado.next();
        Cliente cliente= new Cliente(nombre, folio);
        System.out.println("Su folio es: "+folio);
        listaClientes.add(cliente);
        agregarMascota();
    }

    public static void agregarMascota(){
        Scanner scanner = new Scanner(System.in);
        boolean auxiliar;
        byte op;
        String tipo;
        String nombre;
        String sexo;
        int peso;
        String tipoSangre;
        String padecimiento;
        String medicamentoPreventivo;
        String esterilizado;
        int id = 2347;
        for (int i = 0; i< listaClientes.size(); i++){
           id++;
        }
        String raza;
        String color;
        int posicion = (listaClientes.size()-1);
        System.out.println("Ingrese la mascota del cliente: ");
        System.out.println("1.Mamifero ");
        System.out.println("2.Ave");
        System.out.println("3.Acuático");
        op = entrada.nextByte();
        System.out.println("Ingrese que tipo es la mascota: ");
        tipo = scanner.nextLine();
       //entrada.next();
        System.out.println("Ingrese el nombre de la mascota: ");
        nombre = scanner.nextLine();
        //entrada.next();
        System.out.println("Sexo: ");
        sexo = scanner.nextLine();
        //entrada.next();
        System.out.println("Peso: ");
        peso = scanner.nextInt();
        System.out.println("Tipo de sangre: ");
        tipoSangre = scanner.nextLine();
        entrada.next();
        do {
            auxiliar = false;
            switch (op){
                case 1:
                    auxiliar=true;
                    System.out.println("Raza: ");
                    raza = scanner.nextLine();
                    System.out.println("Color: ");
                    color = scanner.nextLine();
                    ///se empieza a hacer el llenado del historial clinico
                    System.out.println("Padecimiento de la mascota: ");
                    padecimiento = scanner.nextLine();
                    System.out.println("Medicamento preventivo: ");
                    medicamentoPreventivo = scanner.nextLine();
                    System.out.println("Esterilizado: ");
                    esterilizado = scanner.nextLine();
                    HistorialClinico historialMamifero = new HistorialClinico(tipo,nombre,sexo,peso,color,raza,padecimiento,medicamentoPreventivo,esterilizado);
                    Mamifero mamifero = new Mamifero(tipo,nombre,sexo,peso,tipoSangre,id,raza,color,historialMamifero);
                    listaClientes.get(posicion).listaAnimales.add(mamifero);
                    for (int i = 0; i< listaClientes.get(posicion).listaAnimales.size(); i++){
                        System.out.println("Las mascotas del cliente: "+listaClientes.get(posicion).getNombre()+" son: "+listaClientes.get(posicion).listaAnimales.get(i).getTipo());
                    }
                    break;
                case 2:
                    auxiliar=true;
                    raza = "------------";
                    System.out.println("Color: ");
                    color = scanner.nextLine();
                    System.out.println("Padecimiento de la mascota: ");
                    padecimiento = scanner.nextLine();
                    System.out.println("Medicamento preventivo: ");
                    medicamentoPreventivo = scanner.nextLine();
                    System.out.println("Esterilizado: ");
                    esterilizado = scanner.nextLine();
                    HistorialClinico historialAve = new HistorialClinico(tipo,nombre,sexo,peso,color,raza,padecimiento,medicamentoPreventivo,esterilizado);
                    Ave ave = new Ave(tipo,nombre,sexo,peso,tipoSangre,id,historialAve,color);
                    listaClientes.get(posicion).listaAnimales.add(ave);
                    for (int i = 0; i< listaClientes.get(posicion).listaAnimales.size(); i++){
                        System.out.println("Las mascotas del cliente: "+listaClientes.get(posicion).getNombre()+" son: "+listaClientes.get(posicion).listaAnimales.get(i).getTipo());
                    }
                    break;
                case 3:
                    auxiliar=true;
                    raza = "------------";
                    System.out.println("Color: ");
                    color = scanner.nextLine();
                    System.out.println("Padecimiento de la mascota: ");
                    padecimiento = scanner.nextLine();
                    System.out.println("Medicamento preventivo: ");
                    medicamentoPreventivo = scanner.nextLine();
                    System.out.println("Esterilizado: ");
                    esterilizado = scanner.nextLine();
                    HistorialClinico historialPez = new HistorialClinico(tipo,nombre,sexo,peso,color,raza,padecimiento,medicamentoPreventivo,esterilizado);
                    Pez pez = new Pez(tipo,nombre,sexo,peso,tipoSangre,id,historialPez,color);
                    listaClientes.get(posicion).listaAnimales.add(pez);
                    for (int i = 0; i< listaClientes.get(posicion).listaAnimales.size(); i++){
                        System.out.println("Las mascotas del cliente: "+listaClientes.get(posicion).getNombre()+" son: "+listaClientes.get(posicion).listaAnimales.get(i).getTipo());
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    System.out.println("Intente de nuevo");
            }
        }while (auxiliar == false);


    }


}
