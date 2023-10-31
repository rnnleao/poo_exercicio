public class For1 extends Thread{
    public void run(){
        int x=0;
        for (int i = 0; i < 50; i++) {
            x=x+2;
            System.out.println("Executando For1");
            try{
                Thread.sleep(100);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}