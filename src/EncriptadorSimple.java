public class EncriptadorSimple {

    public String desencriptar(String texto){
        String textoDesencriptado = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if(i % 2 == 0){
                textoDesencriptado += letra;
            }
        }
        return textoDesencriptado;
    }

    public String encriptar(String texto) {
        String textoEncriptado = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            textoEncriptado += letra + "x";
        }
        return textoEncriptado;
    }
}
