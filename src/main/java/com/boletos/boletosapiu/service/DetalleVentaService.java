package com.boletos.boletosapiu.service;

import com.boletos.boletosapiu.model.DetalleVenta;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.entity.EntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;

public class DetalleVentaService {
    private static final String BASE_URL = "https://futbolboletosapi.onrender.com/api/detalleVenta";
    private static final ObjectMapper mapper = new ObjectMapper();

    public List<DetalleVenta> getDetalleVentas() throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(BASE_URL);
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, new TypeReference<List<DetalleVenta>>() {});
        }
    }

    public DetalleVenta createDetalleVenta(DetalleVenta c) throws Exception {
    try (CloseableHttpClient client = HttpClients.createDefault()) {
        HttpPost request = new HttpPost(BASE_URL + "/create");            
        String json = mapper.writeValueAsString(c);

        request.setEntity(EntityBuilder.create()
                .setText(json)
                .setContentType(ContentType.APPLICATION_JSON)
                .build());

        System.out.println("➡️ Enviando solicitud a: " + BASE_URL + "/create");
        System.out.println("📦 Datos enviados: " + json);

        ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
        int statusCode = response.getCode();
        InputStream is = response.getEntity().getContent();

        if (statusCode >= 200 && statusCode < 300) {
            System.out.println("✅ Solicitud exitosa. Procesando respuesta...");
            return mapper.readValue(is, DetalleVenta.class);
        } else {
            // Leer el cuerpo de error del servidor
            String errorResponse = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            System.err.println("❌ Error del servidor (" + statusCode + "): " + errorResponse);
            throw new RuntimeException("Error del servidor: " + statusCode + " - " + errorResponse);
        }

    } catch (SocketTimeoutException e) {
        System.err.println("⏰ Error: tiempo de espera agotado (timeout).");
        e.printStackTrace();
        throw e;
    } catch (ConnectException e) {
        System.err.println("🚫 Error: no se pudo conectar con el servidor (" + BASE_URL + ").");
        e.printStackTrace();
        throw e;
    } catch (IOException e) {
        System.err.println("💥 Error de entrada/salida al intentar comunicar con la API.");
        e.printStackTrace();
        throw e;
    } catch (Exception e) {
        System.err.println("⚠️ Error inesperado en createDetalleVenta:");
        e.printStackTrace();
        throw e;
    }
}
    
    public DetalleVenta updateDetalleVenta(int id, DetalleVenta c) throws Exception{
        try(CloseableHttpClient client = HttpClients.createDefault()){
            HttpPut request = new HttpPut(BASE_URL + "/update/"+ id);
            String json = mapper.writeValueAsString(c);
            
            request.setEntity(EntityBuilder.create()
            .setText(json)
            .setContentType(ContentType.APPLICATION_JSON)
            .build());
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, DetalleVenta.class);
        }
    }    
}
