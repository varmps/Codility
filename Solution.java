public class Solution {

    public static int maximumPossibleInteger(int N, int K) {
        // write your code in Java SE 11
        String charInt = Integer.toString(N);
        System.out.println(charInt);
        
        while ((charInt.charAt(0) != '9')&&(K>0)){
                N += 100;
                K -= 1;
                System.out.println(N);
        }
        while ((charInt.charAt(1) != '9')&&(K>0)){
                N += 10;
                K -= 1;
        }
        while ((charInt.charAt(2) != '9')&&(K>0)){
                N += 1;
                K -= 1;
        }
        return N;
    }

    public static int daysToDoMissions(int[] D, int X) {
        // write your code in Java SE 11
        int days = 0;
        int currentStart = 0;
        int next = 1;

        while(next<D.length){
            if(Math.abs(D[next] - D[currentStart]) <= X){
             System.out.println("diff " +Math.abs(D[next] - D[currentStart]) );
            next++;
           
            }
            else{
                days++;
                System.out.println("days " + days);
                currentStart = next;
            }

        }


        return days;
    }

    public static int enemiesInLightCone(String direction, int radius, int[] X, int[] Y) {
        int nrOfEnemies = 0;

        // U if y > x or y >abs x if x < 0

        //close enough if radius < Math.sqrt(y*y + x*x)
    for (int i = 0; i < X.length; i++){
        switch (direction){
            case ("U"):
                        // y >= abs.x
                    if (radius >= Math.sqrt(X[i]*X[i]+Y[i]*Y[i]) && (Y[i] >= Math.abs(X[i]))){                        
                        nrOfEnemies++;                        
                    }
                
            break;
            case ("D"): // y <= -abs.x
                    if (radius >= Math.sqrt(X[i]*X[i]+Y[i]*Y[i]) && (Y[i] <= -Math.abs(X[i]))){
                        nrOfEnemies++;
                    }                 
            break;
            case ("L"):
                    if (radius >= Math.sqrt(X[i]*X[i]+Y[i]*Y[i]) && (X[i] <= -Math.abs(Y[i]))){
                        nrOfEnemies++;
                    }                
            break;
            case ("R"):
                    if (radius >= Math.sqrt(X[i]*X[i]+Y[i]*Y[i]) && (X[i] >= Math.abs(Y[i]))){
                        nrOfEnemies++;
                    }                
            break;
        }
    }
        return nrOfEnemies;
    }
    
        public static int daysToDoMissions_2(int[] D, int X) {
            // write your code in Java SE 11
            int days = 0;
            for(int i = 0; i < D.length-1 ; i++){
                if (Math.abs(D[i]-D[i+1]) <= X){
                    System.out.println("i is "+ D[i]);
                    System.out.println("i+1 is "+ D[i+1]);
                    if (i == D.length -2){
                        days++;
                    }
                }
                else{
                    days++;
                }                
            }
            if (Math.abs(D[D.length-2]-D[D.length-1]) > X){
                days++;
            }
            return days;
        }    
}
