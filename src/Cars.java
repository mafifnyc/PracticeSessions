class Cars extends Vehicles{
    static int i;
    String getColor() {
        String[] arr = {"Black", "Blue", "Red", "White"};
        for(int i=0; i<4; i++) {
            return arr[i];
        }
        return arr[i];
    }
    String getDriveTrain() {
        String[] arr = {"AWD", "FWD", "RWD"};
        for(int i=0; i<3; i++) {
            System.out.println(arr[i]);
        }
        return arr[i];
    }
    String getEngine() {
        String[] arr = {"2.0l 4 Cyl Turbo", "2.4l 4 Cyl NA", "3.6l 6c Cyl NA"};
        for(int i=0; i<3; i++){
            System.out.println(arr[i]);
        }
        return arr[i];
    }


    public static void main(String[] args) {
       Cars mazda = new Cars();
       mazda.getDriveTrain();
       mazda.getEngine();
        System.out.println(mazda.getColor());
    }




}
