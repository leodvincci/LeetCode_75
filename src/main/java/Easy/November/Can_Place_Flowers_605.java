package Easy.November;

import java.util.Arrays;

public class Can_Place_Flowers_605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        if(flowerbed.length == 1){
            if(flowerbed[0] == 0){
                count++;
                return n <= 1;
            }else{
                return count == n;
            }
        }

        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1){

            }
            else if(i == 0) {
                if(flowerbed[i + 1] == 0){
                    flowerbed[i] = 1;
                    count++;
                }else{

                }

            }
            else if(i == flowerbed.length-1 && flowerbed[i-1] == 0){
                flowerbed[flowerbed.length-1] = 1;
                count++;
            }
            else if(flowerbed[i - 1] == 0 && flowerbed[i +1] == 0 ){
                flowerbed[i] = 1;
                count++;
            }

        }
        return count >= n;

    }



    public static void main(String[] args) {

        int[] flowerBed = {0,1,0};
        System.out.println(Arrays.toString(flowerBed));
        System.out.println(canPlaceFlowers(flowerBed,0));

    }

}
