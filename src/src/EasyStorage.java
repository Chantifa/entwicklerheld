import java.security.Key;
import java.util.*;

public class EasyStorage {
    private final String item;
    private final String repository;
    private final HashMap<String, String> storage;

    public EasyStorage(String item, String repository, HashMap<String,String> storage) {
        this.item = item;
        this.repository = repository;
        this.storage = storage;
    }
    public void store(String item, String repository){
        //Implement this for scenario 1
        storage.put(item, repository);
    }

    public Map<String, String> getAllData(){
        //Implement this for scenario 2
        return storage;
    }

    public String getRepository(String item){
        if (storage.values().stream().anyMatch(repository -> repository.equalsIgnoreCase(item)));
         if(repository == null) {
                return null;
            }
        //Implement this for scenario 3
            else{
                return repository;
         }
    }

    public Set<String> getItems(String repository){
        if(storage.values().stream().anyMatch(item -> item.equalsIgnoreCase(repository)));
        Set<String> stringHashSet = new HashSet<>();
        stringHashSet.add(item);
        return stringHashSet ;
        //Implement this for scenario 3
    }

    public static void main(String [] args){
        try {
            HashMap<String, String> storage = new HashMap<>();
            String item = "Glasses";
            String repository = "Bookshelf";
            EasyStorage easyStorage = new EasyStorage(item, repository, storage);
            easyStorage.store(item, repository);
            System.out.println(easyStorage.getAllData());
            System.out.println(easyStorage.getRepository(item));
            System.out.println(easyStorage.getItems(repository));
        }
        catch (NullPointerException  e){
            System.out.print("NullPointerException Caught");
        }
        catch (IllegalArgumentException a){
            System.out.print("IllegalArgumentException Caught");
        }
    }


}
