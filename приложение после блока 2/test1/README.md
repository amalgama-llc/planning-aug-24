# Приложение по итогам прохождения двух блоков обучения планированию

Для открытия в Eclipse:
1. Установите и настройке Eclipse (см. https://github.com/amalgama-llc/planning-aug-24/blob/main/EclipseSetup.md, пункт 4 - опционально).
2. Импортируйте исходные коды в Eclipse (в Project Explorer - Import project, далее "Existing Projects into Workspace", далее выбрать папку с исходными кодами проекта, поставить галочку "Search for Nested Projects").
3. В окне "Project Explorer" отыщите и откройте файл releng/имя.вашего.приложения.target/имя.вашего.приложения.target.target.
В открывшемся файле нажмите на кнопку-ссылку "Set as Active Target Platform" (справа сверху). Начнётся загрузка внешних зависимостей приложения. Загрузка может занять до 5 минут. По окончании загрузки ошибки компиляции должны уйти.
4. Откройте инструкцию https://github.com/amalgama-llc/planning-aug-24/blob/main/texts/createBasicApp.md, выполните пункт "Настройка положения JavaFX-библиотек в рантайме".
5. Запустите приложение нажатием на зелёную кнопку 'Launch an Eclipse Application' (сверху справа) в окне product-файла.

