package maratona2019;

class Equacao {

    static float[] DoWork(int a, int b, int c) {
        float delta = (b * b) - 4 * a * c;
        float rootOfDelta = (float) Math.sqrt(delta);
        float rootX = (-b + rootOfDelta) / (2 * a);
        float rootY = (-b - rootOfDelta) / (2 * a);
        float[] roots = {rootX, rootY};
        return roots;
    }
}
