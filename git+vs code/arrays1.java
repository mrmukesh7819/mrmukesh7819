

 public class arrays1 {
    public static void main(String[] args) {
        
    
   /*      // notes of arrars

        int [] marks= new int [5];
         marks [0]= 56;
         marks [1]= 52;
         marks [2]= 57;
         marks [3]= 45;
         marks [4]= 86;
        
         System.out.println(marks[4]);




        int[] marks;
        marks = new int [5];
        marks [0]= 56;
        marks [1]= 52;
        marks [2]= 57;
        marks [3]= 45;
        marks [4]= 86;
       
        System.out.println(marks[4]);


        int [] marks= {56,52,57,45,86};
        System.out.println(marks[4]);
      

        // lecture second of arrays
        int [] marks= {56,52,57,45,86};
        float[]flats= {52.3f,52.4f,58.4f,46.8f,54.1f};
        String[] names={"mukesh","manoj","ritik","sraraj","nishant"};
    
        System.out.println(marks[4]);
        System.out.println(flats[1]);
        System.out.println(names[4]);
        System.out.println("length of marks array");
        System.out.println(marks.length);
        System.out.println("length of flats array");
        System.out.println(flats.length);
        System.out.println("length of names array");
        System.out.println(names.length);

        // Displaying the array (in basic way)
        int [] marks= {56,52,57,45,86};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
    
        
        // Displaying the array (in for loop way)
        int [] marks= {56,52,57,45,86};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]
    }
  
        // Displaying the array (in reverse order)
        int [] marks= {56,52,57,45,86};
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
         
        // Displaying the array in very advanced way
         for(int element:marks){
            System.out.println(element);
         }





         // lecture number 28(notes of arrays)

         // Multidimensional arrays
         // int [] marks; // 1-D arrays
          int [][] flats; // 2-D arrays
         flats = new int [2][3];
         flats [0][0] = 101;
         flats [0][1] = 102;
         flats [0][2] = 103;
         flats [1][0] = 201;
         flats [1][1] = 202;
         flats [1][2] = 203;

        // Displaying 2-D array
 
        for (int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        // 3-D arrays (first method)
    */  
        

        int [][][] flats1 = {{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}}} ;
        
        // Displaying 3-D array 
        for(int a= 0;a<flats1.length;a++){

            for(int b=0;b<flats1[a].length;b++){

               for(int c=0;c<flats1[a][b].length;c++){


                System.out.print(flats1[a][b][c]);
                System.out.print(" ");
               }
               System.out.println();
            }
        }

    // 3-D arrays (second method)

        //for next time  

        }
}


