package kakaoblind_2021;

public class Lv1_newID {
    static class Solution {
        public String solution(String new_id) {
            String answer = "";

            //first
            String first_str = new_id.toLowerCase();
            //second
            String second_str = second(first_str);
            //third
            String third_str = third(second_str);

            //fourth
            String fourth_str = fourth(third_str);
            //fifth
            String fifth_str = fourth_str;
            if(fifth_str.isBlank())
                fifth_str = "a";
            System.out.println(fifth_str);
            String sixth_str = sixth(fifth_str);
            String seven_str = seven(sixth_str);
            return seven_str;
        }

        public String second(String s) {
            String result = s;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!(c >= 'a' && c <= 'z')) {
                    if (Integer.valueOf(c) >= '0' && Integer.valueOf(c) <= '9') {
                        continue;
                    } else {
                        if (!(c == '-' || c == '_' || c == '.')) result = result.replace(c + "", "");
                    }
                }
            }
            return result;
        }

        public String third(String s){
            String result = s;
            while(result.contains("..")){
                result = result.replace("..",".");
            }
            return result;
        }
       public String fourth(String s){
            String result = s;
            if(result.indexOf(".")==0)
                result = result.substring(1,result.length());
            if(result.lastIndexOf(".")==result.length()-1)
                result = result.substring(0,result.length()-1);
            return result;
       }

        public  String sixth(String s){
            String result = s;
            if(s.length()>15){
                if(s.charAt(14)=='.'){
                    result = s.substring(0,14);
                }
                else
                    result = s.substring(0,15);
            }
            return result;
        }

        public String seven(String s){
            String result = s;
            while(result.length()<3){
                result +=s.charAt(s.length()-1);
            }
            return result;
        }

    }


    public static void main(String[] args) {
        String s = "1....3";
        Solution solution = new Solution();

        System.out.println(solution.solution(s));
    }
}
