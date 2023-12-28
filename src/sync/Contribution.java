package sync;

/**
 * 기부 Class
 */
public class Contribution {

    private  int amount = 0;

    public synchronized void donate(){
        amount++;
    }

    /**
     * static 선언시 amount는 class 변수이다.
     * 메서드도 클래스 메서드로 참조하도록 static synchronized 추가 필요
     * @return
     */
/*
    private static int amount = 0;

    public static synchronized void donate(){
        amount++;
    }
*/
    public int getTotal(){
        return amount;
    }
}
