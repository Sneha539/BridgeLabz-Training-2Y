public class Fee {
    public static void main(String[] args) {
        int fees = 125000;
        int discountPercent = 10;
        int dicount = fees / discountPercent;
        int finalAmt = fees - dicount;
        System.out.println("The discount amount is INR"+ dicount +"and final discounted fee is INR "+ finalAmt);
    }
}