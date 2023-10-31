public class For2 extends Thread{
    public void run(){
        int y=0;
        for (int i = 0; i < 50; i++) {
            y=y+3;
            System.out.println("Executando For2");
            try{
                Thread.sleep(100);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Valor Final de y: "+y);
        }
    }
}