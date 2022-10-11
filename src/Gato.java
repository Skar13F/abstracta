public class Gato extends Animal{
    public Gato(String nombre){
        super.setNombre(nombre);
    }
    public String tipoAnimal(){
        return "el animal es un gato se llama: "+super.getNombre();
    }
}
