package cond;

public class If5 {
    public static void main(String[] args) {
        int age = 10;
        int price = 10000;
        int discount = 0;

//        if (price >= 10000) {
//            discount += 1000;
//            if ( age <= 10 ) {
//                discount += 1000;
//                System.out.println("할인금액은 " + discount);
//            } else {
//                System.out.println("할인금액은 " + discount);
//            }
//        } else if (age <= 10) {
//            discount += 1000;
//            System.out.println("할인금액은 " + discount);
//        } else {
//            System.out.println("할인금액은 " + discount);
//        }

        if (price >= 10000) {
            discount += 1000;
            System.out.println("구매하시는 상품의 할인금액은 " + discount);
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("구매고객의 할인금액은 " + discount);
        }

        System.out.println("총 할인금액은 " + discount + "입니다.");
    }
}
