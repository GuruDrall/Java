import javax.sound.sampled.SourceDataLine;

class Practice
{

    public static void main(String [] args)
    {
                    // Printing Hello world 
        // System.out.println("Hello World");


                    // Defining varibles and sum of them
        // int a;
        // int b;
        
        // a = 20;
        // b = 10;
        // int c = a+b;

        // System.out.println("Sum of a and b is " + c);



                    // Max and Min values for int type variables 

        // byte bmax = Byte.MAX_VALUE;
        // byte bmin = Byte.MIN_VALUE;
        // short smax = Short.MAX_VALUE;
        // short smin = Short.MIN_VALUE;
        // int imax = Integer.MAX_VALUE;
        // int imin = Integer.MIN_VALUE;
        // long lmax = Long.MAX_VALUE;
        // long lmin = Long.MIN_VALUE;

        // System.out.println((bmax + " "+ bmin) + "\n" +(smax + " " + smin) + "\n" + (imax + " " + imin) +"\n" +(lmax + " " + lmin));

        
                    // Using boolean to print odd even
        // boolean t = true;
        // boolean f = false;

        // int a = 7;

        // if (a % 2 == 0)
        // {

        //     System.out.println("Even " + t);
        // } else {
        //     System.out.println("Odd " + f);
       // }
        
                    // Printing Char and finding values of char in number

        // char c = 'a';
        // int a = c;
        // int b = 'g';
        // char c1 = (char) b;
        // System.out.println(c);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c1);

                    // Array 1D, 2D and 3D

        // int [] num = {2,5,7,9};
        // int sum = 0;
        // for(int i:num){
            
        //     sum = sum+i;
        //     System.out.println(sum);
        //}


        // int [][] arr2 = {{2,3,1},{1,2,1}};
        // System.out.println(arr2[1][0]);

        // int arr[][] = new int[2][3];
        // arr[0][0] = 2;
        // arr[0][1] = 3;
        // arr[0][2] = 5;
        // arr[1][0] = 7;
        // arr[1][1] = 12;
        // arr[1][2] = 15;

        // System.out.println(arr[0][2]);

        // int arr3[][][] = new int[1][2][3];
        // arr3[0][0][0] = 2;
        // arr3[0][0][1] = 3;
        // arr3[0][0][2] = 7;
        // arr3[0][1][0] = 4;
        // arr3[0][1][1] = 6;
        // arr3[0][1][2] = 9;
        // System.out.println(arr3[0][1][1]);

        // long l;
        // l = 45684975778555555l;
        // System.out.println(l);
            // char c= 'g';
            // int a = c; 
            // System.out.println(a);
            // char c = 'a';
            // int a = c;
            // System.out.println(a);
             
            // int a = 'g';
            // char c = (char) a;
            // char c1 = 98;
            // System.out.println(c+ " " +c1);



            // int a = 10;
            // int b = 20;

            // System.out.println("Sum for a & b = "+ (a+b));

            // int[] arr = {2,4,6,8,9};
            // int[][] arr1 = new int[2][3];
            // // System.out.println(arr[2]);

            // int arr1[0][0] = 23;
            // int arr1[0][1] =22;
            // int arr1[0][2] =24;

            // int [][] arr2 = {{2,4,6},{4,6,8}};
            // int [][] arr3 = new int[2][3];
            
            // for(int i=0; i<2 ; i++){

            //     for(int j=0; j<3; j++){
            //     System.out.print(arr2[i][j]+ " ");
            //     }
            //     System.out.println();
            // }

        //    int [] marks = {24,67,54,76,87,34};

        //    int sum=0;

        //    for(int i:marks){
        //     sum = sum+i;
    
        //    System.out.println(sum);
        // }
        // 
        
            boolean rain = false;
            boolean umbrella = true;
            boolean raincoat = false;

            // if((rain==true && umbrella==false) && raincoat==false)
            // System.out.println("You cant go out");
            // else
            // System.out.println("You can go out");

            if(rain==true){
                if(umbrella==true){
                    System.out.println("Go out, carry umbrella");
                }
                else{
                    if(raincoat==true){
                    System.out.println("Go out, carry raincoat");
                    }
                    else{
                    System.out.println("Cant go out, u dont have raincoat or umbrella");
                    }
                }
            }
            else{
                System.out.println("Go out, no rain");
            }
    
    }
}