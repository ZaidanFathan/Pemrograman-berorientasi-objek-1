public class OperatorAritmatika {
    public static void main(String[] args) {
        // Operasi Aritmatika
        int var1 = 12;
        int var2 = 5;

        int hasil;

        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);

        hasil = var1 - var2;
       System.out.printf("%d - %d = %d \n", var1,var2,hasil);
        
       hasil = var1 * var2;
       System.out.printf("%d x %d = %d \n", var1,var2,hasil);

       hasil = var1 / var2;
       System.out.printf("%d / %d = %d \n", var1,var2,hasil);

       float a = 6;
       float b = 5;
       float hasilFloat = a/b;
       System.out.printf("%f / %f = %f \n", a,b,hasilFloat);
       System.out.println(a + " / " + b + " = " + hasilFloat);

       // Modulus (sisa pembagian)
       hasil = var1 % var2;
       System.out.printf("%d %% %d = %d \n", var1,var2,hasil);
    }
}
