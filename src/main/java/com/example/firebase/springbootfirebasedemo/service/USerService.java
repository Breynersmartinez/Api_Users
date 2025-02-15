package com.example.firebase.springbootfirebasedemo.service;

import com.example.firebase.springbootfirebasedemo.service.User;

@Service
public class USerService {

private final String COLLECTION_NAME = " Users ";

public String SaveUser(User user) ExecutionException, InterruptedException
{
Firestore db = FirestoreClient.getFirestore();
ApiFuture<WriteResult> collectionApiFuture = db.collection(COLLECTION_NAME).document(user.getName()).set(user);
return collectionApiFuture.get().getUpdateTime().toString;
}

public user getUserBayName()
{
    Firestore db = FirestoreClient.getFirestore();
    
}

}
