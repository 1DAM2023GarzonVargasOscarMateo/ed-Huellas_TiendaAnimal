// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Animal: Perro
        Perro perro = new Perro();
        perro.setCodigo("ID0705");
        perro.setNombre("Dante");
        perro.setFechaNacimiento("07-05-2019");



        // Animal: Gato
        Gato gato = new Gato();
        gato.setCodigo("ID1910");
        gato.setNombre("Nala");
        gato.setFechaNacimiento("19-10-2021");


        imprimir(perro);
        imprimir(gato);

    }

    public static void imprimir(Animal animal) {
        System.out.println("Código:" + animal.getCodigo());
        System.out.println("Nombre:" + animal.getNombre());
        System.out.println("DirecciónPostal:" + animal.getFechaNacimiento());

    }
}