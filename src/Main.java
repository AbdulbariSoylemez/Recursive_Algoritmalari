public class Main {

    public static int OzyinemeliFactoriyel(int a){ // factoriyel = Bir sayının faktöriyeli o sayından önce yer alan bütün tamsayıların 1 sayısına gelinceye kadar sıralanıp çarpılmasıyla bulunan sayıdır,Özyinemeli metodumuzu yazdık
        if (a != 1) { // sayımızın bir'e eşit olmadığı duruma bakıyoruz
            return a * OzyinemeliFactoriyel(a - 1);// bir'e eşit değilise sayı ile kendinden sonraki fonksiyonu çarpıyoruz ve geriye döndürüyoruz
        } else {
            return a;// eğer bir'e eşit ise kendisini döndürüyorüz
        }
    }

    public static int OzyinemeliFibonacci(int n){// Fibonacci =  her sayının kendisinden bir önceki sayı ile toplanması ile elde edilen sayılar serisidir. Özyinemeli metodumuzu yazdık
        if ( n == 0 ) return 0;// sayımızın 0'a eşit olma durumuna bakıyoruz eşit ise 0 döndür
        else if ( n == 1 ) return 1;// sayımızın 1'e eşit olma durumuna bakıyoruz eşit ise 1 döndür
        else return (OzyinemeliFibonacci(n-1) + OzyinemeliFibonacci(n-2));// 1'e ve 0' a eşit değil ise kendinden önceki iki fonksiyonu çağır ve onları karşılaştır
    }
    public static void main(String[] args) {

        System.out.println(OzyinemeliFactoriyel(5));

        System.out.println(OzyinemeliFibonacci(8));

    }
}