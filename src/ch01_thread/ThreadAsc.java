package ch01_thread;

public class ThreadAsc extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println("1부터 10까지 출력합니다 : "+i);
        }
    }
}
