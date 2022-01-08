package Junior.FirstCourse.Projects.Runes.RuneEnhance;

import Junior.FirstCourse.Projects.Runes.RunesSet.CreateRunes;

import static Junior.FirstCourse.Lections.Random.Random.myRandom;

public interface Enhancement {
     static CreateRunes runesLevelUp(CreateRunes runes){
         if (runes.getEnhanceRate() < 4){
             int runUp = myRandom(4,8);
             switch (myRandom(1,4)) {
                 case 1:
                     System.out.printf("Точим 1й атрибут %s на %d \n", runes.getFirst().getName(), runUp);
                     runes.getFirst().setAttributeValue(runes.getFirst().getAttributeValue()+runUp);
                     break;
                 case 2:
                     System.out.printf("Точим 2й атрибут %s на %d \n", runes.getSecond().getName(), runUp);
                     runes.getSecond().setAttributeValue(runes.getSecond().getAttributeValue()+runUp);
                     break;
                 case 3:
                     System.out.printf("Точим 3й атрибут %s на %d \n", runes.getThird().getName(), runUp);
                     runes.getThird().setAttributeValue(runes.getThird().getAttributeValue()+runUp);
                     break;
                 case 4:
                     System.out.printf("Точим 4й атрибут %s на %d \n", runes.getFour().getName(), runUp);
                     runes.getFour().setAttributeValue(runes.getFour().getAttributeValue()+runUp);
                     break;
             }
             runes.setEnhanceRate(runes.getEnhanceRate()+1);
         }
         else {
             System.out.println("Рунна зачарована на максимум. Больше зачаровать не возможно");
         }

        return runes;
    }

}
