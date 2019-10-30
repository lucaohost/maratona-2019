package maratona2019;

class Change {

    static String DoWork(int[] initialChange, int[] queue) {
        for (int money : queue) {
            int change = money - 25;
            if (change > 0) {
                if (change == 25 && initialChange[0] > 0) {
                    initialChange[0]--;
                } else if (change == 75 && initialChange[1] > 0 && initialChange[0] > 0) {
                    initialChange[0]--;
                    initialChange[1]--;
                } else {
                    return "Não";
                }
            }
        }
        return "Sim";
    }
}
