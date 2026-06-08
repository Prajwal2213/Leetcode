/*
981.Time Based Key - value store
Time complexity -> set - O(1), get - O(log n)
*/

class Data{
    int timeStamp;
    String value;
    Data(String value, int timeStamp){
        this.value = value;
        this.timeStamp = timeStamp;
    }
}
class TimeMap {
    private HashMap<String, ArrayList<Data>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).add(new Data(value, timestamp));
        }else{
            ArrayList<Data> arr = new ArrayList<>();
            arr.add(new Data(value, timestamp));
            map.put(key, arr);
        }
    }
    
    public String get(String key, int timestamp) {
        String cand = "";

        if(map.containsKey(key)) {
            ArrayList<Data> arr = map.get(key);
            int low = 0, high = arr.size() - 1;

            while(low <= high){
                int mid = (low + high) / 2;
                int timeVal = arr.get(mid).timeStamp;
                if(timeVal == timestamp){
                    return arr.get(mid).value;

                }else if(timeVal < timestamp){
                    cand = arr.get(mid).value;
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return cand;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */