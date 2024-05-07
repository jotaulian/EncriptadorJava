import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // EncriptadorSimple encriptador = new EncriptadorSimple();
        EncriptadorAvanzado encriptador = new EncriptadorAvanzado();
        encriptador.setClave(939);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige la acción que deseas realizar:");
        System.out.println("1) Encriptar");
        System.out.println("2) Desencriptar");

        // Pedimos acción al usuario
        int accion = teclado.nextInt();

        // Pedimos ruta del archivo: C:\Cursos\javaATL\textoParaEncriptar.txt
        System.out.println("Indica la ruta del archivo:");
        String rutaArchivo = teclado.next();

        if (accion == 1){
            String texto = FileUtil.cargarTextoDesdeArchivo(rutaArchivo);
            String textoEncriptado = encriptador.encriptar(texto);
            System.out.println("Texto encriptado: "+ textoEncriptado);
            FileUtil.guardarArchivo(rutaArchivo, textoEncriptado);
        }else{
            String texto = FileUtil.cargarTextoDesdeArchivo(rutaArchivo);
            String textoDesencriptado = encriptador.desencriptar(texto);
            System.out.println("Texto desencriptado: "+textoDesencriptado);
            FileUtil.guardarArchivo(rutaArchivo, textoDesencriptado);
        }

    }
}
