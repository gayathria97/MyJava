public class july2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i= arr[6];
        try{
            int c=arr[4];
        }
        catch(ArrayIndexOutOfBoundsException aie){
            aie.printStackTrace();

            System.out.println(aie);
        }
        System.out.println("execute: ");

    }
}
