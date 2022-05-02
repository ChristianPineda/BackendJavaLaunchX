package Hogwarts;

    public class Hogwarts {
        public static void main(String[] args) {
            harry();
            hermione();
            severus();
        }

        private static void harry() {
            Model harry = new Model("Harry Potter", "Masculino", "Gryffindor", "Dementor", "Ciervo");
            System.out.println(harry.showMessage());
            System.out.println("--------------");
        }

        private static void hermione() {
            Model hermione = new Model();
            hermione.setname("Hermione Granger");
            hermione.setgen("Femenino");
            hermione.sethouse("Gryffindor");
            hermione.setbogg("Fracaso");
            hermione.setPatronus("Nutria");
            System.out.println(hermione.showMessage());
            System.out.println("--------------");
        }

        private static void severus() {
            Model severus = new Model("Severus Snape", "Masculino", "Slytherin", "Lord Voldemort", "Cierva");
            System.out.println(severus.showMessage());
            System.out.println("--------------");
        }
    }