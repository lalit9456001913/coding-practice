interface GPS{
    void GpsMethod();
}


interface Camera{
    void CameraMethod();
}



class PolymorphismWithInterface implements GPS,Camera{
    public void GpsMethod(){
        System.out.println("calling GpsMethod");
    }
    public void CameraMethod(){
        System.out.println("calling CameraMethod");
    }
    public static void main(String[] args){
        System.out.println("inside main function");
        GPS gps=new PolymorphismWithInterface();
//        gps.CameraMethod();    // will through error because here we have refrence of GPS interface but call trying to call Camera interface method
        gps.GpsMethod();

        // same for Camera Interface

        Camera cam=new PolymorphismWithInterface();
        // cam.GpsMethod() // it will also through error
        cam.CameraMethod();
    }
}