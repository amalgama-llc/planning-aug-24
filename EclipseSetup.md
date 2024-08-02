# Установка и настройка Eclipse

## 1. Скачивание и установка JavaFX

1. Перейдите по адресу https://jdk.java.net/javafx21/ и скачайте архив с JavaFX для Windows (раздел Builds - SDK, ссылка 'zip' напротив Windows / x64).
2. Распакуйте скачанный архив с JavaFX в папку `c:\Program Files\Java`. В результате должна появиться папка `c:\Program Files\Java\javafx-sdk-21.0.2\`.

## 2. Скачивание и установка Eclipse

1. Скачайте архив с Eclipse 2024-06 (вариант Eclipse Modeling Tools): https://www.eclipse.org/downloads/packages/release/2024-06/r/eclipse-modeling-tools
2. Распакуйте скачанный архив в любую папку. Добавьте ярлык на файл `eclipse.exe` на рабочий стол и/или на панель быстрого запуска.

## 3. Установка плагина e(fx)clipse

1. Запустите Eclipse. Выберите произвольную пустую папку для создания рабочего пространства (Workspace). Примите предложение о добавлении Eclipse в список исключений Защитника Windows.
2. Через меню `Help -> Eclipse Marketplace` установите плагин e(fx)clipse. Он необходим для того, чтобы во время сборки приложения в Eclipse были доступны библиотеки JavaFX.
3. Ответьте согласием на предложение о перезапуске Eclipse.

## 4. Установка плагина визарда для создания десктоп-приложения для построения расписания

1. В Eclipse выберите пункт меню `Help -> Install New Software...`.
2. В верхнем поле введите: `https://nexus.am-sim.com/repository/wizard-scheduling-p2/latest/` и нажмите `Enter`.
3. Установите `Desktop Application Wizard for Scheduling`. 

## 5. Задание в Eclipse местоположения библиотек JavaFX

Цель шага - сообщить Eclipse о местоположении библиотек JavaFX. Эта настройка хранится в файлах рабочего пространства (Workspace),
поэтому данный шаг выполняется для каждого нового Workspace. 
Если Eclipse перезапускается, и в нём открывается уже существовавший ранее Workspace, то шаг можно пропустить.

1. Откройте окно `Window -> Preferences`
2. В разделе *JavaFX* в поле *JavaFX 11+ SDK*: выберите подкаталог lib внутри каталога с JavaFX (например, `C:\Program Files\Java\javafx-sdk-21.0.2\lib`).
3. Нажмите `Apply and Close`.

