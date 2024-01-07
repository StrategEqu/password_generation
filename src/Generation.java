public class Generation {

    public void GenerationPass (String pass) {
        String passOld = pass;
        int key = 1410;
        System.out.println(passOld);
        char[] textArray = passOld.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            textArray[i] ^= key;
        }
        passOld = new String(textArray);
        System.out.println(passOld);
        for (int i = 0; i < passOld.length(); i++) {
            textArray[i] ^= key;
        }
        passOld = new String(textArray);
        System.out.println(passOld);
    }
    }
