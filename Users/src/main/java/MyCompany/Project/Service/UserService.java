package MyCompany.Project.Service;

import MyCompany.Project.Entity.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class UserService {
    private static final String COLLECTION_NAME = "User";



    public String addUser(User user) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture=db.collection(COLLECTION_NAME).document(user.getName()).set(user);


        return collectionApiFuture.get().getUpdateTime().toString();

    }
}
