public class Temperature {
    double hot;
    double cold;

    Temperature(double hot, double cold){
        this.hot= hot;
        this.cold= cold;
    }

    void checkIcyHot(double hot, double cold){
        if(hot>100 && cold <0){
            System.out.println("IcyHot");
        }
        else{
            System.out.println("Not IcyHot");
        }
    }
}
