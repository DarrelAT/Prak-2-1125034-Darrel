//Level 1 (Top Level)
abstract class Hewan {
    private String name;
    private int age;
    private String food;

    public Hewan(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract String printSound();

    public String printData() {
        return "Jenis Hewan: " + getClass().getSimpleName() + "\n" +
               "Nama       : " + name + "\n" +
               "Umur       : " + age + " tahun\n" +
               "Makanan    : " + food;
    }
}

//Level 2 (Habitat / Kategori)
abstract class HewanDarat extends Hewan {
    private int numberOfLegs;

    public HewanDarat(String name, int age, String food, int numberOfLegs) {
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void move() {
        System.out.println(getName() + " berjalan atau berlari di darat.");
    }

    @Override
    public String printData() {
        return super.printData() + "\nJumlah Kaki: " + numberOfLegs;
    }
}

abstract class HewanLaut extends Hewan {
    private double depth;

    public HewanLaut(String name, int age, String food, double depth) {
        super(name, age, food);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String printData() {
        return super.printData() + "\nKedalaman  : " + depth + " meter";
    }
}

abstract class HewanUdara extends Hewan {
    private double wingSpan;

    public HewanUdara(String name, int age, String food, double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String printData() {
        return super.printData() + "\nRentang Sayap: " + wingSpan + " meter";
    }
}

//Level 3 (Concrete Class)

// --- Hewan Darat ---
class Anjing extends HewanDarat {
    public Anjing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Guk Guk";
    }
}

class Kucing extends HewanDarat {
    public Kucing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Meow Meow";
    }
}

class Tikus extends HewanDarat {
    public Tikus(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Cit Cit";
    }
}

// --- Hewan Laut ---
class Ikan extends HewanLaut {
    public Ikan(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Blub Blub";
    }
}

class Hiu extends HewanLaut {
    public Hiu(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Splash / Silent Predator";
    }
}

class Paus extends HewanLaut {
    public Paus(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Echolocation Click/Whistle";
    }
}

// --- Hewan Udara ---
class Burung extends HewanUdara {
    public Burung(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Cuit Cuit";
    }
}

class Elang extends HewanUdara {
    public Elang(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Kreeee / Screech";
    }
}

class Bebek extends HewanUdara {
    public Bebek(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Kwek Kwek";
    }
}


public class Main {
    public static void main(String[] args) {
        Hewan[] daftarHewan = new Hewan[] {
            new Anjing("Doggy", 3, "Tulang", 4),
            new Kucing("Milo", 2, "Ikan", 4),
            new Tikus("Jerry", 1, "Keju", 4),
            new Ikan("Nemo", 1, "Plankton", 15.0),
            new Hiu("Megalo", 10, "Daging", 500.0),
            new Paus("Bluey", 20, "Krill", 1000.0),
            new Burung("Pipit", 1, "Biji-bijian", 0.2),
            new Elang("Garuda", 5, "Daging", 2.1),
            new Bebek("Donald", 2, "Dedak", 0.8)
        };

        for (int i = 0; i < daftarHewan.length; i++) {
            System.out.println(daftarHewan[i].printData());
            System.out.println("Suara      : " + daftarHewan[i].printSound());
            System.out.println("----------------------------------------");
        }
    }
}