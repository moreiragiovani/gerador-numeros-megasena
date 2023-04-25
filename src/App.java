public class App {
    public static void main(String[] args) throws Exception {
        int[] numerosDaSorte = new int[6];

        int quantidade = 0;

        while(quantidade < numerosDaSorte.length){
            int geradorNumerico = 1 + (int)(Math.random() * 60);

            for(int i=0; i<numerosDaSorte.length; i++){
                for(int j=0; j<numerosDaSorte.length; j++){
                    if(numerosDaSorte[j] == geradorNumerico){
                        while(numerosDaSorte[j] == geradorNumerico){
                            geradorNumerico = 1 + (int)(Math.random() * 60);
                        }
                    }
                }
            }
            numerosDaSorte[quantidade] = geradorNumerico;
            quantidade ++;
        }
        
        for(int i=0; i<numerosDaSorte.length - 1; i++){
            for(int j=i + 1; j<numerosDaSorte.length; j++){
                if(numerosDaSorte[i] > numerosDaSorte[j]){
                    int n = numerosDaSorte[i];
                    numerosDaSorte[i] = numerosDaSorte[j];
                    numerosDaSorte[j] = n;
                }
            }
        }
        
        System.out.print("Numeros da sorte: ");

        for(int i : numerosDaSorte){
            System.out.print(i + " ");
        }
    }
}
