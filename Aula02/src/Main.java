public class Main {
    public static void main(String[] args) {

        Cachorro dogBelga = new Cachorro();

        dogBelga.nome = "Spike";
        dogBelga.peso = 25;
        dogBelga.idade = 9;
        dogBelga.castrado = true;

        System.out.println(dogBelga.nome + " pesa " + dogBelga.peso + "kgs e tem " + dogBelga.idade + " anos");
    }
}