package Java_Problem.Method;

public class Problem_5 {
    public static void main(String[] args) {
        wear(2400,2000);
        wear(3800,1200);
    }

    public static void wear(int hp, int mp) {
        if (hp>=2000 && mp>=2000) {
            System.out.println("아이템 장착 완료 !");
        } else {
            System.out.println("아이템을 장착할 수 없습니다.");
        }
    }
}
