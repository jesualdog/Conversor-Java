package Operaciones;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {

        ConversorMoneda conversorMoneda = new ConversorMoneda();
        ConversorTiempo conversorTiempo = new ConversorTiempo();
        ConversorLongitud conversorLongitud = new ConversorLongitud();
        
        while (true) {
           
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú Principal",
                    JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Tiempo", "Conversor de Longitud"},
                    "Selecciona")).toString();

            if ("Conversor de Moneda".equals(opciones)) {
                String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir");
                if (conversorMoneda.ValidarNumero(input) == true) {
                    double MonedaInput = Double.parseDouble(input);
                    double total = conversorMoneda.ConvertirMoneda(MonedaInput);
                    JOptionPane.showMessageDialog(null, "Equivale a: " + Math.round(total * 100.0) / 100.0);

                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Selecciona opción afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa Terminado");
                        break;
                    }
                }
            } 
            
            if ("Conversor de Tiempo".equals(opciones)) {
                String input = JOptionPane.showInputDialog("Ingrese el valor de tiempo que deseas convertir");
                if (conversorTiempo.ValidarNumero(input) == true) {
                    double TiempoInput = Double.parseDouble(input);
                    double total = conversorTiempo.ConvertirTiempo(TiempoInput);
                    JOptionPane.showMessageDialog(null, "Equivale a: " + Math.round(total * 100.0) / 100.0);

                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Selecciona opción afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa Terminado");
                        break;
                    }
                }
            }
            
            if ("Conversor de Longitud".equals(opciones)) {
                String input = JOptionPane.showInputDialog("Ingrese el valor de la longitud que deseas convertir");
                if (conversorLongitud.ValidarNumero(input) == true) {
                    double LongitudInput = Double.parseDouble(input);
                    double total = conversorLongitud.ConvertirLongitud(LongitudInput);
                    JOptionPane.showMessageDialog(null, "Equivale a: " + Math.round(total * 100.0) / 100.0);
                    
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Selecciona opción afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa Terminado");
                        break;
                    }
                }
            }

        }

    }

}
