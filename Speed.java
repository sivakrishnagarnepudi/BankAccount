public class Speed extends Bike{
   final int Bikespeed=80;
   final int Carspeed=110;
   public Boolean getspeed(){
     final int Carspeed=160;
      return false;
   }
    public static void main(String args[]){
       Speed obJ=new Speed();
        System.out.println(obJ.Bikespeed);
        System.out.println(obJ.Carspeed);
        System.out.println(obJ.getspeed());
    }
}
