//package 재귀함수;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class baseball {
//    package baseball;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//    public class Application {
//        public static void main(String[] args) {
//            // TODO: 프로그램 구현
//            System.out.println("숫자 야구 게임을 시작합니다.");
//
//            List<Integer> LastanswerNumber = answerNumber();
//
//            while(true) {
//                printCase(LastanswerNumber, inputNumber());
//            }
//        }
//
//        public static List<Integer> answerNumber() {
//            List<Integer> arrLst = new ArrayList<>();
//            List<Integer> answerLst = new ArrayList<>();
//
//            for(int i=1; i<10; i++) {
//                arrLst.add(i);
//            }
//            Collections.shuffle(arrLst);
//            for(int i=0; i<3; i++) {
//                answerLst.add(i, arrLst.get(i));
//            }
//            System.out.println(answerLst);
//            return answerLst;
//        }
//
//        public static List<Integer> inputNumber() {
//            List<Integer> inputNumber = new ArrayList<>();
//            System.out.print("숫자를 입력해주세요 : ");
//            Scanner in = new Scanner(System.in);
//
////        try {
////            for(int i=0; i<3; i++) {
////                inputNumber.add(in.nextInt());
////            }
////
////        } catch (IllegalArgumentException e) {
////            throw new IllegalArgumentException();
////        }
//
//            for(int i=0; i<3; i++) {
//                inputNumber.add(in.nextInt());
//            }
//
//            System.out.println(inputNumber);
//            return inputNumber;
//
//        }
//
//        public static void printCase(List<Integer> answerNumber, List<Integer> inputNumber) {
//            ArrayList<Integer> strike = new ArrayList<>();
//            ArrayList<Integer> ball = new ArrayList<>();
//
//
//            int strikeNum = 0;
//            int ballNum = 0;
//
//            for(int i=0; i<3; i++) {
//                if(answerNumber.contains(inputNumber.get(i))) {
//                    if(answerNumber.get(i).equals(inputNumber.get(i))) {
//                        strikeNum += 1;
//                    } else {
//                        ballNum += 1;
//                    }
//                    /**
//                     * indent 3초과 리팩터링 하기
//                     */
//                }
//            }
//
//            System.out.printf("%d볼 %d스트라이크\n", ballNum, strikeNum);
//            if(strikeNum == 3) {
//                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
//            }
//        }
//    }
//
//}
