package maratona2019;

class Futebol {

    static String DoWork(String[] timeA, String[] timeB, String[] timeC, String[] timeD) {
        int pontA = 0;
        int pontB = 0;
        int pontC = 0;
        int pontD = 0;
        for (String resultado : timeA) {
            switch (resultado) {
                case "E":
                    pontA = pontA + 1;
                    break;
                case "V":
                    pontA = pontA + 3;
                    break;
            }
        }
        for (String resultado : timeB) {
            switch (resultado) {
                case "E":
                    pontB = pontB + 1;
                    break;
                case "V":
                    pontB = pontB + 3;
                    break;
            }

        }
        for (String resultado : timeC) {
            switch (resultado) {
                case "E":
                    pontC = pontC + 1;
                    break;
                case "V":
                    pontC = pontC + 3;
                    break;
            }

        }
        for (String resultado : timeD) {
            switch (resultado) {
                case "E":
                    pontD = pontD + 1;
                    break;
                case "V":
                    pontD = pontD + 3;
                    break;
            }

        }
        if (pontA > pontB && pontA > pontC && pontA > pontD) {
            return "timeA";
        }
        if (pontB > pontA && pontB > pontC && pontB > pontD) {
            return "timeB";
        }
        if (pontC > pontA && pontC > pontB && pontC > pontD) {
            return "timeC";
        }
        if (pontD > pontA && pontD > pontB && pontD > pontC) {
            return "timeD";
        }
        return "há times empatados caraio";
    }
}
