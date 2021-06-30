package homework2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class Main {
    public static void main(String[] args) {


        Catalog catal = new Catalog();
//        catal.add(new Candy("jelly", "nut", 20));
//        catal.add(new Candy("chocolate", "nut", 50));
        Candy candy = new Candy("fondant", "nougat", 25);


        try {
            // Создаем файл
            File file = new File("C:\\Users\\fenux\\IdeaProjects\\Java_EE\\src\\main\\java\\homework2\\candies.xml");
            // Вызываем статический метод JAXBContext
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            // Возвращает объект класса Marshaller, для того чтобы трансформировать объект
            Marshaller mar = jaxbContext.createMarshaller();
            // Читабельное форматирование
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Записываем в файл, marshal(из памяти, в файл)
//            mar.marshal(catal, file);
//            mar.marshal(catal, System.out);

            System.out.println();

            // Считываем из файла
            Unmarshaller unmar = jaxbContext.createUnmarshaller();
            catal = (Catalog) unmar.unmarshal(file);
            System.out.println(catal);
            // Добавляю конфету
            catal.add(candy);
            // Записаваю заново все в фаил
            mar.marshal(catal, file);
            mar.marshal(catal, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
