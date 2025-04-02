
public class simulacaoCGI {
        public static void main(String[] args) {
            // Imprimindo os headers HTTP obrigatórios
            System.out.println("Content-Type: text/html");
            System.out.println(); // Linha em branco separando headers do corpo

            // Imprimindo o corpo da resposta em HTML
            System.out.println("<html>");
            System.out.println("<head><title>Saudação CGI</title></head>");
            System.out.println("<body>");
            System.out.println("<h1>Olá, Terráqueos!</h1>");
            System.out.println("</body>");
            System.out.println("</html>");
        }
    }
