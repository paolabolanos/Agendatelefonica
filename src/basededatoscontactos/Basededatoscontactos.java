
package basededatoscontactos;

import java.util.Scanner;


public class Basededatoscontactos {

   
    public static void main(String[] args) {
      contactos datos[] = new contactos[15]; 

        int opciones = 0; 

        Scanner teclado = new Scanner(System.in); 

        Scanner letras = new Scanner(System.in); 

        while (opciones != 5) { 

            System.out.println("1. Guardar contacto"); 

            System.out.println("2. Buscar contacto"); 

            System.out.println("3. Ver todos los contactos"); 

            System.out.println("4. Modificar contacto"); 

            System.out.println("5. Salir"); 

            System.out.println("Ingrese el numero de opcion: "); 

            opciones = teclado.nextInt(); 

            System.out.println("----------------------------"); 

            if (opciones == 1) { 

                System.out.println("Ingrese el numero de telefono"); 

                int telefono = teclado.nextInt(); 

                System.out.println("Ingrese el nombre del contacto "); 

                String nombre = letras.nextLine(); 

                System.out.println("Ingrese el correo electronico"); 

                String correo = letras.nextLine(); 

                System.out.println(nuevoContacto(telefono, nombre, correo, datos)); 

            } else if (opciones == 2) { 
                
                 System.out.println("Ingrese el numero de telefono"); 

                int telefono = teclado.nextInt(); 


                System.out.println(buscarContactos(telefono, datos)); 

            } else if (opciones == 3) { 

              System.out.println(imprimirTodo(datos)); 

            } else if (opciones == 4) { 

        System.out.println("Ingrese el numero de telefono "); 

                int telefono = teclado.nextInt(); 

                if (buscarContactosBooleano(telefono, datos)) { 

                    System.out.println("Ingrese el nuevo nombre "); 

                    String nombre = letras.nextLine(); 

                    System.out.println("Ingrese el nuevo correo"); 

                    String correo = letras.nextLine(); 

                    System.out.println(modificarDatos(telefono, nombre, correo, datos)); 

                } else { 

                    System.out.println("No existe el contacto"); 

                } 

            } 

        } 

    } 

  


  

    public static String nuevoContacto(int telefono, String nombre, String correo, contactos arreglo[]) { 

        boolean lleno = true; 

        for (int i = 0; i < arreglo.length; i++) { 

            if (arreglo[i] == null) { 

                arreglo[i] = new contactos(telefono, nombre, correo); 

                lleno = false; 

                break; 

            } else if (arreglo[i].getTelefono() == telefono) { 

                return "Ya existe el contacto"; 

            } 

        } 

        if (!lleno) { 

            return "Contacto guardado"; 

        } else { 

            return "Ya no hay espacio"; 

        } 

    } 

    public static String buscarContactos(int telefono, contactos arreglo[]) { 

          for (int i = 0; i < arreglo.length; i++) { 

            if (arreglo[i] != null && arreglo[i].getTelefono() == telefono) { 

                   return "Los datos \n nombre: " + arreglo[i].getNombre()+ "Telefono: " + arreglo[i].getTelefono()+"" + "correo: " + arreglo[i].getCorreo(); 

            } 

  

        } 

        return "No existe el contacto ingresado"; 

    } 

  

  
   public static String imprimirTodo(contactos arreglo[]) { 

        String cadena = ""; 

        for (int i = 0; i < arreglo.length; i++) { 

            if (arreglo[i] != null) { 

                cadena = cadena + arreglo[i].getNombre() + "|" + arreglo[i].getTelefono() + "|" + arreglo[i].getCorreo() + "\n"; 

            } 

  

        } 

        return cadena; 

    } 

    public static boolean buscarContactosBooleano(int telefono, contactos arreglo[]) { 

        for (int i = 0; i < arreglo.length; i++) { 

            if (arreglo[i] != null && arreglo[i].getTelefono() == telefono) { 

                return true; 

            } 

  

        } 

        return false; 

    } 

  

    public static String modificarDatos(int telefono,String nombre,String correo, contactos arreglo[]) { 

        for (int i = 0; i < arreglo.length; i++) { 

            if (arreglo[i] != null && arreglo[i].getTelefono() == telefono) {  

                arreglo[i].setNombre(nombre);  

                arreglo[i].setCorreo(correo); 

                return "Se actualizo con exito"; 

            } 

  

        } 

        return ""; 

    } 

}

    
    

sssss