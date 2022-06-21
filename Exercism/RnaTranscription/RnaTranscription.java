class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        switch (dnaStrand) {
            case "G":
                rnaStrand = "C";
                break;
            case "C":
                rnaStrand = "G";
                break;
            case "T":
                rnaStrand = "A";
                break;
            case "A":
                rnaStrand = "U";
                break;
            default:
                rnaStrand = "";
        }

        if (dnaStrand.length() != 1) {
            for(int i = 0; i < dnaStrand.length(); i++){
                rnaStrand+=transcribe(dnaStrand.charAt(i)+"");
        }
    }
        return rnaStrand;
    }
}


