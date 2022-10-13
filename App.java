public class App {
    public static void main(String[] args) throws Exception {

        // N -> [100..999], K -> [0..30]
        System.out.println(Solution7.maximumPossibleInteger(100,1)); //200
        System.out.println(Solution7.maximumPossibleInteger(999,1)); //999
        System.out.println(Solution7.maximumPossibleInteger(100,0)); //100
        System.out.println(Solution7.maximumPossibleInteger(123,15));//993

/*
        // D -> {[1..1_000_000_000],..N}, N -> [1..200_000], X -> [0..1_000_000_000]
        //int[] D = {1,1,1,1_000_000_000,1_000_000_000}; int X= 0; 
        System.out.println(Solution7.daysToDoMissions_2(new int[] {1,1,1,1_000_000_000,1_000_000_000}, 0)); //2
        System.out.println(Solution7.daysToDoMissions_2(new int[] {1,1,1,1_000_000_000,1_000_000_000}, 1)); //2
        System.out.println(Solution7.daysToDoMissions_2(new int[] {1,1,1,1_000_000_000,1_000_000_000},1_000_000_000)); //1
        System.out.println(Solution7.daysToDoMissions_2(new int[] {1,2,3,4,5,6,7,8,9}, 0)); //9
        System.out.println(Solution7.daysToDoMissions_2(new int[] {1,2,3,4,5,6,7,8,9}, 1)); //1
        System.out.println(Solution7.daysToDoMissions_2(new int[] {1,1,2,2,3,3,4,4,5,5}, 0)); //5
*/
/*
        // String direction = "U"; int radius = 50;        int[] X = {-50,-30,0  ,15, 40};        int[] Y = {5  ,30 ,40 ,30, 0};
        // direction -> [U,D,L,R], radius -> [1..10_000], X,Y -> {[-10_000..10_000,N0]}, N-> [1..100]
        // As it returns only one integer, it is tricky to test several conditions at the same time. Unless all 1-s or all 0-s.
        System.out.println(Solution7.enemiesInLightCone("U", 50, new int[] {-25, 25}, new int[] {20, 20}));  //0
        System.out.println(Solution7.enemiesInLightCone("U", 50, new int[] {-25, 25}, new int[] {30, 30}));  //2

        System.out.println(Solution7.enemiesInLightCone("D", 50, new int[] {-25, 25}, new int[] {-20,-20}));  //0
        System.out.println(Solution7.enemiesInLightCone("D", 50, new int[] {-25, 25}, new int[] {-30,-30}));  //2

        System.out.println(Solution7.enemiesInLightCone("L", 50, new int[] {-20, -20}, new int[] {-25,25}));  //0
        System.out.println(Solution7.enemiesInLightCone("L", 50, new int[] {-30, -30}, new int[] {-25,25}));  //2        

        System.out.println(Solution7.enemiesInLightCone("R", 50, new int[] { 20, 20}, new int[] { 25,-25}));  //0
        System.out.println(Solution7.enemiesInLightCone("R", 50, new int[] { 30, 30}, new int[] { 25,-25}));  //2

        System.out.println(Solution7.enemiesInLightCone("U", 50, new int[] {0,25}, new int[] {50,25}));  //2 -on cone and on radius

        System.out.println(Solution7.enemiesInLightCone("U", 50, new int[] {0}, new int[] {0})); //1
*/
    }
}
