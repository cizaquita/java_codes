
import javax.management.monitor.CounterMonitorMBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author  fabian vargas
 */
public class Basedatos {
	Libros lib[];
    Editorial editoriales[];
    Cliente clientes[];
    Pedido pedidos[];
    Ventas ventas[];
    int indexcl = -1;
    int indexed = -1;
    int indexpe = -1;
    int indexve = -1;
    int indexlb=-1;
    int codigosclientes[];
    int codigoPedido=0;

    public Basedatos() {
        editoriales = new Editorial[3];
        clientes = new Cliente[20];
        pedidos = new Pedido[20];
        ventas = new Ventas[2];
        codigosclientes=new int[20];
        lib=new Libros[20];

    }
    public String LeerUnLibro(int index){
        String temp = this.lib[indexlb].toString();   
        return temp;

}
    public String LeerAllLibros(){
        String info="";
        try{
        for (int i = 0; i < lib.length; i++) {
            //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
            String temp = this.lib[i].toString();
            System.out.println("Leidos ALL para index:"+i+ ":"+temp);
            if (temp.indexOf("null")== -1){
            info =  info + "\r\n"+ this.lib[i].toString();
            }
            
        }
        }catch(Exception e){
        	
        	
        	
        }
        return info;
    
    }
    public void AgregarLibros(Libros lb){
        indexlb++;
        System.out.println("indexlb:"+indexlb);
        this.lib[indexlb] = lb;
        System.out.println("Leidos para index "+ indexlb+":"+clientes[indexlb].toString());
    }
    public void AgregarLibros1(String titulo, int codigo, String editorial, float precio) {
        indexlb++;
        System.out.println("indexlb:"+indexlb);
        this.lib[indexlb] = new Libros(titulo, codigo, editorial, precio);
        System.out.println("Leidos para index "+ indexlb+":"+lib[indexlb].toString());
        
    }
   
    public void InicializarLibros() {

        for (int i = 0; i < lib.length; i++) {
            lib[i] = new Libros();

        }
        }
        public String BuscarLibro(int codigo){
            String info="No se encontro ";        
                for (int i = 0; i < lib.length; i++) {
                    //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
                     int code = this.lib[i].getCodigo();
                   // System.out.println("Leidos ALL para index:"+i+ ":"+info);
                    if (code== codigo){
                        info=this.editoriales[i].toString();
                     break;
                    }else{
                     info="No se encontro ninguna editorial con codigo "+String.valueOf(codigo);
                    }
                }
                 return info;     
            }
        public float PrecioLibro(String codigo){
           float info = 0;        
                for (int i = 0; i < lib.length; i++) {
                    //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
                     int code = this.lib[i].getCodigo();
                   // System.out.println("Leidos ALL para index:"+i+ ":"+info);
                    if (code== Integer.parseInt(codigo)){
                        info=this.lib[i].getPrecio();
                     break;
                    }
                }
                 return info;
            }
       
       
    
    public void deVolvercod(){	
		for (int i = 0; i < clientes.length; i++) {
			codigosclientes[i]=clientes[i].getCodigo();
		}
	}
    
    public int Leercod(int index){
		return codigosclientes[index];
    }
    
