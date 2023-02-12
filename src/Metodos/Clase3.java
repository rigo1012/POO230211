package Metodos;

public class Clase3 {

    public static void Mascota(String nombre, String tipo, int edad){
        System.out.println(
                "Tu mascota se llama" + nombre
                + ", es un " + tipo
                + "y tiene" + edad + "meses"
        );
    }
    public void registraTuMascota() {
        Mascota("Lila","PERRO",5);
    }


    //Metodos
    public static void resgistro(String apellido, String nombre, int edad, char sexo, double altura){
        System.out.println(
                "Apellido" + apellido
                + "Nombre" + nombre
                + "Edad" + edad
                + "Sexo" + sexo
        );
    }
    //
    public void introduce() {
        resgistro("Vargas","Saul",25,'h',1.70);
    }

    public static void datos (String nombre, String lugarOrigen, String nacionalidad, String destino, int estancia) {
        System.out.println(
                "Su nombre es" + nombre
                        + "Su lugar de origen es" + lugarOrigen
                        + "Su nacionalidad es" + nacionalidad
                        + "Destino es" + destino
                        + "con una estancia de " + estancia + "meses"
        );
    }

    public void pasaporte() {
        datos("Rodrigo", "Teziutlan","Mexicana","Canada",6);
    }
}

