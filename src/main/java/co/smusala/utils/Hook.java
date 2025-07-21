package co.smusala.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Hook {
    public static void descargarSiNoExiste(String apkUrl, String destinoLocal) {
        Path destino = Paths.get(destinoLocal);

        if (!Files.exists(destino)) {
            try (InputStream in = new URL(apkUrl).openStream()) {
                Files.copy(in, destino, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("APK descargado correctamente.");
            } catch (IOException e) {
                throw new RuntimeException("Error al descargar el APK desde la URL: " + apkUrl, e);
            }
        }
    }
}
