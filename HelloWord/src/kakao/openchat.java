package kakao;
import java.util.ArrayList;
import java.util.HashMap;

public class openchat {
    public static void main(String[] args) {
        String[] record={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        HashMap<String, String> words=new HashMap<>();
        ArrayList<String> messageList =new ArrayList<>();
        
            for (String a : record) {
                    String[] splitRecord = a.split("\\s");
                    if(splitRecord[0].equals("Leave")){
                    }else {
                    words.put(splitRecord[1], splitRecord[2]);

                    }
                        
                }
                    
                for(String a : record){
                String[] splitRecord = a.split("\\s");
                if(splitRecord[0].equals("Enter")){
                  messageList.add( words.get(splitRecord[1])+"님이 들어왔습니다.");
                }else if(splitRecord[0].equals("Leave")){
                    messageList.add(words.get(splitRecord[1])+"님이 나갔습니다.");
                }
            }
        
            String[] answer = messageList.toArray(new String[0]);

            for(String a : answer){
                System.err.println(a);
            }
        
    }
        
        
        
}
