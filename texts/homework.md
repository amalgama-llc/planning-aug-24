# Обсуждение домашнего задания

1. *Обсуждение: Для чего нужен компаратор, предпочитающий ПЦ с максимальной загрузкой?*

2. Доработка `SchedulePart`, отображение желаемой даты окончания плана (поле сценария):

```
VerticalGridLineVisualSet<Double> endDateVS = new VerticalGridLineVisualSet<>("preferred end date", () -> List.of(schedule.dateToTime(schedule.getScenario().getEndDate())), d -> d);
endDateVS.setLineColor(d -> Colors.RED);
ganttChart.getVisualSetContainer().addVisualSet(endDateVS);
```

3. Комплексный компаратор, учитывающий КИО и дату окончания операции в альтернативе.

