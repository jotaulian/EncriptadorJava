public class EncriptadorAvanzado {
    private Integer clave = 1;

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String encriptar(String texto) {
        String textoEncriptado = "";
        for (int i = 0; i < texto.length(); i++) {
            int codigoLetra = texto.charAt(i);
            codigoLetra = codigoLetra * clave;
            textoEncriptado += codigoLetra + "-";
        }
        return textoEncriptado;
    }

    public String desencriptar(String texto){
        String textoDesencriptado = "";
        String[] codigosLetras = texto.split("-");

        for (int i = 0; i < codigosLetras.length; i++) {
            String codigoLetraStr = codigosLetras[i];
            int codigoLetraInt = Integer.parseInt(codigoLetraStr) / clave;
            char codigoLetra = (char) codigoLetraInt ;
            String letra = Character.toString(codigoLetra);
            textoDesencriptado += letra;
        }
        return textoDesencriptado;
    }

}
