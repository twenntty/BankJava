# Лабораторна робота №5

-----

# Тема: Обробка виняткових ситуацій в Java
____________

### Виконав: Білоус Марк Олександрович ПД-31

____________

## Мета:

Зрозуміти базові принципи обробки виняткових ситуацій в Java.
Створити спеціалізовані класи винятків для обробки конкретних помилкових сценаріїв.
Реалізувати кілька блоків try-catch і використовувати finally для виконання коду очищення.
Використовувати пропагацію винятків.

-----------

## Опис роботи:
У цій лабораторній роботі вам потрібно реалізувати надійну і стійку до помилок програму, яка імітує спрощену банківську систему. Ця система буде включати створення рахунків, фінансові операції і функції зведення рахунків. Ваше завдання полягає в тому, щоб переконатися, що програма може елегантно обробляти різні типи помилок, не ламаючись. Реалізуйте спеціалізовані класи винятків для обробки спеціалізованих сценаріїв помилок.

------

### Що потрібно мати в лабораторній роботі?

Реалізуйте клас BankAccount з членами класу accountNumber, accountName і balance.

Реалізуйте методи deposit(double amount), withdraw(double amount), getBalance() та getAccountSummary().

Створіть спеціалізовані класи винятків:
InsufficientFundsException
NegativeAmountException
AccountNotFoundException

Реалізуйте клас Bank, який зберігає колекцію об'єктів BankAccount.

У класі Bank, реалізуйте методи:
createAccount(String accountName, double initialDeposit)
findAccount(int accountNumber)
transferMoney(int fromAccountNumber, int toAccountNumber, double amount)

Обробляйте винятки відповідно в кожному методі.

Створіть тестові класи, де ви моделюєте різні сценарії для тестування обробки виняткових ситуацій.




## Етапи виконання

### Перший етап

Створення репозиторія в GitHub, створення нового
проєкту на java та push на репозиторій.

### Другий етап

Створення класу BankAccount з членами класу accountNumber, accountName і balance.

### Третій етап
Реалізуємо методи deposit(double amount), withdraw(double amount), getBalance() та getAccountSummary().

### Четвертий етап
Створюємо спеціалізовані класи винятків:
InsufficientFundsException
NegativeAmountException
AccountNotFoundException

### Пʼятий етап
Реалізуємо клас Bank, який зберігає колекцію об'єктів BankAccount.

У класі Bank, реалізовуємо методи:
createAccount(String accountName, double initialDeposit)
findAccount(int accountNumber)
transferMoney(int fromAccountNumber, int toAccountNumber, double amount)

