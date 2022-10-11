public class Perro extends Animal{
    public Perro(String nombre){
        super.setNombre(nombre);
    }
    public String tipoAnimal(){
        return "el animal es un perro se llama: "+super.getNombre();
    }
}
