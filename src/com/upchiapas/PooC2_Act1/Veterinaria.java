package com.upchiapas.PooC2_Act1;

import com.upchiapas.PooC2_Act1.models.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Veterinaria {
    static ArrayList<Producto> listaProductos = new ArrayList<>();
    static  ArrayList<Servicio> listaServicios = new ArrayList<>();
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Servicio servicio1 = new Servicio("Baño de mascota",300.0f);
        Servicio servicio2 = new Servicio("Consulta medica", 250.0f);
        Servicio servicio3 = new Servicio("Aplicacion de medicamento",50);
        Servicio servicio4 = new Servicio("Inseminacion artificial",680.0f);
        Producto producto1 = new Producto("Alimento",30.0f,"Nupec",100);
        Producto producto2 = new Producto("Collar",75.0f,"Perro consentido",30);
        Producto producto3 = new Producto("Cepillo",45.0f,"Doggy",65);
        Producto producto4 = new Producto("Jabon",80.0f,"Bayer",40);
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        byte opcion;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("============VETERINARIA===============");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Servicio");
            System.out.println("3. Producto");
            System.out.println("4. Corte caja");
            opcion= teclado.nextByte();
            switch (opcion){
                case 1:
                    agregarCliente();
                    break;
                case 2:

                    break;
                case 3:
                    menuProductos();
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
    public static void menuProductos(){
        Scanner scanner = new Scanner(System.in);
        int opcionMenu;
        System.out.println("1. Elegir productos existentes ");
        System.out.println("2. Agregar productos ");
        System.out.println("Ingrese la opcion deseada: ");
        opcionMenu = scanner.nextInt();
        switch (opcionMenu){
            case 1:

                System.out.println("Los productos existentes son: ");
                for (int i=0; i < listaProductos.size();i++){
                    System.out.println((i+1) + ". Nombre: "+ listaProductos.get(i).getNombre()+ " Precio: $"+listaProductos.get(i).getPrecio()+" Marca: "+listaProductos.get(i).getMarca()+" Stock: "+listaProductos.get(i).getStock());
                }
                break;
            case 2:
                agregarProductos();
                break;
            default:
                System.out.println("Opcion incorrecta");
                System.out.println("Intente de nuevo");
        }
    }
    public static void agregarProductos(){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        float precio;
        String marca;
        int stock;
        System.out.println("Ingrese el nombre del producto: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el precio: ");
        precio = scanner.nextFloat();
        System.out.println("Ingrese la marca: ");
        marca = scanner.nextLine();
        scanner.next();
        System.out.println("Ingrese el stock: ");
        stock = scanner.nextInt();
        Producto nuevoProducto = new Producto(nombre,precio,marca, stock);
        listaProductos.add(nuevoProducto);
    }
    public static void menuServicios(){
        Scanner scanner = new Scanner(System.in);
        int opcionM;
        System.out.println("1. Elegir servicios existentes ");
        System.out.println("2. Agregar servicios ");
        System.out.println("Ingrese la opcion deseada: ");
        opcionM = scanner.nextInt();
        switch (opcionM){
            case 1:

                System.out.println("Los productos existentes son: ");
                for (int i=0; i < listaProductos.size();i++){
                    System.out.println((i+1) + ". Nombre: "+ listaProductos.get(i).getNombre()+ " Precio: $"+listaProductos.get(i).getPrecio()+" Marca: "+listaProductos.get(i).getMarca()+" Stock: "+listaProductos.get(i).getStock());
                }
                break;
            case 2:
                agregarServicios();
                break;
            default:
                System.out.println("Opcion incorrecta");
                System.out.println("Intente de nuevo");
        }
    }
    public static void agregarServicios(){

    }


}
