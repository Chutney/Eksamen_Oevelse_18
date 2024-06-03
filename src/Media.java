public abstract class Media {

    private String name;
    private int duration;

    public Media(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + "\n" + duration + "\n";
    }

}
