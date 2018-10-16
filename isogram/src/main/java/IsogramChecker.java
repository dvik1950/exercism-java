class IsogramChecker {

    boolean isIsogram(String phrase) {
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = 0; j < phrase.length(); j++) {
                if (i != j) {
                    if (Character.toLowerCase(phrase.charAt(i)) == Character.toLowerCase(phrase.charAt(j))) {
                        if ((phrase.charAt(i) != " ".charAt(0)) && (phrase.charAt(i) != "-".charAt(0))){
                        return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
