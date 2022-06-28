package Operaciones;

import javax.swing.JOptionPane;

public class ConversorMoneda {

    public double ConvertirMoneda(double MonedaInput) {
        String tipoConversion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir su dinero", "Opciones de Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                    "De peso Colombiano a Dolar",
                    "De peso Colombiano a Euro",
                    "De peso Colombiano a Libras",
                    "De peso Colombiano a Yen",
                    "De peso Colombiano a Won coreano",
                    "De Dolar a Peso Colombiano",
                    "De Euro a Peso Colombiano",
                    "De Libras a Peso Colombiano",
                    "De Yen a Peso Colombiano",
                    "De Won coreano a Peso Colombiano",}, "Seleccione una Conversión")).toString();

        switch (tipoConversion) {
            case "De peso Colombiano a Dolar":
                MonedaInput = MonedaInput * 0.00024;
                break;

            case "De peso Colombiano a Euro":
                MonedaInput = MonedaInput * 0.00023;
                break;

            case "De peso Colombiano a Libras":
                MonedaInput = MonedaInput * 0.00020;
                break;

            case "De peso Colombiano a Yen":
                MonedaInput = MonedaInput * 0.033;
                break;

            case "De peso Colombiano a Won coreano":
                MonedaInput = MonedaInput * 0.31;
                break;

            case "De Dolar a Peso Colombiano":
                MonedaInput = MonedaInput * 4140;
                break;

            case "De Euro a Peso Colombiano":
                MonedaInput = MonedaInput * 4380;
                break;

            case "De Libras a Peso Colombiano":
                MonedaInput = MonedaInput * 5072;
                break;

            case "De Yen a Peso Colombiano":
                MonedaInput = MonedaInput * 30.51;
                break;

            case "De Won coreano a Peso Colombiano":
                MonedaInput = MonedaInput * 3.21;
                break;

            default:
                break;
        }

        return MonedaInput;
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
