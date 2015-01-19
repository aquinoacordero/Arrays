package arrays;

public class Arrays {

    public static void main(String[] args) {

        float[] temperaturas = {2f, 3f, 5f, 6f, 7f,};
        for (int i = temperaturas.length - 1; i >= 0; i--) {
            System.out.println("dia" + (1 + i) + "--->" + temperaturas[i]);
        }
        System.out.println("--------------\n");
        temperaturas[3] = 16f;
        for (int i = temperaturas.length - 1; i >= 0; i--) {
            System.out.println("dia" + (1 + i) + "--->" + temperaturas[i]);
        }
        System.out.println("--------------\n");
        for (int i = temperaturas.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i  + "  " + temperaturas[i]);
            }
        }
        visualizar(temperaturas);
    }
        
        public static void visualizar (float [] tem){
            for(int i=0;i<tem.length;i++){
                System.out.println("**"+tem[i]);
            }
        }
        
}
