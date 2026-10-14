public class Shopping_Bill {
    static double calculateElectronicsGST(double a, double b){
           double ammount = a + b ;
           double gst = ammount * 0.18 ;
           return gst+ammount ;
    }
    static double calculateFashionGST(double c, double d){
        double ammount = c + d ;
        double gst = ammount * 0.13 ;
        return gst+ammount ;
    }
    static double calculateFoodGST(double e){
        double gst = e * 0.07 ;
        return gst+e ;
    }
    static double totalBill(double a, double b, double c, double d, double e){
        double total = calculateElectronicsGST(a, b) + calculateFashionGST(c, d) + calculateFoodGST(e) ;
        return total ;
    }
    static double calculateDiscountedBill(double a, double b, double c, double d, double e){ 
       double total = calculateElectronicsGST(a, b) + calculateFashionGST(c, d) + calculateFoodGST(e) ;
       double totaldiscount = total * 0.20 ;
       double bill = total - totaldiscount ;
       return bill ;
    }
    public static void main(String [] args){
           double a = 100 ;
           double b = 100 ;
           double c = 100 ;
           double d = 100 ;
           double e = 100 ;

           double ElectronicsDiscount = calculateElectronicsGST(a, b) ;

           System.out.println("The discount on ELectronics is : " + ElectronicsDiscount) ;

           double FashionDiscount = calculateFashionGST(c , d) ;

           System.out.println("The discount on Fashion is : " + FashionDiscount) ;

           double FoodDiscount = calculateFoodGST(e) ;

           System.out.println("The discount on Food is : " + FoodDiscount) ;
           
            double total = totalBill(a, b, c, d, e) ;

            System.out.println("The total bill is : " + total) ;

            double discountedBill = calculateDiscountedBill(a, b, c, d, e) ; 

            System.out.println("The discounted bill is : " + discountedBill) ;
            
    }
}
