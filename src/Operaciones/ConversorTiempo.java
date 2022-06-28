package Operaciones;

import javax.swing.JOptionPane;

public class ConversorTiempo {

    public double ConvertirTiempo(double TiempoInput) {
        String tipoConversion = (JOptionPane.showInputDialog(null, "Elija la escala a la que desea convertir su tiempo", "Opciones de Tiempo",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                    "De Minuto a Segundo",
                    "De Minuto a Hora",
                    "De Hora a Segundo",
                    "De Hora a Minuto",
                    "De Hora a Dia",
                    "De Dia a Segundo",
                    "De Dia a Hora",
                    "De Dia a Minuto",
                    "De Segundo a Minuto",}, "Seleccione una Conversión")).toString();

        switch (tipoConversion) {

            case "De Minuto a Segundo":
                TiempoInput = (TiempoInput * 60);
                break;

            case "De Minuto a Hora":
                TiempoInput = (TiempoInput / 60);
                break;

            case "De Hora a Segundo":
                TiempoInput = (TiempoInput * 3600);
                break;

            case "De Hora a Minuto":
                TiempoInput = (TiempoInput * 60);
                break;
            
            case "De Hora a Dia":
                TiempoInput = (TiempoInput / 24);
                break;

            case "De Dia a Segundo":
                TiempoInput = (TiempoInput * 86400);
                break;
                
            case "De Dia a Minuto":
                TiempoInput = (TiempoInput * 1440);
                break;
                
            case "De Dia a Hora":
                TiempoInput = (TiempoInput * 24);
                break;

            case "De Segundo a Minuto":
                TiempoInput = (TiempoInput / 60);

            default:
                break;
        }
        return TiempoInput;
    }

    public boolean ValidarNumero(String input) {
        if (input.matches("^[0-9]+([.][0-9]+)?$")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un valor numerico");
            return false;
        }
    }

}
