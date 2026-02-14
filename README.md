# Simple HTTP Server Java

Um servidor HTTP simples feito em Java usando `ServerSocket` e `Socket`, que responde com a data e hora atual.

## Como funciona
O servidor abre a porta **8080**, aguarda conexões e responde qualquer requisição HTTP com:

- Status `HTTP/1.1 200 OK`
- Data e hora atual do sistema

## ver a requisição no terminal

Se você quiser visualizar no terminal o que o navegador está enviando para o servidor (headers HTTP), dentro do while (true), colocar esse codigo: 

InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
BufferedReader reader = new BufferedReader(isr);

String line = reader.readLine();
while (line != null && !line.isEmpty()) {
    System.out.println(line);
    line = reader.readLine();
}
