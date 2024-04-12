
import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        boolean a=true;
        while (a){
                
                
        String nombreEmpleado, nombreCliente, direccion;
        int edadEmpleado, edadCliente, opcion;
        double salarioEmpleado;
 
     String menu = "Seleccione Una Opcion: \n"+
             "1. Empleado \n"+ 
             "2. Cliente \n"+
             "3. Salida ";
     
     String opMenu = JOptionPane.showInputDialog(menu);
     opcion = Integer.parseInt(opMenu);
     
     switch (opcion) {
     
         case 1: 
             
        nombreEmpleado = JOptionPane.showInputDialog("Ingrese El Nombre Del Empleado: ");  
        edadEmpleado = Integer.parseInt (JOptionPane.showInputDialog("Ingrese La Edad Del Empleado: ") );
        salarioEmpleado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese El Salario Del Empleado: "));
        
        JOptionPane.showMessageDialog(null, "El Nombre Del Empleado Es: "+nombreEmpleado+
                "\n La Edad Del Empleado Es: "+edadEmpleado+
                "\n EL Salario Del Empleado Es: "+salarioEmpleado);
        
     break;
      
         case 2:
             nombreCliente = JOptionPane.showInputDialog("Ingrese el NOmbre Del Cliente: ");
             edadCliente = Integer.parseInt(JOptionPane.showInputDialog("INgrese la edad del cliente: "));
             direccion = JOptionPane.showInputDialog("Ingrese la Direccion del Cliente : ");
             
        JOptionPane.showMessageDialog(null, "El Nombre Del Cliente Es: "+nombreCliente+
                "\n La Edad Del Cliente Es: "+edadCliente+
                "\n La Direccion Del Ciente es: "+direccion);
         break;  
         
         case 3:
             a=false;
             break; 
    }
    }
}
}