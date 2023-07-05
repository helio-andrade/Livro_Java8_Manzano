package capitulo5;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class RedeInfo {
    public static void main(String[] args) {
        String enderecoRede = "192.168.0.0/28";

        try {
            // Extrair o endereço IP e a máscara de rede do formato CIDR
            String[] partes = enderecoRede.split("/");
            String enderecoIP = partes[0];
            int mascara = Integer.parseInt(partes[1]);

            // Calcular o número de hosts possíveis na rede com base na máscara
            int numHosts = (int) Math.pow(2, 32 - mascara) - 2;

            // Calcular os endereços de rede, broadcast e gateway
            InetAddress enderecoRedeInet = InetAddress.getByName(enderecoIP);
            byte[] enderecoRedeBytes = enderecoRedeInet.getAddress();
            byte[] mascaraBytes = calcularMascaraBytes(mascara);
            byte[] enderecoBroadcastBytes = calcularEnderecoBroadcast(enderecoRedeBytes, mascaraBytes);
            byte[] enderecoGatewayBytes = calcularEnderecoGateway(enderecoRedeBytes);

            // Exibir os resultados
            System.out.println("Endereço de rede: " + enderecoRedeInet.getHostAddress());
            System.out.println("Endereço de broadcast: " + InetAddress.getByAddress(enderecoBroadcastBytes).getHostAddress());
            System.out.println("Endereço de gateway: " + InetAddress.getByAddress(enderecoGatewayBytes).getHostAddress());
            System.out.println("Endereços dos hosts:");

            // Exibir os endereços dos hosts
            for (int i = 1; i <= numHosts; i++) {
                byte[] enderecoHostBytes = calcularEnderecoHost(enderecoRedeBytes, i);
                InetAddress enderecoHostInet = InetAddress.getByAddress(enderecoHostBytes);
                System.out.println(enderecoHostInet.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Endereço IP inválido.");
        }
    }

    private static byte[] calcularMascaraBytes(int mascara) {
        int numBits = 0xFFFFFFFF << (32 - mascara);
        return new byte[] {
            (byte) ((numBits >> 24) & 0xFF),
            (byte) ((numBits >> 16) & 0xFF),
            (byte) ((numBits >> 8) & 0xFF),
            (byte) (numBits & 0xFF)
        };
    }

    private static byte[] calcularEnderecoBroadcast(byte[] enderecoRedeBytes, byte[] mascaraBytes) {
        byte[] enderecoBroadcastBytes = new byte[4];
        for (int i = 0; i < 4; i++) {
            enderecoBroadcastBytes[i] = (byte) (enderecoRedeBytes[i] | (~mascaraBytes[i] & 0xFF));
        }
        return enderecoBroadcastBytes;
    }

    private static byte[] calcularEnderecoGateway(byte[] enderecoRedeBytes) {
        byte[] enderecoGatewayBytes = enderecoRedeBytes.clone();
        enderecoGatewayBytes[3] = (byte) (enderecoGatewayBytes[3] + 1);
        return enderecoGatewayBytes;
    }

    private static byte[] calcularEnderecoHost(byte[] enderecoRedeBytes, int indiceHost) {
        byte[] enderecoHostBytes = enderecoRedeBytes.clone();
        enderecoHostBytes[3] = (byte) (enderecoHostBytes[3] + indiceHost);
        return enderecoHostBytes;
    }
}
