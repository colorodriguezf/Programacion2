// Permite el uso del objeto LocalDate
import java.time.LocalDate; 
// Toman un LocalDate y devuelven una fecha (de tipo String) con x formato que le especifiquemos
import java.time.format.DateTimeFormatter; 
// Permite especificar la cantidad de decimales en un float
import java.text.DecimalFormat;
public class Persona {
       private int dni;
       private String nombre;
       private String apellido;
       private String fecha_nacimiento;   // dd/mm/yyyy
       private int edad;
       private char sexo;
       private int peso;
       private int altura;
    

      /*public Persona(int DNI){
        this(DNI, "");
      }
      public Persona(int DNI, String nombre){
        this(DNI, nombre, "");
      }
      public Persona(int DNI, String nombre, String fecha_nacimiento){
        this(DNI, nombre, fecha_nacimiento, ' ');
      }
      public Persona(int DNI, String nombre, String fecha_nacimiento, char sexo){
        this(DNI, nombre, fecha_nacimiento, sexo, 0);
      }
      public Persona(int DNI, String nombre, String fecha_nacimiento, char sexo, int altura){
        this(DNI, nombre, fecha_nacimiento, sexo, altura, 0);
      } */ 

       public Persona(int dni, String nombre, String apellido, String fecha_nacimiento, char sexo, int peso, int altura) {
            this.setDni(dni);
            this.nombre = "N";    
            this.setNombre(nombre);
            this.apellido = "N";
            this.setApellido(apellido);
            this.setFecha_nacimiento(fecha_nacimiento);
            this.setEdad();
            this.setSexo(sexo);
            this.setPeso(peso);
            this.setAltura(altura);
       }
       //SETTERS
       public void setNombre(String nombre) {
           if (nombre != "") {
               this.nombre = nombre;
            }
            else {
            this.nombre = "N";
            }
       }
       public void setApellido(String apellido) {
            if (apellido != "") {
                this.apellido = apellido;
            }
            else {
                this.apellido = "N";
            }
        }
        public void setFecha_nacimiento(String fecha_nacimiento) {
              // Formato que se usará para guardar las fechas
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            // Por default, se utilizará la fecha 01/01/2000
            final String default_fecha_nacimiento = LocalDate.of(2000, 1, 1).format(formato); 
            // Comprobamos que la fecha ingresada no sea una cadena vacia
            if(!fecha_nacimiento.equals("")){
                this.fecha_nacimiento = fecha_nacimiento.formatted(formato);
            }
            else {
            System.out.println("Se asigno el value por defecto a fecha de nacimiento, ya que [" + fecha_nacimiento + "] es invalido.");
            this.fecha_nacimiento = default_fecha_nacimiento;
            }
        }
        public void setEdad(){
            this.edad = calcularAnios();
        }
        public void setDni(int dni){
            this.dni = dni;
        }
        public void setSexo(char sexo){
                this.sexo = sexo;           
        }
        public void setPeso(int peso){
            if (peso >= 0) {
                this.peso = peso;
            }
            else {	
                this.peso = 1;
            }
        }
        public void setAltura(int altura){
            if (altura >= 0) {
                this.altura = altura;
            }
            else {	
                this.altura = 1;
            }
        }

