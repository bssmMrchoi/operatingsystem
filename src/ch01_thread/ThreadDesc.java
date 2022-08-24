package ch01_thread;

public class ThreadDesc extends Thread{
    @Override
    public void run() {
        for (int i=10; i>=0; i--) {
            System.out.println("10부터 1까지 출력합니다 : "+i);
        }
    }
}
