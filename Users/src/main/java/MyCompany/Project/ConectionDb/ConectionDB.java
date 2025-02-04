package MyCompany.Project.ConectionDb;
import com.google.cloud.firestore.WriteResult;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;


@Service
public class ConectionDB {




    //Metodo para conexion de la base de datos
    public static void Conection()
    {
        FileInputStream serviceAccount = null;


        try {
             serviceAccount = new FileInputStream("./dbproyecttest.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                   // .setDatabaseUrl("https://dbproyecttest.firebaseio.com")
                    .build();

            FirebaseApp.initializeApp(options);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
