package Assigment2;

public class task {

	private String name;

    public task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal: " + name;
    }

}
