
package proyecto;


public class CarteraClientes {
    private int nClientes;
    private Cliente[] clientes;
    
    public CarteraClientes(){
        this.nClientes=0;
        clientes = new Cliente[10];
    }
    public boolean agregarCliente(Cliente clie){
        boolean r= false;
        if(this.nClientes<10){
            r=true;
            clientes[this.nClientes]=clie;
            this.nClientes++;
        }
        return r;
    }
    public Cliente obtenerCliente(int index){
        if(index<0 && index>100 ){
            return null;
        }else{
            return clientes[index];
        }
    }

    public int getnClientes() {
        return nClientes;
    }
    
}
