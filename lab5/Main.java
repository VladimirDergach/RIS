import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Avto
{
    private String marka;
    private int godV;

    public Avto(String marka, int godV)
    {
        this.marka = marka;
        this.godV = godV;
    }

    public String getMarka(){return marka;}
    public int getGod(){return godV;}
}
public class Main {
    public static void main(String[] args) {
        // Создание списка объектов Avto
        List<Avto> AvtoList = new ArrayList<>();
        AvtoList.add(new Avto("BMW M5", 2019));
        AvtoList.add(new Avto("Lada Vesta", 2015));
        AvtoList.add(new Avto("Ford Edge II", 2016));
        AvtoList.add(new Avto("Cadillac DTS", 2010));
        AvtoList.add(new Avto("Gelly MK I", 2013));

        // Фильтрация по условию: год выпуска >= 2015
        List<Avto> filterList = filter(AvtoList, avto -> avto.getGod() >= 2015);

        // Вывод отфильтрованного списка на экран
        for (Avto avto : filterList) {
            System.out.println(avto.getMarka() + " | " + avto.getGod());
        }
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        // Создание нового списка для хранения отфильтрованных элементов
        List<T> result = new ArrayList<>();
        // Итерация по каждому элементу входного списка
        for (T element : list) {
            // Проверка, удовлетворяет ли элемент условию, переданному через предикат p
            if (p.test(element)) {
                // Если элемент удовлетворяет условию, добавляем его в результат
                result.add(element);
            }
        }
        // Возвращаем список с отфильтрованными элементами
        return result;
    }
}
