package com.upchiapas.PooC2_Act1;

import com.upchiapas.PooC2_Act1.models.Cliente;
import com.upchiapas.PooC2_Act1.models.Mamifero;
import com.upchiapas.PooC2_Act1.models.Producto;
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
        int numero;
        byte folio = 0000;
        for (int i = 0; i< listaClientes.size(); i++){
            folio++;
        }
        System.out.println("Nombre del cliente: ");
        nombre=teclado.next();
        System.out.println("Ingrese su numero telefonico: ");
        numero = teclado.nextInt();
        Cliente cliente= new Cliente(nombre, numero, folio);
        listaClientes.add(cliente);
    }

    public static void agregarMascota(){
        byte op;
        String tipoMamifero;
        String nombre;
        String sexo;
        int peso;
        String tipoSangre;
        byte id;
        int posicion = listaClientes.size();
        System.out.println("Ingrese la mascota del cliente: ");
        System.out.println("1.Mamifero ");
        System.out.println("2.Ave");
        System.out.println("3.Acuático");
        System.out.println("Ingrese que tipo es la mascota: ");
        tipoMamifero = entrada.nextLine();
        System.out.println("Ingrese el nombre de la mascota: ");
        nombre = entrada.nextLine();;
        System.out.println("Sexo: ");
        sexo = entrada.nextLine();
        System.out.println("Peso: ");
        peso = entrada.nextInt();
        System.out.println("Tipo de sangre: ");
        tipoSangre = entrada.nextLine();
        op = entrada.nextByte();
        if (op == 1){
            Mamifero mamifero = new Mamifero(tipoMamifero,);
            listaClientes.get(posicion).listaAnimales.add();
        } else if (op ==2) {
            listaClientes.get(posicion).listaAnimales.add();
        } else if (op ==3) {
            listaClientes.get(posicion).listaAnimales.add();
        }

    }

}
