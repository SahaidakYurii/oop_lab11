package task3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RealImage implements Image{
    public String file;

    @Override
    public void show() {
        System.out.println(file + " produced");
    }
}
