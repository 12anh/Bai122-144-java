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
    public static void bai_129_131_nhap(int[] array , int n ) {
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

    public static void main(String[] args) {
   //  bai_122() ;
    /*boolean check ;
    check =bai_124() ;
    if(check) System.out.printf("co ton tai so chan < 2004");
    else  System.out.printf("co ton tai so chan < 2004");*/

   // bai_127();
    double[] a = new double[3] ;
   bai_128_130_nhap(a,3);
  //  bai_128_130_xuat(a);
//bai_133();
        double kq;
kq= bai_134(a,3) ;

        System.out.printf("so duong dau tien la"+kq);
    }
}