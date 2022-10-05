package misuma;

public class Perrito {
    //  declaración de los atributos 
    private int edad;
    private String raza;
    private String color;
    private String tamaño;
    private String nombre;
    
    //  creación del constructor
    public Perrito(int edad, String raza, String color, String tamaño, String nombre){
        this.edad=edad;
        this.raza=raza;
        this.color=color;
        this.tamaño=tamaño;
        this.nombre=nombre;
    }
    
    //  Sobrecarga de método
    public Perrito (String raza, String color, String tamaño, String nombre){
        this.raza=raza;
        this.color=color;
        this.tamaño=tamaño;
        this.nombre=nombre;
    }
   
   public String jugar(char jugaar){
       if (jugaar=='s'){
              String jugaaar= "*su amo le avienta la pelota y corre por ella*";
                return jugaaar;    
       } else{
           String jugar= "*se pone triston*";
                   return jugar;
       }    
   }
   
   //   método dormir
   public String dormir(){
       String dormir="*Zzzzzzzzzz*";
       return dormir;
   } 
   
   //   método caminar
   public String caminar(char collar){
       if (collar=='s'){
              String caminar= "*se pone contento*";
                return caminar;    
       } else{
           String jugar= "*se enoja y le muerde la piernita*";
                   return jugar;
       }    
   }
   
   public String rascar(){
       String rascar="*se acuesta de pancita*";
       return rascar;
   }
   
   //   getters 
   public int get_edad(){
       return this.edad;
   }
   
   public String get_raza(){
       return this.raza;
   }
    
   public String get_color(){
       return this.color;
   }
   
   public String get_tamaño(){
       return this.tamaño;
   }
   
   public String get_nombre(){
       return this.nombre;
   }
   
   //   métodos para salida de texto
   
   //1ro para los chichuahuas
   public String toString(){
       String presenta= "Hola, mi nombre es" + " " +this.nombre + " " + "tengo" + " " + this.edad + " " + "años" + " " + "soy un " + " " + this.raza + " " + "y soy de color" + " "+ this.color;
       return presenta;
   }
   
   //2do para Marley porque no sé nos dice su edad
      public String presentar(){
       String presenta= "Hola, mi nombre es" + " " +this.nombre + " " + "soy un " + " " + this.raza + " " + "y soy de color" + " "+ this.color;
       return presenta;
   }
   
    public static void main(String[] args) {
        // instancias de objetos
        Perrito marley= new Perrito("Caniche","blanco","mediano","Marley");
        Perrito einstein= new Perrito(9,"Chihuahua","café","chico","Einstein");
        Perrito newton= new Perrito(5,"Chihuahua","café","chico","Newton");
        System.out.println("Marley fue el primer perrito a modelar");
        System.out.println(marley.presentar());
        
        //Modificar
        System.out.println("Una actividad que a mi me gusta mucho hacer, es jugar mucho con mi amo, mira como juego!!! :DDDD");
        System.out.println(marley.jugar('s'));
        System.out.println("---------------------------------------------------------------");
        System.out.println("También me gusta mucho pasear, pero para ello tengo que tener el collar puesto y si me lo pongo, me pasea ^^" + " " + marley.caminar('s'));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Luego, presentaremos a los hermanos");
        System.out.println(einstein.toString());
        System.out.println(newton.toString());
        System.out.println("----------------------------------------------------------------");
        System.out.println("A ambos nos gusta muchísimo dormir");
        System.out.println(einstein.dormir());
        System.out.println("Otra cosa que nos gusta, es que nos rasquen ^^");
        System.out.println(einstein.rascar());
        System.out.println("Otra actividad que nos gusta mucho también es salir a caminar y si no nos sacan...");
        System.out.println(newton.caminar('n'));
    }
}
