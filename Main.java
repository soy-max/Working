import javax.net.ssl.HttpsURLConnection;
import java.net.*;
import java.io.*;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) throws IOException {
         URL urlOBj = new URL("https://monitoringapi.solaredge.com/sites/list?size=5&searchText=Lyon&sortProperty=name&sortOrder=ASC&api_key=JKQ2H4L6I9Y6583LBTRGO2UFL5EVLPIE");
         HttpsURLConnection connection = (HttpsURLConnection) urlOBj.openConnection();
         connection.setRequestMethod("GET");


         int responseCode = connection.getResponseCode();
         // System.out.println("Response CODE: " + responseCode);

         if (responseCode == HttpsURLConnection.HTTP_OK) {
             StringBuilder sb = new StringBuilder();
             Scanner scanner = new Scanner(connection.getInputStream());
             while (scanner.hasNext()) {
                 sb.append(scanner.nextLine());
             }
             System.out.print(sb);
         } else {
             System.out.println("Error in sending a GET request");
         }


     }
}