package src.Lesson4.Task2;

public class Hollydays {
    public enum days {
        COMMON("нет праздника"),
        NEWYAER ("Новый год"),
        FEVRAL23 ("23 февраля"),
        MART8 ("8 марта");

        private String title;

        days(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "DayOfWeek{" +
                    "title='" + title + '\'' +
                    '}';
        }
    }
}
