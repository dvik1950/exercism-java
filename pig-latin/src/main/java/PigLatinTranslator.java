class PigLatinTranslator {
    
    public String translate(String word){
        String[] words = word.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += PigLatinTranslator.translate_one(words[i]);
            if (i != (words.length-1)){
                result += " ";
            }
        }
        return result;
    }
    
    public static String translate_one(String word){
        String vowels = "aeiou";
        if (vowels.indexOf(word.charAt(0)) != -1 || word.substring(0, 2).equals("xr") || word.substring(0, 2).equals("yt")) {
            return word + "ay";
        } else {
            if (word.substring(1, 2).equals("y") && word.length() == 2) {
                 word += word.substring(0, 1);
                 return (word + "ay").substring(1);
            } else if (word.substring(0, 3).matches("thr|sch")) {
                 word += word.substring(0, 3);
                 return (word + "ay").substring(3);
            } else if (word.substring(1, 2).equals("h")) {
                 word += word.substring(0, 2);
                 return (word + "ay").substring(2);
            } else if (word.substring(1, 3).equals("qu")) { 
                word += word.substring(0, 3);
                return word.substring(3) + "ay";
            } else if (word.substring(0, 2).equals("qu")) { 
                word += word.substring(0, 2);
                return word.substring(2) + "ay";
            } else {
                 word += word.substring(0, 1);
                 return (word + "ay").substring(1);
            }
        }

    }
    
    
    
    
    
    
}