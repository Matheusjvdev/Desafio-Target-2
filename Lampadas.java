public class Lampadas {
    public static void main(String[] args) {
        
        boolean[] lampadas = {false, false, false};  
        boolean[] interruptores = {false, false, false};  
        boolean[] lampadasQuentes = {false, false, false};  

        interruptores[0] = true;  
        lampadas[0] = true;  
        simulateWait();  
        
        interruptores[0] = false;  
        lampadas[0] = false; 
        lampadasQuentes[0] = true;  
        interruptores[1] = true;  
        lampadas[1] = true;  
        
        
        checkLampadas(lampadas, lampadasQuentes);
    }

    
    public static void simulateWait() {
        try {
            Thread.sleep(2000);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
    public static void checkLampadas(boolean[] lampadas, boolean[] lampadasQuentes) {
        for (int i = 0; i < 3; i++) {
            if (lampadas[i] && !lampadasQuentes[i]) {
                System.out.println("Lâmpada " + (i + 1) + " está acesa e corresponde ao interruptor B.");
            } else if (!lampadas[i] && lampadasQuentes[i]) {
                System.out.println("Lâmpada " + (i + 1) + " está apagada mas quente, corresponde ao interruptor A.");
            } else if (!lampadas[i] && !lampadasQuentes[i]) {
                System.out.println("Lâmpada " + (i + 1) + " está apagada e fria, corresponde ao interruptor C.");
            }
        }
    }
}
