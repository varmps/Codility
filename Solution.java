public class Solution {

    public static int maximumPossibleInteger(int N, int K) {
        // write your code in Java SE 11
        String charInt = Integer.toString(N);
        
        while ((charInt.charAt(0) != '9')&&(K>0)){
                N += 100;
                K -= 1;
                charInt = Integer.toString(N);
        }
        while ((charInt.charAt(1) != '9')&&(K>0)){
                N += 10;
                K -= 1;
                charInt = Integer.toString(N);
        }
        while ((charInt.charAt(2) != '9')&&(K>0)){
                N += 1;
                K -= 1;
                charInt = Integer.toString(N);
        }
        return N;
    }

    public static int enemiesInLightCone(String direction, int radius, int[] X, int[] Y) {
        int nrOfEnemies = 0;

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
