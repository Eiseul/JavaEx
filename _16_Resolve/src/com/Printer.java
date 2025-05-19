public interface Printer {              // 대사만 적힌 대본 / 구현x
    public void InkjetPrinter();
    public void LaserPrinter();
}

public void Printer {
    String[] name = new String[] {"InkjetPrinter", "LaserPrinter"};
}

