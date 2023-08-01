class CalorieBurn {
    public static void main(String[] args) {
    float cycling = 300f;
    float swimming = 200f;
    float running = 500f;
    float caloriesAddD = 100f;
    //Month Adding
    float caloriesAddM = caloriesAddD*30;
    //Week burning
    float cyclingW = cycling*2;
    float swimmingW = swimming*2;
    float runningW= running*2;
    //Month Calories Burn
    float burnTotalM = (cyclingW+swimmingW+runningW)*4;
    //Total loss of weight
    float TotalBurnM = (burnTotalM-caloriesAddM)/1000;
    System.out.println(" Weight lost by Anne in a month is :"+TotalBurnM+ " pounds");


    }
}
