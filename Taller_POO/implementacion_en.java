.main.java
package.DIAGRAMAS_UML;
public class Main{
    public static void main (string [] args){
        Gato animal1=new Gato ("pepita", 4 "Gato", "siames", "20-N17");
        Perro animal2= new Perro ("Lulu", 4, "Perro", "Pitbul", "22-AS9");
        cliente cliente1=new cliente ("Carmen Reyes", 11109843, 20/03/1992);
        cliente1.listaanimales.add(animal1);
        cliente2.listaanimales.add(animal2);
        this.nombre=nombre;
        this.especialidad=especialidad;
        this.numld=numld;
        this.fechnacimiento=fechnacimiento;
    }
    public void mostrarinfo(){
        system.out.println("nombre" + nombre + "especialidad" + especialidad + "ID:" + numld + "fechnacimiento:" + fechnacimiento);
    }
    public void solicitar cita (cita cita) {
        system.out.println ("el veterinario" + nombre + "esta atendiendo la cita" + cita.animal.nombre);
    }
}
.cita.java
package.DIAGRAMS_UML;
public class cita {
    string fecha;
    animal animal;
    veterinario veterinario;
    cliente cliente;
    string motivo;
    public cita (string fecha, animal animal, veterinario veterinario, cliente cliente, dtring motivo) {
        this.fecha=fecha;
        this.animal=animal;
        this.veterinario=veterinario;
        this.cliente=cliente;
        this.motivo=motivo;
    }
    public void mostrardetalle () {
        system.out.println("---------- FACTURA DE AGENDACION DE CITA VETERINARIA CATS Y DOGS ----------");
        system.out.println ("cita agendada para el dia" + fecha + "para" + animal.nombre + "(carnet:" +" )con el veterinario" + veterinario.nombre);
        system.out.println ("a) nombre del cliente" + cliente.nombre + "con la cedula" + cliente.cedula +"(con motivo de " + motivo);
    }
}
.Gato.java
package.DIAGRAMAS_UML;
public class Gtao extends animal {
    public Gato (string nombre, int edad, string especie, string raza, string carnet){
        super( nombre, edad, especie, raza, carnet);
    }
    @override
    public void emitirsonido () {
        .system.out.println ("miau");
    }
    .cliente.java
package.DIAGRAMAS_UML;
Import java.util.Arraylist;
public calss cliente {
    string nombre;
    int cedula;
    string fechnacimiento;
    Arraylist <animal>list a animales= new Arraylist<> ();
    public cliente (string nombre, int cedula, string fechnacimiento) {
        this.nombre=nombre
        this.cedula=cedula
        this.fechnacimiento=fechnacimiento;
    }
    public void agendarcita (animal animal, string fecha, veterinario vet, string motivo) {
        cita cita=new cita (fecha animal, vet, this, motivo);
        cita.mostrardetalle();
        vet.atendercita(cita);
    }
}
    .veterinario.java
    package.DIAGRAMAS_UML;
    public class veterinario {
        string nombre;
        string especialidad;
        int num_id;
        string fechnacimiento;
        public veterinario (string nombre, string especialidad, int num_id, string fechnacimiento) {
            veterinario vet=new veterinario ("Carla Martinez", "cirujana", 1114587963, "22/11/2000");
            for (animal animal = cliente1.listaanimales){
                animal.mostrarinfo();
                animal.emitirsonido();}
                cliente.agendarcita(animal1, "2/08/2025", vet1 "chequeo general");
        }
        .animal.java
        package.DIAGRAMAS_UML;
        public class animal {
            string nombre;
            int edad;
            string raza;
            string carnet;
            public animal (string, nombre, int edad,string raza, string carnet){
                this.nombre=nombre;
                this.edad=edad;
                this.especie=especie;
                this.raza=raza;
                this.carnet=carnet;
            }
            public void mostrarinfo (){
                system.out.println("nombre:" + nombre + "edad:" + edad + "especie:" + "raza:" + raza + "carnet:" + carnet);
            }
            .perro.java
            package.DIAGRAMAS_UML;
            public class perro extends animal {
                public class perro (string nombre, int edad, string especie, string raza, sitring carnet) {
                    super(nombre, edad, especie, raza, carnet);
                }
                @override
                public void emitirsonido(){
                    system.out.println("guau");
                }
            }
        }
    }
}