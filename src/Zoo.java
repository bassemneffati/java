public class Zoo {


    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo()
    {
        System.out.println("nom est :"+name);
        System.out.println("city est :"+city);
        System.out.println("nombre des cages est :"+nbrCages);
    }
    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == null)
            {
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
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


}
