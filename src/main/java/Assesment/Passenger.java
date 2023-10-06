package Assesment;
import java.util.HashMap;

public class Passenger {

        private HashMap<Integer, String> info;

        public Passenger() {
            info = new HashMap<>();
        }


        public void addInfo(int key, String value) {
            info.put(key, value);
        }


        public String getInfo(int key) {
            return info.get(key);
        }


        public void removeInfo(int key) {
            info.remove(key);
        }


        public HashMap<Integer, String> getAllInfo() {
            return info;
        }
}
