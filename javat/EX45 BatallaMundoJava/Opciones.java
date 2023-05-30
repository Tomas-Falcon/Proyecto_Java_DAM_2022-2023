public class Opciones{

    Opciones(String respuesta){


        int respuestaInt = Integer.parseInt(respuesta);
        if(respuestaInt == 1){
            ClaseMain.iniciarBatallaMain();
        }
        else if(respuestaInt == 2){
            ClaseMain.cuantosSoldadosSeAgregan();
        }
        else if (respuestaInt == 3){
            System.exit(0);
        }
        else{
            System.out.println("El valor ingresado es incorrecto, porfavor ingrese algun valor ya establecido (1, 2, 3)");
             ClaseMain.menu();
            }

    }
}