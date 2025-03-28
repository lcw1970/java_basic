package oop;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("뮤직 플레이어를 실행합니다.");
    }

    void off(){
        isOn = false;
        System.out.println("뮤직 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨을 증가시킵니다. 현재 볼륨: "+volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨을 감소시킵니다. 현재 볼륨: "+volume);
    }

    void showStatus() {
        System.out.println("현재 상태를 출력합니다.");
        System.out.print("작동 상태 : ");
        if (isOn) {
            System.out.println("On");
        }
        else {
            System.out.println("Off");
        }
        System.out.println("볼륨: "+volume);
    }
}
