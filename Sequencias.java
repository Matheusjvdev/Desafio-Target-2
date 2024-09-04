public class Sequencias {
    public static void main(String[] args) {
        
        int[] seqA = {1, 3, 5, 7};
        int nextA = seqA[seqA.length - 1] + 2; 
        System.out.println("Próximo elemento da sequência A: " + nextA);

        
        int[] seqB = {2, 4, 8, 16, 32, 64};
        int nextB = seqB[seqB.length - 1] * 2; 
        System.out.println("Próximo elemento da sequência B: " + nextB);

        
        int[] seqC = {0, 1, 4, 9, 16, 25, 36};
        int nextC = (seqC.length) * (seqC.length); 
        System.out.println("Próximo elemento da sequência C: " + nextC);

        
        int[] seqD = {4, 16, 36, 64};
        int nextD = (seqD.length + 2) * (seqD.length + 2); 
        System.out.println("Próximo elemento da sequência D: " + nextD);

       
        int[] seqE = {1, 1, 2, 3, 5, 8};
        int nextE = seqE[seqE.length - 1] + seqE[seqE.length - 2]; 
        System.out.println("Próximo elemento da sequência E: " + nextE);

        
        int[] seqF = {2, 10, 12, 16, 17, 18, 19};
        int nextF = seqF[seqF.length - 1] + 1; 
        System.out.println("Próximo elemento da sequência F: " + nextF);
    }
}
