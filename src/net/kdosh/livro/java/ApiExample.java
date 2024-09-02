/*
package net.kdosh.livro.java;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiExample {
    private static final String API_URL = "https://kdosh.net/api/leitura/public/leituras/?access_key=geYAEVuhUUeR1kbPmQ88ayTi";

    public static void main(String[] args) {
        try {
            // Cria a URL e a conexão HTTP
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Lê a resposta da API
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Converte a resposta para JSON
            JSONArray jsonArray = new JSONArray(response.toString());

            // Exibe os dados
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject item = jsonArray.getJSONObject(i);
                System.out.println("ID Leitura: " + item.getInt("id_leitura"));
                System.out.println("ID Livro: " + item.getInt("id_livro"));
                System.out.println("Data Início: " + item.getString("data_inicio"));
                System.out.println("Data Final: " + item.getString("data_final"));
                System.out.println("Página Atual: " + item.getInt("pagina_atual"));
                System.out.println("Progresso: " + item.getString("progresso"));
                System.out.println("---------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
