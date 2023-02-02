
package listaordenadagenerica;


public class ListaOrdenadaGenerica {

    Data[] array;
    int n;
    int count;
    int pos;
    
    public ListaOrdenadaGenerica(int n){
        this.array = new Data[n];
        this.n = n;
        this.pos =0;
        this.count = 0;
    }
    
    public boolean Buscar(Data element){
        boolean bandera = true;
        int posi = 0;    
        
        while(posi<this.count && bandera){  
            //no se si funcione <= 
            if(element.compareTo(this.array[posi]) < 0 || element.equals(this.array[posi])){
                bandera = false;
            }else{
                posi ++;
            }           
        }
        this.pos = posi;
        
        if( posi<this.count){
            bandera = element == this.array[posi];
        }else{
            bandera = posi!=count;
        }     
        return bandera;
    }
    
    public boolean Insertar(Data element){
        boolean bandera = false;
        if(count<n){
            if( !Buscar(element) ){
                for(int i = count-1;i>=pos;i-- ){
                    array[i+1] = array[i];             
                }
                array[pos] = element;
                this.count ++;
                bandera = true;               
            }
        }else{
            System.out.println("Esta lleno pa");
        }        
        return bandera;
    
    }
    
    public boolean Eliminar(Data element){
        
        boolean bandera = false;    
        if( Buscar(element) ){
            for(int i=pos; i<count-1; i++){            
                array[i] = array[i+1];
            }
            this.count--;
            bandera = true;
        }              
        return bandera;
    }     
    
    public int indexOf(Data element){
        boolean found = Buscar(element);
        if(found){
            return this.pos;
        }
        else{
            return -1;
        }
    }
    
    public String toString(){
       
        String cad = "[ ";
        for(int i=0;i<count;i++){
            cad +=array[i]+" ";
        }
        cad +=" ]";
        return cad;
        
    }
    
    public static void main(String[] args) {
        
     
        
    }
}

