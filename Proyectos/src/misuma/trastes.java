package misuma;

public class trastes {
    public static void main(String[] args) {
        int hermano=0, menor=0; 
        //hermano platos HONDOS y TENEDOR
        //menor platos PLANOS y CUCHARAS
        //CUBIERTOS 1
        // PLATOS 2
        char trastes[] = {'H','H','P','C','C','C','H','T','T','H','P','P'};
        
        for(int i=0; i<trastes.length; i++){
            switch (trastes[i]) {
                case 'H':
                    hermano=hermano+2;
                    break;
                case 'T':
                    hermano=hermano+1;
                    break;
                case 'P':
                    menor=menor+2;
                    break;
                default:
                    menor=menor+1;
                    break;
            }
           
           System.out.println("Tú lavaste: " + hermano + " " +"trastes");
           System.out.println("Tú hermano menor lavó: " + menor+ " " + "trastes");
            
        }
           
    }   
}

