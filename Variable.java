public class Variable {
    public static void main(String[] args) {
        boolean multimonitor = false;
        byte memory = 4;
        short ssd = 512;
        char m = 'm';
        int cores = 2;
        long distance = 147_600_000_000L;
        float gHz = 1.6f;
        double size = 512.00;
        System.out.println("Наличие двух мониторов: " + multimonitor);
        System.out.println("Оперативная память: " + memory + " Гб");
        System.out.println("Память SSD: " + ssd + " Гб");
        System.out.println("Символ : " + m);
        System.out.println("Количество ядер: " + cores);
        System.out.println("Расстояние от Земли до Солнца: " + distance + " метров");
        System.out.println("Частота ядер: " + gHz + " GHz");
        System.out.println("Размер жёсткого диска: " + size + " Gb");
    }
}