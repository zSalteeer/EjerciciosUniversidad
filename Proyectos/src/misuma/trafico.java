package misuma;

public class trafico {
        public static void main(String[] args) {
        int personas=0; 
        //personas que pasan en una zona
        char transporte[] = {'c','a','m','b','p','p','b','b','a','a','a','m','c','b','p','c','b','a','a','p','a'};
        
        for(int i=0; i<transporte.length; i++){
            switch (transporte[i]) {
                case 'c':
                    personas=personas+25;
                    break;
                case 'a':
                    personas=personas+2;
                    break;
                default:
                    personas=personas+1;
                    break;
            }
        }
           System.out.println("La cantidad de personas que pasaron en la intersección es de: " +personas);
    }  
}
