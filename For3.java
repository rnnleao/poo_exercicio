public class For3 extends Thread{
    public void run(){
        int z=0;
        for (int i = 0; i < 50; i++) {
            z=z+2;
            System.out.println("Executando For3");
            try{
                Thread.sleep(100);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Valor Final de z: "+z);
        }
    }
}