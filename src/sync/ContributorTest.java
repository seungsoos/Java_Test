package sync;

public class ContributorTest {

    public static void main(String[] args) {


        /**
         * Ex1) group 객체가 매번 새로생성되어,
         * 10명의 기부자가 10개의 각기 다른 단체에 기부하는 상황이기 때문에
         * 동시성문제가 발생하지않음.
         */
/*
        // 기부자와 기부단체 초기화
        Contributor[] crs = new Contributor[10];
        for (int loop = 0; loop < 10; loop++) {
            Contribution group = new Contribution();
            crs[loop] = new Contributor(group, "Contributor" + loop);
        }
        // 기부시작
        for (int loop = 0; loop < 10; loop++) {
            crs[loop].start();
        }
*/

        /**
         * 동시성 문제 발생
         * 10개의 Contributor 객체가
         * 하나의 Contribution 객체에 접근
         *
         * synchronized 추가로 해결
         */
        Contributor[] crs = new Contributor[10];
        for (int loop = 0; loop < 10; loop++) {
            Contribution group = new Contribution();

            crs[loop] = new Contributor(group, "Contributor" + loop);
        }

        for (int loop = 0; loop < 10; loop++) {
            crs[loop].start();
        }
    }
}
