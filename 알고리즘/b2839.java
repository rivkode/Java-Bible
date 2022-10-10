import java.util.Scanner;

public class b2839 {
    public static void main(String[] args) {
        // 규칙을 찾아야 한다, 가장 작은 봉지의 개수는 5를 기준으로 구성된다.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n == 4 || n == 7) { //4와 7은 나타낼 수 없다.
            System.out.println(-1);
        }
        else if (n%5 == 0) {// 5로 나누어 떨어진다면 5로 나눈 몫이다
            System.out.println(n/5);
        }
        else if (n%5 == 1 || n%5 == 3) { // 나머지가 1, 3이라면 이는 규칙에 의해 5로나눈 몫+1과 같다
            System.out.println((n/5)+1);
        }
        else if (n%5 == 2 || n%5 == 4) { // 나머지가 2, 4이라면 이는 규칙에 의해 5로나눈 몫+2과 같다
            System.out.println((n/5)+2);
        }
    }
}
