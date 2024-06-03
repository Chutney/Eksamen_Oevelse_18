public class Video extends Media {
    private String aspectRatio;


    public Video(String name, int duration, String aspectRatio) {
        super(name, duration);
        this.aspectRatio = aspectRatio;
    }


    @Override
    public String toString() {
        return super.toString() + aspectRatio;
    }


}
