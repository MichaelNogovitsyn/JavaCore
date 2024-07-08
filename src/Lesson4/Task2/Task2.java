package src.Lesson4.Task2;
/*
Задание: Класс «Эмуляция интернет-магазина».
        1. Написать классы покупатель (ФИО, возраст, телефон), товар (название, цена) и
        заказ (объект покупатель, объект товар, целочисленное количество).
        2. Создать массив покупателей (инициализировать 2 элемента), массив товаров
        (инициализировать 5 элементов) и массив заказов (пустой на 5 элементов).
        3. Создать статический метод «совершить покупку» со строковыми параметрами,
        соответствующими полям объекта заказа. Метод должен вернуть объект заказа.
        4. Если в метод передан несуществующий покупатель – метод должен выбросить
        исключение CustomerException, если передан несуществующий товар, метод
        должен выбросить исключение ProductException, если было передано отрицательное или слишком больше значение количества (например, 100), метод
        должен выбросить исключение AmountException.
        5. Вызвать метод совершения покупки несколько раз таким образом, чтобы заполнить массив покупок возвращаемыми значениями. Обработать исключения следующим образом (в заданном порядке):
        – если был передан неверный товар – вывести в консоль сообщение об ошибке, не совершать данную покупку;
        – если было передано неверное количество – купить товар в количестве 1;
        – если был передан неверный пользователь – завершить работу приложения
        с исключением.
        6. Вывести в консоль итоговое количество совершённых покупок после выполнения основного кода приложения.

        1. Доделать задания про интернет-магазин. Обработать исключения, показывать "говорящие" сообщения о том,
        что пошло не так.
        2. В класс покупателя добавить перечисление с гендерами, добавить в объекты покупателей свойство
        «пол» со значением созданного перечисления. Добавить геттеры, сеттеры.
        3. Добавить перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля).
        В метод оформления заказа добавить параметр - дата заказа (можно сразу использовать значение из перечисления),
         при создании заказа проверять значение перечисления и пол покупателя. Делать скидку мужчинам - на 23 февраля,
          женщинам на 8 марта в размере 15%, всем на Новый год в размере 20%. В заказе указывать общую сумму со скидкой.
        4. (*) любые доработки в магазин на Ваше усмотрение - описать в readme либо в тексте к ПЗ
    */

public class Task2 {
    public static void main(String[] args) {
        Market market = new Market();
        buy(market,market.costumers.get(1),market.products.get(0),2,Hollydays.days.FEVRAL23);
        buy(market,market.costumers.get(1),market.products.get(1),2,Hollydays.days.MART8);
        buy(market,market.costumers.get(2),market.products.get(2),3,Hollydays.days.MART8 );
        buy(market,market.costumers.get(3),market.products.get(4),5,Hollydays.days.COMMON);
        buy(market,market.costumers.get(4),market.products.get(4),5,Hollydays.days.NEWYAER);

        System.out.println(market.getOrders());
    }
    public static void buy(Market market, Costumer costumer, Product product, int quantity, Hollydays.days day){
            int orderID=0;
            int Sale;
            int orderPrice;
            int newPrice = 0;
            try {
                 orderID = market.createOrder(costumer);
            } catch (CustomerException e) {
                System.out.println("User not found");
                System.exit(1);
            }

            try {
                market.addProductToOrder(orderID, product, quantity) ;
                // 23 Февраля
                if (costumer.getGender().equals(Costumer.Gen.male.toString()) && (day==Hollydays.days.FEVRAL23)){
                    System.out.println("Sail 23 february");
                    Sale = 15;
                    orderPrice = market.getOrder(orderID).getOrdPrice();
                    newPrice = orderPrice - (orderPrice*Sale/100);
                    market.setOrderPrice(orderID, newPrice);
                }
                // 8 Марта
                if (costumer.getGender().equals(Costumer.Gen.famale.toString()) && (day==Hollydays.days.MART8)){
                    System.out.println("Sail 8 march");
                    Sale = 15;
                    orderPrice = market.getOrder(orderID).getOrdPrice();
                    newPrice = orderPrice - (orderPrice*Sale/100);
                    market.setOrderPrice(orderID, newPrice);
                }
                // 8 NEWYEAR
                if ((day==Hollydays.days.NEWYAER)){
                    System.out.println("Sail 8 march");
                    Sale = 20;
                    orderPrice = market.getOrder(orderID).getOrdPrice();
                    newPrice = orderPrice - (orderPrice*Sale/100);
                    market.setOrderPrice(orderID, newPrice);
                }
            } catch (ProductException e) {
                System.out.println(" Выбран не верный товар");
            } catch (AmountException e) {
                System.out.println("Измените количество товара.");
            }

        }
}
