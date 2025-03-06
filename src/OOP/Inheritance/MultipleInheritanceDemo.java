package OOP.Inheritance;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("taking a photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Play music in phone");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.takePhoto();  // Calls Camera's method
        myPhone.playMusic();  // Calls MusicPlayer's method
    }
}
