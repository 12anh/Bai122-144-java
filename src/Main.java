import java.lang.reflect.Array;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void bai_122()
    {
        double[] array = new double[4] ; double max ;
        Scanner sc = new Scanner(System.in) ;
        for(int i =0;i< array.length;i++)
        {
            System.out.println("nhap phan tu thu "+i);
            array[i]= sc.nextDouble() ;
        }
        max= array[0];
        for(int i =1;i< array.length;i++)
        {
            if(max<array[i]) max = array[i] ;

        }
        System.out.printf("the max element is " + max );
    }
    public static void bai_123() {
        double[] array = new double[4] ; double min ; int vitri = 0 ;
        Scanner sc = new Scanner(System.in) ;
        for(int i =0;i< array.length;i++)
        {
            System.out.println("nhap phan tu thu "+i);
            array[i]= sc.nextDouble() ;
        }
        min = array[0] ;
        for(int i =0;i< array.length;i++)
        {
            if(array[i]<min) min =array[i] ; vitri = i ;

        }
        System.out.printf("vi tri min la : " + vitri);
    }

    public static boolean bai_124() {
        int[] array = new int[4] ; boolean ktr= false  ;
        Scanner sc = new Scanner(System.in) ;
        for(int i =0;i< array.length;i++)
        {
            System.out.println("nhap phan tu thu "+i);
            array[i]= sc.nextInt() ;
        }

        for(int i =0;i< array.length;i++) {
            if ((array[i] % 2 == 0) && (array[i] < 2004)) ;
            ktr = true;
        }
    return ktr;


    }

    public static boolean kiem_tra_so_ngto(int a ) {
    // ktra so ngto
       boolean ktr = false ;

        if(a==1) ktr = true ;
        else
        {
            for(int i=2; i<a;i++)
            {
                if(a%i==0)  ktr =  true ;
            }

        }

        return ktr ;
    }
    public static void bai_125() {
        int[] array = new int[4]; int count = 0 ;
        boolean ktr = false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu thu " + i);
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

                if(kiem_tra_so_ngto(array[i])&&(array[i])<100)
                    count++;
        }
        System.out.printf("so luong so ng to la : "+count);
    }

    public static void bai_126() {
        double[] array = new double[4];
        double sum= 0 ;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu thu " + i);
            array[i] = sc.nextDouble();
        }
        for (int i = 0; i < array.length; i++) {

                if(array[i]<0) sum+= array[i] ;
        }
        System.out.printf("tong cac so am trong mang"+sum );
    }

    public static void bai_127() {
        double[] array = new double[4];
        int j; double temp ;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap phan tu thu " + i);
            array[i] = sc.nextDouble();
        }
        for (int i = 0; i <= array.length-2; i++)
        {
            for ( j = i+1; j <= array.length-1; j++)
            {
                 if(array[i] >array[j])
                 {
                     temp = array[i] ;
                     array[i] =array[j] ;
                     array[j] =temp ;
                 }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void bai_128_130_nhap(double[] array , int n ) {
        Scanner sc = new Scanner(System.in);
      for(int i=0 ; i<n;i++)
      {
          System.out.println("nhap phan tu thu " + i);
          array[i] = sc.nextDouble();

      }

    }

    public static void bai_128_130_xuat(double[] array) {
        for(int i = 0; i< array.length; i++)
        {
            System.out.println("nhap phan tu thu " + i + "la:"+ array[i]);

        }

    }
    public static void bai_129_131_nhap_mang_so_nguyen(int[] array , int n ) {
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<n;i++)
        {
            System.out.println("nhap phan tu thu " + i);
            array[i] = sc.nextInt();

        }

    }

    public static void bai_129_131_xuat(int[] array) {
        for(int i = 0; i< array.length; i++)
        {
            System.out.println("nhap phan tu thu " + i + "la:"+ array[i]);

        }

    }

    public static void bai_132(int[] array , int n ) {
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<n;i++)
        {
            System.out.println("nhap phan tu thu " + i);
            array[i] = sc.nextInt();

        }
        for(int i=0 ; i<n;i++) {

            if(array[i]%2==0) System.out.println(array[i]);
        }

    }

    public static void bai_133(double[] array , int n ){
       int vitri = 0 ;
        for(int i=0 ; i<n;i++)
        {
             if(array[i]<0)
             {
                 vitri = i;
                 System.out.println("vi tri so am " + vitri);
             }

                 else
            System.out.println("ko co so am trong amng");
        }

    }

    public static double bai_134(double[] array , int n ) {
        double kq =-1;

        for(int i=0 ; i<n;i++)
        {
            if(array[i]>0 )
            {
                kq = array[i] ; break;
            }
        }
    return kq ;
    }
    public static double bai_135(double[] array ){
        double max = 0 ;
        max= array[0] ;
        for(int i=0 ; i<array.length;i++) {
            if(array[i]>max )
                max = array[i];

        }
        return max ;
    }

    public static int bai_136(int[] array ){
        int kq = -1 ;
        for(int i=array.length-1 ; i>=0;i--)
        {
            if(array[i]%2==0) {kq =array[i] ; break;}  ;
        }

        return kq ;
    }

    public static void bai_137(double[] array ) {
        int vitri = 0  ; double min  ;
        min =array[0] ;

        for(int i=0 ; i<array.length;i++) {
            if(array[i]<min){
                vitri = i ;
            }

        }
        System.out.println("vi tri min la : " + vitri);

    }

    public static int bai_138(int[] array ) {
        int first_value_even = -1;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                first_value_even = array[i];
                break;
            }

        }
        return first_value_even ;
    }

     public  static boolean is_perfect_number(int a ){
        int sum= 0 ;

     if(a==1||a==0) {return false;}
        else {
                 for (int i = 1; i <= a / 2; i++) {
                     if (a % i == 0) sum += i;
                 }
            }
            if(sum==a) return  true ;
        else return  false ;

     }

    public static int bai_139(int[] array ) {
        int vitri =-1;
        for (int i = array.length-1; i >= 0; i--)
        {
            if(is_perfect_number(array[i])) { vitri = i ; break ;}
        }
        return vitri ;
    }

    public static double bai_140(double[] array ) {

         double kq =-1, min ;
         min =array[0] ;
        for (int i = 0; i < array.length; i++)
        {
             if(array[i]<min && array[i]>0) min =array[i];

        }
        return min;

    }

    public static double bai_141(double[] array ) {

        double kq =-1,min ; int vitri =-1  ;
        min =array[0] ;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i]<min && array[i]>0) vitri= i ;

        }
        return vitri;

    }

    public static void bai_142(double[] array ) {
        double  min;
        min = array[0] ;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i]<min) min= array[i] ;

        }
        System.out.printf("gia tri nho nhat trong mang" + min);

    }

    public static int bai_143(int[] array ) {
        int kq = -1 ;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i]%2==0) {kq= array[i] ; break;}
        }
        return  kq ;
    }

    public static boolean ktr_so_ngto(int a)
    {   boolean kq =false;
        for(int i =2;i<= a/2; i++)
        {
            if(a%i==0)  kq = false ;
                else kq =true ;
        }
        return  kq ;
    }
    public static int bai_144(int[] array )
    {       int kq = -1;
        for (int i = 0; i < array.length; i++) {
            if(ktr_so_ngto(array[i])) {kq = array[i] ; break ; }

        }
        return kq ;
    }


        public static void main(String[] args) {
   //  bai_122() ;
    /*boolean check ;
    check =bai_124() ;
    if(check) System.out.printf("co ton tai so chan < 2004");
    else  System.out.printf("co ton tai so chan < 2004");*/

   // bai_127();
   // double[] a = new double[3] ;

        int[] a = new int[3] ;
 //  bai_129_131_nhap_mang_so_nguyen(a,3);
  //  bai_128_130_xuat(a);
//bai_133();
      //  int kq;
//kq= bai_136(a) ;

      //  System.out.printf("so chan cuoi cung trong mang: "+kq);

  // bai_128_130_nhap(a,3);
     //   bai_137(a);
  /*      bai_129_131_nhap_mang_so_nguyen(a,3);
        int kq ;
        kq = bai_139(a) ;
        System.out.printf("so hoan hao la : "+kq);*/
       /* double   kq ;
        kq = bai_141(a) ;
        System.out.printf("so duong nho nhat : "+kq) ;*/
            int kq = -1;
            bai_129_131_nhap_mang_so_nguyen(a,3);
              kq=   bai_144(a) ;
            System.out.printf("so ng to dau tien la :" + kq);

    }
}