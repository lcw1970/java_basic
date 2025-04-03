package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("볼륨이 최대입니다.");
        }
        else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumeDown() {
        if (volume >= 10) {
            volume -= 10;
            System.out.println("음량을 10 감소합니다.");
        }
        else {
            System.out.println("음소거 상태입니다.");
        }
    }
    void showVolume() {
        System.out.println("현재 음량: "+ volume);
    }
}
