package Operaciones;

import javax.swing.JOptionPane;

public class ConversorLongitud {

    public double ConvertirLongitud(double LongitudInput) {
        String tipoConversion = (JOptionPane.showInputDialog(null, "Elija la escala a la que desea convertir su longitud", "Opciones de Longitud",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                    "De Metro a Centimetro",
                    "De Metro a Kilometro",
                    "De Metro a Milla",
                    "De Kilometro a Centimetro",
                    "De Kilometro a metro",
                    "De Kilometro a Milla",
                    "De Milla a Centimetro",
                    "De Milla a Metro",
                    "De Milla a Kilometro",}, "Seleccione una Conversión")).toString();
        
        switch (tipoConversion) {
            case "De Metro a Centimetro":
                LongitudInput = LongitudInput * 100;
                break;

            case "De Metro a Kilometro":
                LongitudInput = (LongitudInput / 1000);
                break;

            case "De Metro a Milla":
                LongitudInput = (LongitudInput / 1609);
                break;

            case "De Kilometro a Centimetro":
                LongitudInput = (LongitudInput * 100000);
                break;

            case "De Kilometro a metro":
                LongitudInput = (LongitudInput * 1000);
                break;

            case "De Kilometro a Milla":
                LongitudInput = (LongitudInput / 1.609);
                break;
                
            case "De Milla a Centimetro":
                LongitudInput = (LongitudInput * 160900);
                break;
                
            case "De Milla a Metro":
                LongitudInput = (LongitudInput * 1609);
                break;
                
            case "De Milla a Kilometro":
                LongitudInput = (LongitudInput * 1.609);
                break;
                
            default:
                break;
        }
        return LongitudInput;
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
