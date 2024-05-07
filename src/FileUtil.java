import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {
    public static String cargarTextoDesdeArchivo(String rutaArchivo){
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(Paths.get(rutaArchivo)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return texto;
    }

    public static void guardarArchivo(String rutaArchivo, String textoEncriptado) {
        try {
            FileWriter fw = new FileWriter(rutaArchivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(textoEncriptado);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
