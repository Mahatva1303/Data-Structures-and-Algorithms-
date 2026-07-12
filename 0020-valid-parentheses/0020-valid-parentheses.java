class Solution {
    public boolean isValid(String s) {
        while(true){
            if(s.contains("()")){
                s = s.replace("()","");
            }
            else if(s.contains("{}")){
                s = s.replace("{}","");
            }
            else if(s.contains("[]")){
                s = s.replace("[]","");
            }
            else{
                return s.isEmpty(); // working as 2 :- 1) ex [{()}] like this check and in last " " empty string remain returns true
                // 2 {[}] no if and elseif condition falls goes to else condition s.isempty check wheater string is empty or not as it is not empty it writen false
            }
        }
    }
}