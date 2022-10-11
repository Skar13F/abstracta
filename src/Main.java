public class Main {

        public static void main(String[] args) {
            Animal [] misAnimales = new Animal[2];

            misAnimales[0] = new Perro("boby");
            misAnimales[1]=new Gato("blanquita");
            for (Animal e: misAnimales) {
                System.out.println(e.tipoAnimal());
            }
        }

}