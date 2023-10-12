public class Zoo {

    Animal[] animals;
    String name;
    String city;
    final int NBR_CAGES = 25;

    public Zoo(String name, String city) {
        this.animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Nom est : " + name);
        System.out.println("City est : " + city);
        System.out.println("Nombre des cages est : " + NBR_CAGES);
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < NBR_CAGES; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Animal Name: " + animal.getName());
            }
        }
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < NBR_CAGES; i++)
        {
            if (animals[i] != null && animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

        public static String comparerZoo(Zoo z1, Zoo z2) {
            if (z1.animals.length > z2.animals.length) {
                return z1;
            } else if (z1.animals.length < z2.animals.length) {
                return z2;
            } else {
                return "les deux zoos sont egaux";
            }
        }

    public static boolean isZooFull(Zoo zoo) {
        int numberOfAnimals = 0;

        for (Animal animal : zoo.animals) {
            if (animal != null) {
                numberOfAnimals++;
            }
        }

        return numberOfAnimals >= zoo.NBR_CAGES;
    }
}
