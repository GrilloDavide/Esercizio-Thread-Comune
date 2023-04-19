public class Comune {
    private boolean occupata = false;


    public boolean isOccupata(){
        return occupata;
    }

    public void entra(){
        String name = Thread.currentThread().getName();
        
        System.out.println(name + " INIZIA a COMPILARE il modulo...");
        try {
            while (occupata) {    
                wait();
            }
            
            occupata = true;
        } catch (InterruptedException e) {
        }
    }

}
