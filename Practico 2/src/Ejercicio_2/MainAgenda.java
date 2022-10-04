package Ejercicio_2;

public class MainAgenda {
    public static void main(String[] args) throws Exception {
        //creamos los usuarios
        Usuario usuario1 = new Usuario("Juan Perez", "442323", "juanperez@gmail.com");
        Usuario usuario2 = new Usuario("Pedro", "434343", "pedro@gmail.com");
        Usuario usuario3 = new Usuario("Maria Marta", "4542315", "maria@gmail.com");
    
        //creo el objeto de tipo Participantes y Asistentes, con los usuarios que quiero
        Usuario[] participantes = {usuario1, usuario2};
        Usuario[] asistentes = {usuario3};
    
        //creo las reuniones
        Reunion reunion1 = new Reunion(participantes, asistentes, "Club River", "futbol", 16, " 3 hs");
        Reunion reunion2 = new Reunion(participantes, asistentes, "Unicen", "ingreso", 19, "1 hs");
    
        //creamos el objeto de tipo Reunion, con las reuniones que contiene
        Reunion[] reuniones = {reunion1, reunion2};
    
        Agenda agenda = new Agenda(usuario1, reuniones); // TODO --> NO ME TOMA LA AGENDA!!

        mostrarInfoUsuario(usuario1);
        mostrarInfoAgenda(agenda);
        mostrarInfoReunion(reunion1);
    }
    
    public static void mostrarInfoAgenda(Agenda agenda){
        System.out.println("Dueño: "+agenda.getDuenio());
        System.out.println("Reuniones : "+agenda.getReuniones());
    }
    public static void mostrarInfoUsuario(Usuario usuario) {
        System.out.println("Nombre: "+usuario.getNombre());
        System.out.println("Telefono: "+usuario.getTelefono());
        System.out.println("Email: "+usuario.getEmail());
    }
    public static void mostrarInfoReunion(Reunion reunion){
        System.out.println("Lugar a realizar: "+reunion.getLugar());
        System.out.println("Tema a tratar : "+reunion.getTema());
        System.out.println("Hora comienzo : "+reunion.getHsComienzo()+ " hs");
        System.out.println("Duracion : "+reunion.getDuracion_reunion());



    }
    
}
