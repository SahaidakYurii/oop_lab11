package task3;

public class ProxyImage implements Image{
    private String file;
    private RealImage rImage;

    public ProxyImage(String file){
        this.file = file;
    }

    @Override
    public void show() {
        if (rImage.equals(null)){
            rImage = new RealImage(file);
        }
    }
}
