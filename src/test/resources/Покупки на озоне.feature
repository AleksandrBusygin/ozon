#language: ru

  Функционал:Работа с сайтом покупок "OZONE"

    @web
    Структура сценария: "Добавление и удаление товаров в корзину"

      * проходит авторизация на сайте с имеющимся логином "<login>" и паролем "<password>"
      * выполняется поиск товаров, соответсвующих заданному запросу "<find>"
      * в корзину добавлен первый продукт, id которого "<first>"
      * в корзину добавлен второй продукт, id которого "<second>"
      * в корзину добавлен третий продукт, id которого "<third>"
      * в корзину добавлен четвертый продукт, id которого "<fourth>"
      * в корзину добавлен пятый продукт, id которого "<fifth>"
      * переход в корзину
      * первый товар, id которого "<first>" присутствует в корзине
      * второй товар, id которого "<second>" присутствует в корзине
      * третий товар, id которого "<third>" присутствует в корзине
      * четвертый товар, id которого "<fourth>" присутствует в корзине
      * пятый товар, id которого "<fifth>" присутствует в корзине
      * удаление всех добавленных товаров из корзины
      * выход авторизованного пользователя
      * проходит авторизация на сайте с имеющимся логином "<login>" и паролем "<password>"
      * проверка отсутствия товаров в корзине

      Примеры:
        | login               | password  | find                       | first     | second    | third     | fourth    | fifth     |
        | persik665@yandex.ru | 123456789 | iPhone 7 Plus/8 Plus Black | 142408221 | 142408242 | 147034039 | 140981081 | 138208703 |
