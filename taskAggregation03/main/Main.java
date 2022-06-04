package by.epam.aggregetion03.main;
/*
 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 столицу, количество областей, площадь, областные центры.
 */

import by.epam.aggregetion03.entity.City;
import by.epam.aggregetion03.entity.District;
import by.epam.aggregetion03.entity.Region;
import by.epam.aggregetion03.view.Capital;
import by.epam.aggregetion03.view.ListRegionalCenters;
import by.epam.aggregetion03.view.Quantity;
import by.epam.aggregetion03.view.Square;

public class Main{
    public static void main(String[] args){
        City city = new City("Minsk", 1_900_456, 23_343);
        District district = new District();
        Region region = new Region();
        ListRegionalCenters centers = new ListRegionalCenters();
        Capital capital = new Capital();
        Square square = new Square();
        Quantity quantity = new Quantity();

        Region[] regions = new Region[region.REGIONS_QUANTITY];
        regions[0] = new Region("Brest region", "Brest", 124_837.45, 2_456_234);
        regions[1] = new Region("Grodno region", "Grodno", 273_654.54, 1_986_456);
        regions[2] = new Region("Minsk region", "Minsk", 387_345, 3_234_543);
        regions[3] = new Region("Mogilev region", "Mogilev", 736_256.32, 1_983_894);
        regions[4] = new Region("Vitebsk region", "Vitebsk", 399_659.52, 1_876_342);
        regions[5] = new Region("Gomel region", "Gomel", 348_736.65, 2_022_123);

        capital.getCapital(city.toString());
        System.out.println("_______________________________");
        quantity.getQuantity();
        System.out.println("_______________________________");
        square.getSquare(regions);
        System.out.println("_______________________________");
        centers.getRegions(regions);
    }
}
/*
The capital name is Minsk, population is 1900456 people.
_______________________________
Regions quantity is 6
_______________________________
Regions square
The square of Brest region is 124837.45 km2
The square of Grodno region is 273654.54 km2
The square of Minsk region is 387345.0 km2
The square of Mogilev region is 736256.32 km2
The square of Vitebsk region is 399659.52 km2
The square of Gomel region is 348736.65 km2
_______________________________
List of regional centers
Brest
Grodno
Minsk
Mogilev
Vitebsk
Gomel
 */