    public void InicializarClientes() {
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
        }
    }

    public void InicializarVentas() {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = new Ventas();
        }

    }

    public void InicializarPedidos() {

        for (int i = 0; i < pedidos.length; i++) {
            pedidos[i] = new Pedido();

        }

    }

    public void InicializarEditoriales() {

        for (int i = 0; i < editoriales.length; i++) {
//            editoriales[i] = new Editorial();

        }

    }

    public void AgregarCLiente(Cliente cl) {
        indexcl++;
        System.out.println("indexcl:"+indexcl);
        this.clientes[indexcl] = cl;
        System.out.println("Leidos para index "+ indexed+":"+clientes[indexcl].toString());
    }
    public void Agregarcliente1(String nombre, String direccion, float credito,	String telefono, int codigocliente) {
        indexcl++;
        System.out.println("indexcl:"+indexcl);
        this.clientes[indexcl] = new Cliente(nombre, direccion, credito, telefono, codigocliente);
        System.out.println("Leidos para index "+ indexcl+":"+clientes[indexcl].toString());
        
    }
    public String BuscarClientes(int codigo){
        String info="No se encontro";
            
        try{
            for (int i = 0; i <clientes.length; i++) {
                //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
                 int code = this.clientes[i].getCodigo();
               // System.out.println("Leidos ALL para index:"+i+ ":"+info);
                if (code== codigo){
                    info=info+"\r\n"+this.clientes[i].toString();
                 break;
                }else{
                 info="No se encontro ninguna cliente con ese codigo "+String.valueOf(codigo);
                }
                
            }
        }catch(Exception r){
        	info="No se encontro ninguna cliente con ese codigo "+String.valueOf(codigo);
        }
             return info;
    }
    public void AgregarPedido(Pedido pe) {
        indexpe++;
        System.out.println("indexpe:"+indexpe);
        this.pedidos[indexpe] = pe;
        System.out.println("Leidos para index "+ indexpe+":"+pedidos[indexed].toString());
    }
    public void AgregarPedido1(int codigopedido, String descripcion, String fecha,
			float total, String direccionenvio,String estado){
    	indexpe++;
    	System.out.println("indexpe: "+indexpe);
    	this.pedidos[indexpe]=new Pedido(codigopedido, descripcion, fecha, total, direccionenvio, estado);
    	System.out.println("leidos para index :"+pedidos[indexpe].toString());
    	
    }
    public int generarCodigoPedido(){
    	codigoPedido++;
		return codigoPedido;
    	
    }
    
    public String BuscarPedido(int codigo){
        String info="No se encontro";
            
            for (int i = 0; i < pedidos.length; i++) {
                //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
                 int code = this.pedidos[i].getCodigopedido();
               // System.out.println("Leidos ALL para index:"+i+ ":"+info);
                if (code== codigo){
                    info=info+"\r\n"+this.ventas[i].toString();
                 break;
                }else{
                 info="No se encontro ningun pedido con ese  codigo "+String.valueOf(codigo);
                }
                
            }
             return info;
            
        
        }
    public void AgregarVentas(Ventas ve) {
        indexve++;
        System.out.println("indexve:"+indexve);
        this.ventas[indexve] = ve;
        System.out.println("Leidos para index "+ indexve+":"+ventas[indexve].toString());
    }
    public void AgregarVentas1(int codigopedido, int codigocliente, String fecha,String desripcion){
    	indexve++;
    	System.out.println("indexve: "+indexve);
    	this.ventas[indexve] =new Ventas(codigopedido, codigocliente, fecha, desripcion);
    	 System.out.println("Leidos para index "+ventas[indexve].toString());
    	
    }
    public void AgregarEditorial(Editorial ed) {
        indexed++;
        System.out.println("indexed:"+indexed);
        this.editoriales[indexed] = ed;
        System.out.println("Leidos para index "+ indexed+":"+editoriales[indexed].toString());
        
    }
    public void AgregarEditorial1(int codigoeditorial,String nombreeditorial,String direccion, String telefono, float descuentosvolumen) {
        indexed++;
        System.out.println("indexed:"+indexed);
        this.editoriales[indexed] = new Editorial(codigoeditorial,nombreeditorial,direccion,  telefono, descuentosvolumen);
        System.out.println("Leidos para index "+ indexed+":"+editoriales[indexed].toString());
        
    }
    
    public String LeerUnaEditorial(int index){
                 String temp = this.editoriales[index].toString();   
                 return temp;
    
    }
    
    public String BuscarEditorial(int codigo){
    String info="No se encontro ";
        
        for (int i = 0; i < editoriales.length; i++) {
            //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
             int code = this.editoriales[i].getCodigoeditorial();
           // System.out.println("Leidos ALL para index:"+i+ ":"+info);
            if (code== codigo){
                info=this.editoriales[i].toString();
             break;
            }else{
             info="No se encontro ninguna editorial con codigo "+String.valueOf(codigo);
            }
            
        }
         return info;
        
    
    }
    public String LeerAllEditoriales(){
        String info="";
        try{
        for (int i = 0; i < editoriales.length; i++) {
            //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
            String temp = this.editoriales[i].toString();
            System.out.println("Leidos ALL para index:"+i+ ":"+temp);
            if (temp.indexOf("null")== -1){
            info =  info + "\r\n"+ this.editoriales[i].toString();
            }
            
        }
        }catch(Exception e){
        	
        	
        }
        return info;
    
    }
    public String LeerAllVentas(){
String info="";
        try{
        for (int i = 0; i < ventas.length; i++) {
            //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
            String temp = this.ventas[i].toString();
            System.out.println("Leidos ALL para index:"+i+ ":"+temp);
            if (temp.indexOf("null")== -1){
            info =  info + "\r\n"+ this.ventas[i].toString();
            }
            
        }
        }catch(Exception e){
        	
        }
        return info;
    }
    public String BuscarVentas(int codigo){
        String info="No se encontro ";
            
            for (int i = 0; i < ventas.length; i++) {
                //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
                 int code = this.ventas[i].getCodigoCliente();
               // System.out.println("Leidos ALL para index:"+i+ ":"+info);
                if (code== codigo){
                    info=info+"\r\n"+this.ventas[i].toString();
                 break;
                }else{
                 info="No se encontro ninguna venta con ese codigo "+String.valueOf(codigo);
                }
                
            }
             return info;
            
        
        }
    public String LeerAllPedidos(){
String info="";
        try{
        for (int i = 0; i < pedidos.length; i++) {
            //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
            String temp = this.pedidos[i].toString();
            System.out.println("Leidos ALL para index:"+i+ ":"+temp);
            if (temp.indexOf("null")== -1){
            info =  info + "\r\n"+ this.pedidos[i].toString();
            }
            
        }
        }catch(Exception e){
        	
        	
        }
        return info;
    
    }
    public String LeerAllClientes(){
String info="";
        try{
        for (int i = 0; i < clientes.length; i++) {
            //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
            String temp = this.clientes[i].toString();
            System.out.println("Leidos ALL para index :"+i+ ":"+temp);
            if (temp.indexOf("null")== -1){
            info =  info + "\r\n"+ this.clientes[i].toString();
            }
            
        }
        }catch(Exception e){
        	
        	
        }
        return info;
    
    }
    public String  generarReporte(){
    	String reporte = "";
    	for (int i = 0; i < codigosclientes.length; i++) {
    		int codi=codigosclientes[i];
    		reporte= reporte+"\r\n"+BuscarVentas(codi);
    		
			
		}
    	
		return reporte;
    	
    }
       	
    	
    public boolean consultarCliente(String codigo){
         boolean info = false;
             try{
             for (int i = 0; i < clientes.length; i++) {
                 //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
            	 System.out.println(clientes[i]);
                  int code = this.clientes[i].getCodigo();
                // System.out.println("Leidos ALL para index:"+i+ ":"+info);
                 if (code== Integer.parseInt(codigo)){
                     info=true;
                  break;
                 }
                 else {
                 info=false;
                 }
                 
             }
             }catch(Exception e){
            	 
            	info=false; 
             }
              return info;
             
         
         }
    public boolean actualizarPedidos(int codigo,String estado){
    	
    	 boolean info = false;
         
         for (int i = 0; i < pedidos.length; i++) {
             //info  = info + editoriales[i].getNombreeditorial()+ ","+ editoriales[i].
              int code = this.pedidos[i].getCodigopedido();
            // System.out.println("Leidos ALL para index:"+i+ ":"+info);
             if (code== codigo){
            	 pedidos[i].setEstado(estado);
                 info=true;
              break;
             }
             else {
             info=false;
             }
             
         }
          return info;
    }
}
