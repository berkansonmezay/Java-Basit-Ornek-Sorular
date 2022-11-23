public class PrintASCIIValue1 {
    /**
     * American Standard Code for Information Interchange'in ASCII kısaltması.
     * 128 (0 ila 127) karakter içeren 7 bitlik bir karakter kümesidir.
     * Bir karakterin sayısal değerini temsil eder. Örneğin, A'nın ASCII değeri 65'tir.
     * Bu bölümde, bir Java programı aracılığıyla ASCII değeri veya kodunun nasıl yazdırılacağını öğreneceğiz.
     * Java'da ASCII değerini yazdırmanın iki yolu vardır:
     *
     * int Değişkenine Atama
     * Casting
     */

    public static void main(String[] args)
    {
// character whose ASCII value to be found
        char ch1 = 'a';
        char ch2 = 'b';
// variable that stores the integer value of the character
        int asciivalue1 = ch1;
        int asciivalue2 = ch2;
        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1); // The ASCII value of a is: 97
        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2); // The ASCII value of b is: 98
    }
}
