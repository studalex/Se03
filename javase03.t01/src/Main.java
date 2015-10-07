import java.util.Date;

public class Main {
    public static void main(String[] arg)
    {
        CrazyLogger crazyLogger = new CrazyLogger();

        crazyLogger.addMessage(new StringBuilder("Первое сообщение в логе"));
        crazyLogger.addMessage(new StringBuilder("Второе сообщение в логе"));
        crazyLogger.addMessage(new StringBuilder("Второе новое сообщение в логе"));
        crazyLogger.addMessage(new StringBuilder("Третье сообщение в логе"));
        crazyLogger.addMessage(new StringBuilder("Четвертое сообщение в логе"));
        crazyLogger.addMessage(new StringBuilder("Пятое сообщение в логе"));

        //Вывод всех сообщений
        crazyLogger.showAllMessage();
        //Поиск по ключевому слову
        crazyLogger.searchMessagesByKeyword("Второе");
        //Поиск по дате
        crazyLogger.searchMessagesByDate(new Date());
        //Поиск несуществующего слова
        crazyLogger.searchMessagesByKeyword("абажур");
    }

}
