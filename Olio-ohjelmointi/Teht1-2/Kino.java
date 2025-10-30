public class Kino {
        public static void main(String[] args) throws Exception {
        Elokuva Batman=new Elokuva();
        Elokuva Superman=new Elokuva();

        Batman.setElokuva("Batman");
        Batman.setKesto(140);
        Batman.setTuottaja("Matt Reeves");


                Superman.setElokuva("Superman");
        Superman.setKesto(155);
        Superman.setTuottaja("James Gunn");

        System.out.println("Kinossa esitellään");

        
        System.out.println(Batman.getElokuva());


        System.out.println(Superman.getElokuva());

        }
}
