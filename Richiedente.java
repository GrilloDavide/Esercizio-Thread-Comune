public class Richiedente implements Runnable{
    
    private String name;
    private Comune comune;

    public Richiedente(String name, Comune comune){
        this.name = name;
        this.comune = comune;

    }

    @Override
    public void run() {
        long timeToCompile = (int) (Math.random() * 5000) + 1;
        comune.entra();
        try {
            Thread.sleep(timeToCompile);
        } catch (InterruptedException e) {
            
        }
    }
}
