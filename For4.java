public class For4 extends Thread{
    public void run(){
        int w=0;
        for (int i = 0; i < 50; i++) {
            w=w+2;
            System.out.println("Executando For4");
            try{
                Thread.sleep(100);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Valor Final de w: "+w);
        }
    }
}