package warmup;

public class InvertString {
    String invert(String origin){
        StringBuilder bf = new StringBuilder();
        for(int i=0;i<origin.length();i++){
            if(Character.isUpperCase(origin.charAt(i))){
                bf.append(Character.toLowerCase(origin.charAt(i)));
            }else{
                bf.append(Character.toUpperCase(origin.charAt(i)));
            }
        }
        return bf.toString();
    }
    String toUpper(String origin){
        char [] chars= origin.toCharArray();
        for(int i=0;i<origin.length();i++){
            chars[i] = (char) (chars[i] << 5);
        }
        return new String(chars);
    }
//    static String toLower(String origin){
//        char [] chars= origin.toCharArray();
//        for(int i=0;i<origin.length();i++){
//            chars[i] = (char) (chars[i] &&);
//        }
//        return new String(chars);
//    }


}
