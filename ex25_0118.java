package 연습.javaFestival;

public class ex25_0118 {
    public static void main(String[]aStrings) {
        int[][] array = new int[5][5];
        for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array.length; j++){
            array[i][j] = (j+1) + (i*5);
        }
        }
        System.out.println("원본");
        for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array.length; j++){
            System.out.print(array[i][j]+"\t");
        }System.out.println();
        }
        System.out.println();
        System.out.println("90도 회전");
        for(int i=array[0].length-1; i>=0 ; i--){
        for(int j = 0 ; j<array.length; j++){
            System.out.print(array[j][i] + "\t");
        }System.out.println();
        }
    }
}
