package patronesCreacionales.Singleton;

public class Conection {
    //Declaracion
    private static Conection instance;
    //private static Conection instance = new Conection();
    //Para evitar la instanciación mediante new
    private Conection(){

    }
    //Obtenemos la instancia unicamente por este metodo
    public static Conection getInstance(){
        if(instance == null){
            instance = new Conection();
        }
        return instance;
    }
    //Si la instancia no existe se crea una nueva. Si ya existe devuelve la que esta creada

    //Metodos de prueba
    public void conect(){
        System.out.println("Conexión aceptada");
    }
    public void disconnect(){
        System.out.println("Desconexión");
    }

}