        //GETTERS
        public String getNombre() {
            return this.nombre;
        }
        public String getApellido() {
            return this.apellido;
        }
        public String getFechaNacimiento(){
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            /* 
            * Para usar el formato, la fecha a formatear debe ser de tipo LocalDate, por eso
            * usamos una variable auxiliar (fecha_devolver)
            */
            LocalDate fecha_devolver = LocalDate.parse(this.fecha_nacimiento); 
        
            return fecha_devolver.format(formato); // Devuelve la fecha del usuario, con el patron indicado.
        }
        public LocalDate getFechaNacimientoLocalDate(){
            return LocalDate.parse(this.fecha_nacimiento);
        }
        public int getEdad(){
            return this.edad;
        }
        public int getDni(){
            return this.dni;
        }
        public char getSexo(){
            return this.sexo;
        }
        public double getPeso(){
            return this.peso;
        }
        public double getAltura(){
            return this.altura;
        }

     
        
        
        //Metodo privado
        private int calcularAnios(){
            LocalDate fecha_actual = LocalDate.now();
            LocalDate fecha_nac_usuario = LocalDate.parse(this.fecha_nacimiento);
            int edad_final = 0;
        
            if(fecha_actual.getYear() > fecha_nac_usuario.getYear()){ // Verificamos que el usuario no tenga 0 años
              edad_final = fecha_actual.getYear() - fecha_nac_usuario.getYear(); // Obtenemos la cantidad de años entre ambas fechas
              if(fecha_actual.getMonthValue() < fecha_nac_usuario.getMonthValue()){
                edad_final++;
              }else{
                /*
                * En caso de que el mes de la fecha de nacimiento del usuario coincida con el mes actual, debemos
                * verificar cual de los 2 dias de la fecha es mayor, para sumarle 1 año en caso de que el dia de
                * la fecha de nacimiento del usuario sea mayor a el dia de la fecha actual, y tambien sumarle 1 año
                * en caso de que ambos dias de la fecha coincidan, 
                */ 
                if(fecha_actual.getMonthValue() == fecha_nac_usuario.getMonthValue()){
                  if(fecha_actual.getDayOfMonth() <= fecha_nac_usuario.getDayOfMonth()){
                    edad_final++;
                  }
                }
              }
            }
        
            return edad_final;
          }

          //Metodos publicos
          public float devolverIndiceMasaCorporal(){
            // Le aplicamos un formato de maximo 2 decimales al resultado
            DecimalFormat formato1 = new DecimalFormat("#.00");
            /*
            * Al aplicar el formato, devuelve un String, es por eso que
            * debemos usar el "Float.parseFloat" 
            */
            float peso = (float)this.peso;
            float altura = (float)this.altura;
            float resultado = peso / (altura * altura);
        
            return Float.parseFloat(formato1.format(resultado));
          }
           /*
        * Evalua el IMC de la persona y devuelve si está (o no) en forma.
        * Para estar en forma, su imc debe estar entre el IMC minimo y maximo, o igualar alguno. 
        */ 
        public boolean estaEnForma(){
            final float INDICE_MASA_CORPORAL_MINIMA = 18.5f;
            final float INDICE_MASA_CORPORAL_MAXIMA = 25.f;
            float imc = this.devolverIndiceMasaCorporal(); // Invocamos la funcion

            // Operador ternario, en caso de que el condicional se cumple, devolvera true, sino false
            return ((imc >= INDICE_MASA_CORPORAL_MINIMA) && (imc <= INDICE_MASA_CORPORAL_MAXIMA))?true : false;
        }
        /*
        * Evalua la fecha de nacimiento de la persona y la compara con la fecha actual,
        * devuelve Verdadero o falso 
        */
        public boolean esSuCumpleanios(){
            LocalDate fecha_nac = this.getFechaNacimientoLocalDate();
            LocalDate fecha_actual = LocalDate.now();
            // En caso que coicidan los meses y los dias de ambas fechas, será su cumpleanios
            return ((fecha_nac.getMonthValue() == fecha_actual.getMonthValue()) &&
                (fecha_nac.getDayOfMonth() == fecha_actual.getDayOfMonth())) 
                ? true : false;
        }
        // Evalua la edad del usuario y determina si es (o no) mayor de edad. 
        public boolean esMayorDeEdad(){
            int edad = this.getEdad();
            final int MAYORIA_EDAD = 18;
        return (edad >= MAYORIA_EDAD)? true : false;
    }
    // Evalua la edad del usuario y determina si puede (o no) votar. 
        public boolean puedeVotar(){
            int edad = this.getEdad();
            final int MINIMO_EDAD_VOTAR = 16;
        return (edad >= MINIMO_EDAD_VOTAR)? true : false;
    }

     // Muestra la informacion del objeto
  public void mostrarDatos(){
    System.out.println("DNI: " + this.getDni());
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("Fecha de nacimiento: " + this.getFechaNacimiento());
    System.out.println("Edad: " + this.getEdad());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("Altura: " + this.getAltura()+ "cm");
    System.out.println("Peso: " + this.getPeso()+ "kg");
    System.out.println("El IMC es de: " + this.devolverIndiceMasaCorporal());
    System.out.println("Está en forma: " + this.estaEnForma());
    System.out.println("Es su cumpleanios: " + this.esSuCumpleanios());
    System.out.println("Es mayor de edad: " + this.esMayorDeEdad());
    System.out.println("Puede votar: " + this.puedeVotar());
  }
}
